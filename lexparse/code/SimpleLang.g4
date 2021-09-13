grammar SimpleLang;

// Parser rules

r   : program EOF ;

program 
    : 'program' ID declaration* ;      // Match the start of the program
declaration
    : constDecl
    ;

constDecl 
    : 'const' type ID '=' ( NUM | CHAR | BOOL ) ';' ;


type : ( 'int' | 'char' | 'bool' ) ;

// Lex rules (least to most general)

NUM : [0-9][0-9]* ; 
CHAR : '\'' ~['\\\r\n] '\'' ;             // TODO: Match a single char
BOOL 
    : 'true' 
    | 'false'
    ;
ID : [a-zA-Z][a-zA-Z0-9_]* ;

WS : [ \t\r\n]+ -> skip ;          // skip spaces, tabs, newlines
OTHER: . ;