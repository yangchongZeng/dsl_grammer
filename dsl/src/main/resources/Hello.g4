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
| <assoc=right> expr '^' expr   # Xx
| INT                           # int
| ID                            # id
| ARRAY                         # array
| '(' expr ')'                  # parens
| 'sin(' expr ')'               # Sin
| 'cos' expr                    # Cos

;

MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
MOD : '%' ;

ARRAY : '[' .*? ']';

SIN : 'sin' ;
COS : 'cos' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip;

FLOAT : DIGIT+ '.' DIGIT*    // 1.39、3.14159等
      | '.' DIGIT+           // .12 (表示0.12)
      ;

fragment DIGIT : [0-9];    // 匹配单个数字

// 单行注释(以//开头，换行结束)
LINE_COMMENT : '//' .*? '\r'?'\n' -> skip;
// 多行注释(/* */包裹的所有字符)
COMMENT : '/*' .*? '*/' -> skip;