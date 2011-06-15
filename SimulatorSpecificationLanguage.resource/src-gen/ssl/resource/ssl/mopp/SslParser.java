// $ANTLR ${project.version} ${buildNumber}

	package ssl.resource.ssl.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class SslParser extends SslANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "WHITESPACE", "LINEBREAK", "'given'", "'when'", "'then'", "'the watch is in mode \\\"'", "'\\\"'", "'the '", "' button is pressed'", "'the watch must be in mode \\\"'", "' button must be bound to \\\"'", "'the display must show \\\"'"
    };
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int WHITESPACE=5;
    public static final int TEXT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int LINEBREAK=6;
    public static final int T__7=7;

    // delegates
    // delegators


        public SslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[21+1];
             
             
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
    			if (type.getInstanceClass() == ssl.SetMode.class) {
    				return parse_ssl_SetMode();
    			}
    			if (type.getInstanceClass() == ssl.PressButton.class) {
    				return parse_ssl_PressButton();
    			}
    			if (type.getInstanceClass() == ssl.ObserveMode.class) {
    				return parse_ssl_ObserveMode();
    			}
    			if (type.getInstanceClass() == ssl.ObserveBinding.class) {
    				return parse_ssl_ObserveBinding();
    			}
    			if (type.getInstanceClass() == ssl.ObserveDisplay.class) {
    				return parse_ssl_ObserveDisplay();
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
    		int followSetID = 28;
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
    // Ssl.g:695:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_ssl_Specification ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        ssl.Specification c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Ssl.g:696:1: ( (c0= parse_ssl_Specification ) EOF )
            // Ssl.g:697:2: (c0= parse_ssl_Specification ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // Ssl.g:702:2: (c0= parse_ssl_Specification )
            // Ssl.g:703:3: c0= parse_ssl_Specification
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
    // Ssl.g:708:1: parse_ssl_Specification returns [ssl.Specification element = null] : ( (a0_0= parse_ssl_Testcase ) )* ;
    public final ssl.Specification parse_ssl_Specification() throws RecognitionException {
        ssl.Specification element =  null;
        int parse_ssl_Specification_StartIndex = input.index();
        ssl.Testcase a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Ssl.g:711:1: ( ( (a0_0= parse_ssl_Testcase ) )* )
            // Ssl.g:712:2: ( (a0_0= parse_ssl_Testcase ) )*
            {
            // Ssl.g:712:2: ( (a0_0= parse_ssl_Testcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ssl.g:713:3: (a0_0= parse_ssl_Testcase )
            	    {
            	    // Ssl.g:713:3: (a0_0= parse_ssl_Testcase )
            	    // Ssl.g:714:4: a0_0= parse_ssl_Testcase
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
    // Ssl.g:742:1: parse_ssl_Testcase returns [ssl.Testcase element = null] : (a0_0= parse_ssl_Given ) ( (a1_0= parse_ssl_When ) )? (a2_0= parse_ssl_Then ) ;
    public final ssl.Testcase parse_ssl_Testcase() throws RecognitionException {
        ssl.Testcase element =  null;
        int parse_ssl_Testcase_StartIndex = input.index();
        ssl.Given a0_0 = null;

        ssl.When a1_0 = null;

        ssl.Then a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Ssl.g:745:1: ( (a0_0= parse_ssl_Given ) ( (a1_0= parse_ssl_When ) )? (a2_0= parse_ssl_Then ) )
            // Ssl.g:746:2: (a0_0= parse_ssl_Given ) ( (a1_0= parse_ssl_When ) )? (a2_0= parse_ssl_Then )
            {
            // Ssl.g:746:2: (a0_0= parse_ssl_Given )
            // Ssl.g:747:3: a0_0= parse_ssl_Given
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
            // Ssl.g:773:2: ( (a1_0= parse_ssl_When ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Ssl.g:774:3: (a1_0= parse_ssl_When )
                    {
                    // Ssl.g:774:3: (a1_0= parse_ssl_When )
                    // Ssl.g:775:4: a1_0= parse_ssl_When
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
            // Ssl.g:801:2: (a2_0= parse_ssl_Then )
            // Ssl.g:802:3: a2_0= parse_ssl_Then
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
    // Ssl.g:829:1: parse_ssl_Given returns [ssl.Given element = null] : a0= 'given' ( (a1_0= parse_ssl_Condition ) )+ ;
    public final ssl.Given parse_ssl_Given() throws RecognitionException {
        ssl.Given element =  null;
        int parse_ssl_Given_StartIndex = input.index();
        Token a0=null;
        ssl.Condition a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Ssl.g:832:1: (a0= 'given' ( (a1_0= parse_ssl_Condition ) )+ )
            // Ssl.g:833:2: a0= 'given' ( (a1_0= parse_ssl_Condition ) )+
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
              	
            }
            // Ssl.g:848:2: ( (a1_0= parse_ssl_Condition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ssl.g:849:3: (a1_0= parse_ssl_Condition )
            	    {
            	    // Ssl.g:849:3: (a1_0= parse_ssl_Condition )
            	    // Ssl.g:850:4: a1_0= parse_ssl_Condition
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
    // Ssl.g:880:1: parse_ssl_When returns [ssl.When element = null] : a0= 'when' ( (a1_0= parse_ssl_Action ) )+ ;
    public final ssl.When parse_ssl_When() throws RecognitionException {
        ssl.When element =  null;
        int parse_ssl_When_StartIndex = input.index();
        Token a0=null;
        ssl.Action a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Ssl.g:883:1: (a0= 'when' ( (a1_0= parse_ssl_Action ) )+ )
            // Ssl.g:884:2: a0= 'when' ( (a1_0= parse_ssl_Action ) )+
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 7, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_5);
              	
            }
            // Ssl.g:899:2: ( (a1_0= parse_ssl_Action ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Ssl.g:900:3: (a1_0= parse_ssl_Action )
            	    {
            	    // Ssl.g:900:3: (a1_0= parse_ssl_Action )
            	    // Ssl.g:901:4: a1_0= parse_ssl_Action
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 8, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_5);
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
    // Ssl.g:930:1: parse_ssl_Then returns [ssl.Then element = null] : a0= 'then' ( (a1_0= parse_ssl_Observation ) )+ ;
    public final ssl.Then parse_ssl_Then() throws RecognitionException {
        ssl.Then element =  null;
        int parse_ssl_Then_StartIndex = input.index();
        Token a0=null;
        ssl.Observation a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Ssl.g:933:1: (a0= 'then' ( (a1_0= parse_ssl_Observation ) )+ )
            // Ssl.g:934:2: a0= 'then' ( (a1_0= parse_ssl_Observation ) )+
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 9, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              	
            }
            // Ssl.g:951:2: ( (a1_0= parse_ssl_Observation ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12||LA5_0==14||LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Ssl.g:952:3: (a1_0= parse_ssl_Observation )
            	    {
            	    // Ssl.g:952:3: (a1_0= parse_ssl_Observation )
            	    // Ssl.g:953:4: a1_0= parse_ssl_Observation
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 10, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
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


    // $ANTLR start "parse_ssl_SetMode"
    // Ssl.g:984:1: parse_ssl_SetMode returns [ssl.SetMode element = null] : a0= 'the watch is in mode \\\"' (a1= TEXT ) a2= '\\\"' ;
    public final ssl.SetMode parse_ssl_SetMode() throws RecognitionException {
        ssl.SetMode element =  null;
        int parse_ssl_SetMode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Ssl.g:987:1: (a0= 'the watch is in mode \\\"' (a1= TEXT ) a2= '\\\"' )
            // Ssl.g:988:2: a0= 'the watch is in mode \\\"' (a1= TEXT ) a2= '\\\"'
            {
            a0=(Token)match(input,10,FOLLOW_10_in_parse_ssl_SetMode448); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createSetMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_8, 11);
              	
            }
            // Ssl.g:1003:2: (a1= TEXT )
            // Ssl.g:1004:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_SetMode466); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createSetMode();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.SET_MODE__MODE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.SET_MODE__MODE), resolved);
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_9, 12);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_ssl_SetMode487); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createSetMode();
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
            if ( state.backtracking>0 ) { memoize(input, 7, parse_ssl_SetMode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_SetMode"


    // $ANTLR start "parse_ssl_PressButton"
    // Ssl.g:1058:1: parse_ssl_PressButton returns [ssl.PressButton element = null] : a0= 'the ' (a1= TEXT ) a2= ' button is pressed' ;
    public final ssl.PressButton parse_ssl_PressButton() throws RecognitionException {
        ssl.PressButton element =  null;
        int parse_ssl_PressButton_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Ssl.g:1061:1: (a0= 'the ' (a1= TEXT ) a2= ' button is pressed' )
            // Ssl.g:1062:2: a0= 'the ' (a1= TEXT ) a2= ' button is pressed'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ssl_PressButton516); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createPressButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_10, 14);
              	
            }
            // Ssl.g:1077:2: (a1= TEXT )
            // Ssl.g:1078:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_PressButton534); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_11, 15);
              	
            }
            a2=(Token)match(input,13,FOLLOW_13_in_parse_ssl_PressButton555); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createPressButton();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_4, 16, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_5);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_2, 16, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_3);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_ssl_PressButton_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_PressButton"


    // $ANTLR start "parse_ssl_ObserveMode"
    // Ssl.g:1131:1: parse_ssl_ObserveMode returns [ssl.ObserveMode element = null] : a0= 'the watch must be in mode \\\"' (a1= TEXT ) a2= '\\\"' ;
    public final ssl.ObserveMode parse_ssl_ObserveMode() throws RecognitionException {
        ssl.ObserveMode element =  null;
        int parse_ssl_ObserveMode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Ssl.g:1134:1: (a0= 'the watch must be in mode \\\"' (a1= TEXT ) a2= '\\\"' )
            // Ssl.g:1135:2: a0= 'the watch must be in mode \\\"' (a1= TEXT ) a2= '\\\"'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_ssl_ObserveMode584); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_12, 17);
              	
            }
            // Ssl.g:1150:2: (a1= TEXT )
            // Ssl.g:1151:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveMode602); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_13, 18);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_ssl_ObserveMode623); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveMode();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 19, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 19, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 19, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 19, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_ssl_ObserveMode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveMode"


    // $ANTLR start "parse_ssl_ObserveBinding"
    // Ssl.g:1206:1: parse_ssl_ObserveBinding returns [ssl.ObserveBinding element = null] : a0= 'the ' (a1= TEXT ) a2= ' button must be bound to \\\"' (a3= TEXT ) a4= '\\\"' ;
    public final ssl.ObserveBinding parse_ssl_ObserveBinding() throws RecognitionException {
        ssl.ObserveBinding element =  null;
        int parse_ssl_ObserveBinding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Ssl.g:1209:1: (a0= 'the ' (a1= TEXT ) a2= ' button must be bound to \\\"' (a3= TEXT ) a4= '\\\"' )
            // Ssl.g:1210:2: a0= 'the ' (a1= TEXT ) a2= ' button must be bound to \\\"' (a3= TEXT ) a4= '\\\"'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ssl_ObserveBinding652); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveBinding();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_14, 20);
              	
            }
            // Ssl.g:1225:2: (a1= TEXT )
            // Ssl.g:1226:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveBinding670); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveBinding();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BINDING__BUTTON), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BINDING__BUTTON), resolved);
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_15, 21);
              	
            }
            a2=(Token)match(input,15,FOLLOW_15_in_parse_ssl_ObserveBinding691); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveBinding();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_16, 22);
              	
            }
            // Ssl.g:1276:2: (a3= TEXT )
            // Ssl.g:1277:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveBinding709); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveBinding();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a3 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BINDING__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_BINDING__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_17, 23);
              	
            }
            a4=(Token)match(input,11,FOLLOW_11_in_parse_ssl_ObserveBinding730); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveBinding();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 24, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 24, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 24, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 24, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_ssl_ObserveBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveBinding"


    // $ANTLR start "parse_ssl_ObserveDisplay"
    // Ssl.g:1332:1: parse_ssl_ObserveDisplay returns [ssl.ObserveDisplay element = null] : a0= 'the display must show \\\"' (a1= TEXT ) a2= '\\\"' ;
    public final ssl.ObserveDisplay parse_ssl_ObserveDisplay() throws RecognitionException {
        ssl.ObserveDisplay element =  null;
        int parse_ssl_ObserveDisplay_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Ssl.g:1335:1: (a0= 'the display must show \\\"' (a1= TEXT ) a2= '\\\"' )
            // Ssl.g:1336:2: a0= 'the display must show \\\"' (a1= TEXT ) a2= '\\\"'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_ssl_ObserveDisplay759); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveDisplay();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_18, 25);
              	
            }
            // Ssl.g:1351:2: (a1= TEXT )
            // Ssl.g:1352:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ssl_ObserveDisplay777); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new ssl.resource.ssl.mopp.SslTerminateParsingException();
              			}
              			if (element == null) {
              				element = ssl.SslFactory.eINSTANCE.createObserveDisplay();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				ssl.resource.ssl.ISslTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				ssl.resource.ssl.ISslTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_DISPLAY__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(ssl.SslPackage.OBSERVE_DISPLAY__VALUE), resolved);
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
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_19, 26);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_ssl_ObserveDisplay798); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = ssl.SslFactory.eINSTANCE.createObserveDisplay();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_5, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_6, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_7, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_6);
              		addExpectedElement(ssl.resource.ssl.grammar.SslFollowSetProvider.TERMINAL_0, 27, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_0, ssl.resource.ssl.grammar.SslFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_ssl_ObserveDisplay_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_ObserveDisplay"


    // $ANTLR start "parse_ssl_Condition"
    // Ssl.g:1407:1: parse_ssl_Condition returns [ssl.Condition element = null] : c0= parse_ssl_SetMode ;
    public final ssl.Condition parse_ssl_Condition() throws RecognitionException {
        ssl.Condition element =  null;
        int parse_ssl_Condition_StartIndex = input.index();
        ssl.SetMode c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Ssl.g:1408:1: (c0= parse_ssl_SetMode )
            // Ssl.g:1409:2: c0= parse_ssl_SetMode
            {
            pushFollow(FOLLOW_parse_ssl_SetMode_in_parse_ssl_Condition823);
            c0=parse_ssl_SetMode();

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
            if ( state.backtracking>0 ) { memoize(input, 12, parse_ssl_Condition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Condition"


    // $ANTLR start "parse_ssl_Action"
    // Ssl.g:1413:1: parse_ssl_Action returns [ssl.Action element = null] : c0= parse_ssl_PressButton ;
    public final ssl.Action parse_ssl_Action() throws RecognitionException {
        ssl.Action element =  null;
        int parse_ssl_Action_StartIndex = input.index();
        ssl.PressButton c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Ssl.g:1414:1: (c0= parse_ssl_PressButton )
            // Ssl.g:1415:2: c0= parse_ssl_PressButton
            {
            pushFollow(FOLLOW_parse_ssl_PressButton_in_parse_ssl_Action844);
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
            if ( state.backtracking>0 ) { memoize(input, 13, parse_ssl_Action_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_ssl_Action"


    // $ANTLR start "parse_ssl_Observation"
    // Ssl.g:1419:1: parse_ssl_Observation returns [ssl.Observation element = null] : (c0= parse_ssl_ObserveMode | c1= parse_ssl_ObserveBinding | c2= parse_ssl_ObserveDisplay );
    public final ssl.Observation parse_ssl_Observation() throws RecognitionException {
        ssl.Observation element =  null;
        int parse_ssl_Observation_StartIndex = input.index();
        ssl.ObserveMode c0 = null;

        ssl.ObserveBinding c1 = null;

        ssl.ObserveDisplay c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Ssl.g:1420:1: (c0= parse_ssl_ObserveMode | c1= parse_ssl_ObserveBinding | c2= parse_ssl_ObserveDisplay )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Ssl.g:1421:2: c0= parse_ssl_ObserveMode
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveMode_in_parse_ssl_Observation865);
                    c0=parse_ssl_ObserveMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Ssl.g:1422:4: c1= parse_ssl_ObserveBinding
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveBinding_in_parse_ssl_Observation875);
                    c1=parse_ssl_ObserveBinding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Ssl.g:1423:4: c2= parse_ssl_ObserveDisplay
                    {
                    pushFollow(FOLLOW_parse_ssl_ObserveDisplay_in_parse_ssl_Observation885);
                    c2=parse_ssl_ObserveDisplay();

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
            if ( state.backtracking>0 ) { memoize(input, 14, parse_ssl_Observation_StartIndex); }
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
    public static final BitSet FOLLOW_7_in_parse_ssl_Given256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_ssl_Condition_in_parse_ssl_Given279 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_8_in_parse_ssl_When320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_parse_ssl_Action_in_parse_ssl_When343 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9_in_parse_ssl_Then384 = new BitSet(new long[]{0x0000000000015000L});
    public static final BitSet FOLLOW_parse_ssl_Observation_in_parse_ssl_Then407 = new BitSet(new long[]{0x0000000000015002L});
    public static final BitSet FOLLOW_10_in_parse_ssl_SetMode448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_SetMode466 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_SetMode487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ssl_PressButton516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_PressButton534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_ssl_PressButton555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_ssl_ObserveMode584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveMode602 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_ObserveMode623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ssl_ObserveBinding652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveBinding670 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_ssl_ObserveBinding691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveBinding709 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_ObserveBinding730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_ssl_ObserveDisplay759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_ssl_ObserveDisplay777 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ssl_ObserveDisplay798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_SetMode_in_parse_ssl_Condition823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_PressButton_in_parse_ssl_Action844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveMode_in_parse_ssl_Observation865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveBinding_in_parse_ssl_Observation875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ssl_ObserveDisplay_in_parse_ssl_Observation885 = new BitSet(new long[]{0x0000000000000002L});

}