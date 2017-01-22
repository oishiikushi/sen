grammar PlayField;
file  : row* EOF ;
row   : value (Separator value)* (LineBreak | EOF) ;
value : SimpleValue;
Separator   : ';' ;
LineBreak   : '\r'?'\n' | '\r';
SimpleValue : ('0'|'1'|'2'|'3'|'4'|'5') ;
