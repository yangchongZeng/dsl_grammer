grammar Signal; //信号词法规则

signal_input : stat+;

stat : expr
    | expr NEWLINE
    | NEWLINE;


/* 表达式：（参数 + 一目运算符） | （参数1 + 二目运算符 + 参数2） | 函数 | （'(' + 表达式 + ')’） */
expr :
      expr unary_op                         # UnaryExpr // 一目运算
    | expr binary_op1 expr                  # BinaryExpr1 //
    | expr binary_op2 expr                  # BinaryExpr2
    | expr binary_op3 expr                  # BinaryExpr3
    | expr binary_op4 expr                  # BinaryExpr4
    | expr binary_op5 expr                  # BinaryExpr5
    | function                              # FunctionExpr // 函数
    | param                                 # ParamExpr //参数
    | LEFT_BRACKET expr RIGHT_BRACKET       # ExprWithBracket;

/* 函数： 函数名称 + ( + 表达式 + ) */
function :
      function_name LEFT_BRACKET expr RIGHT_BRACKET;

function_name :
    F_SUM           # Sum
    | F_COUNT       # Count
    | F_AVG         # Avg
    | F_VAR         # Var
    | F_STD         # Std
    | F_MIN         # Min
    | F_MAX         # Max
    | C_SIN         # Sin
    | C_COS         # Cos
    | C_TAN         # Tan
   ;

unary_op : DERI # Deri; // 一目运算符

/* 二目运算符 优先级1 最高 （乘除取模运算） */
binary_op1 :
      MUL           # Mul
    | DIV           # Div
    | MOD           # Mod;
/* 二目运算符 优先级2 较高 （加减运算） */
binary_op2 :
      ADD           # Add
    | SUB           # Sub;
/* 二目运算符 优先级3 中 （关系运算） */
binary_op3 :
      MORE_THAN     # MoreThan
    | LESS_THAN     # LessThan
    | MT_EQUAL      # MoreThanEqual
    | LT_EQUAL      # LessThanEqual
    | EQUAL         # Equal
    | NOT_EQUAL     # NotEqual;

/* 二目运算符 优先级4 较低 （位运算） */
binary_op4 :
      OR_OP         # OrOperate
    | AND_OP        # AndOperate;
/* 二目运算符 优先级5 很低 （逻辑运算） */
binary_op5:
      OROR_OP       # OrOrOperate
    | ANDAND_OP     # AndAndOperate;

/* 参数（变量或者常量） */
param : variable
    | INT
    | FLOAT
    | BOOL;

variable : SV # SignalVariable;

/*  */



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

SV : [a-zA-Z][a-zA-Z0-9_]*; // 信号变量，以字母开头，可以包含字母、数字、下划线
/* 以下为支持的数据类型 */
INT : [0]|[-]?[1-9][0-9]*; // 整数
FLOAT : INT [\\.][\\d]+; // 浮点数
BOOL : 'true' | 'false'; // 布尔值
NEWLINE
 : '\r'? '\n'
 ;



fragment SPACES : [ \t]+;

fragment COMMENT : '#' ~[\r\n\f]*;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f')
 ;

SKIP_ : ( SPACES | COMMENT | LINE_JOINING ) -> skip;



