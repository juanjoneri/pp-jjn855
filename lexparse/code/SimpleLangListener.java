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
	 * Enter a parse tree produced by {@link SimpleLangParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#interfaceMethodDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#interfaceMethodDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleLangParser#formParams}.
	 * @param ctx the parse tree
	 */
	void enterFormParams(SimpleLangParser.FormParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#formParams}.
	 * @param ctx the parse tree
	 */
	void exitFormParams(SimpleLangParser.FormParamsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#designatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorStatement(SimpleLangParser.DesignatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#designatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorStatement(SimpleLangParser.DesignatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(SimpleLangParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(SimpleLangParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SimpleLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SimpleLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void enterCondTerm(SimpleLangParser.CondTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void exitCondTerm(SimpleLangParser.CondTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#condFact}.
	 * @param ctx the parse tree
	 */
	void enterCondFact(SimpleLangParser.CondFactContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#condFact}.
	 * @param ctx the parse tree
	 */
	void exitCondFact(SimpleLangParser.CondFactContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignop}.
	 * @param ctx the parse tree
	 */
	void enterAssignop(SimpleLangParser.AssignopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignop}.
	 * @param ctx the parse tree
	 */
	void exitAssignop(SimpleLangParser.AssignopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(SimpleLangParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(SimpleLangParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(SimpleLangParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(SimpleLangParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(SimpleLangParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(SimpleLangParser.MulopContext ctx);
}