grammar SimpleLang;

// Parser rules (appear in the AST)

r   : program EOF ;

program 
    : 'program' ID (constDecl | varDecl | classDecl | enumDecl | interfaceDecl)* 
    ;

constDecl 
    : 'const' type ID EQ (NUM | CHAR | BOOL) (COMMA ID EQ (NUM | CHAR | BOOL))* SM
    ;

enumDecl
    : 'enum' ID OCB ID (EQ NUM)? (COMMA ID (EQ NUM)?)* CCB
    ;

varDecl
    : type ID (OB CB)? (COMMA ID (OB CB)?)* SM
    ;

classDecl
    : 'class' ID ('extends' type)? ('implements' type (COMMA type)*)? OCB varDecl* (OCB methodDecl* CCB)? CCB
    ;

interfaceDecl
    : 'interface' ID OCB interfaceMethodDecl* CCB
    ;

interfaceMethodDecl
    : (type | 'void') ID OP formParams? CP SM
    ;

methodDecl
    : (type | 'void') ID OB formParams? CB varDecl* OCB statement* CCB
    ;

formParams
    : type ID (OB CB)? (COMMA type ID (OB CB)?)*
    ;

type : ID ;

statement
    : 'TODO'
    ;

// Lex rules (least to most general)

NUM : [0-9][0-9]* ; 
CHAR : '\'' ~['\\\r\n] '\'' ; 
BOOL 
    : 'true' 
    | 'false'
    ;
ID : [a-zA-Z][a-zA-Z0-9_]* ;

// Common

EQ : '=' ;
SM : ';' ;
OB : '[' ;
CB : ']' ;
OCB : '{' ;
CCB : '}' ;
OP : '(' ;
CP : ')' ;
COMMA : ',' ;

WS : [ \t\r\n]+ -> skip ;          // skip spaces, tabs, newlines
OTHER: . ;