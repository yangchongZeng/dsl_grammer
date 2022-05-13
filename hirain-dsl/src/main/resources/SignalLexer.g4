lexer grammar SignalLexer; //信号词法规则

options {
    language=java; //定义语言为JAVA
}

@header {
    package com.hirain.signal.lexer; //定义生成的代码的package
}

SV : [a-zA-Z][\w]+; // 信号变量，以字母开头，可以包含字母、数字、下划线

/* 以下为支持的操作符 */
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
FLOAT : INT [\.][\d]+; // 浮点数

/* 以下为支持的聚合函数（输入多条，返回一条） */
F_SUM : 'sum'; // 求和
F_COUNT : 'count'; // 计数
F_AVG : 'avg'; // 求平均值
F_VAR : 'var'; // 求方差
F_STD : 'std'; // 求标准差
F_MIN : 'min'; // 取最小值
F_MAX : 'max'; // 取最大值
