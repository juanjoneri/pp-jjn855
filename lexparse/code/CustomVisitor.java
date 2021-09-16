import org.antlr.v4.runtime.tree.*;
import java.util.HashSet;

/**
 * This visitor checks a few semantic rules
 */
@SuppressWarnings({"unchecked"})
public class CustomVisitor extends SimpleLangBaseVisitor<Void> {

    private boolean hasMain;
    public NamesStack stack;

    public CustomVisitor() {
        this.hasMain = false;
        this.stack = new NamesStack();
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
        for (TerminalNode id : ctx.ID()) {
            stack.addNameToCurrentScope(id.getText());
        }

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
        stack.addNameToCurrentScope(ctx.ID().getText());

        stack.addNewScope();
        stack.addNameToCurrentScope("this");
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) {
        stack.addNameToCurrentScope(ctx.ID().getText());

        stack.addNewScope();
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) {
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

    // Statements that create their own context

    @Override
    public Void visitIfStatement(SimpleLangParser.IfStatementContext ctx) {
        // TODO: if and else should have independent scopes
        stack.addNewScope();
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    @Override
    public Void visitForStatement(SimpleLangParser.ForStatementContext ctx) {
        stack.addNewScope();
        visitChildren(ctx);
        stack.removeLastScope();
        return null;
    }

    // Designator is where variables are being used

    @Override
    public Void visitDesignator(SimpleLangParser.DesignatorContext ctx) {
        // Only check the first name used in a designator
        // val.inner.getPos() -> only val needs to be in scope
        stack.checkInStack(ctx.ID(0).getText());
        
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