// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SimpleLangParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SimpleLangParser.RootContext ctx);
}