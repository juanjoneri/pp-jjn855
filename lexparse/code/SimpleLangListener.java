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
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(SimpleLangParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(SimpleLangParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumValueDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDecl(SimpleLangParser.EnumValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumValueDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDecl(SimpleLangParser.EnumValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SimpleLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SimpleLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(SimpleLangParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(SimpleLangParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(SimpleLangParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(SimpleLangParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleLangParser.TypeContext ctx);
}