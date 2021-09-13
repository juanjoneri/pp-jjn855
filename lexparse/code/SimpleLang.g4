grammar SimpleLang;

r   : program EOF ;

program 
    : 'program' ID declaration* ;      // Match the start of the program
declaration
    : constDecl
    ;

constDecl 
    : 'const' ID '=' ( numConst | charConst ) ';' ;

numConst : DIGIT DIGIT* ;
charConst : '\'' ~NON_PRINTABLE '\'' ;

DIGIT : [0-9] ;
ID : [a-zA-Z][a-zA-Z0-9_]* ;
NON_PRINTABLE : [\r\n] ;

WS : [ \t\r\n]+ -> skip ;          // skip spaces, tabs, newlines
OTHER: . ;
