SYNTAXDEF ssl
FOR <ssl> <ssl.genmodel>
START Specification

OPTIONS {
	resourcePluginID   = "SimulatorSpecificationLanguage.resource";
	resourceUIPluginID = "SimulatorSpecificationLanguage.resource.ui";
	reloadGeneratorModel = "true";
}

RULES {
	Specification ::= testcases* ;
	
	Testcase ::= given when? then;
	
	Given ::= "given" conditions+;
	
	When ::= "when" actions+;
	
	Then ::= "then" observations+;
	
	
	// Conditions
	
	SetMode ::= "the watch is in mode \"" mode[TEXT] "\"";
	
	
	// Actions
	
	PressButton ::= "the " button[TEXT] " button is pressed";
	
	
	// Observations
	
	ObserveMode ::= "the watch must be in mode \"" mode[TEXT] "\"";
	
	ObserveBinding ::= "the " button[TEXT] " button must be bound to \"" name[TEXT] "\"";
	
	ObserveDisplay ::= "the display must show \"" value[TEXT] "\"";
}