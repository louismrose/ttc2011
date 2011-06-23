/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslPrinter implements ssl.resource.ssl.ISslTextPrinter {
	
	protected ssl.resource.ssl.ISslTokenResolverFactory tokenResolverFactory = new ssl.resource.ssl.mopp.SslTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/**
	 * Holds the resource that is associated with this printer. may be null if the
	 * printer is used stand alone.
	 */
	private ssl.resource.ssl.ISslTextResource resource;
	private java.util.Map<?, ?> options;
	
	public SslPrinter(java.io.OutputStream outputStream, ssl.resource.ssl.ISslTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed){
		int pos = 0;
		int neg = 0;
		
		for(String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof ssl.Specification) {
			print_ssl_Specification((ssl.Specification) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.Testcase) {
			print_ssl_Testcase((ssl.Testcase) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.Given) {
			print_ssl_Given((ssl.Given) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.When) {
			print_ssl_When((ssl.When) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.Then) {
			print_ssl_Then((ssl.Then) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.CheckMode) {
			print_ssl_CheckMode((ssl.CheckMode) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.CheckLabel) {
			print_ssl_CheckLabel((ssl.CheckLabel) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.CheckTimePastOther) {
			print_ssl_CheckTimePastOther((ssl.CheckTimePastOther) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.EntersMode) {
			print_ssl_EntersMode((ssl.EntersMode) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.PressButton) {
			print_ssl_PressButton((ssl.PressButton) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.ObserveMode) {
			print_ssl_ObserveMode((ssl.ObserveMode) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.ObserveButton) {
			print_ssl_ObserveButton((ssl.ObserveButton) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.ObserveLabelValue) {
			print_ssl_ObserveLabelValue((ssl.ObserveLabelValue) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.ObserveLabelVariable) {
			print_ssl_ObserveLabelVariable((ssl.ObserveLabelVariable) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.ObserveVariableChange) {
			print_ssl_ObserveVariableChange((ssl.ObserveVariableChange) element, globaltab, out);
			return;
		}
		if (element instanceof ssl.ObserveRing) {
			print_ssl_ObserveRing((ssl.ObserveRing) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected ssl.resource.ssl.mopp.SslReferenceResolverSwitch getReferenceResolverSwitch() {
		return (ssl.resource.ssl.mopp.SslReferenceResolverSwitch) new ssl.resource.ssl.mopp.SslMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		ssl.resource.ssl.ISslTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new ssl.resource.ssl.mopp.SslProblem(errorMessage, ssl.resource.ssl.SslEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public ssl.resource.ssl.ISslTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_ssl_Specification(ssl.Specification element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.SPECIFICATION__TESTCASES));
		printCountingMap.put("testcases", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("testcases");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.SPECIFICATION__TESTCASES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("testcases", 0);
		}
	}
	
	public void print_ssl_Testcase(ssl.Testcase element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__GIVEN));
		printCountingMap.put("given", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN));
		printCountingMap.put("when", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"given"		,
		"then"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"when"		,
		"then"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_ssl_Testcase_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_ssl_Testcase_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_ssl_Testcase_0(ssl.Testcase element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("given");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__GIVEN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("given", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("when");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("when", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("then");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("then", count - 1);
		}
	}
	public void print_ssl_Testcase_1(ssl.Testcase element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("when");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("when", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("then");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("then", count - 1);
		}
	}
	
	public void print_ssl_Given(ssl.Given element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.GIVEN__TESTCASE));
		printCountingMap.put("testcase", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.GIVEN__CONDITIONS));
		printCountingMap.put("conditions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Given");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("conditions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.GIVEN__CONDITIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("conditions", 0);
		}
	}
	
	public void print_ssl_When(ssl.When element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.WHEN__TESTCASE));
		printCountingMap.put("testcase", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.WHEN__ACTIONS));
		printCountingMap.put("actions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("When");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("actions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.WHEN__ACTIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("actions", 0);
		}
	}
	
	public void print_ssl_Then(ssl.Then element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.THEN__TESTCASE));
		printCountingMap.put("testcase", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.THEN__OBSERVATIONS));
		printCountingMap.put("observations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("observations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.THEN__OBSERVATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("observations", 0);
		}
	}
	
	public void print_ssl_CheckMode(ssl.CheckMode element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__GIVEN));
		printCountingMap.put("given", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__MODE));
		printCountingMap.put("mode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the watch is in mode \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("mode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__MODE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__MODE), element));
				out.print(" ");
			}
			printCountingMap.put("mode", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\"");
		out.print(" ");
	}
	
	public void print_ssl_CheckLabel(ssl.CheckLabel element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__GIVEN));
		printCountingMap.put("given", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__LABEL_TYPE));
		printCountingMap.put("labelType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("labelType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__LABEL_TYPE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__LABEL_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("labelType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\" is showing \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__VALUE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\"");
		out.print(" ");
	}
	
	public void print_ssl_CheckTimePastOther(ssl.CheckTimePastOther element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__GIVEN));
		printCountingMap.put("given", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__FIRST_VARIABLE_NAME));
		printCountingMap.put("firstVariableName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__SECOND_VARIABLE_NAME));
		printCountingMap.put("secondVariableName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("firstVariableName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__FIRST_VARIABLE_NAME));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__FIRST_VARIABLE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("firstVariableName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(" is past ");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("secondVariableName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__SECOND_VARIABLE_NAME));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__SECOND_VARIABLE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("secondVariableName", count - 1);
		}
	}
	
	public void print_ssl_EntersMode(ssl.EntersMode element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.ENTERS_MODE__WHEN));
		printCountingMap.put("when", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.ENTERS_MODE__MODE));
		printCountingMap.put("mode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the watch enters mode \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("mode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.ENTERS_MODE__MODE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.ENTERS_MODE__MODE), element));
				out.print(" ");
			}
			printCountingMap.put("mode", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\"");
		out.print(" ");
	}
	
	public void print_ssl_PressButton(ssl.PressButton element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__WHEN));
		printCountingMap.put("when", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON));
		printCountingMap.put("button", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the ");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("button");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON), element));
				out.print(" ");
			}
			printCountingMap.put("button", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(" button is pressed");
		out.print(" ");
	}
	
	public void print_ssl_ObserveMode(ssl.ObserveMode element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE));
		printCountingMap.put("mode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the watch must be in mode \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("mode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE), element));
				out.print(" ");
			}
			printCountingMap.put("mode", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\"");
		out.print(" ");
	}
	
	public void print_ssl_ObserveButton(ssl.ObserveButton element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__BUTTON));
		printCountingMap.put("button", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the ");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("button");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__BUTTON));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__BUTTON), element));
				out.print(" ");
			}
			printCountingMap.put("button", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(" button must be called \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__NAME));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\"");
		out.print(" ");
	}
	
	public void print_ssl_ObserveLabelValue(ssl.ObserveLabelValue element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__LABEL_TYPE));
		printCountingMap.put("labelType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("labelType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__LABEL_TYPE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__LABEL_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("labelType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\" must show \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__VALUE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\"");
		out.print(" ");
	}
	
	public void print_ssl_ObserveLabelVariable(ssl.ObserveLabelVariable element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__LABEL_TYPE));
		printCountingMap.put("labelType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__VARIABLE_NAME));
		printCountingMap.put("variableName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("the \"");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("labelType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__LABEL_TYPE));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__LABEL_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("labelType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("\" must show the ");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("variableName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__VARIABLE_NAME));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__VARIABLE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("variableName", count - 1);
		}
	}
	
	public void print_ssl_ObserveVariableChange(ssl.ObserveVariableChange element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME));
		printCountingMap.put("variableName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__UNIT));
		printCountingMap.put("unit", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("variableName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("variableName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(" must be incremented by 1 ");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("unit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__UNIT));
			if (o != null) {
				ssl.resource.ssl.ISslTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__UNIT), element));
				out.print(" ");
			}
			printCountingMap.put("unit", count - 1);
		}
	}
	
	public void print_ssl_ObserveRing(ssl.ObserveRing element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_RING__THEN));
		printCountingMap.put("then", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("the alarm must ring");
		out.print(" ");
	}
	
}
