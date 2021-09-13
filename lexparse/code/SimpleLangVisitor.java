// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(SimpleLangParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(SimpleLangParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#enumDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(SimpleLangParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SimpleLangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(SimpleLangParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#interfaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#interfaceMethodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(SimpleLangParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#formParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormParams(SimpleLangParser.FormParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLangParser.StatementContext ctx);
}