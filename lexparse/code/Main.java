import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) throws Exception {
        SimpleLangLexer lexer = new SimpleLangLexer(new ANTLRFileStream(args[0]));
        SimpleLangParser parser = new SimpleLangParser(new CommonTokenStream(lexer));

        // Customize lexer errors
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CustomListener("LEX ERROR"));

        // Customize parser errors
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomListener("PARSER ERROR"));

        ParseTree tree = parser.r();
        HasMainVisitor visitor = new HasMainVisitor();
        visitor.visit(tree);
        System.out.println(visitor.hasMain());
    }
}