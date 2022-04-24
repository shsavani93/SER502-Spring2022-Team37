import java.util.HashMap;
import java.util.Map;

public class LaxScriptEvaluate extends LaxScriptBaseVisitor{

    static Map<String, Object> evalMemory = new HashMap<>();

    @Override
    public Object visitP(LaxScriptParser.PContext ctx) {
        Map<String, Integer> integerMap = new HashMap<>();
        Map<String, Boolean> booleanMap = new HashMap<>();
        Map<String, String> stringMap = new HashMap<>();
        evalMemory.put("string", stringMap);
        evalMemory.put("integer", integerMap);
        evalMemory.put("boolean", booleanMap);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitK(LaxScriptParser.KContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationInteger(LaxScriptParser.DeclarationIntegerContext ctx) {
        return super.visitDeclarationInteger(ctx);
    }

    @Override
    public Object visitDeclarationString(LaxScriptParser.DeclarationStringContext ctx) {
        return super.visitDeclarationString(ctx);
    }

    @Override
    public Object visitDeclarationBoolean(LaxScriptParser.DeclarationBooleanContext ctx) {
        return super.visitDeclarationBoolean(ctx);
    }

    @Override
    public Object visitInit(LaxScriptParser.InitContext ctx) {
        return super.visitInit(ctx);
    }

    @Override
    public Object visitPrintStr(LaxScriptParser.PrintStrContext ctx) {
        return super.visitPrintStr(ctx);
    }

    @Override
    public Object visitPrintExpr(LaxScriptParser.PrintExprContext ctx) {
        return super.visitPrintExpr(ctx);
    }

    @Override
    public Object visitNumberIntInit(LaxScriptParser.NumberIntInitContext ctx) {
        return super.visitNumberIntInit(ctx);
    }

    @Override
    public Object visitIdentifierIntInit(LaxScriptParser.IdentifierIntInitContext ctx) {
        return super.visitIdentifierIntInit(ctx);
    }

    @Override
    public Object visitExpressionIntInit(LaxScriptParser.ExpressionIntInitContext ctx) {
        return super.visitExpressionIntInit(ctx);
    }

    @Override
    public Object visitIdentifierStrInit(LaxScriptParser.IdentifierStrInitContext ctx) {
        return super.visitIdentifierStrInit(ctx);
    }

    @Override
    public Object visitSentenceStrInit(LaxScriptParser.SentenceStrInitContext ctx) {
        return super.visitSentenceStrInit(ctx);
    }

    @Override
    public Object visitIdentifierBoolInit(LaxScriptParser.IdentifierBoolInitContext ctx) {
        return super.visitIdentifierBoolInit(ctx);
    }

    @Override
    public Object visitIdentifierBoolVal(LaxScriptParser.IdentifierBoolValContext ctx) {
        return super.visitIdentifierBoolVal(ctx);
    }

    @Override
    public Object visitPreIncrement(LaxScriptParser.PreIncrementContext ctx) {
        return super.visitPreIncrement(ctx);
    }

    @Override
    public Object visitPostIncrement(LaxScriptParser.PostIncrementContext ctx) {
        return super.visitPostIncrement(ctx);
    }

    @Override
    public Object visitPreDecrement(LaxScriptParser.PreDecrementContext ctx) {
        return super.visitPreDecrement(ctx);
    }

    @Override
    public Object visitPostDecrement(LaxScriptParser.PostDecrementContext ctx) {
        return super.visitPostDecrement(ctx);
    }

    @Override
    public Object visitTernaryInt(LaxScriptParser.TernaryIntContext ctx) {
        return super.visitTernaryInt(ctx);
    }

    @Override
    public Object visitTernaryStr(LaxScriptParser.TernaryStrContext ctx) {
        return super.visitTernaryStr(ctx);
    }

    @Override
    public Object visitTernaryBool(LaxScriptParser.TernaryBoolContext ctx) {
        return super.visitTernaryBool(ctx);
    }

    @Override
    public Object visitConditionOp(LaxScriptParser.ConditionOpContext ctx) {
        return super.visitConditionOp(ctx);
    }

    @Override
    public Object visitConditionBoolOp(LaxScriptParser.ConditionBoolOpContext ctx) {
        return super.visitConditionBoolOp(ctx);
    }

    @Override
    public Object visitNumberAssignment(LaxScriptParser.NumberAssignmentContext ctx) {
        return super.visitNumberAssignment(ctx);
    }

    @Override
    public Object visitBooleanAssignment(LaxScriptParser.BooleanAssignmentContext ctx) {
        return super.visitBooleanAssignment(ctx);
    }

    @Override
    public Object visitStringAssignment(LaxScriptParser.StringAssignmentContext ctx) {
        return super.visitStringAssignment(ctx);
    }

    @Override
    public Object visitExpressionAssignment(LaxScriptParser.ExpressionAssignmentContext ctx) {
        return super.visitExpressionAssignment(ctx);
    }

    // yet to be implemented
    @Override
    public Object visitAdditionEqualNum(LaxScriptParser.AdditionEqualNumContext ctx) {
        return super.visitAdditionEqualNum(ctx);
    }

    @Override
    public Object visitSubtractionEqualNum(LaxScriptParser.SubtractionEqualNumContext ctx) {
        return super.visitSubtractionEqualNum(ctx);
    }

    @Override
    public Object visitMultiplicationEqualNum(LaxScriptParser.MultiplicationEqualNumContext ctx) {
        return super.visitMultiplicationEqualNum(ctx);
    }

    @Override
    public Object visitDivisionEqualNum(LaxScriptParser.DivisionEqualNumContext ctx) {
        return super.visitDivisionEqualNum(ctx);
    }

    @Override
    public Object visitAdditionEqualID(LaxScriptParser.AdditionEqualIDContext ctx) {
        return super.visitAdditionEqualID(ctx);
    }

    @Override
    public Object visitSubtractionEqualID(LaxScriptParser.SubtractionEqualIDContext ctx) {
        return super.visitSubtractionEqualID(ctx);
    }

    @Override
    public Object visitMultiplicationEqualID(LaxScriptParser.MultiplicationEqualIDContext ctx) {
        return super.visitMultiplicationEqualID(ctx);
    }

    @Override
    public Object visitDivisionEqualID(LaxScriptParser.DivisionEqualIDContext ctx) {
        return super.visitDivisionEqualID(ctx);
    }

    @Override
    public Object visitIfThenCond(LaxScriptParser.IfThenCondContext ctx) {
        return super.visitIfThenCond(ctx);
    }

    @Override
    public Object visitIfThenElseCond(LaxScriptParser.IfThenElseCondContext ctx) {
        return super.visitIfThenElseCond(ctx);
    }

    @Override
    public Object visitWhileLoop(LaxScriptParser.WhileLoopContext ctx) {
        return super.visitWhileLoop(ctx);
    }

    @Override
    public Object visitForLoop(LaxScriptParser.ForLoopContext ctx) {
        return super.visitForLoop(ctx);
    }

    @Override
    public Object visitOption(LaxScriptParser.OptionContext ctx) {
        return super.visitOption(ctx);
    }

    @Override
    public Object visitBasicRangeFormat(LaxScriptParser.BasicRangeFormatContext ctx) {
        return super.visitBasicRangeFormat(ctx);
    }

    @Override
    public Object visitStepRangeFormat(LaxScriptParser.StepRangeFormatContext ctx) {
        return super.visitStepRangeFormat(ctx);
    }

    @Override
    public Object visitAdd(LaxScriptParser.AddContext ctx) {
        return super.visitAdd(ctx);
    }

    @Override
    public Object visitSubtract(LaxScriptParser.SubtractContext ctx) {
        return super.visitSubtract(ctx);
    }

    @Override
    public Object visitExpPrecedence(LaxScriptParser.ExpPrecedenceContext ctx) {
        return super.visitExpPrecedence(ctx);
    }

    @Override
    public Object visitMultiply(LaxScriptParser.MultiplyContext ctx) {
        return super.visitMultiply(ctx);
    }

    @Override
    public Object visitDivide(LaxScriptParser.DivideContext ctx) {
        return super.visitDivide(ctx);
    }

    @Override
    public Object visitFactorization(LaxScriptParser.FactorizationContext ctx) {
        return super.visitFactorization(ctx);
    }

    @Override
    public Object visitExprID(LaxScriptParser.ExprIDContext ctx) {
        return super.visitExprID(ctx);
    }

    @Override
    public Object visitExprNum(LaxScriptParser.ExprNumContext ctx) {
        return super.visitExprNum(ctx);
    }

    @Override
    public Object visitLine(LaxScriptParser.LineContext ctx) {
        return super.visitLine(ctx);
    }

    @Override
    public Object visitSentenceOp(LaxScriptParser.SentenceOpContext ctx) {
        return super.visitSentenceOp(ctx);
    }

    @Override
    public Object visitSentence(LaxScriptParser.SentenceContext ctx) {
        return super.visitSentence(ctx);
    }

    @Override
    public Object visitIden(LaxScriptParser.IdenContext ctx) {
        return super.visitIden(ctx);
    }

    @Override
    public Object visitSpecialChar(LaxScriptParser.SpecialCharContext ctx) {
        return super.visitSpecialChar(ctx);
    }

    @Override
    public Object visitNum(LaxScriptParser.NumContext ctx) {
        return super.visitNum(ctx);
    }
}
