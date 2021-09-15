
/**
 * This visitor makes sure that there is a main method in the program
 * 
 * 
 */
public class CustomVisitor extends SimpleLangBaseVisitor<Void> {

    private boolean hasMain;

    public CustomVisitor() {
        this.hasMain = false;
    }

    /**
     * Check that this program has a main method with no arguments and return type of void
     */
    public boolean hasMain() {
        return hasMain;
    }

    @Override
    public Void visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) {
        if (isMain(ctx)) {
            hasMain = true;
        }

        return super.visitMethodDecl(ctx);
    }

    private static boolean isMain(SimpleLangParser.MethodDeclContext ctx) {
        boolean isMain = ctx.ID().getText().equals("main");
        boolean returnsVoid = ctx.VOID() != null;
        boolean hasNoArguments = ctx.formParams() == null;
        
        return (isMain && returnsVoid && hasNoArguments);
    }

}