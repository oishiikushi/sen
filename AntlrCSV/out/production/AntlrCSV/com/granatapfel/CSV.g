grammar CSV;
file : row* EOF ;
row : value (Separator value)* (LineBreak | EOF) ;
value : SimpleValue | QuotedValue ;
Separator : ',' | ';' ;
// line break
LineBreak   : '\r'?'\n' | '\r';
// anything but a line-breaking, separator or quoting character is allowed
SimpleValue : ~(','|';'|'\r'|'\n'|'"')+ ;
// Anything but a quoting character is allowed
QuotedValue : '"'('""'|~'"')*'"' ;