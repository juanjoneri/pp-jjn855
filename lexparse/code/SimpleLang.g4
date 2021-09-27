grammar SimpleLang;

// Syntax

r   
    : program EOF 
    ;

program 
    : PROGRAM ID (constDecl | varDecl | classDecl | enumDecl | interfaceDecl)* OCB methodDecl* CCB
    ;

constDecl 
    : CONST type ID ASSIGN (NUM | CHAR | BOOL) (COMMA ID ASSIGN (NUM | CHAR | BOOL))* SM
    ;

enumDecl
    : ENUM ID OCB ID (ASSIGN NUM)? (COMMA ID (ASSIGN NUM)?)* CCB
    ;

varDecl
    : type ID (OB CB)? (COMMA ID (OB CB)?)* SM
    ;

classDecl
    : CLASS ID (EXTENDS type)? (IMPLEMENTS type (COMMA type)*)? OCB varDecl* (OCB methodDecl* CCB)? CCB
    ;

interfaceDecl
    : INTERFACE ID OCB interfaceMethodDecl* CCB
    ;

interfaceMethodDecl
    : (type | VOID) ID OP formParams? CP SM
    ;

methodDecl
    : (type | VOID) ID OP formParams? CP varDecl* OCB statement* CCB
    ;

formParams
    : type ID (OB CB)? (COMMA type ID (OB CB)?)*
    ;

type 
    : ID 
    ;

statement
    :  designatorStatement SM
    | IF OP condition CP statement (ELSE statement)?
    | FOR OP designatorStatement? SM condition? SM designatorStatement? CP
    | BREAK SM
    | CONTINUE SM
    | RETURN (expr)? SM
    | READ OP designator CP SM
    | PRINT OP expr (COMMA NUM)? CP SM
    | OCB statement* CCB
    ;

designatorStatement
    : designator (assignop expr | OP actPars? CP | PP | MM)
    ;

actPars 
    : expr (COMMA expr)*
    ;

condition
    : condTerm (OR condTerm)*
    ;

condTerm
    : condFact (AND condFact)*
    ;

condFact
    : expr (relop expr)?
    ;

expr
    : MINUS? term (addop term)*
    ;

term
    : factor (mulop factor)*
    ;

factor 
    : designator (OP actPars? CP)?
    | NUM
    | CHAR
    | BOOL
    | NEW type (OB expr CB)?
    | OP expr CP
    ;

designator
    : ID (DOT ID | OB expr CB)*
    ;

assignop
    : ASSIGN
    ;

relop
    : EQUALS | NOT_EQUALS | GT | GTOE | LT | LTOE
    ;

addop
    : PLUS | MINUS
    ;

mulop
    : TIMES | DIVIDE | REMINDER
    ;

// # Lexical structures

// ## Keywords

PROGRAM : 'program' ;
BREAK : 'break' ;
CLASS : 'class' ;
INTERFACE : 'interface' ;
ENUM : 'enum' ;
ELSE : 'else' ;
CONST : 'const' ;
IF : 'if' ;
NEW : 'new' ;
PRINT : 'print' ;
READ : 'read' ;
RETURN : 'return' ;
VOID : 'void' ;
FOR : 'for' ;
IMPLEMENTS : 'implements' ;
EXTENDS : 'extends' ;
CONTINUE : 'continue' ;

// ## Operators

PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIVIDE : '/' ;
REMINDER : '%' ;
EQUALS : '==' ;
NOT_EQUALS : '!=' ;
GT : '>' ;
GTOE : '>=' ;
LT : '<' ;
LTOE : '<=' ;
AND : '&&' ;
OR : '||' ;
ASSIGN : '=' ;
PP : '++' ;
MM : '--' ;
SM : ';' ;
COMMA : ',' ;
DOT : '.' ;
OP : '(' ;
CP : ')' ;
OB : '[' ;
CB : ']' ;
OCB : '{' ;
CCB : '}' ;

// ## Token types

BOOL : ('true' | 'false') ;
NUM : [0-9][0-9]* ;
CHAR : '\'' ~['\\\r\n] '\'' ; 
ID : [a-zA-Z][a-zA-Z0-9_]* ;

// ## Comments

COMMENT : '//' ~[\r\n]* -> skip ;

WS : [ \t\r\n]+ -> skip ;