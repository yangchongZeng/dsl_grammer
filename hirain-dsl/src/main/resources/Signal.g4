grammar Signal; //信号词法规则

signal_input : stat+;

stat : expr
    | expr NEWLINE
    | NEWLINE;


/* 表达式：（参数 + 一目运算符） | （参数1 + 二目运算符 + 参数2） | 函数 | （'(' + 表达式 + ')’） */
expr : param unary_op
    | param binary_op param
    | function
    | LEFT_BRACKET expr RIGHT_BRACKET;

/* 函数： 函数名称 + ( + 表达式 + ) */
function : function_name LEFT_BRACKET expr RIGHT_BRACKET;

function_name :
    F_SUM
    | F_COUNT
    | F_AVG
    | F_VAR
    | F_STD
    | F_MIN
    | F_MAX
    | C_SIN
    | C_COS
    | C_TAN
   ;

unary_op : DERI; // 一目运算符

/* 二目运算符 */
binary_op : MUL | DIV | ADD | SUB | MOD | MORE_THAN | LESS_THAN
            | MT_EQUAL | LT_EQUAL | EQUAL | NOT_EQUAL | OR_OP
            | AND_OP | OROR_OP | ANDAND_OP;

/* 参数（变量或者常量） */
param : SV
    | INT
    | FLOAT
    | BOOL
    | LEFT_BRACKET param RIGHT_BRACKET;

/*  */


SV : [a-zA-Z][a-zA-Z0-9_]+; // 信号变量，以字母开头，可以包含字母、数字、下划线

/* 以下为支持的一目操作符 */
DERI : '\''; // 求导
/* 以下为支持的二目操作符 */
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
MOD : '%' ;
MORE_THAN : '>';
LESS_THAN : '<';
MT_EQUAL : '>=';
LT_EQUAL : '<=';
EQUAL : '=';
NOT_EQUAL : '!=';
OR_OP : '|';
AND_OP : '&';
OROR_OP : '||';
ANDAND_OP : '&&';

/* 以下为支持的数据类型 */
INT : [0]|[-]?[1-9][0-9]*; // 整数
FLOAT : INT [\\.][\\d]+; // 浮点数
BOOL : 'true' | 'false'; // 布尔值

/* 括号 */
LEFT_BRACKET : '(';
RIGHT_BRACKET : ')';

/* 以下为支持的聚合函数（输入多条，返回一条） */
F_SUM : 'sum'; // 求和
F_COUNT : 'count'; // 计数
F_AVG : 'avg'; // 求平均值
F_VAR : 'var'; // 求方差
F_STD : 'std'; // 求标准差
F_MIN : 'min'; // 取最小值
F_MAX : 'max'; // 取最大值

/* 以下为支持的计算函数 */
C_SIN : 'sin'; // sin
C_COS : 'cos'; // cos
C_TAN : 'tan'; // tan

NEWLINE
 : '\r'? '\n' | '\r' | '\f'
 ;

fragment SPACES : [ \t]+;

fragment COMMENT : '#' ~[\r\n\f]*;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f')
 ;

SKIP_ : ( SPACES | COMMENT | LINE_JOINING ) -> skip;



