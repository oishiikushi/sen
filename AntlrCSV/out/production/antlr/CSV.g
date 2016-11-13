grammar CSV;
file : row* EOF ;
row : value (Seperator value)* (LineBreak | EOF) ;
value : SimpleValue | QuotedValue ;
Separator : ',' | ';' ;
// line break
LineBreak   : '\r'?'\n' | '\r';
// anything but a line-breaking, seperator or quoting chracter is allowed
SimpleValue : ~(','|';'|'\r'|'\n'|'"')+ ;
// Anything but a quoting character is allowed
QuotedValue : '"'('""'|~'"')*'"' ;