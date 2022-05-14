grammar Hello;

prog : stat+;

stat: expr NEWLINE          # printExpr
    | ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;

expr:
  expr op=('*'|'/') expr   # MulDiv
| expr op=('+'|'-') expr        # AddSub
| expr op='%' expr              # Mod
| INT                           # int
| ID                            # id

| '(' expr ')'                  # parens
| 'sin' expr                    # Sin
| 'cos' expr                    # Cos

;

MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
MOD : '%' ;
SIN : 'sin' ;
COS : 'cos' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip;