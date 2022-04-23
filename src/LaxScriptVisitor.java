// Generated from /home/dennis/Desktop/LaxScript/parser/LaxScript.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaxScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaxScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(LaxScriptParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK(LaxScriptParser.KContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationInteger}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationInteger(LaxScriptParser.DeclarationIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationString}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationString(LaxScriptParser.DeclarationStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationBoolean}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBoolean(LaxScriptParser.DeclarationBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(LaxScriptParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link LaxScriptParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(LaxScriptParser.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LaxScriptParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(LaxScriptParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberIntInit(LaxScriptParser.NumberIntInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierIntInit(LaxScriptParser.IdentifierIntInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIntInit(LaxScriptParser.ExpressionIntInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierStrInit}
	 * labeled alternative in {@link LaxScriptParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierStrInit(LaxScriptParser.IdentifierStrInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenceStrInit}
	 * labeled alternative in {@link LaxScriptParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenceStrInit(LaxScriptParser.SentenceStrInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierBoolInit}
	 * labeled alternative in {@link LaxScriptParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierBoolInit(LaxScriptParser.IdentifierBoolInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierBoolVal}
	 * labeled alternative in {@link LaxScriptParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierBoolVal(LaxScriptParser.IdentifierBoolValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrement(LaxScriptParser.PreIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrement(LaxScriptParser.PostIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrement(LaxScriptParser.PreDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrement(LaxScriptParser.PostDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryInt}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryInt(LaxScriptParser.TernaryIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryStr}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryStr(LaxScriptParser.TernaryStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryBool}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryBool(LaxScriptParser.TernaryBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionOp}
	 * labeled alternative in {@link LaxScriptParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOp(LaxScriptParser.ConditionOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionBoolOp}
	 * labeled alternative in {@link LaxScriptParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBoolOp(LaxScriptParser.ConditionBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAssignment(LaxScriptParser.NumberAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAssignment(LaxScriptParser.BooleanAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(LaxScriptParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssignment(LaxScriptParser.ExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionEqualNum(LaxScriptParser.AdditionEqualNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionEqualNum(LaxScriptParser.SubtractionEqualNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationEqualNum(LaxScriptParser.MultiplicationEqualNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionEqualNum(LaxScriptParser.DivisionEqualNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionEqualID(LaxScriptParser.AdditionEqualIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionEqualID(LaxScriptParser.SubtractionEqualIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationEqualID(LaxScriptParser.MultiplicationEqualIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionEqualID(LaxScriptParser.DivisionEqualIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenCond}
	 * labeled alternative in {@link LaxScriptParser#ifCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenCond(LaxScriptParser.IfThenCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElseCond}
	 * labeled alternative in {@link LaxScriptParser#ifCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseCond(LaxScriptParser.IfThenElseCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(LaxScriptParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(LaxScriptParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(LaxScriptParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicRangeFormat}
	 * labeled alternative in {@link LaxScriptParser#forRangeLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicRangeFormat(LaxScriptParser.BasicRangeFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stepRangeFormat}
	 * labeled alternative in {@link LaxScriptParser#forRangeLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepRangeFormat(LaxScriptParser.StepRangeFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LaxScriptParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(LaxScriptParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPrecedence}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPrecedence(LaxScriptParser.ExpPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(LaxScriptParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(LaxScriptParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorization}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorization(LaxScriptParser.FactorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link LaxScriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(LaxScriptParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link LaxScriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(LaxScriptParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LaxScriptParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#sentenceOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenceOp(LaxScriptParser.SentenceOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(LaxScriptParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#iden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIden(LaxScriptParser.IdenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#specialChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialChar(LaxScriptParser.SpecialCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaxScriptParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(LaxScriptParser.NumContext ctx);
}