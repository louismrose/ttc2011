// $ANTLR ${project.version} ${buildNumber}

	package ssl.resource.ssl.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class SslParser extends SslANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "WHITESPACE", "LINEBREAK", "'Given'", "'When'", "'Then'", "'the watch is in mode \\\"'", "'\\\"'", "'the \\\"'", "'\\\" is showing \\\"'", "' is past '", "'the '", "' button is pressed'", "'the watch must be in mode \\\"'", "' button must be called \\\"'", "'\\\" must show \\\"'", "'\\\" must show the '", "' must be incremented by 1 '", "'the alarm must ring'"
    };
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=5;
    public static final int TEXT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int LINEBREAK=6;

    // delegates
    // delegators


        public SslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[33+1];
             
             
        }
        

    public String[] getTokenNames() { return SslParser.tokenNames; }
    public String getGrammarFileName() { return "Ssl.g"; }


    	private ssl.resource.ssl.ISslTokenResolverFactory tokenResolverFactory = new ssl.resource.ssl.mopp.SslTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * the index of the last token that was handled by retrieveLayoutInformation()
    	 */
    	private int lastPosition2;
    	
    	private ssl.resource.ssl.mopp.SslTokenResolveResult tokenResolveResult = new ssl.resource.ssl.mopp.SslTokenResolveResult();
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<ssl.resource.ssl.mopp.SslExpectedTerminal> expectedElements = new java.util.ArrayList<ssl.resource.ssl.mopp.SslExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	/**
    	 * A collection that is filled with commands to be executed after parsing. This
    	 * collection is cleared before parsing starts and returned as part of the parse
    	 * result object.
    	 */
    	private java.util.Collection<ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>> postParseCommands;
    	
    	/**
    	 * A flag to indicate that the parser should stop parsing as soon as possible. The
    	 * flag is set to false before parsing starts. It can be set to true by invoking
    	 * the terminateParsing() method from another thread. This feature is used, when
    	 * documents are parsed in the background (i.e., while editing them). In order to
    	 * cancel running parsers, the parsing process can be terminated. This is done
    	 * whenever a document changes, because the previous content of the document is
    	 * not valid anymore and parsing the old content is not necessary any longer.
    	 */
    	private boolean terminateParsing;
    	
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * a collection to store all anonymous tokens
    	 */
    	private java.util.List<org.antlr.runtime3_2_0.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime3_2_0.CommonToken>();
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>() {
    			public boolean execute(ssl.resource.ssl.ISslTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new ssl.resource.ssl.ISslProblem() {
    					public ssl.resource.ssl.SslEProblemType getType() {
    						return ssl.resource.ssl.SslEProblemType.ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<ssl.resource.ssl.ISslQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(ssl.resource.ssl.ISslExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		ssl.resource.ssl.mopp.SslExpectedTerminal expectedElement = new ssl.resource.ssl.mopp.SslExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, ssl.resource.ssl.mopp.SslDummyEObject dummy) {
    		Object value = element.eGet(structuralFeature);
    		Object mapKey = dummy.getValueByName("key");
    		Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = ssl.resource.ssl.util.SslMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
    		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
    		return ((java.util.List<Object>) container.eGet(feature)).add(object);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof ssl.resource.ssl.mopp.SslDummyEObject);
    			ssl.resource.ssl.mopp.SslDummyEObject dummy = (ssl.resource.ssl.mopp.SslDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>() {
    			public boolean execute(ssl.resource.ssl.ISslTextResource resource) {
    				ssl.resource.ssl.ISslLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>() {
    			public boolean execute(ssl.resource.ssl.ISslTextResource resource) {
    				ssl.resource.ssl.ISslLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>() {
    			public boolean execute(ssl.resource.ssl.ISslTextResource resource) {
    				ssl.resource.ssl.ISslLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public ssl.resource.ssl.ISslTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new SslParser(new org.antlr.runtime3_2_0.CommonTokenStream(new SslLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SslParser(new org.antlr.runtime3_2_0.CommonTokenStream(new SslLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			ssl.resource.ssl.mopp.SslPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public SslParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((SslLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((SslLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == ssl.Specification.class) {
    				return parse_ssl_Specification();
    			}
    			if (type.getInstanceClass() == ssl.Testcase.class) {
    				return parse_ssl_Testcase();
    			}
    			if (type.getInstanceClass() == ssl.Given.class) {
    				return parse_ssl_Given();
    			}
    			if (type.getInstanceClass() == ssl.When.class) {
    				return parse_ssl_When();
    			}
    			if (type.getInstanceClass() == ssl.Then.class) {
    				return parse_ssl_Then();
    			}
    			if (type.getInstanceClass() == ssl.CheckMode.class) {
    				return parse_ssl_CheckMode();
    			}
    			if (type.getInstanceClass() == ssl.CheckLabel.class) {
    				return parse_ssl_CheckLabel();
    			}
    			if (type.getInstanceClass() == ssl.CheckTimePastOther.class) {
    				return parse_ssl_CheckTimePastOther();
    			}
    			if (type.getInstanceClass() == ssl.PressButton.class) {
    				return parse_ssl_PressButton();
    			}
    			if (type.getInstanceClass() == ssl.ObserveMode.class) {
    				return parse_ssl_ObserveMode();
    			}
    			if (type.getInstanceClass() == ssl.ObserveButton.class) {
    				return parse_ssl_ObserveButton();
    			}
    			if (type.getInstanceClass() == ssl.ObserveLabelValue.class) {
    				return parse_ssl_ObserveLabelValue();
    			}
    			if (type.getInstanceClass() == ssl.ObserveLabelVariable.class) {
    				return parse_ssl_ObserveLabelVariable();
    			}
    			if (type.getInstanceClass() == ssl.ObserveVariableChange.class) {
    				return parse_ssl_ObserveVariableChange();
    			}
    			if (type.getInstanceClass() == ssl.ObserveRing.class) {
    				return parse_ssl_ObserveRing();
    			}
    		}
    		throw new ssl.resource.ssl.mopp.SslUnexpectedContentTypeException(typeObject);
    	}
    	
    	private ssl.resource.ssl.mopp.SslTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public ssl.resource.ssl.mopp.SslMetaInformation getMetaInformation() {
    		return new ssl.resource.ssl.mopp.SslMetaInformation();
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected ssl.resource.ssl.mopp.SslReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (ssl.resource.ssl.mopp.SslReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(ssl.resource.ssl.ISslOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public ssl.resource.ssl.ISslParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>>();
    		ssl.resource.ssl.mopp.SslParseResult parseResult = new ssl.resource.ssl.mopp.SslParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<ssl.resource.ssl.mopp.SslExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, ssl.resource.ssl.ISslTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
    		ssl.resource.ssl.ISslParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<ssl.resource.ssl.mopp.SslExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<ssl.resource.ssl.mopp.SslExpectedTerminal>();
    		java.util.List<ssl.resource.ssl.mopp.SslExpectedTerminal> newFollowSet = new java.util.ArrayList<ssl.resource.ssl.mopp.SslExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			ssl.resource.ssl.mopp.SslExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 46;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (ssl.resource.ssl.mopp.SslExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (ssl.resource.ssl.mopp.SslExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<ssl.resource.ssl.util.SslPair<ssl.resource.ssl.ISslExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (ssl.resource.ssl.util.SslPair<ssl.resource.ssl.ISslExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							ssl.resource.ssl.ISslExpectedElement newFollower = newFollowerPair.getLeft();
    							ssl.resource.ssl.mopp.SslExpectedTerminal newFollowTerminal = new ssl.resource.ssl.mopp.SslExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (ssl.resource.ssl.mopp.SslExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(ssl.resource.ssl.mopp.SslExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final ssl.resource.ssl.mopp.SslContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>() {
    			public boolean execute(ssl.resource.ssl.ISslTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = ssl.resource.ssl.util.SslStringUtil.formatTokenName(tokenName);
    			}
    			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
    			String tokenName = "<unknown>";
    			if (mtne.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mtne.expecting];
    			}
    			message = "mismatched tree node: " + "xxx" + "; expecting " + tokenName;
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
    			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
    			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
    			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message ="rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.index, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	public void setOptions(java.util.Map<?,?> options) {
    		this.options = options;
    	}
    	
    	public void terminate() {
    		terminateParsing = true;
    	}
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	/**
    	 * Creates a dynamic Java proxy that mimics the interface of the given class.
    	 */
    	@SuppressWarnings("unchecked")
    	
    	public <T> T createDynamicProxy(Class<T> clazz) {
    		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
    			
    			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
    			
    			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
    				// search in dummyObject for the requested method
    				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
    				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
    					boolean matches = true;
    					if (methodInDummy.getName().equals(method.getName())) {
    						Class<?>[] parameterTypes = method.getParameterTypes();
    						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
    						if (parameterTypes.length == parameterTypesInDummy.length) {
    							for (int p = 0; p < parameterTypes.length; p++) {
    								Class<?> parameterType = parameterTypes[p];
    								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
    								if (!parameterType.equals(parameterTypeInDummy)) {
    									matches = false;
    								}
    							}
    						} else {
    							matches = false;
    						}
    					} else {
    						matches = false;
    					}
    					if (matches) {
    						return methodInDummy.invoke(dummyObject, args);
    					}
    				}
    				return null;
    			}
    		});
    		return (T) proxy;
    	}
    	
    	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, ssl.resource.ssl.grammar.SslSyntaxElement syntaxElement, Object object) {
    		if (!(syntaxElement instanceof ssl.resource.ssl.grammar.SslPlaceholder) && !(syntaxElement instanceof ssl.resource.ssl.grammar.SslKeyword)) {
    			return;
    		}
    		ssl.resource.ssl.mopp.SslLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
    		for (org.antlr.runtime3_2_0.CommonToken anonymousToken : anonymousTokens) {
    			layoutInformationAdapter.addLayoutInformation(new ssl.resource.ssl.mopp.SslLayoutInformation(syntaxElement, object, anonymousToken.getStartIndex(), anonymousToken.getText(), ""));
    		}
    		anonymousTokens.clear();
    		int currentPos = getTokenStream().index();
    		if (currentPos == 0) {
    			return;
    		}
    		int endPos = currentPos - 1;
    		for (; endPos >= this.lastPosition2; endPos--) {
    			org.antlr.runtime3_2_0.Token token = getTokenStream().get(endPos);
    			int _channel = token.getChannel();
    			if (_channel != 99) {
    				break;
    			}
    		}
    		StringBuilder hiddenTokenText = new StringBuilder();
    		StringBuilder visibleTokenText = new StringBuilder();
    		org.antlr.runtime3_2_0.CommonToken firstToken = null;
    		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
    			org.antlr.runtime3_2_0.Token token = getTokenStream().get(pos);
    			if (firstToken == null) {
    				firstToken = (org.antlr.runtime3_2_0.CommonToken) token;
    			}
    			int _channel = token.getChannel();
    			if (_channel == 99) {
    				hiddenTokenText.append(token.getText());
    			} else {
    				visibleTokenText.append(token.getText());
    			}
    		}
    		int offset = -1;
    		if (firstToken != null) {
    			offset = firstToken.getStartIndex();
    		}
    		layoutInformationAdapter.addLayoutInformation(new ssl.resource.ssl.mopp.SslLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
    		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
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
    	



    // $ANTLR start "start"
    // Ssl.g:710:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_ssl_Specification ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        ssl.Specification c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Ssl.g:711:1: ( (c0= parse_ssl_Specification ) EOF )
            // Ssl.g:712:2: (c0= parse_ssl_Specification ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // Ssl.g:717:2: (c0= parse_ssl_Specification )
            // Ssl.g:718:3: c0= parse_ssl_Specification
            {
            pushFollow(FOLLOW_parse_ssl_Specification_in_start82);
            c0=parse_ssl_Specification();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_ssl_Specification"
    // Ssl.g:723:1: parse_ssl_Specification returns [ssl.Specification element = null] : ( (a0_0= parse_ssl_Testcase ) )* ;
    public final ssl.Specification parse_ssl_Specification() throws RecognitionException {
        ssl.Specification element =  null;
        int parse_ssl_Specification_StartIndex = input.index();
        ssl.Testcase a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Ssl.g:726:1: ( ( (a0_0= parse_ssl_Testcase ) )* )
            // Ssl.g:727:2: ( (a0_0= parse_ssl_Testcase ) )*
            {
            // Ssl.g:727:2: ( (a0_0= parse_ssl_Testcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ssl.g:728:3: (a0_0= parse_ssl_Testcase )
            	    {
            	    // Ssl.g:728:3: (a0_0= parse_ssl_Testcase )
            	    // Ssl.g:729:4: a0_0= parse_ssl_Testcase
            	    {
            	    pushFollow(FOLLOW_parse_ssl_Testcase_in_parse_ssl_Specification121);
            	    a0_0=parse_ssl_Testcase();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = ssl.SslFactory.eINSTANCE.createSpecification();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attributes
            	      				}
            	      				if (a0_0 != null) {
            	      					if (a0_0 != null) {
            	      						addObjectToList(element, ssl.SslPackage.SPECIFICATION__TESTCASES, a0_0);
            	      						completedElement(a0_0, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_0_0_0_0, a0_0);
            	      					copyLocalizationInfos(a0_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 1, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_ssl_Specification_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Specification"


    // $ANTLR start "parse_ssl_Testcase"
    // Ssl.g:757:1: parse_ssl_Testcase returns [ssl.Testcase element = null] : (a0_0= parse_ssl_Given ) ( (a1_0= parse_ssl_When ) )? (a2_0= parse_ssl_Then ) ;
    public final ssl.Testcase parse_ssl_Testcase() throws RecognitionException {
        ssl.Testcase element =  null;
        int parse_ssl_Testcase_StartIndex = input.index();
        ssl.Given a0_0 = null;

        ssl.When a1_0 = null;

        ssl.Then a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Ssl.g:760:1: ( (a0_0= parse_ssl_Given ) ( (a1_0= parse_ssl_When ) )? (a2_0= parse_ssl_Then ) )
            // Ssl.g:761:2: (a0_0= parse_ssl_Given ) ( (a1_0= parse_ssl_When ) )? (a2_0= parse_ssl_Then )
            {
            // Ssl.g:761:2: (a0_0= parse_ssl_Given )
            // Ssl.g:762:3: a0_0= parse_ssl_Given
            {
            pushFollow(FOLLOW_parse_ssl_Given_in_parse_ssl_Testcase166);
            a0_0=parse_ssl_Given();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createTestcase();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__GIVEN), a0_0);
              					completedElement(a0_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_1_0_0_0, a0_0);
              				copyLocalizationInfos(a0_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_1, 2, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_2);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 2, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }
            // Ssl.g:788:2: ( (a1_0= parse_ssl_When ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Ssl.g:789:3: (a1_0= parse_ssl_When )
                    {
                    // Ssl.g:789:3: (a1_0= parse_ssl_When )
                    // Ssl.g:790:4: a1_0= parse_ssl_When
                    {
                    pushFollow(FOLLOW_parse_ssl_When_in_parse_ssl_Testcase193);
                    a1_0=parse_ssl_When();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = ssl.SslFactory.eINSTANCE.createTestcase();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a1_0 != null) {
                      					if (a1_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN), a1_0);
                      						completedElement(a1_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_1_0_0_1, a1_0);
                      					copyLocalizationInfos(a1_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 3, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }
            // Ssl.g:816:2: (a2_0= parse_ssl_Then )
            // Ssl.g:817:3: a2_0= parse_ssl_Then
            {
            pushFollow(FOLLOW_parse_ssl_Then_in_parse_ssl_Testcase223);
            a2_0=parse_ssl_Then();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createTestcase();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN), a2_0);
              					completedElement(a2_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_1_0_0_2, a2_0);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 4, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_ssl_Testcase_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Testcase"


    // $ANTLR start "parse_ssl_Given"
    // Ssl.g:844:1: parse_ssl_Given returns [ssl.Given element = null] : a0= 'Given' ( (a1_0= parse_ssl_Condition ) )+ ;
    public final ssl.Given parse_ssl_Given() throws RecognitionException {
        ssl.Given element =  null;
        int parse_ssl_Given_StartIndex = input.index();
        Token a0=null;
        ssl.Condition a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Ssl.g:847:1: (a0= 'Given' ( (a1_0= parse_ssl_Condition ) )+ )
            // Ssl.g:848:2: a0= 'Given' ( (a1_0= parse_ssl_Condition ) )+
            {
            a0=(Token)match(input,7,FOLLOW_7_in_parse_ssl_Given256); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createGiven();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_2_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_3, 5, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 5, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 5, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              	
            }
            // Ssl.g:865:2: ( (a1_0= parse_ssl_Condition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TEXT||LA3_0==10||LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ssl.g:866:3: (a1_0= parse_ssl_Condition )
            	    {
            	    // Ssl.g:866:3: (a1_0= parse_ssl_Condition )
            	    // Ssl.g:867:4: a1_0= parse_ssl_Condition
            	    {
            	    pushFollow(FOLLOW_parse_ssl_Condition_in_parse_ssl_Given279);
            	    a1_0=parse_ssl_Condition();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = ssl.SslFactory.eINSTANCE.createGiven();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attributes
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						addObjectToList(element, ssl.SslPackage.GIVEN__CONDITIONS, a1_0);
            	      						completedElement(a1_0, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_2_0_0_1, a1_0);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_3, 6, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 6, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 6, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_1, 6, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_2);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 6, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_ssl_Given_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Given"


    // $ANTLR start "parse_ssl_When"
    // Ssl.g:899:1: parse_ssl_When returns [ssl.When element = null] : a0= 'When' ( (a1_0= parse_ssl_Action ) )+ ;
    public final ssl.When parse_ssl_When() throws RecognitionException {
        ssl.When element =  null;
        int parse_ssl_When_StartIndex = input.index();
        Token a0=null;
        ssl.Action a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Ssl.g:902:1: (a0= 'When' ( (a1_0= parse_ssl_Action ) )+ )
            // Ssl.g:903:2: a0= 'When' ( (a1_0= parse_ssl_Action ) )+
            {
            a0=(Token)match(input,8,FOLLOW_8_in_parse_ssl_When320); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createWhen();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_3_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 7, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_5);
              	
            }
            // Ssl.g:918:2: ( (a1_0= parse_ssl_Action ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Ssl.g:919:3: (a1_0= parse_ssl_Action )
            	    {
            	    // Ssl.g:919:3: (a1_0= parse_ssl_Action )
            	    // Ssl.g:920:4: a1_0= parse_ssl_Action
            	    {
            	    pushFollow(FOLLOW_parse_ssl_Action_in_parse_ssl_When343);
            	    a1_0=parse_ssl_Action();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = ssl.SslFactory.eINSTANCE.createWhen();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attributes
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						addObjectToList(element, ssl.SslPackage.WHEN__ACTIONS, a1_0);
            	      						completedElement(a1_0, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_3_0_0_1, a1_0);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 8, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_5);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 8, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_ssl_When_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_When"


    // $ANTLR start "parse_ssl_Then"
    // Ssl.g:949:1: parse_ssl_Then returns [ssl.Then element = null] : a0= 'Then' ( (a1_0= parse_ssl_Observation ) )+ ;
    public final ssl.Then parse_ssl_Then() throws RecognitionException {
        ssl.Then element =  null;
        int parse_ssl_Then_StartIndex = input.index();
        Token a0=null;
        ssl.Observation a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Ssl.g:952:1: (a0= 'Then' ( (a1_0= parse_ssl_Observation ) )+ )
            // Ssl.g:953:2: a0= 'Then' ( (a1_0= parse_ssl_Observation ) )+
            {
            a0=(Token)match(input,9,FOLLOW_9_in_parse_ssl_Then384); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createThen();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_4_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              	
            }
            // Ssl.g:973:2: ( (a1_0= parse_ssl_Observation ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TEXT||LA5_0==12||LA5_0==15||LA5_0==17||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Ssl.g:974:3: (a1_0= parse_ssl_Observation )
            	    {
            	    // Ssl.g:974:3: (a1_0= parse_ssl_Observation )
            	    // Ssl.g:975:4: a1_0= parse_ssl_Observation
            	    {
            	    pushFollow(FOLLOW_parse_ssl_Observation_in_parse_ssl_Then407);
            	    a1_0=parse_ssl_Observation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = ssl.SslFactory.eINSTANCE.createThen();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attributes
            	      				}
            	      				if (a1_0 != null) {
            	      					if (a1_0 != null) {
            	      						addObjectToList(element, ssl.SslPackage.THEN__OBSERVATIONS, a1_0);
            	      						completedElement(a1_0, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_4_0_0_1, a1_0);
            	      					copyLocalizationInfos(a1_0, element);
            	      				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_ssl_Then_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Then"


    // $ANTLR start "parse_ssl_CheckMode"
    // Ssl.g:1009:1: parse_ssl_CheckMode returns [ssl.CheckMode element = null] : a0= 'the watch is in mode \\\"' (a1= TEXT ) a2= '\\\"' ;
    public final ssl.CheckMode parse_ssl_CheckMode() throws RecognitionException {
        ssl.CheckMode element =  null;
        int parse_ssl_CheckMode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Ssl.g:1012:1: (a0= 'the watch is in mode \\\"' (a1= TEXT ) a2= '\\\"' )
            // Ssl.g:1013:2: a0= 'the watch is in mode \\\"' (a1= TEXT ) a2= '\\\"'
            {
            a0=(Token)match(input,10,FOLLOW_10_in_parse_ssl_CheckMode448); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createCheckMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_13, 11);
              	
            }
            // Ssl.g:1028:2: (a1= TEXT )
            // Ssl.g:1029:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_CheckMode466); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createCheckMode();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__MODE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__MODE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_14, 12);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_ssl_CheckMode487); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createCheckMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_3, 13, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 13, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 13, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_1, 13, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_2);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 13, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_ssl_CheckMode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_CheckMode"


    // $ANTLR start "parse_ssl_CheckLabel"
    // Ssl.g:1085:1: parse_ssl_CheckLabel returns [ssl.CheckLabel element = null] : a0= 'the \\\"' (a1= TEXT ) a2= '\\\" is showing \\\"' ( (a3= TEXT ) )? a4= '\\\"' ;
    public final ssl.CheckLabel parse_ssl_CheckLabel() throws RecognitionException {
        ssl.CheckLabel element =  null;
        int parse_ssl_CheckLabel_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Ssl.g:1088:1: (a0= 'the \\\"' (a1= TEXT ) a2= '\\\" is showing \\\"' ( (a3= TEXT ) )? a4= '\\\"' )
            // Ssl.g:1089:2: a0= 'the \\\"' (a1= TEXT ) a2= '\\\" is showing \\\"' ( (a3= TEXT ) )? a4= '\\\"'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ssl_CheckLabel516); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createCheckLabel();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_15, 14);
              	
            }
            // Ssl.g:1104:2: (a1= TEXT )
            // Ssl.g:1105:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_CheckLabel534); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createCheckLabel();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__LABEL_TYPE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				ssl.LabelType resolved = (ssl.LabelType)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__LABEL_TYPE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_16, 15);
              	
            }
            a2=(Token)match(input,13,FOLLOW_13_in_parse_ssl_CheckLabel555); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createCheckLabel();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_17, 16);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_18, 16);
              	
            }
            // Ssl.g:1156:2: ( (a3= TEXT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Ssl.g:1157:3: (a3= TEXT )
                    {
                    // Ssl.g:1157:3: (a3= TEXT )
                    // Ssl.g:1158:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_CheckLabel578); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = ssl.SslFactory.eINSTANCE.createCheckLabel();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a3 != null) {
                      					ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__VALUE), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__VALUE), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_3, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_18, 17);
              	
            }
            a4=(Token)match(input,11,FOLLOW_11_in_parse_ssl_CheckLabel608); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createCheckLabel();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_3, 18, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 18, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 18, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_1, 18, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_2);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 18, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_ssl_CheckLabel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_CheckLabel"


    // $ANTLR start "parse_ssl_CheckTimePastOther"
    // Ssl.g:1215:1: parse_ssl_CheckTimePastOther returns [ssl.CheckTimePastOther element = null] : (a0= TEXT ) a1= ' is past ' (a2= TEXT ) ;
    public final ssl.CheckTimePastOther parse_ssl_CheckTimePastOther() throws RecognitionException {
        ssl.CheckTimePastOther element =  null;
        int parse_ssl_CheckTimePastOther_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Ssl.g:1218:1: ( (a0= TEXT ) a1= ' is past ' (a2= TEXT ) )
            // Ssl.g:1219:2: (a0= TEXT ) a1= ' is past ' (a2= TEXT )
            {
            // Ssl.g:1219:2: (a0= TEXT )
            // Ssl.g:1220:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_CheckTimePastOther641); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createCheckTimePastOther();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a0 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__FIRST_VARIABLE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__FIRST_VARIABLE_NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_19, 19);
              	
            }
            a1=(Token)match(input,14,FOLLOW_14_in_parse_ssl_CheckTimePastOther662); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createCheckTimePastOther();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_20, 20);
              	
            }
            // Ssl.g:1270:2: (a2= TEXT )
            // Ssl.g:1271:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_CheckTimePastOther680); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createCheckTimePastOther();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a2 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__SECOND_VARIABLE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__SECOND_VARIABLE_NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_3, 21, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 21, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 21, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_4);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_1, 21, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_2);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 21, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_ssl_CheckTimePastOther_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_CheckTimePastOther"


    // $ANTLR start "parse_ssl_PressButton"
    // Ssl.g:1312:1: parse_ssl_PressButton returns [ssl.PressButton element = null] : a0= 'the ' (a1= TEXT ) a2= ' button is pressed' ;
    public final ssl.PressButton parse_ssl_PressButton() throws RecognitionException {
        ssl.PressButton element =  null;
        int parse_ssl_PressButton_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Ssl.g:1315:1: (a0= 'the ' (a1= TEXT ) a2= ' button is pressed' )
            // Ssl.g:1316:2: a0= 'the ' (a1= TEXT ) a2= ' button is pressed'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_ssl_PressButton716); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createPressButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_21, 22);
              	
            }
            // Ssl.g:1331:2: (a1= TEXT )
            // Ssl.g:1332:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_PressButton734); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createPressButton();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_22, 23);
              	
            }
            a2=(Token)match(input,16,FOLLOW_16_in_parse_ssl_PressButton755); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createPressButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 24, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_5);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 24, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_ssl_PressButton_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_PressButton"


    // $ANTLR start "parse_ssl_ObserveMode"
    // Ssl.g:1385:1: parse_ssl_ObserveMode returns [ssl.ObserveMode element = null] : a0= 'the watch must be in mode \\\"' (a1= TEXT ) a2= '\\\"' ;
    public final ssl.ObserveMode parse_ssl_ObserveMode() throws RecognitionException {
        ssl.ObserveMode element =  null;
        int parse_ssl_ObserveMode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Ssl.g:1388:1: (a0= 'the watch must be in mode \\\"' (a1= TEXT ) a2= '\\\"' )
            // Ssl.g:1389:2: a0= 'the watch must be in mode \\\"' (a1= TEXT ) a2= '\\\"'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_ssl_ObserveMode784); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_23, 25);
              	
            }
            // Ssl.g:1404:2: (a1= TEXT )
            // Ssl.g:1405:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveMode802); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveMode();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_24, 26);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_ssl_ObserveMode823); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_ssl_ObserveMode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveMode"


    // $ANTLR start "parse_ssl_ObserveButton"
    // Ssl.g:1463:1: parse_ssl_ObserveButton returns [ssl.ObserveButton element = null] : a0= 'the ' (a1= TEXT ) a2= ' button must be called \\\"' (a3= TEXT ) a4= '\\\"' ;
    public final ssl.ObserveButton parse_ssl_ObserveButton() throws RecognitionException {
        ssl.ObserveButton element =  null;
        int parse_ssl_ObserveButton_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Ssl.g:1466:1: (a0= 'the ' (a1= TEXT ) a2= ' button must be called \\\"' (a3= TEXT ) a4= '\\\"' )
            // Ssl.g:1467:2: a0= 'the ' (a1= TEXT ) a2= ' button must be called \\\"' (a3= TEXT ) a4= '\\\"'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_ssl_ObserveButton852); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_10_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_25, 28);
              	
            }
            // Ssl.g:1482:2: (a1= TEXT )
            // Ssl.g:1483:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveButton870); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveButton();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__BUTTON), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__BUTTON), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_10_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_26, 29);
              	
            }
            a2=(Token)match(input,18,FOLLOW_18_in_parse_ssl_ObserveButton891); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_10_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_27, 30);
              	
            }
            // Ssl.g:1533:2: (a3= TEXT )
            // Ssl.g:1534:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveButton909); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveButton();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a3 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_10_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_28, 31);
              	
            }
            a4=(Token)match(input,11,FOLLOW_11_in_parse_ssl_ObserveButton930); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_10_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 32, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_ssl_ObserveButton_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveButton"


    // $ANTLR start "parse_ssl_ObserveLabelValue"
    // Ssl.g:1592:1: parse_ssl_ObserveLabelValue returns [ssl.ObserveLabelValue element = null] : a0= 'the \\\"' (a1= TEXT ) a2= '\\\" must show \\\"' ( (a3= TEXT ) )? a4= '\\\"' ;
    public final ssl.ObserveLabelValue parse_ssl_ObserveLabelValue() throws RecognitionException {
        ssl.ObserveLabelValue element =  null;
        int parse_ssl_ObserveLabelValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Ssl.g:1595:1: (a0= 'the \\\"' (a1= TEXT ) a2= '\\\" must show \\\"' ( (a3= TEXT ) )? a4= '\\\"' )
            // Ssl.g:1596:2: a0= 'the \\\"' (a1= TEXT ) a2= '\\\" must show \\\"' ( (a3= TEXT ) )? a4= '\\\"'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ssl_ObserveLabelValue959); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveLabelValue();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_11_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_29, 33);
              	
            }
            // Ssl.g:1611:2: (a1= TEXT )
            // Ssl.g:1612:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveLabelValue977); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveLabelValue();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__LABEL_TYPE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				ssl.LabelType resolved = (ssl.LabelType)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__LABEL_TYPE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_11_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_30, 34);
              	
            }
            a2=(Token)match(input,19,FOLLOW_19_in_parse_ssl_ObserveLabelValue998); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveLabelValue();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_11_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_31, 35);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_32, 35);
              	
            }
            // Ssl.g:1663:2: ( (a3= TEXT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Ssl.g:1664:3: (a3= TEXT )
                    {
                    // Ssl.g:1664:3: (a3= TEXT )
                    // Ssl.g:1665:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveLabelValue1021); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = ssl.SslFactory.eINSTANCE.createObserveLabelValue();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a3 != null) {
                      					ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__VALUE), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__VALUE), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_11_0_0_3, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_32, 36);
              	
            }
            a4=(Token)match(input,11,FOLLOW_11_in_parse_ssl_ObserveLabelValue1051); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveLabelValue();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_11_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 37, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_ssl_ObserveLabelValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveLabelValue"


    // $ANTLR start "parse_ssl_ObserveLabelVariable"
    // Ssl.g:1724:1: parse_ssl_ObserveLabelVariable returns [ssl.ObserveLabelVariable element = null] : a0= 'the \\\"' (a1= TEXT ) a2= '\\\" must show the ' (a3= TEXT ) ;
    public final ssl.ObserveLabelVariable parse_ssl_ObserveLabelVariable() throws RecognitionException {
        ssl.ObserveLabelVariable element =  null;
        int parse_ssl_ObserveLabelVariable_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Ssl.g:1727:1: (a0= 'the \\\"' (a1= TEXT ) a2= '\\\" must show the ' (a3= TEXT ) )
            // Ssl.g:1728:2: a0= 'the \\\"' (a1= TEXT ) a2= '\\\" must show the ' (a3= TEXT )
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ssl_ObserveLabelVariable1080); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveLabelVariable();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_12_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_33, 38);
              	
            }
            // Ssl.g:1743:2: (a1= TEXT )
            // Ssl.g:1744:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveLabelVariable1098); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveLabelVariable();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__LABEL_TYPE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				ssl.LabelType resolved = (ssl.LabelType)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__LABEL_TYPE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_12_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_34, 39);
              	
            }
            a2=(Token)match(input,20,FOLLOW_20_in_parse_ssl_ObserveLabelVariable1119); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveLabelVariable();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_12_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_35, 40);
              	
            }
            // Ssl.g:1794:2: (a3= TEXT )
            // Ssl.g:1795:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveLabelVariable1137); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveLabelVariable();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a3 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__VARIABLE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__VARIABLE_NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_12_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 41, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_ssl_ObserveLabelVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveLabelVariable"


    // $ANTLR start "parse_ssl_ObserveVariableChange"
    // Ssl.g:1838:1: parse_ssl_ObserveVariableChange returns [ssl.ObserveVariableChange element = null] : (a0= TEXT ) a1= ' must be incremented by 1 ' (a2= TEXT ) ;
    public final ssl.ObserveVariableChange parse_ssl_ObserveVariableChange() throws RecognitionException {
        ssl.ObserveVariableChange element =  null;
        int parse_ssl_ObserveVariableChange_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Ssl.g:1841:1: ( (a0= TEXT ) a1= ' must be incremented by 1 ' (a2= TEXT ) )
            // Ssl.g:1842:2: (a0= TEXT ) a1= ' must be incremented by 1 ' (a2= TEXT )
            {
            // Ssl.g:1842:2: (a0= TEXT )
            // Ssl.g:1843:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveVariableChange1177); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveVariableChange();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a0 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_13_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_36, 42);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_ssl_ObserveVariableChange1198); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveVariableChange();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_13_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_37, 43);
              	
            }
            // Ssl.g:1893:2: (a2= TEXT )
            // Ssl.g:1894:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveVariableChange1216); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveVariableChange();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a2 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__UNIT), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				ssl.UnitOfTime resolved = (ssl.UnitOfTime)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__UNIT), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_13_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 44, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_ssl_ObserveVariableChange_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveVariableChange"


    // $ANTLR start "parse_ssl_ObserveRing"
    // Ssl.g:1937:1: parse_ssl_ObserveRing returns [ssl.ObserveRing element = null] : a0= 'the alarm must ring' ;
    public final ssl.ObserveRing parse_ssl_ObserveRing() throws RecognitionException {
        ssl.ObserveRing element =  null;
        int parse_ssl_ObserveRing_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Ssl.g:1940:1: (a0= 'the alarm must ring' )
            // Ssl.g:1941:2: a0= 'the alarm must ring'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_ssl_ObserveRing1252); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveRing();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_14_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 45, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_ssl_ObserveRing_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveRing"


    // $ANTLR start "parse_ssl_Condition"
    // Ssl.g:1964:1: parse_ssl_Condition returns [ssl.Condition element = null] : (c0= parse_ssl_CheckMode | c1= parse_ssl_CheckLabel | c2= parse_ssl_CheckTimePastOther );
    public final ssl.Condition parse_ssl_Condition() throws RecognitionException {
        ssl.Condition element =  null;
        int parse_ssl_Condition_StartIndex = input.index();
        ssl.CheckMode c0 = null;

        ssl.CheckLabel c1 = null;

        ssl.CheckTimePastOther c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Ssl.g:1965:1: (c0= parse_ssl_CheckMode | c1= parse_ssl_CheckLabel | c2= parse_ssl_CheckTimePastOther )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case TEXT:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // Ssl.g:1966:2: c0= parse_ssl_CheckMode
                    {
                    pushFollow(FOLLOW_parse_ssl_CheckMode_in_parse_ssl_Condition1277);
                    c0=parse_ssl_CheckMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Ssl.g:1967:4: c1= parse_ssl_CheckLabel
                    {
                    pushFollow(FOLLOW_parse_ssl_CheckLabel_in_parse_ssl_Condition1287);
                    c1=parse_ssl_CheckLabel();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Ssl.g:1968:4: c2= parse_ssl_CheckTimePastOther
                    {
                    pushFollow(FOLLOW_parse_ssl_CheckTimePastOther_in_parse_ssl_Condition1297);
                    c2=parse_ssl_CheckTimePastOther();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_ssl_Condition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Condition"


    // $ANTLR start "parse_ssl_Action"
    // Ssl.g:1972:1: parse_ssl_Action returns [ssl.Action element = null] : c0= parse_ssl_PressButton ;
    public final ssl.Action parse_ssl_Action() throws RecognitionException {
        ssl.Action element =  null;
        int parse_ssl_Action_StartIndex = input.index();
        ssl.PressButton c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Ssl.g:1973:1: (c0= parse_ssl_PressButton )
            // Ssl.g:1974:2: c0= parse_ssl_PressButton
            {
            pushFollow(FOLLOW_parse_ssl_PressButton_in_parse_ssl_Action1318);
            c0=parse_ssl_PressButton();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; /* this is a subclass or primitive expression choice */ 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_ssl_Action_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Action"


    // $ANTLR start "parse_ssl_Observation"
    // Ssl.g:1978:1: parse_ssl_Observation returns [ssl.Observation element = null] : (c0= parse_ssl_ObserveMode | c1= parse_ssl_ObserveButton | c2= parse_ssl_ObserveLabelValue | c3= parse_ssl_ObserveLabelVariable | c4= parse_ssl_ObserveVariableChange | c5= parse_ssl_ObserveRing );
    public final ssl.Observation parse_ssl_Observation() throws RecognitionException {
        ssl.Observation element =  null;
        int parse_ssl_Observation_StartIndex = input.index();
        ssl.ObserveMode c0 = null;

        ssl.ObserveButton c1 = null;

        ssl.ObserveLabelValue c2 = null;

        ssl.ObserveLabelVariable c3 = null;

        ssl.ObserveVariableChange c4 = null;

        ssl.ObserveRing c5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Ssl.g:1979:1: (c0= parse_ssl_ObserveMode | c1= parse_ssl_ObserveButton | c2= parse_ssl_ObserveLabelValue | c3= parse_ssl_ObserveLabelVariable | c4= parse_ssl_ObserveVariableChange | c5= parse_ssl_ObserveRing )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 12:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==TEXT) ) {
                    int LA9_6 = input.LA(3);

                    if ( (LA9_6==20) ) {
                        alt9=4;
                    }
                    else if ( (LA9_6==19) ) {
                        alt9=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                alt9=5;
                }
                break;
            case 22:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // Ssl.g:1980:2: c0= parse_ssl_ObserveMode
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveMode_in_parse_ssl_Observation1339);
                    c0=parse_ssl_ObserveMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Ssl.g:1981:4: c1= parse_ssl_ObserveButton
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveButton_in_parse_ssl_Observation1349);
                    c1=parse_ssl_ObserveButton();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Ssl.g:1982:4: c2= parse_ssl_ObserveLabelValue
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveLabelValue_in_parse_ssl_Observation1359);
                    c2=parse_ssl_ObserveLabelValue();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Ssl.g:1983:4: c3= parse_ssl_ObserveLabelVariable
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveLabelVariable_in_parse_ssl_Observation1369);
                    c3=parse_ssl_ObserveLabelVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Ssl.g:1984:4: c4= parse_ssl_ObserveVariableChange
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveVariableChange_in_parse_ssl_Observation1379);
                    c4=parse_ssl_ObserveVariableChange();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Ssl.g:1985:4: c5= parse_ssl_ObserveRing
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveRing_in_parse_ssl_Observation1389);
                    c5=parse_ssl_ObserveRing();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_ssl_Observation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Observation"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_ssl_Specification_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_Testcase_in_parse_ssl_Specification121 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_parse_ssl_Given_in_parse_ssl_Testcase166 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_parse_ssl_When_in_parse_ssl_Testcase193 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_parse_ssl_Then_in_parse_ssl_Testcase223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_parse_ssl_Given256 = new BitSet(new long[]{0x0000000000001410L});
    public static final BitSet FOLLOW_parse_ssl_Condition_in_parse_ssl_Given279 = new BitSet(new long[]{0x0000000000001412L});
    public static final BitSet FOLLOW_8_in_parse_ssl_When320 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_parse_ssl_Action_in_parse_ssl_When343 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9_in_parse_ssl_Then384 = new BitSet(new long[]{0x0000000000429010L});
    public static final BitSet FOLLOW_parse_ssl_Observation_in_parse_ssl_Then407 = new BitSet(new long[]{0x0000000000429012L});
    public static final BitSet FOLLOW_10_in_parse_ssl_CheckMode448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_CheckMode466 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_CheckMode487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ssl_CheckLabel516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_CheckLabel534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_ssl_CheckLabel555 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_CheckLabel578 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_CheckLabel608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_CheckTimePastOther641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_ssl_CheckTimePastOther662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_CheckTimePastOther680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_ssl_PressButton716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_PressButton734 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_ssl_PressButton755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_ssl_ObserveMode784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveMode802 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_ObserveMode823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_ssl_ObserveButton852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveButton870 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_ssl_ObserveButton891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveButton909 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_ObserveButton930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ssl_ObserveLabelValue959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveLabelValue977 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_ssl_ObserveLabelValue998 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveLabelValue1021 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_ObserveLabelValue1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ssl_ObserveLabelVariable1080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveLabelVariable1098 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_ssl_ObserveLabelVariable1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveLabelVariable1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveVariableChange1177 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_ssl_ObserveVariableChange1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveVariableChange1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_ssl_ObserveRing1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_CheckMode_in_parse_ssl_Condition1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_CheckLabel_in_parse_ssl_Condition1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_CheckTimePastOther_in_parse_ssl_Condition1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_PressButton_in_parse_ssl_Action1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveMode_in_parse_ssl_Observation1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveButton_in_parse_ssl_Observation1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveLabelValue_in_parse_ssl_Observation1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveLabelVariable_in_parse_ssl_Observation1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveVariableChange_in_parse_ssl_Observation1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveRing_in_parse_ssl_Observation1389 = new BitSet(new long[]{0x0000000000000002L});

}