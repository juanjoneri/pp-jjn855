grammar SimpleLang;

root  : 'program' ID EOF ;      // Match the start of the program


ID : [a-zA-Z][a-zA-Z0-9_]* ;             // Match and identifier

WS : [ \t\r\n]+ -> skip ;          // skip spaces, tabs, newlines
OTHER: . ;
