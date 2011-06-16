SYNTAXDEF ssl
FOR <ssl> <ssl.genmodel>
START Specification

OPTIONS {
	resourcePluginID   = "SimulatorSpecificationLanguage.resource";
	resourceUIPluginID = "SimulatorSpecificationLanguage.resource.ui";
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
}

RULES {
	Specification ::= testcases* ;
	
	Testcase ::= given when? then;
	
	Given ::= "Given" conditions+;
	
	When ::= "When" actions+;
	
	Then ::= "Then" observations+;
	
	
	// Conditions
	
	CheckMode ::= "the watch is in mode \"" mode[TEXT] "\"";
	
	CheckLabel ::= "the \"" labelType[TEXT] "\" is showing \"" value[TEXT]? "\"";
	
	CheckTimePastOther ::= firstVariableName[TEXT] " is past " secondVariableName[TEXT];
	
	// Actions
	
	PressButton ::= "the " button[TEXT] " button is pressed";
	
	
	// Observations
	
	ObserveMode ::= "the watch must be in mode \"" mode[TEXT] "\"";
	
	ObserveButton ::= "the " button[TEXT] " button must be called \"" name[TEXT] "\"";
	
	ObserveLabelValue ::= "the \"" labelType[TEXT] "\" must show \"" value[TEXT]? "\"";
	
	ObserveLabelVariable ::= "the \"" labelType[TEXT] "\" must show the " variableName[TEXT];
	
	ObserveVariableChange ::= variableName[TEXT] " must be incremented by 1 " unit[TEXT];
	
	ObserveRing ::= "the alarm must ring";
}