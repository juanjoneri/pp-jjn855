import org.antlr.v4.runtime.tree.*;
import java.util.HashSet;

/**
 * This visitor makes sure that there is a main method in the program
 */
@SuppressWarnings({"unchecked"})
public class CustomVisitor extends SimpleLangBaseVisitor<Void> {

    private boolean hasMain;
    private int numberOfNamesNotDeclaredBeforeUse;

    public HashSet<String> declaredNames;

    public CustomVisitor() {
        this.hasMain = false;
        this.numberOfNamesNotDeclaredBeforeUse = 0;

        this.declaredNames = new HashSet();
    }

    /**
     * Checks that this program has a main method with no arguments and return type of void.
     */
    public boolean hasMain() {
        return hasMain;
    }

    /**
     * Keeps track of all the names that were not created before being used.
     */
    public int numberOfNamesNotDeclaredBeforeUse() {
        return numberOfNamesNotDeclaredBeforeUse;
    }

    @Override
    public Void visitConstDecl(SimpleLangParser.ConstDeclContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            declaredNames.add(id.getText());
        }

        return super.visitConstDecl(ctx);
    }

    @Override
    public Void visitEnumDecl(SimpleLangParser.EnumDeclContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            declaredNames.add(id.getText());
        }

        return super.visitEnumDecl(ctx);
    }

    @Override
    public Void visitVarDecl(SimpleLangParser.VarDeclContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            declaredNames.add(id.getText());
        }

        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitClassDecl(SimpleLangParser.ClassDeclContext ctx) {
        declaredNames.add(ctx.ID().getText());

        return super.visitClassDecl(ctx);
    }

    @Override
    public Void visitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) {
        declaredNames.add(ctx.ID().getText());

        return super.visitInterfaceDecl(ctx);
    }

    @Override
    public Void visitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) {
        declaredNames.add(ctx.ID().getText());

        return super.visitInterfaceMethodDecl(ctx);
    }

    @Override
    public Void visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) {
        declaredNames.add(ctx.ID().getText());

        if (isMain(ctx)) {
            hasMain = true;
        }

        return super.visitMethodDecl(ctx);
    }

    @Override
    public Void visitFormParams(SimpleLangParser.FormParamsContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            declaredNames.add(id.getText());
        }

        return super.visitFormParams(ctx);
    }

    private static boolean isMain(SimpleLangParser.MethodDeclContext ctx) {
        boolean isMain = ctx.ID().getText().equals("main");
        boolean returnsVoid = ctx.VOID() != null;
        boolean hasNoArguments = ctx.formParams() == null;
        
        return (isMain && returnsVoid && hasNoArguments);
    }

}