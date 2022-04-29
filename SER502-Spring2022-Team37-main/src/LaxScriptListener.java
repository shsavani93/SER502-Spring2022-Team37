// Generated from /home/dennis/Desktop/LaxScript/parser/LaxScript.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaxScriptParser}.
 */
public interface LaxScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(LaxScriptParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(LaxScriptParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#k}.
	 * @param ctx the parse tree
	 */
	void enterK(LaxScriptParser.KContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#k}.
	 * @param ctx the parse tree
	 */
	void exitK(LaxScriptParser.KContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationInteger}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationInteger(LaxScriptParser.DeclarationIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationInteger}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationInteger(LaxScriptParser.DeclarationIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationString}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationString(LaxScriptParser.DeclarationStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationString}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationString(LaxScriptParser.DeclarationStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationBoolean}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBoolean(LaxScriptParser.DeclarationBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationBoolean}
	 * labeled alternative in {@link LaxScriptParser#d}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBoolean(LaxScriptParser.DeclarationBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(LaxScriptParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(LaxScriptParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link LaxScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintStr(LaxScriptParser.PrintStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link LaxScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintStr(LaxScriptParser.PrintStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LaxScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LaxScriptParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LaxScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LaxScriptParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void enterNumberIntInit(LaxScriptParser.NumberIntInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void exitNumberIntInit(LaxScriptParser.NumberIntInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierIntInit(LaxScriptParser.IdentifierIntInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierIntInit(LaxScriptParser.IdentifierIntInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIntInit(LaxScriptParser.ExpressionIntInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionIntInit}
	 * labeled alternative in {@link LaxScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIntInit(LaxScriptParser.ExpressionIntInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierStrInit}
	 * labeled alternative in {@link LaxScriptParser#str}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierStrInit(LaxScriptParser.IdentifierStrInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierStrInit}
	 * labeled alternative in {@link LaxScriptParser#str}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierStrInit(LaxScriptParser.IdentifierStrInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenceStrInit}
	 * labeled alternative in {@link LaxScriptParser#str}.
	 * @param ctx the parse tree
	 */
	void enterSentenceStrInit(LaxScriptParser.SentenceStrInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenceStrInit}
	 * labeled alternative in {@link LaxScriptParser#str}.
	 * @param ctx the parse tree
	 */
	void exitSentenceStrInit(LaxScriptParser.SentenceStrInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierBoolInit}
	 * labeled alternative in {@link LaxScriptParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierBoolInit(LaxScriptParser.IdentifierBoolInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierBoolInit}
	 * labeled alternative in {@link LaxScriptParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierBoolInit(LaxScriptParser.IdentifierBoolInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierBoolVal}
	 * labeled alternative in {@link LaxScriptParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierBoolVal(LaxScriptParser.IdentifierBoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierBoolVal}
	 * labeled alternative in {@link LaxScriptParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierBoolVal(LaxScriptParser.IdentifierBoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrement(LaxScriptParser.PreIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrement(LaxScriptParser.PreIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrement(LaxScriptParser.PostIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrement(LaxScriptParser.PostIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrement(LaxScriptParser.PreDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrement(LaxScriptParser.PreDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrement(LaxScriptParser.PostDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link LaxScriptParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrement(LaxScriptParser.PostDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryInt}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryInt(LaxScriptParser.TernaryIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryInt}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryInt(LaxScriptParser.TernaryIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryStr}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryStr(LaxScriptParser.TernaryStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryStr}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryStr(LaxScriptParser.TernaryStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryBool}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryBool(LaxScriptParser.TernaryBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryBool}
	 * labeled alternative in {@link LaxScriptParser#ternaryOp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryBool(LaxScriptParser.TernaryBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionOp}
	 * labeled alternative in {@link LaxScriptParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterConditionOp(LaxScriptParser.ConditionOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionOp}
	 * labeled alternative in {@link LaxScriptParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitConditionOp(LaxScriptParser.ConditionOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionBoolOp}
	 * labeled alternative in {@link LaxScriptParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterConditionBoolOp(LaxScriptParser.ConditionBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionBoolOp}
	 * labeled alternative in {@link LaxScriptParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitConditionBoolOp(LaxScriptParser.ConditionBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterNumberAssignment(LaxScriptParser.NumberAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitNumberAssignment(LaxScriptParser.NumberAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAssignment(LaxScriptParser.BooleanAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAssignment(LaxScriptParser.BooleanAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(LaxScriptParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(LaxScriptParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignment(LaxScriptParser.ExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link LaxScriptParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignment(LaxScriptParser.ExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterAdditionEqualNum(LaxScriptParser.AdditionEqualNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitAdditionEqualNum(LaxScriptParser.AdditionEqualNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionEqualNum(LaxScriptParser.SubtractionEqualNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionEqualNum(LaxScriptParser.SubtractionEqualNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationEqualNum(LaxScriptParser.MultiplicationEqualNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationEqualNum(LaxScriptParser.MultiplicationEqualNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterDivisionEqualNum(LaxScriptParser.DivisionEqualNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionEqualNum}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitDivisionEqualNum(LaxScriptParser.DivisionEqualNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterAdditionEqualID(LaxScriptParser.AdditionEqualIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitAdditionEqualID(LaxScriptParser.AdditionEqualIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionEqualID(LaxScriptParser.SubtractionEqualIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionEqualID(LaxScriptParser.SubtractionEqualIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationEqualID(LaxScriptParser.MultiplicationEqualIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationEqualID(LaxScriptParser.MultiplicationEqualIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void enterDivisionEqualID(LaxScriptParser.DivisionEqualIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionEqualID}
	 * labeled alternative in {@link LaxScriptParser#synthSugar}.
	 * @param ctx the parse tree
	 */
	void exitDivisionEqualID(LaxScriptParser.DivisionEqualIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenCond}
	 * labeled alternative in {@link LaxScriptParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfThenCond(LaxScriptParser.IfThenCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenCond}
	 * labeled alternative in {@link LaxScriptParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfThenCond(LaxScriptParser.IfThenCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElseCond}
	 * labeled alternative in {@link LaxScriptParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseCond(LaxScriptParser.IfThenElseCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElseCond}
	 * labeled alternative in {@link LaxScriptParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseCond(LaxScriptParser.IfThenElseCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(LaxScriptParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(LaxScriptParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(LaxScriptParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(LaxScriptParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(LaxScriptParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(LaxScriptParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicRangeFormat}
	 * labeled alternative in {@link LaxScriptParser#forRangeLoop}.
	 * @param ctx the parse tree
	 */
	void enterBasicRangeFormat(LaxScriptParser.BasicRangeFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicRangeFormat}
	 * labeled alternative in {@link LaxScriptParser#forRangeLoop}.
	 * @param ctx the parse tree
	 */
	void exitBasicRangeFormat(LaxScriptParser.BasicRangeFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stepRangeFormat}
	 * labeled alternative in {@link LaxScriptParser#forRangeLoop}.
	 * @param ctx the parse tree
	 */
	void enterStepRangeFormat(LaxScriptParser.StepRangeFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stepRangeFormat}
	 * labeled alternative in {@link LaxScriptParser#forRangeLoop}.
	 * @param ctx the parse tree
	 */
	void exitStepRangeFormat(LaxScriptParser.StepRangeFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LaxScriptParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LaxScriptParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(LaxScriptParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(LaxScriptParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPrecedence}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpPrecedence(LaxScriptParser.ExpPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPrecedence}
	 * labeled alternative in {@link LaxScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpPrecedence(LaxScriptParser.ExpPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(LaxScriptParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(LaxScriptParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDivide(LaxScriptParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDivide(LaxScriptParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorization}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 */
	void enterFactorization(LaxScriptParser.FactorizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorization}
	 * labeled alternative in {@link LaxScriptParser#element}.
	 * @param ctx the parse tree
	 */
	void exitFactorization(LaxScriptParser.FactorizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link LaxScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterExprID(LaxScriptParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link LaxScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitExprID(LaxScriptParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link LaxScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(LaxScriptParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link LaxScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(LaxScriptParser.ExprNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LaxScriptParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LaxScriptParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#sentenceOp}.
	 * @param ctx the parse tree
	 */
	void enterSentenceOp(LaxScriptParser.SentenceOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#sentenceOp}.
	 * @param ctx the parse tree
	 */
	void exitSentenceOp(LaxScriptParser.SentenceOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(LaxScriptParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(LaxScriptParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#iden}.
	 * @param ctx the parse tree
	 */
	void enterIden(LaxScriptParser.IdenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#iden}.
	 * @param ctx the parse tree
	 */
	void exitIden(LaxScriptParser.IdenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#specialChar}.
	 * @param ctx the parse tree
	 */
	void enterSpecialChar(LaxScriptParser.SpecialCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#specialChar}.
	 * @param ctx the parse tree
	 */
	void exitSpecialChar(LaxScriptParser.SpecialCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaxScriptParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(LaxScriptParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaxScriptParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(LaxScriptParser.NumContext ctx);
}