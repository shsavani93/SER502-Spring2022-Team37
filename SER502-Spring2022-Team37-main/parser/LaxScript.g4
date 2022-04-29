grammar LaxScript;

p : k '.';

k : d ';' k
| d ';'
| init ';' k
| init ';'
| print ';' k
| print ';'
| unaryOp ';' k
| unaryOp ';'
| ternaryOp ';' k
| ternaryOp ';'
| assignOp ';' k
| assignOp ';'
| synthSugar ';' k
| synthSugar ';'
| ifCond k
| ifCond
| whileLoop k
| whileLoop
| forLoop k
| forLoop
| forRangeLoop k
| forRangeLoop
;

d :  'int' iden     # declarationInteger
| 'str' iden        # declarationString
|'boolean' iden     # declarationBoolean
;

init : int
| str
| bool;

print : 'print' '(' line ')' #printStr
|'print' '(' expr')'             #printExpr
;

int: 'int' iden '=' num     #numberIntInit
| 'int' iden '=' iden       #identifierIntInit
| 'int' iden '=' expr #expressionIntInit
;

str : 'str' iden '=' iden        #identifierStrInit
|'str' iden '=' '"' line '"'     #sentenceStrInit;

bool :'boolean' iden '=' iden                     #identifierBoolInit
|'boolean' iden '=' boolVal=('true' | 'false')    #identifierBoolVal
;

unaryOp : '++' iden        #preIncrement
| iden '++'                #postIncrement
| '--' iden                #preDecrement
| iden '--'                #postDecrement;

ternaryOp : 'int' iden  '=' cond '?' expr ':' expr                                      #ternaryInt
|'str' iden  '=' cond '?' '"' line '"' ':' '"' line '"'                                 #ternaryStr
|'boolean' iden  '=' cond '?' boolVal=('true' | 'false') ':' boolVal=('true' | 'false') #ternaryBool;

cond : expr condOp=('==' | '<' | '>' | '<=' | '>=' | '!=') expr #conditionOp
| boolVal=('true' | 'false')                                    #conditionBoolOp;

assignOp : iden '=' num               #numberAssignment
| iden '=' boolVal=('true' | 'false') #booleanAssignment
| iden '=' '"' line '"'               #stringAssignment
| iden '=' expr                       #expressionAssignment
;

synthSugar : iden '+=' num    #additionEqualNum
| iden '-=' num               #subtractionEqualNum
| iden '*=' num               #multiplicationEqualNum
| iden '/=' num               #divisionEqualNum
| iden '+=' iden              #additionEqualID
| iden '-=' iden              #subtractionEqualID
| iden '*=' iden              #multiplicationEqualID
| iden '/=' iden              #divisionEqualID
;

ifCond : 'if' '(' cond ')' 'then' '{' k '}'         #ifThenCond
| 'if' '('cond')' 'then' '{' k '}' 'else' '{' k '}' #ifThenElseCond ;

whileLoop : 'while' '(' cond ')' '{' k '}';

forLoop : 'for' '(' int ';'  cond ';'  option ')' '{' k '}';
option : unaryOp | synthSugar;

forRangeLoop : 'for'  iden  'in' 'range' '('num ',' num')' '{' k '}'  #basicRangeFormat
|'for'  iden  'in' 'range' '('num ',' num ',' num ')' '{' k '}'       #stepRangeFormat
;

expr : element '+' expr #add
| element '-' expr      #subtract
| element               #expPrecedence;

element : value '*' element #multiply
| value '/' element         #divide
| value                     #factorization;

value : iden    #exprID
| num           #exprNum;

line : sentenceOp*;
sentenceOp : num |sentence| specialChar;

sentence: String;
String: '"' (~["])+ '"';

iden : Identifier;
Identifier : [a-zA-Z][a-zA-Z0-9_]*;

specialChar : SpecialCharacter;
SpecialCharacter : [$&+,:;=?@#|'<>.^*()%!-];

num : Number;

Number : '0'
    | '-'?[1-9][0-9]*
    ;

Spacing  : [ \t\r\n]+ -> skip;
