grammar SimpleLang;

// Parser rules (appear in the AST)

r   : program EOF ;

program 
    : 'program' ID declaration* ;      // Match the start of the program
declaration
    : constDecl
    | enumDecl
    ;

constDecl 
    : 'const' type ID EQ (NUM | CHAR | BOOL) SM
    ;

enumDecl
    : 'enum' ID OB enumValueDecl (COMMA enumValueDecl)* CB
    ;

enumValueDecl : ID (EQ NUM)? ;

type : ('int' | 'char' | 'bool') ;

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
OB : '{' ;
CB : '}' ;
COMMA : ',' ;

WS : [ \t\r\n]+ -> skip ;          // skip spaces, tabs, newlines
OTHER: . ;