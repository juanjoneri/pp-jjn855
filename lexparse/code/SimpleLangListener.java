// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(SimpleLangParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(SimpleLangParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SimpleLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SimpleLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(SimpleLangParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(SimpleLangParser.ConstDeclContext ctx);
}