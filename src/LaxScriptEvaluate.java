import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LaxScriptEvaluate extends LaxScriptBaseVisitor{

    static Map<String, Map<String, String>> evalMemory = new HashMap<>();

    @Override
    public Object visitP(LaxScriptParser.PContext ctx) {
        Map<String, String> integerMap = new HashMap<>();
        Map<String, String> booleanMap = new HashMap<>();
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
        String variable = ctx.iden().getText();
        evalMemory.get("integer").put(variable,null);
        return 0;
    }

    @Override
    public Object visitDeclarationString(LaxScriptParser.DeclarationStringContext ctx) {
        String variable = ctx.iden().getText();
        evalMemory.get("string").put(variable,null);
        return 0;
    }

    @Override
    public Object visitDeclarationBoolean(LaxScriptParser.DeclarationBooleanContext ctx) {
        String variable = ctx.iden().getText();
        evalMemory.get("boolean").put(variable,null);
        return 0;
    }

    @Override
    public Object visitInit(LaxScriptParser.InitContext ctx) {
        return super.visitInit(ctx);
    }

    @Override
    public Object visitPrintStr(LaxScriptParser.PrintStrContext ctx) {
        String lines = ctx.line().getText();
        System.out.println(lines.replaceAll("[\"]",""));
        return 0;
    }

    @Override
    public Object visitPrintExpr(LaxScriptParser.PrintExprContext ctx) {
        System.out.println(visit(ctx.expr()));
        return 0;
    }

    @Override
    public Object visitNumberIntInit(LaxScriptParser.NumberIntInitContext ctx) {

        String var = ctx.iden().getText();
        String number = ctx.num().getText();
        evalMemory.get("integer").put(var,number);
        return 0;
    }

    @Override
    public Object visitIdentifierIntInit(LaxScriptParser.IdentifierIntInitContext ctx) {
        String first_id = ctx.iden(0).getText();
        String second_id = ctx.iden(1).getText();
        boolean keyExistsInMemory = false;

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();
        for(Map.Entry<String, Map<String, String>> entry : entries) {
            if (!keyExistsInMemory) {
                String key = entry.getKey();
                Map<String, String> intMemoryMapValue = evalMemory.get(key);
                for (String val: intMemoryMapValue.keySet()) {
                    if (val.equals(second_id)) {
                        String keyValue = intMemoryMapValue.get(val);
                        evalMemory.get("integer").put(first_id, keyValue);
                        keyExistsInMemory = true;
                        break;
                    }
                }
            }

        }

        return 0;
    }

    @Override
    public Object visitExpressionIntInit(LaxScriptParser.ExpressionIntInitContext ctx) {
        String identifier = ctx.iden().getText();
        String result = visit(ctx.expr()).toString();
        evalMemory.get("integer").put(identifier, result);
        return 0;
    }

    @Override
    public Object visitIdentifierStrInit(LaxScriptParser.IdentifierStrInitContext ctx) {
        String first_id = ctx.iden(0).getText();
        String second_id = ctx.iden(1).getText();

        boolean keyExistsInMemory = false;

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();
        for(Map.Entry<String, Map<String, String>> entry : entries) {
            if (!keyExistsInMemory) {
                String key = entry.getKey();
                Map<String, String> stringMemoryMapValue = evalMemory.get(key);
                for (String val: stringMemoryMapValue.keySet()) {
                    if (val.equals(second_id)) {
                        String keyValue = stringMemoryMapValue.get(val);
                        evalMemory.get("string").put(first_id, keyValue);
                        keyExistsInMemory = true;
                        break;
                    }
                }
            }

        }

        return 0;
    }

    @Override
    public Object visitSentenceStrInit(LaxScriptParser.SentenceStrInitContext ctx) {
        String first_id = ctx.iden().getText();
        String second_id = ctx.line().getText();
        evalMemory.get("string").put(first_id,second_id);
        return 0;
    }

    @Override
    public Object visitIdentifierBoolInit(LaxScriptParser.IdentifierBoolInitContext ctx) {
        String first_id = ctx.iden(0).getText();
        String second_id = ctx.iden(1).getText();

        boolean keyExistsInMemory = false;

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();
        for(Map.Entry<String, Map<String, String>> entry : entries) {
            if (!keyExistsInMemory) {
                String key = entry.getKey();
                Map<String, String> boolMemoryMapValue = evalMemory.get(key);
                for (String val: boolMemoryMapValue.keySet()) {
                    if (val.equals(second_id)) {
                        String keyValue = boolMemoryMapValue.get(val);
                        evalMemory.get("boolean").put(first_id, keyValue);
                        keyExistsInMemory = true;
                        break;
                    }
                }
            }

        }

        return 0;
    }

    @Override
    public Object visitIdentifierBoolVal(LaxScriptParser.IdentifierBoolValContext ctx) {
        String identifier = ctx.iden().getText();
        String val = ctx.boolVal.getText();
        evalMemory.get("boolean").put(identifier,val);
        return 0;
    }

    @Override
    public Object visitPreIncrement(LaxScriptParser.PreIncrementContext ctx) {
        int count = 0;
        String identifier = ctx.iden().getText();

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();

        for(Map.Entry<String, Map<String, String>> entry : entries) {
            String key = entry.getKey();
            Map<String, String> intMemoryMapValue = evalMemory.get(key);
            if(intMemoryMapValue.containsKey(identifier)){
                count = Integer.parseInt(intMemoryMapValue.get(identifier));
                ++count;
                evalMemory.get("integer").put(identifier, String.valueOf(count));
            }
        }

        return count;
    }

    @Override
    public Object visitPostIncrement(LaxScriptParser.PostIncrementContext ctx) {
        int count = 0;
        String identifier = ctx.iden().getText();

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();

        for(Map.Entry<String, Map<String, String>> entry : entries) {
            String key = entry.getKey();
            Map<String, String> intMemoryMapValue = evalMemory.get(key);
            if(intMemoryMapValue.containsKey(identifier)){
                count = Integer.parseInt(intMemoryMapValue.get(identifier));
                count++;
                evalMemory.get("integer").put(identifier, String.valueOf(count));
            }
        }

        return count;
    }

    @Override
    public Object visitPreDecrement(LaxScriptParser.PreDecrementContext ctx) {
        int count = 0;
        String identifier = ctx.iden().getText();

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();

        for(Map.Entry<String, Map<String, String>> entry : entries) {
            String key = entry.getKey();
            Map<String, String> intMemoryMapValue = evalMemory.get(key);
            if(intMemoryMapValue.containsKey(identifier)){
                count = Integer.parseInt(intMemoryMapValue.get(identifier));
                --count;
                evalMemory.get("integer").put(identifier, String.valueOf(count));
            }
        }

        return count;
    }

    @Override
    public Object visitPostDecrement(LaxScriptParser.PostDecrementContext ctx) {
        int count = 0;
        String identifier = ctx.iden().getText();

        Set<Map.Entry<String, Map<String, String>>> entries = evalMemory.entrySet();

        for(Map.Entry<String, Map<String, String>> entry : entries) {
            String key = entry.getKey();
            Map<String, String> intMemoryMapValue = evalMemory.get(key);
            if(intMemoryMapValue.containsKey(identifier)){
                count = Integer.parseInt(intMemoryMapValue.get(identifier));
                count--;
                evalMemory.get("integer").put(identifier, String.valueOf(count));
            }
        }

        return count;
    }

    @Override
    public Object visitTernaryInt(LaxScriptParser.TernaryIntContext ctx) {
        int resVal;
        String identifier = ctx.iden().getText();
        if((boolean) visit(ctx.cond())) {
            resVal = Integer.parseInt((String) visit(ctx.expr(0)));
        } else {
            resVal = Integer.parseInt((String) visit(ctx.expr(1)));
        }
        evalMemory.get("integer").put(identifier, String.valueOf(resVal));
        return 0;
    }

    @Override
    public Object visitTernaryStr(LaxScriptParser.TernaryStrContext ctx) {
        String resVal;
        String identifier = ctx.iden().getText();
        if((boolean) visit(ctx.cond())) {
            resVal = ctx.line(0).getText();
        } else {
            resVal = ctx.line(1).getText();
        }
        evalMemory.get("string").put(identifier, resVal);
        return 0;
    }

    @Override
    public Object visitTernaryBool(LaxScriptParser.TernaryBoolContext ctx) {
        String resVal;
        String id = ctx.iden().getText();
        if((boolean) visit(ctx.cond())) {
            resVal = ctx.boolVal.getText();
        } else {
            resVal = ctx.boolVal.getText();
        }
        evalMemory.get("boolean").put(id, String.valueOf(resVal));
        return 0;
    }

    @Override
    public Object visitConditionOp(LaxScriptParser.ConditionOpContext ctx) {
        int first_expr = Integer.parseInt(visit(ctx.expr(0)).toString());
        int second_expr = Integer.parseInt(visit(ctx.expr(1)).toString());
        String conditionalOperator = ctx.condOp.getText();

//        if(conditionalOperator == "<") {
//            return first_expr < second_expr;
//        } else if(conditionalOperator == "<=") {
//            return first_expr <= second_expr;
//        } else if(conditionalOperator == ">") {
//            return first_expr > second_expr;
//        } else if(conditionalOperator == ">=") {
//            return first_expr >= second_expr;
//        } else if(conditionalOperator == "==") {
//            return first_expr == second_expr;
//        } else if(conditionalOperator == "!=") {
//            return first_expr != second_expr;
//        }
        switch (conditionalOperator) {
            case "==":
                return first_expr == second_expr;
            case "<":
                return first_expr < second_expr;
            case ">":
                return first_expr > second_expr;
            case "<=":
                return first_expr <= second_expr;
            case ">=":
                return first_expr >= second_expr;
            case "!=":
                return first_expr != second_expr;
        }

        return 0;
    }

    @Override
    public Object visitConditionBoolOp(LaxScriptParser.ConditionBoolOpContext ctx) {
        boolean booleanVal = Boolean.parseBoolean(ctx.boolVal.getText());
        return booleanVal;
    }

    @Override
    public Object visitNumberAssignment(LaxScriptParser.NumberAssignmentContext ctx) {
        String identifier = ctx.iden().getText();
        String num = ctx.num().getText();
        evalMemory.get("integer").put(identifier, num);
        return 0;
    }

    @Override
    public Object visitBooleanAssignment(LaxScriptParser.BooleanAssignmentContext ctx) {
        String identifier = ctx.iden().getText();
        String val = ctx.boolVal.getText();
        evalMemory.get("boolean").put(identifier, val);
        return 0;
    }

    @Override
    public Object visitStringAssignment(LaxScriptParser.StringAssignmentContext ctx) {
        String identifier = ctx.iden().getText();
        String line = ctx.line().getText();
        evalMemory.get("string").put(identifier, line);
        return 0;
    }

    @Override
    public Object visitExpressionAssignment(LaxScriptParser.ExpressionAssignmentContext ctx) {
        String identifier = ctx.iden().getText();
        String expr = visit(ctx.expr()).toString();
        evalMemory.get("integer").put(identifier, expr);
        return 0;
    }

    @Override
    public Object visitAdditionEqualNum(LaxScriptParser.AdditionEqualNumContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden().getText();
        String y = ctx.num().getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(y);
                value1+=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitSubtractionEqualNum(LaxScriptParser.SubtractionEqualNumContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden().getText();
        String y = ctx.num().getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(y);
                value1-=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitMultiplicationEqualNum(LaxScriptParser.MultiplicationEqualNumContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden().getText();
        String y = ctx.num().getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(y);
                value1*=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitDivisionEqualNum(LaxScriptParser.DivisionEqualNumContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden().getText();
        String y = ctx.num().getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(y);
                value1/=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitAdditionEqualID(LaxScriptParser.AdditionEqualIDContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden(0).getText();
        String y = ctx.iden(1).getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(map.get(y));
                value1+=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitSubtractionEqualID(LaxScriptParser.SubtractionEqualIDContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden(0).getText();
        String y = ctx.iden(1).getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(map.get(y));
                value1-=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitMultiplicationEqualID(LaxScriptParser.MultiplicationEqualIDContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden(0).getText();
        String y = ctx.iden(1).getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(map.get(y));
                value1*=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitDivisionEqualID(LaxScriptParser.DivisionEqualIDContext ctx) {
        int value1 = 0;
        int value2 = 0;
        String x = ctx.iden(0).getText();
        String y = ctx.iden(1).getText();
        for(String integer :evalMemory.keySet()){
            Map<String,String> map = evalMemory.get(integer);
            if(map.containsKey(x)){
                value1= Integer.parseInt(map.get(x));
                value2= Integer.parseInt(map.get(y));
                value1/=value2;
                evalMemory.get("integer").put(x, String.valueOf(value1));
            }
        }
        return 0;
    }

    @Override
    public Object visitIfThenCond(LaxScriptParser.IfThenCondContext ctx) {
        if((boolean)visit(ctx.cond())) {
            visit(ctx.k());
        }
        return 0;
    }

    @Override
    public Object visitIfThenElseCond(LaxScriptParser.IfThenElseCondContext ctx) {
        if((boolean)visit(ctx.cond())) {
            visit(ctx.k(0));
        } else {
            visit(ctx.k(1));
        }
        return 0;
    }

    @Override
    public Object visitWhileLoop(LaxScriptParser.WhileLoopContext ctx) {
        while((boolean)visit(ctx.cond()))
        {
            visit(ctx.k());
        }
        return 0;
    }

    @Override
    public Object visitForLoop(LaxScriptParser.ForLoopContext ctx) {
        for(visit(ctx.int_());(boolean)visit(ctx.cond());visit(ctx.option()))
        {
            visit(ctx.k());
        }
        return 0;
    }

    @Override
    public Object visitOption(LaxScriptParser.OptionContext ctx) {
        return super.visitOption(ctx);
    }

    @Override
    public Object visitBasicRangeFormat(LaxScriptParser.BasicRangeFormatContext ctx) {
        int value1 = Integer.parseInt(ctx.num(0).getText());
        int value2 = Integer.parseInt(ctx.num(1).getText());
        String str = ctx.iden().getText();
        evalMemory.get("integer").put(str,null);
        for(int a =value1 ; a < value2; a++ )
        {   evalMemory.get("integer").put(str, String.valueOf(a));
            visit(ctx.k());
        }
        return 0;
    }

    @Override
    public Object visitStepRangeFormat(LaxScriptParser.StepRangeFormatContext ctx) {
        int value1 = Integer.parseInt(ctx.num(0).getText());
        int value2 = Integer.parseInt(ctx.num(1).getText());
        int step = Integer.parseInt(ctx.num(2).getText());
        String str = ctx.iden().getText();
        evalMemory.get("integer").put(str,null);
        for(int a =value1 ; a < value2; a+=step )
        {   evalMemory.get("integer").put(str, String.valueOf(a));
            visit(ctx.k());
        }
        return 0;
    }

    @Override
    public Object visitAdd(LaxScriptParser.AddContext ctx) {
        int str =  Integer.parseInt(String.valueOf(visit(ctx.element())));
        int y =  Integer.parseInt(String.valueOf(visit(ctx.expr())));
        int res = str + y;
        return res;
    }

    @Override
    public Object visitSubtract(LaxScriptParser.SubtractContext ctx) {
        int str = Integer.parseInt(String.valueOf(visit(ctx.element())));
        int y =  Integer.parseInt(String.valueOf(visit(ctx.expr())));
        int res = str - y;
        return res;
    }

    @Override
    public Object visitExpPrecedence(LaxScriptParser.ExpPrecedenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiply(LaxScriptParser.MultiplyContext ctx) {
        int str =  Integer.parseInt(String.valueOf(visit(ctx.value())));
        int y =  Integer.parseInt(String.valueOf(visit(ctx.element())));
        int res = str * y;
        return res;
    }

    @Override
    public Object visitDivide(LaxScriptParser.DivideContext ctx) {
        int str =  Integer.parseInt(String.valueOf(visit(ctx.value())));
        int y =  Integer.parseInt(String.valueOf(visit(ctx.element())));
        int res = str / y;
        return res;
    }

    @Override
    public Object visitFactorization(LaxScriptParser.FactorizationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprID(LaxScriptParser.ExprIDContext ctx) {
        int value1 = 0;
        String value2 = null;
        String id = ctx.iden().getText();
        if(id.getClass().equals("class java.lang.Integer"))
        {
            for (String type : evalMemory.keySet()) {
                Map<String, String> map = evalMemory.get(type);
                if (map.containsKey(id)) {
                    value1 = Integer.parseInt(map.get(id));
                }
            }
            return value1;
        }else{
            for (String type : evalMemory.keySet()) {
                Map<String, String> map = evalMemory.get(type);
                if (map.containsKey(id)) {
                    value2 = (map.get(id));
                }
            }
            return value2;
        }
    }

    @Override
    public Object visitExprNum(LaxScriptParser.ExprNumContext ctx) {
        return ctx.num().getText();
    }

    @Override
    public Object visitLine(LaxScriptParser.LineContext ctx) {
        System.out.println(ctx.sentenceOp());
        return 0;
    }

    @Override
    public Object visitSentenceOp(LaxScriptParser.SentenceOpContext ctx) {
        return super.visitSentenceOp(ctx);
    }

    @Override
    public Object visitIden(LaxScriptParser.IdenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSpecialChar(LaxScriptParser.SpecialCharContext ctx) {
        return super.visitSpecialChar(ctx);
    }

    @Override
    public Object visitNum(LaxScriptParser.NumContext ctx) {
        return visitChildren(ctx);
    }
}
