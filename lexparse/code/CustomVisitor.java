
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

    public boolean hasMain() {
        return hasMain;
    }

    @Override
    public Void visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) {
        
        boolean isMain = ctx.ID().getText().equals("main");
        boolean returnsVoid = ctx.VOID() != null;
        boolean hasNoArguments = ctx.formParams() == null;

        if (isMain && returnsVoid && hasNoArguments) {
            hasMain = true;
        }
        return super.visitMethodDecl(ctx);
    }

}