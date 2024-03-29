import org.antlr.v4.runtime.tree.*;
import java.util.HashSet;

/**
 * This visitor checks a few semantic rules
 */
@SuppressWarnings({"unchecked"})
public class CustomVisitor extends SimpleLangBaseVisitor<Void> {

    private HashSet<String> primitiveTypes;
    
    private boolean hasMain; // Is set to true when main method is found
    private NamesStack stack; // Keeps track of variables defined in each scope


    public CustomVisitor() {
        primitiveTypes = new HashSet();
        hasMain = false;
        stack = new NamesStack();

        primitiveTypes.add("int");
        primitiveTypes.add("bool");
        primitiveTypes.add("char");
        primitiveTypes.add("enum");
    }

    /**
     * Checks that this program has a main method with no arguments and return type of void.
     */
    public boolean hasMain() {
        return hasMain;
    }

    @Override
    public Void visitProgram(SimpleLangParser.ProgramContext ctx) {
        stack.addNewScope();
        stack.addNameToCurrentScope(ctx.ID().getText());

        visitChildren(ctx);
        return null;

    }


    @Override
    public Void visitConstDecl(SimpleLangParser.ConstDeclContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            stack.addNameToCurrentScope(id.getText());
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitEnumDecl(SimpleLangParser.EnumDeclContext ctx) {
        boolean isFirst = true;
        for (TerminalNode id : ctx.ID()) {
            stack.addNameToCurrentScope(id.getText());
            if (isFirst) {
                // The enum values should not be accessible to the enclosing scope
                stack.addNewScope();
                isFirst = false;
            }
        }
        stack.removeLastScope();

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVarDecl(SimpleLangParser.VarDeclContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            stack.addNameToCurrentScope(id.getText());
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitClassDecl(SimpleLangParser.ClassDeclContext ctx) {
        // A class' name is part of the enclosing scope
        stack.addNameToCurrentScope(ctx.ID().getText());
        // A class variables and methods have their own scope
        stack.addNewScope();
        stack.addNameToCurrentScope("this");
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) {
        // An interface's name is part of the enclosing scope
        stack.addNameToCurrentScope(ctx.ID().getText());
        // An interface can define functions with the same names as variables in the scope
        stack.addNewScope();
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) {
        // A method's name is part of the enclosing scope
        stack.addNameToCurrentScope(ctx.ID().getText());
        // A method's params has its own scope
        stack.addNewScope();
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) {
        if (isMain(ctx)) {
            hasMain = true;
        }
        
        // A method's name is part of the enclosing scope
        stack.addNameToCurrentScope(ctx.ID().getText());
        // A method's params and body has its own scope
        stack.addNewScope();
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitFormParams(SimpleLangParser.FormParamsContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            stack.addNameToCurrentScope(id.getText());
        }

        visitChildren(ctx);
        return null;
    }

    // Designator is where variables are being used

    @Override
    public Void visitDesignator(SimpleLangParser.DesignatorContext ctx) {
        // Only check if the first name is in scope
        // Assume all inner names are always in scope if previously defined
        // val.inner.getPos()
        boolean isFirst = true;
        for (TerminalNode id : ctx.ID()) {
            String name = id.getText();
            if (isFirst) {
                stack.checkInStack(name);
                isFirst = false;
            } else {
                stack.checkDeclared(name);
            }
        }
        

        
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitType(SimpleLangParser.TypeContext ctx) {
        // Check that types are defined:
        // - int, bool, char, enum
        // - a class or interface that was previously defined
        String id = ctx.ID().getText();
        if (!primitiveTypes.contains(id)) {
            stack.checkInStack(id);
        }

        visitChildren(ctx);
        return null;
    }



    private static boolean isMain(SimpleLangParser.MethodDeclContext ctx) {
        boolean isMain = ctx.ID().getText().equals("main");
        boolean returnsVoid = ctx.VOID() != null;
        boolean hasNoArguments = ctx.formParams() == null;
        boolean parentIsProgram = ctx.getParent() instanceof SimpleLangParser.ProgramContext;
        
        return (isMain && returnsVoid && hasNoArguments && parentIsProgram);
    }

}