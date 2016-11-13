grammar KI;
file  : row* EOF ;
row   : value (LineBreak | EOF) ;
value : PrefixValue SimpleValue;
LineBreak   : '\r'?'\n' | '\r' ;
PrefixValue : 'Der Computer feuert ' ;
SimpleValue : (('auf '('A'|'B'|'C'|'D'|'E'|'F'|'G')('1'|'2'|'3'|'4'|'5'|'6'|'7'))|'per Zufall auf eine noch nicht getroffene Zelle')'.' ;