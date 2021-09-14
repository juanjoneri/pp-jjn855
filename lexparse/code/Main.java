import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleLangLexer lexer = new SimpleLangLexer(new ANTLRFileStream(args[0]));
        SimpleLangParser parser = new SimpleLangParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.r();
        HasMainVisitor visitor = new HasMainVisitor();
        visitor.visit(tree);
        System.out.println(visitor.hasMain());
    }
}