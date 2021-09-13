grammar SimpleLang;

r   : program EOF ;

program 
    : 'program' ID declaration* ;      // Match the start of the program
declaration
    : constDecl
    ;

constDecl 
    : 'const' ID '=' NUM_CONST ';' ;

NUM_CONST : [1-9][0-9]* ;           // Match valid numbers
ID : [a-zA-Z][a-zA-Z0-9_]* ;        // Match and identifier

WS : [ \t\r\n]+ -> skip ;          // skip spaces, tabs, newlines
OTHER: . ;
