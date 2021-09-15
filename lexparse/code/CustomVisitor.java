
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
        // TODO: check return type of this method = void and has no args
        if (ctx.ID().getText().equals("main")) {
            hasMain = true;
        }
        return super.visitMethodDecl(ctx);
    }

}