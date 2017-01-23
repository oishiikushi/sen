grammar PlayField;
file  : row* EOF ;
row   : value (Separator value)* (LineBreak | EOF) ;
value : SimpleValue | WayValue | StartValue | GoalValue | ToGoalValue | HomeValue ;

Separator   : ';' ;
LineBreak   : '\r'?'\n' | '\r';

SimpleValue : 'NO' ;
WayValue    : 'WN'|'WS'|'WW'|'WE' ;
StartValue  : 'S1N'|'S2N'|'S3N'|'S4N'|'S1S'|'S2S'|'S3S'|'S4S'|'S1W'|'S2W'|'S3W'|'S4W'|'S1E'|'S2E'|'S3E'|'S4E' ;
GoalValue   : 'G1'|'G2'|'G3'|'G4'|'G1N'|'G1S'|'G1W'|'G1E'|'G2N'|'G2S'|'G2W'|'G2E'|'G3N'|'G3S'|'G3W'|'G3E'|'G4N'|'G4S'|'G4W'|'G4E' ;
ToGoalValue : 'WNGE'|'WSGE'|'WWGE'|'WEGN'|'WNGW'|'WSGW'|'WWGN'|'WEGS'|'WNGS'|'WSGN'|'WWGS'|'WEGW' ;
HomeValue   : 'H1'|'H2'|'H3'|'H4' ;





