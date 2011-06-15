lexer grammar InternalSpecificationLanguage;
@header {
package simulator.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'Specification' ;
T12 : '{' ;
T13 : 'testcases' ;
T14 : ',' ;
T15 : '}' ;
T16 : 'Testcase' ;
T17 : 'given' ;
T18 : 'when' ;
T19 : 'then' ;
T20 : 'Given' ;
T21 : 'conditions' ;
T22 : 'When' ;
T23 : 'actions' ;
T24 : 'Then' ;
T25 : 'observations' ;
T26 : 'SetMode' ;
T27 : 'mode' ;
T28 : 'PressButton' ;
T29 : 'button' ;
T30 : 'ObserveMode' ;
T31 : 'ObserveBinding' ;
T32 : 'ObserveDisplay' ;
T33 : 'value' ;

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1150
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1152
RULE_INT : ('0'..'9')+;

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1154
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1156
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1158
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1160
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g" 1162
RULE_ANY_OTHER : .;


