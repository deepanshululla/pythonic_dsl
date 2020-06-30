grammar PythonicDsl;

program: statement+ EOF ;

statement
    : assignment_statement
    | function_statement
    | if_statement
    ;

assignment_statement: ID '=' expression NEWLINE;

expression
    : '(' expression ')'                                        #eqPar
    | list_def                                                  #eqList
    | hashmap                                                   #eqHashmap
    | function_statement                                        #eqFunc
    | left = expression operator = (MUL|DIV) right = expression #eqMUL
    | left = expression operator = (ADD|SUB) right = expression #eqAdd
    | ID'['expression']'                                        #eqArrayIdx
    | ID                                                        #eqVar
    | DOUBLE                                                    #eqDbl
    | INT                                                       #eqInt
    | STRING                                                    #eqStr
    ;

boolean_expression
    : left = expression '==' right = expression                 #boolEq
    | left = expression '>' right = expression                  #boolGt
    | left = expression '<' right = expression                  #boolLt
    ;

function_statement: ID '(' arguments_list? ')' NEWLINE*;
arguments_list: expression (',' expression)* ;

if_statement: if_fragment code_block (elif_statement | else_statement)? ;

elif_statement: elif_fragment code_block (elif_statement | else_statement)? ;
else_statement: else_fragment code_block ;

if_fragment: 'if' boolean_expression ':' NEWLINE? ;
elif_fragment: 'elif' boolean_expression ':' NEWLINE?;

else_fragment: 'else:' NEWLINE? ;
code_block: '{' NEWLINE? statement+ '}' NEWLINE?;

list_def
    : '[' values_list ']' NEWLINE?
    | '[' ']' // empty array
    ;

array_idx: list_def'['INT']' NEWLINE?;

values_list: list_value(',' list_value)*;

list_value: list_def
    | hashmap
    | expression
    ;

hashmap
    :   '{' keyvaluepairs (',' keyvaluepairs)* '}'
    |   '{' '}' // empty object
    ;
keyvaluepairs:   STRING ':' hashmapvalue ;

hashmapvalue
    :   hashmap
    |   expression
    ;

INT: '-'? DIGIT+ ;

DOUBLE: '-'? DIGIT+ '.' DIGIT+
    | '-'? '.' DIGIT+
    ;

LINE_COMMENT: '#' .*? NEWLINE+ -> skip;
COMMENT: '"""' .*? '"""' NEWLINE ->skip;

ID: ([a-z]) ([a-z] | [A-Z] | [0-9] | '_')* ;



MUL: '*';
DIV: '/';
SUB: '-';
ADD: '+';

STRING : '"' (ESC|.)*? '"' ;

NEWLINE: [\r\n]+ ;

WS: [ \t]+ -> skip;

fragment
ESC: '\\"'|'\\\\';
DIGIT: [0-9];