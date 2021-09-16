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
	 * Visit a parse tree produced by the {@code DesigStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesigStatement(SimpleLangParser.DesigStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SimpleLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SimpleLangParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SimpleLangParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RerturnStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerturnStatement(SimpleLangParser.RerturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(SimpleLangParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleLangParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SimpleLangParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#designatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorStatement(SimpleLangParser.DesignatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActPars(SimpleLangParser.ActParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SimpleLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#condTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondTerm(SimpleLangParser.CondTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#condFact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondFact(SimpleLangParser.CondFactContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpleLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#assignop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignop(SimpleLangParser.AssignopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(SimpleLangParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(SimpleLangParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(SimpleLangParser.MulopContext ctx);
}