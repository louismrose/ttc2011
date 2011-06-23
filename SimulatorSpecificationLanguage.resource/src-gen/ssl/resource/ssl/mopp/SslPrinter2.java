/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslPrinter2 implements ssl.resource.ssl.ISslTextPrinter {
	
	private class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private ssl.resource.ssl.ISslTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private java.util.List<PrintToken> tokenOutputStream;
	private ssl.resource.ssl.ISslTokenResolverFactory tokenResolverFactory = new ssl.resource.ssl.mopp.SslTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether token have already been printed for the some
	 * object. The flag is set to false whenever printing of an EObject tree is
	 * started. The status of the flag is used to avoid printing default token space
	 * in front of the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	private int newTabsBeforeCurrentObject;
	
	public SslPrinter2(java.io.OutputStream outputStream, ssl.resource.ssl.ISslTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		doPrint(element, new java.util.ArrayList<ssl.resource.ssl.grammar.SslFormattingElement>());
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof ssl.Specification) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_0, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.Testcase) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_1, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.Given) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_2, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.When) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_3, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.Then) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_4, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.CheckMode) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.CheckLabel) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.CheckTimePastOther) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.EntersMode) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.PressButton) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.ObserveMode) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_10, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.ObserveButton) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_11, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.ObserveLabelValue) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_12, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.ObserveLabelVariable) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_13, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.ObserveVariableChange) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_14, foundFormattingElements);
			return;
		}
		if (element instanceof ssl.ObserveRing) {
			printInternal(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_15, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, ssl.resource.ssl.grammar.SslSyntaxElement ruleElement, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements) {
		ssl.resource.ssl.mopp.SslLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations = new java.util.ArrayList<ssl.resource.ssl.mopp.SslLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		ssl.resource.ssl.mopp.SslSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public ssl.resource.ssl.mopp.SslSyntaxElementDecorator getDecoratorTree(ssl.resource.ssl.grammar.SslSyntaxElement syntaxElement) {
		ssl.resource.ssl.grammar.SslSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		ssl.resource.ssl.mopp.SslSyntaxElementDecorator[] childDecorators = new ssl.resource.ssl.mopp.SslSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		ssl.resource.ssl.mopp.SslSyntaxElementDecorator decorator = new ssl.resource.ssl.mopp.SslSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(ssl.resource.ssl.mopp.SslSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<String, Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<ssl.resource.ssl.mopp.SslSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<ssl.resource.ssl.mopp.SslSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (ssl.resource.ssl.mopp.SslSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(ssl.resource.ssl.mopp.SslSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap, java.util.List<ssl.resource.ssl.mopp.SslSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		ssl.resource.ssl.grammar.SslSyntaxElement syntaxElement = decorator.getDecoratedElement();
		ssl.resource.ssl.grammar.SslCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<ssl.resource.ssl.mopp.SslSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<ssl.resource.ssl.mopp.SslSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof ssl.resource.ssl.grammar.SslKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof ssl.resource.ssl.grammar.SslTerminal) {
				ssl.resource.ssl.grammar.SslTerminal terminal = (ssl.resource.ssl.grammar.SslTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == ssl.resource.ssl.grammar.SslGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof ssl.resource.ssl.grammar.SslChoice) {
				// for choices we do print only the choice which does print at least one feature
				ssl.resource.ssl.mopp.SslSyntaxElementDecorator childToPrint = null;
				for (ssl.resource.ssl.mopp.SslSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (ssl.resource.ssl.mopp.SslSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == ssl.resource.ssl.grammar.SslCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == ssl.resource.ssl.grammar.SslCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == ssl.resource.ssl.grammar.SslCardinality.STAR || cardinality == ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == ssl.resource.ssl.grammar.SslCardinality.ONE || cardinality == ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(ssl.resource.ssl.mopp.SslSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap) {
		ssl.resource.ssl.grammar.SslSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof ssl.resource.ssl.grammar.SslTerminal) {
			ssl.resource.ssl.grammar.SslTerminal terminal = (ssl.resource.ssl.grammar.SslTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == ssl.resource.ssl.grammar.SslGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (ssl.resource.ssl.mopp.SslSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(ssl.resource.ssl.mopp.SslSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		ssl.resource.ssl.grammar.SslSyntaxElement printElement = decorator.getDecoratedElement();
		ssl.resource.ssl.grammar.SslCardinality cardinality = printElement.getCardinality();
		java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> cloned = new java.util.ArrayList<ssl.resource.ssl.grammar.SslFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof ssl.resource.ssl.grammar.SslKeyword) {
					printKeyword(eObject, (ssl.resource.ssl.grammar.SslKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof ssl.resource.ssl.grammar.SslPlaceholder) {
					ssl.resource.ssl.grammar.SslPlaceholder placeholder = (ssl.resource.ssl.grammar.SslPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof ssl.resource.ssl.grammar.SslContainment) {
					ssl.resource.ssl.grammar.SslContainment containment = (ssl.resource.ssl.grammar.SslContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof ssl.resource.ssl.grammar.SslBooleanTerminal) {
					ssl.resource.ssl.grammar.SslBooleanTerminal booleanTerminal = (ssl.resource.ssl.grammar.SslBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof ssl.resource.ssl.grammar.SslWhiteSpace) {
				foundFormattingElements.add((ssl.resource.ssl.grammar.SslWhiteSpace) printElement);
			}
			if (printElement instanceof ssl.resource.ssl.grammar.SslLineBreak) {
				foundFormattingElements.add((ssl.resource.ssl.grammar.SslLineBreak) printElement);
			}
			for (ssl.resource.ssl.mopp.SslSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				ssl.resource.ssl.grammar.SslSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof ssl.resource.ssl.grammar.SslChoice) {
					break;
				}
			}
			if (cardinality == ssl.resource.ssl.grammar.SslCardinality.ONE || cardinality == ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == ssl.resource.ssl.grammar.SslCardinality.STAR || cardinality == ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, ssl.resource.ssl.grammar.SslKeyword keyword, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + ssl.resource.ssl.util.SslStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, ssl.resource.ssl.grammar.SslPlaceholder placeholder, int count, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, ssl.resource.ssl.grammar.SslPlaceholder placeholder, int count, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		}
		// write result to the output stream
		tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
	}
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, ssl.resource.ssl.grammar.SslBooleanTerminal booleanTerminal, int count, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + ssl.resource.ssl.util.SslStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, ssl.resource.ssl.grammar.SslContainment containment, int count, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject + currentTabs;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations, ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			layoutInformations.remove(layoutInformation);
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
			return;
		}
		if (foundFormattingElements.size() > 0) {
			for (ssl.resource.ssl.grammar.SslFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof ssl.resource.ssl.grammar.SslWhiteSpace) {
					int amount = ((ssl.resource.ssl.grammar.SslWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(new PrintToken(" ", null));
					}
				}
				if (foundFormattingElement instanceof ssl.resource.ssl.grammar.SslLineBreak) {
					currentTabs = ((ssl.resource.ssl.grammar.SslLineBreak) foundFormattingElement).getTabs();
					tokenOutputStream.add(new PrintToken(NEW_LINE, null));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(new PrintToken("\t", null));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, ssl.resource.ssl.grammar.SslPlaceholder placeholder, int count, java.util.List<ssl.resource.ssl.grammar.SslFormattingElement> foundFormattingElements, java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations) {
		Object referencedObject = getValue(eObject, reference, count);
		ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// NC-References must always be printed by deresolving the reference. We cannot
		// use the visible token information, because deresolving usually depends on
		// attribute values of the referenced object instead of the object itself.
		String tokenName = placeholder.getTokenName();
		ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		@SuppressWarnings("rawtypes")		
		ssl.resource.ssl.ISslReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
		referenceResolver.setOptions(getOptions());
		String deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<String, Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public ssl.resource.ssl.ISslTextResource getResource() {
		return resource;
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
	
	protected ssl.resource.ssl.mopp.SslLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof ssl.resource.ssl.mopp.SslLayoutInformationAdapter) {
				return (ssl.resource.ssl.mopp.SslLayoutInformationAdapter) adapter;
			}
		}
		ssl.resource.ssl.mopp.SslLayoutInformationAdapter newAdapter = new ssl.resource.ssl.mopp.SslLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private ssl.resource.ssl.mopp.SslLayoutInformation getLayoutInformation(java.util.List<ssl.resource.ssl.mopp.SslLayoutInformation> layoutInformations, ssl.resource.ssl.grammar.SslSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	private String getHiddenTokenText(ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(ssl.resource.ssl.mopp.SslLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			ssl.resource.ssl.ISslTextScanner scanner = new ssl.resource.ssl.mopp.SslMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<ssl.resource.ssl.ISslTextToken> tempTokens = new java.util.ArrayList<ssl.resource.ssl.ISslTextToken>();
			ssl.resource.ssl.ISslTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				ssl.resource.ssl.ISslTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
