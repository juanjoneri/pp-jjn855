
/**
 * This visitor makes sure that there is a main method in the program
 * 
 * 
 */
public class HasMainVisitor extends SimpleLangBaseVisitor<Void> {

    private boolean hasMain;

    public HasMainVisitor() {
        this.hasMain = false;
    }

    public boolean hasMain() {
        return hasMain;
    }

    @Override
    public Void visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) {
        if (ctx.ID().getText().equals("main")) {
            hasMain = true;
        }
        return super.visitMethodDecl(ctx);
    }

}