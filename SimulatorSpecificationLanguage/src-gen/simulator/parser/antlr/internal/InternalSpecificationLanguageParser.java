package simulator.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import simulator.services.SpecificationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecificationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification'", "'{'", "'testcases'", "','", "'}'", "'Testcase'", "'given'", "'when'", "'then'", "'Given'", "'conditions'", "'When'", "'actions'", "'Then'", "'observations'", "'SetMode'", "'mode'", "'PressButton'", "'button'", "'ObserveMode'", "'ObserveBinding'", "'ObserveDisplay'", "'value'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSpecificationLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g"; }



     	private SpecificationLanguageGrammarAccess grammarAccess;
     	
        public InternalSpecificationLanguageParser(TokenStream input, IAstFactory factory, SpecificationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("simulator/parser/antlr/internal/InternalSpecificationLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected SpecificationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSpecification
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:77:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:78:2: (iv_ruleSpecification= ruleSpecification EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:79:2: iv_ruleSpecification= ruleSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecificationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSpecification_in_entryRuleSpecification75);
            iv_ruleSpecification=ruleSpecification();
            _fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpecification85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSpecification


    // $ANTLR start ruleSpecification
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:86:1: ruleSpecification returns [EObject current=null] : ( () 'Specification' '{' ( 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}' )? '}' ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_testcases_5_0 = null;

        EObject lv_testcases_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:91:6: ( ( () 'Specification' '{' ( 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}' )? '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:92:1: ( () 'Specification' '{' ( 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}' )? '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:92:1: ( () 'Specification' '{' ( 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}' )? '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:92:2: () 'Specification' '{' ( 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}' )? '}'
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:92:2: ()
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getSpecificationAccess().getSpecificationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSpecificationAccess().getSpecificationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,11,FollowSets000.FOLLOW_11_in_ruleSpecification129); 

                    createLeafNode(grammarAccess.getSpecificationAccess().getSpecificationKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleSpecification139); 

                    createLeafNode(grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:111:1: ( 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:111:3: 'testcases' '{' ( (lv_testcases_5_0= ruleTestcase ) ) ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )* '}'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleSpecification150); 

                            createLeafNode(grammarAccess.getSpecificationAccess().getTestcasesKeyword_3_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleSpecification160); 

                            createLeafNode(grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_3_1(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:119:1: ( (lv_testcases_5_0= ruleTestcase ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:120:1: (lv_testcases_5_0= ruleTestcase )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:120:1: (lv_testcases_5_0= ruleTestcase )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:121:3: lv_testcases_5_0= ruleTestcase
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getTestcasesTestcaseParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTestcase_in_ruleSpecification181);
                    lv_testcases_5_0=ruleTestcase();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"testcases",
                    	        		lv_testcases_5_0, 
                    	        		"Testcase", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:143:2: ( ',' ( (lv_testcases_7_0= ruleTestcase ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:143:4: ',' ( (lv_testcases_7_0= ruleTestcase ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleSpecification192); 

                    	            createLeafNode(grammarAccess.getSpecificationAccess().getCommaKeyword_3_3_0(), null); 
                    	        
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:147:1: ( (lv_testcases_7_0= ruleTestcase ) )
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:148:1: (lv_testcases_7_0= ruleTestcase )
                    	    {
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:148:1: (lv_testcases_7_0= ruleTestcase )
                    	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:149:3: lv_testcases_7_0= ruleTestcase
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getTestcasesTestcaseParserRuleCall_3_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTestcase_in_ruleSpecification213);
                    	    lv_testcases_7_0=ruleTestcase();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"testcases",
                    	    	        		lv_testcases_7_0, 
                    	    	        		"Testcase", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleSpecification225); 

                            createLeafNode(grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_3_4(), null); 
                        

                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleSpecification237); 

                    createLeafNode(grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSpecification


    // $ANTLR start entryRuleCondition
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:187:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:188:2: (iv_ruleCondition= ruleCondition EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:189:2: iv_ruleCondition= ruleCondition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConditionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition273);
            iv_ruleCondition=ruleCondition();
            _fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCondition


    // $ANTLR start ruleCondition
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:196:1: ruleCondition returns [EObject current=null] : this_SetMode_0= ruleSetMode ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_SetMode_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:201:6: (this_SetMode_0= ruleSetMode )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:203:5: this_SetMode_0= ruleSetMode
            {
             
                    currentNode=createCompositeNode(grammarAccess.getConditionAccess().getSetModeParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSetMode_in_ruleCondition329);
            this_SetMode_0=ruleSetMode();
            _fsp--;

             
                    current = this_SetMode_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCondition


    // $ANTLR start entryRuleAction
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:219:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:220:2: (iv_ruleAction= ruleAction EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:221:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction363);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:228:1: ruleAction returns [EObject current=null] : this_PressButton_0= rulePressButton ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_PressButton_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:233:6: (this_PressButton_0= rulePressButton )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:235:5: this_PressButton_0= rulePressButton
            {
             
                    currentNode=createCompositeNode(grammarAccess.getActionAccess().getPressButtonParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_rulePressButton_in_ruleAction419);
            this_PressButton_0=rulePressButton();
            _fsp--;

             
                    current = this_PressButton_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleObservation
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:251:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:252:2: (iv_ruleObservation= ruleObservation EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:253:2: iv_ruleObservation= ruleObservation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObservationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleObservation_in_entryRuleObservation453);
            iv_ruleObservation=ruleObservation();
            _fsp--;

             current =iv_ruleObservation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObservation463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleObservation


    // $ANTLR start ruleObservation
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:260:1: ruleObservation returns [EObject current=null] : (this_ObserveMode_0= ruleObserveMode | this_ObserveBinding_1= ruleObserveBinding | this_ObserveDisplay_2= ruleObserveDisplay ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        EObject this_ObserveMode_0 = null;

        EObject this_ObserveBinding_1 = null;

        EObject this_ObserveDisplay_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:265:6: ( (this_ObserveMode_0= ruleObserveMode | this_ObserveBinding_1= ruleObserveBinding | this_ObserveDisplay_2= ruleObserveDisplay ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:266:1: (this_ObserveMode_0= ruleObserveMode | this_ObserveBinding_1= ruleObserveBinding | this_ObserveDisplay_2= ruleObserveDisplay )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:266:1: (this_ObserveMode_0= ruleObserveMode | this_ObserveBinding_1= ruleObserveBinding | this_ObserveDisplay_2= ruleObserveDisplay )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("266:1: (this_ObserveMode_0= ruleObserveMode | this_ObserveBinding_1= ruleObserveBinding | this_ObserveDisplay_2= ruleObserveDisplay )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:267:5: this_ObserveMode_0= ruleObserveMode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObservationAccess().getObserveModeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleObserveMode_in_ruleObservation510);
                    this_ObserveMode_0=ruleObserveMode();
                    _fsp--;

                     
                            current = this_ObserveMode_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:277:5: this_ObserveBinding_1= ruleObserveBinding
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObservationAccess().getObserveBindingParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleObserveBinding_in_ruleObservation537);
                    this_ObserveBinding_1=ruleObserveBinding();
                    _fsp--;

                     
                            current = this_ObserveBinding_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:287:5: this_ObserveDisplay_2= ruleObserveDisplay
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObservationAccess().getObserveDisplayParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleObserveDisplay_in_ruleObservation564);
                    this_ObserveDisplay_2=ruleObserveDisplay();
                    _fsp--;

                     
                            current = this_ObserveDisplay_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObservation


    // $ANTLR start entryRuleTestcase
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:303:1: entryRuleTestcase returns [EObject current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final EObject entryRuleTestcase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestcase = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:304:2: (iv_ruleTestcase= ruleTestcase EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:305:2: iv_ruleTestcase= ruleTestcase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestcaseRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTestcase_in_entryRuleTestcase599);
            iv_ruleTestcase=ruleTestcase();
            _fsp--;

             current =iv_ruleTestcase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTestcase609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTestcase


    // $ANTLR start ruleTestcase
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:312:1: ruleTestcase returns [EObject current=null] : ( 'Testcase' '{' 'given' ( (lv_given_3_0= ruleGiven ) ) ( 'when' ( (lv_when_5_0= ruleWhen ) ) )? 'then' ( (lv_then_7_0= ruleThen ) ) '}' ) ;
    public final EObject ruleTestcase() throws RecognitionException {
        EObject current = null;

        EObject lv_given_3_0 = null;

        EObject lv_when_5_0 = null;

        EObject lv_then_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:317:6: ( ( 'Testcase' '{' 'given' ( (lv_given_3_0= ruleGiven ) ) ( 'when' ( (lv_when_5_0= ruleWhen ) ) )? 'then' ( (lv_then_7_0= ruleThen ) ) '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:318:1: ( 'Testcase' '{' 'given' ( (lv_given_3_0= ruleGiven ) ) ( 'when' ( (lv_when_5_0= ruleWhen ) ) )? 'then' ( (lv_then_7_0= ruleThen ) ) '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:318:1: ( 'Testcase' '{' 'given' ( (lv_given_3_0= ruleGiven ) ) ( 'when' ( (lv_when_5_0= ruleWhen ) ) )? 'then' ( (lv_then_7_0= ruleThen ) ) '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:318:3: 'Testcase' '{' 'given' ( (lv_given_3_0= ruleGiven ) ) ( 'when' ( (lv_when_5_0= ruleWhen ) ) )? 'then' ( (lv_then_7_0= ruleThen ) ) '}'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleTestcase644); 

                    createLeafNode(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleTestcase654); 

                    createLeafNode(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,17,FollowSets000.FOLLOW_17_in_ruleTestcase664); 

                    createLeafNode(grammarAccess.getTestcaseAccess().getGivenKeyword_2(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:330:1: ( (lv_given_3_0= ruleGiven ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:331:1: (lv_given_3_0= ruleGiven )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:331:1: (lv_given_3_0= ruleGiven )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:332:3: lv_given_3_0= ruleGiven
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTestcaseAccess().getGivenGivenParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGiven_in_ruleTestcase685);
            lv_given_3_0=ruleGiven();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestcaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"given",
            	        		lv_given_3_0, 
            	        		"Given", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:354:2: ( 'when' ( (lv_when_5_0= ruleWhen ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:354:4: 'when' ( (lv_when_5_0= ruleWhen ) )
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleTestcase696); 

                            createLeafNode(grammarAccess.getTestcaseAccess().getWhenKeyword_4_0(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:358:1: ( (lv_when_5_0= ruleWhen ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:359:1: (lv_when_5_0= ruleWhen )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:359:1: (lv_when_5_0= ruleWhen )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:360:3: lv_when_5_0= ruleWhen
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTestcaseAccess().getWhenWhenParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWhen_in_ruleTestcase717);
                    lv_when_5_0=ruleWhen();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTestcaseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"when",
                    	        		lv_when_5_0, 
                    	        		"When", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleTestcase729); 

                    createLeafNode(grammarAccess.getTestcaseAccess().getThenKeyword_5(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:386:1: ( (lv_then_7_0= ruleThen ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:387:1: (lv_then_7_0= ruleThen )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:387:1: (lv_then_7_0= ruleThen )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:388:3: lv_then_7_0= ruleThen
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTestcaseAccess().getThenThenParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleThen_in_ruleTestcase750);
            lv_then_7_0=ruleThen();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTestcaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"then",
            	        		lv_then_7_0, 
            	        		"Then", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleTestcase760); 

                    createLeafNode(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTestcase


    // $ANTLR start entryRuleGiven
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:422:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:423:2: (iv_ruleGiven= ruleGiven EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:424:2: iv_ruleGiven= ruleGiven EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGivenRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleGiven_in_entryRuleGiven796);
            iv_ruleGiven=ruleGiven();
            _fsp--;

             current =iv_ruleGiven; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGiven806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGiven


    // $ANTLR start ruleGiven
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:431:1: ruleGiven returns [EObject current=null] : ( 'Given' '{' 'conditions' '{' ( (lv_conditions_4_0= ruleCondition ) ) ( ',' ( (lv_conditions_6_0= ruleCondition ) ) )* '}' '}' ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_4_0 = null;

        EObject lv_conditions_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:436:6: ( ( 'Given' '{' 'conditions' '{' ( (lv_conditions_4_0= ruleCondition ) ) ( ',' ( (lv_conditions_6_0= ruleCondition ) ) )* '}' '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:437:1: ( 'Given' '{' 'conditions' '{' ( (lv_conditions_4_0= ruleCondition ) ) ( ',' ( (lv_conditions_6_0= ruleCondition ) ) )* '}' '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:437:1: ( 'Given' '{' 'conditions' '{' ( (lv_conditions_4_0= ruleCondition ) ) ( ',' ( (lv_conditions_6_0= ruleCondition ) ) )* '}' '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:437:3: 'Given' '{' 'conditions' '{' ( (lv_conditions_4_0= ruleCondition ) ) ( ',' ( (lv_conditions_6_0= ruleCondition ) ) )* '}' '}'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleGiven841); 

                    createLeafNode(grammarAccess.getGivenAccess().getGivenKeyword_0(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleGiven851); 

                    createLeafNode(grammarAccess.getGivenAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,21,FollowSets000.FOLLOW_21_in_ruleGiven861); 

                    createLeafNode(grammarAccess.getGivenAccess().getConditionsKeyword_2(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleGiven871); 

                    createLeafNode(grammarAccess.getGivenAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:453:1: ( (lv_conditions_4_0= ruleCondition ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:454:1: (lv_conditions_4_0= ruleCondition )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:454:1: (lv_conditions_4_0= ruleCondition )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:455:3: lv_conditions_4_0= ruleCondition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGivenAccess().getConditionsConditionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleGiven892);
            lv_conditions_4_0=ruleCondition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGivenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"conditions",
            	        		lv_conditions_4_0, 
            	        		"Condition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:477:2: ( ',' ( (lv_conditions_6_0= ruleCondition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:477:4: ',' ( (lv_conditions_6_0= ruleCondition ) )
            	    {
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleGiven903); 

            	            createLeafNode(grammarAccess.getGivenAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:481:1: ( (lv_conditions_6_0= ruleCondition ) )
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:482:1: (lv_conditions_6_0= ruleCondition )
            	    {
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:482:1: (lv_conditions_6_0= ruleCondition )
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:483:3: lv_conditions_6_0= ruleCondition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGivenAccess().getConditionsConditionParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleGiven924);
            	    lv_conditions_6_0=ruleCondition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGivenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"conditions",
            	    	        		lv_conditions_6_0, 
            	    	        		"Condition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,15,FollowSets000.FOLLOW_15_in_ruleGiven936); 

                    createLeafNode(grammarAccess.getGivenAccess().getRightCurlyBracketKeyword_6(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleGiven946); 

                    createLeafNode(grammarAccess.getGivenAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGiven


    // $ANTLR start entryRuleWhen
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:521:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:522:2: (iv_ruleWhen= ruleWhen EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:523:2: iv_ruleWhen= ruleWhen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhenRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleWhen_in_entryRuleWhen982);
            iv_ruleWhen=ruleWhen();
            _fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhen992); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWhen


    // $ANTLR start ruleWhen
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:530:1: ruleWhen returns [EObject current=null] : ( 'When' '{' 'actions' '{' ( (lv_actions_4_0= ruleAction ) ) ( ',' ( (lv_actions_6_0= ruleAction ) ) )* '}' '}' ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_4_0 = null;

        EObject lv_actions_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:535:6: ( ( 'When' '{' 'actions' '{' ( (lv_actions_4_0= ruleAction ) ) ( ',' ( (lv_actions_6_0= ruleAction ) ) )* '}' '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:536:1: ( 'When' '{' 'actions' '{' ( (lv_actions_4_0= ruleAction ) ) ( ',' ( (lv_actions_6_0= ruleAction ) ) )* '}' '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:536:1: ( 'When' '{' 'actions' '{' ( (lv_actions_4_0= ruleAction ) ) ( ',' ( (lv_actions_6_0= ruleAction ) ) )* '}' '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:536:3: 'When' '{' 'actions' '{' ( (lv_actions_4_0= ruleAction ) ) ( ',' ( (lv_actions_6_0= ruleAction ) ) )* '}' '}'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleWhen1027); 

                    createLeafNode(grammarAccess.getWhenAccess().getWhenKeyword_0(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleWhen1037); 

                    createLeafNode(grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,23,FollowSets000.FOLLOW_23_in_ruleWhen1047); 

                    createLeafNode(grammarAccess.getWhenAccess().getActionsKeyword_2(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleWhen1057); 

                    createLeafNode(grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:552:1: ( (lv_actions_4_0= ruleAction ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:553:1: (lv_actions_4_0= ruleAction )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:553:1: (lv_actions_4_0= ruleAction )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:554:3: lv_actions_4_0= ruleAction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhenAccess().getActionsActionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleWhen1078);
            lv_actions_4_0=ruleAction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWhenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"actions",
            	        		lv_actions_4_0, 
            	        		"Action", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:576:2: ( ',' ( (lv_actions_6_0= ruleAction ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:576:4: ',' ( (lv_actions_6_0= ruleAction ) )
            	    {
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleWhen1089); 

            	            createLeafNode(grammarAccess.getWhenAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:580:1: ( (lv_actions_6_0= ruleAction ) )
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:581:1: (lv_actions_6_0= ruleAction )
            	    {
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:581:1: (lv_actions_6_0= ruleAction )
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:582:3: lv_actions_6_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWhenAccess().getActionsActionParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleWhen1110);
            	    lv_actions_6_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWhenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_6_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,15,FollowSets000.FOLLOW_15_in_ruleWhen1122); 

                    createLeafNode(grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_6(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleWhen1132); 

                    createLeafNode(grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWhen


    // $ANTLR start entryRuleThen
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:620:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:621:2: (iv_ruleThen= ruleThen EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:622:2: iv_ruleThen= ruleThen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleThen_in_entryRuleThen1168);
            iv_ruleThen=ruleThen();
            _fsp--;

             current =iv_ruleThen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleThen1178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleThen


    // $ANTLR start ruleThen
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:629:1: ruleThen returns [EObject current=null] : ( 'Then' '{' 'observations' '{' ( (lv_observations_4_0= ruleObservation ) ) ( ',' ( (lv_observations_6_0= ruleObservation ) ) )* '}' '}' ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        EObject lv_observations_4_0 = null;

        EObject lv_observations_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:634:6: ( ( 'Then' '{' 'observations' '{' ( (lv_observations_4_0= ruleObservation ) ) ( ',' ( (lv_observations_6_0= ruleObservation ) ) )* '}' '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:635:1: ( 'Then' '{' 'observations' '{' ( (lv_observations_4_0= ruleObservation ) ) ( ',' ( (lv_observations_6_0= ruleObservation ) ) )* '}' '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:635:1: ( 'Then' '{' 'observations' '{' ( (lv_observations_4_0= ruleObservation ) ) ( ',' ( (lv_observations_6_0= ruleObservation ) ) )* '}' '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:635:3: 'Then' '{' 'observations' '{' ( (lv_observations_4_0= ruleObservation ) ) ( ',' ( (lv_observations_6_0= ruleObservation ) ) )* '}' '}'
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleThen1213); 

                    createLeafNode(grammarAccess.getThenAccess().getThenKeyword_0(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleThen1223); 

                    createLeafNode(grammarAccess.getThenAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,25,FollowSets000.FOLLOW_25_in_ruleThen1233); 

                    createLeafNode(grammarAccess.getThenAccess().getObservationsKeyword_2(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleThen1243); 

                    createLeafNode(grammarAccess.getThenAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:651:1: ( (lv_observations_4_0= ruleObservation ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:652:1: (lv_observations_4_0= ruleObservation )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:652:1: (lv_observations_4_0= ruleObservation )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:653:3: lv_observations_4_0= ruleObservation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getThenAccess().getObservationsObservationParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleObservation_in_ruleThen1264);
            lv_observations_4_0=ruleObservation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getThenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"observations",
            	        		lv_observations_4_0, 
            	        		"Observation", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:675:2: ( ',' ( (lv_observations_6_0= ruleObservation ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:675:4: ',' ( (lv_observations_6_0= ruleObservation ) )
            	    {
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleThen1275); 

            	            createLeafNode(grammarAccess.getThenAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:679:1: ( (lv_observations_6_0= ruleObservation ) )
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:680:1: (lv_observations_6_0= ruleObservation )
            	    {
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:680:1: (lv_observations_6_0= ruleObservation )
            	    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:681:3: lv_observations_6_0= ruleObservation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getThenAccess().getObservationsObservationParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleObservation_in_ruleThen1296);
            	    lv_observations_6_0=ruleObservation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getThenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"observations",
            	    	        		lv_observations_6_0, 
            	    	        		"Observation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,15,FollowSets000.FOLLOW_15_in_ruleThen1308); 

                    createLeafNode(grammarAccess.getThenAccess().getRightCurlyBracketKeyword_6(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleThen1318); 

                    createLeafNode(grammarAccess.getThenAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleThen


    // $ANTLR start entryRuleSetMode
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:719:1: entryRuleSetMode returns [EObject current=null] : iv_ruleSetMode= ruleSetMode EOF ;
    public final EObject entryRuleSetMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetMode = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:720:2: (iv_ruleSetMode= ruleSetMode EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:721:2: iv_ruleSetMode= ruleSetMode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetModeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSetMode_in_entryRuleSetMode1354);
            iv_ruleSetMode=ruleSetMode();
            _fsp--;

             current =iv_ruleSetMode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetMode1364); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSetMode


    // $ANTLR start ruleSetMode
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:728:1: ruleSetMode returns [EObject current=null] : ( () 'SetMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' ) ;
    public final EObject ruleSetMode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_mode_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:733:6: ( ( () 'SetMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:734:1: ( () 'SetMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:734:1: ( () 'SetMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:734:2: () 'SetMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}'
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:734:2: ()
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:735:5: 
            {
             
                    temp=factory.create(grammarAccess.getSetModeAccess().getSetModeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSetModeAccess().getSetModeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,26,FollowSets000.FOLLOW_26_in_ruleSetMode1408); 

                    createLeafNode(grammarAccess.getSetModeAccess().getSetModeKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleSetMode1418); 

                    createLeafNode(grammarAccess.getSetModeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:753:1: ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:753:3: 'mode' ( (lv_mode_4_0= ruleEString ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleSetMode1429); 

                            createLeafNode(grammarAccess.getSetModeAccess().getModeKeyword_3_0(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:757:1: ( (lv_mode_4_0= ruleEString ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:758:1: (lv_mode_4_0= ruleEString )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:758:1: (lv_mode_4_0= ruleEString )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:759:3: lv_mode_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSetModeAccess().getModeEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSetMode1450);
                    lv_mode_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSetModeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"mode",
                    	        		lv_mode_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleSetMode1462); 

                    createLeafNode(grammarAccess.getSetModeAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSetMode


    // $ANTLR start entryRuleEString
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:793:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:794:2: (iv_ruleEString= ruleEString EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:795:2: iv_ruleEString= ruleEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1499);
            iv_ruleEString=ruleEString();
            _fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:802:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:807:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:808:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:808:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("808:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:808:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1550); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:816:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1576); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEString


    // $ANTLR start entryRulePressButton
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:831:1: entryRulePressButton returns [EObject current=null] : iv_rulePressButton= rulePressButton EOF ;
    public final EObject entryRulePressButton() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressButton = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:832:2: (iv_rulePressButton= rulePressButton EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:833:2: iv_rulePressButton= rulePressButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPressButtonRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePressButton_in_entryRulePressButton1621);
            iv_rulePressButton=rulePressButton();
            _fsp--;

             current =iv_rulePressButton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressButton1631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePressButton


    // $ANTLR start rulePressButton
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:840:1: rulePressButton returns [EObject current=null] : ( () 'PressButton' '{' ( 'button' ( (lv_button_4_0= ruleEString ) ) )? '}' ) ;
    public final EObject rulePressButton() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_button_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:845:6: ( ( () 'PressButton' '{' ( 'button' ( (lv_button_4_0= ruleEString ) ) )? '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:846:1: ( () 'PressButton' '{' ( 'button' ( (lv_button_4_0= ruleEString ) ) )? '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:846:1: ( () 'PressButton' '{' ( 'button' ( (lv_button_4_0= ruleEString ) ) )? '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:846:2: () 'PressButton' '{' ( 'button' ( (lv_button_4_0= ruleEString ) ) )? '}'
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:846:2: ()
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:847:5: 
            {
             
                    temp=factory.create(grammarAccess.getPressButtonAccess().getPressButtonAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPressButtonAccess().getPressButtonAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,28,FollowSets000.FOLLOW_28_in_rulePressButton1675); 

                    createLeafNode(grammarAccess.getPressButtonAccess().getPressButtonKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_rulePressButton1685); 

                    createLeafNode(grammarAccess.getPressButtonAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:865:1: ( 'button' ( (lv_button_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:865:3: 'button' ( (lv_button_4_0= ruleEString ) )
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rulePressButton1696); 

                            createLeafNode(grammarAccess.getPressButtonAccess().getButtonKeyword_3_0(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:869:1: ( (lv_button_4_0= ruleEString ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:870:1: (lv_button_4_0= ruleEString )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:870:1: (lv_button_4_0= ruleEString )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:871:3: lv_button_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPressButtonAccess().getButtonEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePressButton1717);
                    lv_button_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPressButtonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"button",
                    	        		lv_button_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_rulePressButton1729); 

                    createLeafNode(grammarAccess.getPressButtonAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePressButton


    // $ANTLR start entryRuleObserveMode
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:905:1: entryRuleObserveMode returns [EObject current=null] : iv_ruleObserveMode= ruleObserveMode EOF ;
    public final EObject entryRuleObserveMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserveMode = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:906:2: (iv_ruleObserveMode= ruleObserveMode EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:907:2: iv_ruleObserveMode= ruleObserveMode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObserveModeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleObserveMode_in_entryRuleObserveMode1765);
            iv_ruleObserveMode=ruleObserveMode();
            _fsp--;

             current =iv_ruleObserveMode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObserveMode1775); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleObserveMode


    // $ANTLR start ruleObserveMode
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:914:1: ruleObserveMode returns [EObject current=null] : ( () 'ObserveMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' ) ;
    public final EObject ruleObserveMode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_mode_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:919:6: ( ( () 'ObserveMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:920:1: ( () 'ObserveMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:920:1: ( () 'ObserveMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:920:2: () 'ObserveMode' '{' ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )? '}'
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:920:2: ()
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:921:5: 
            {
             
                    temp=factory.create(grammarAccess.getObserveModeAccess().getObserveModeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getObserveModeAccess().getObserveModeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,30,FollowSets000.FOLLOW_30_in_ruleObserveMode1819); 

                    createLeafNode(grammarAccess.getObserveModeAccess().getObserveModeKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleObserveMode1829); 

                    createLeafNode(grammarAccess.getObserveModeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:939:1: ( 'mode' ( (lv_mode_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:939:3: 'mode' ( (lv_mode_4_0= ruleEString ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleObserveMode1840); 

                            createLeafNode(grammarAccess.getObserveModeAccess().getModeKeyword_3_0(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:943:1: ( (lv_mode_4_0= ruleEString ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:944:1: (lv_mode_4_0= ruleEString )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:944:1: (lv_mode_4_0= ruleEString )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:945:3: lv_mode_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObserveModeAccess().getModeEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleObserveMode1861);
                    lv_mode_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObserveModeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"mode",
                    	        		lv_mode_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleObserveMode1873); 

                    createLeafNode(grammarAccess.getObserveModeAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObserveMode


    // $ANTLR start entryRuleObserveBinding
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:979:1: entryRuleObserveBinding returns [EObject current=null] : iv_ruleObserveBinding= ruleObserveBinding EOF ;
    public final EObject entryRuleObserveBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserveBinding = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:980:2: (iv_ruleObserveBinding= ruleObserveBinding EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:981:2: iv_ruleObserveBinding= ruleObserveBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObserveBindingRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleObserveBinding_in_entryRuleObserveBinding1909);
            iv_ruleObserveBinding=ruleObserveBinding();
            _fsp--;

             current =iv_ruleObserveBinding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObserveBinding1919); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleObserveBinding


    // $ANTLR start ruleObserveBinding
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:988:1: ruleObserveBinding returns [EObject current=null] : ( () 'ObserveBinding' ( (lv_name_2_0= ruleEString ) ) '{' ( 'button' ( (lv_button_5_0= ruleEString ) ) )? '}' ) ;
    public final EObject ruleObserveBinding() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_button_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:993:6: ( ( () 'ObserveBinding' ( (lv_name_2_0= ruleEString ) ) '{' ( 'button' ( (lv_button_5_0= ruleEString ) ) )? '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:994:1: ( () 'ObserveBinding' ( (lv_name_2_0= ruleEString ) ) '{' ( 'button' ( (lv_button_5_0= ruleEString ) ) )? '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:994:1: ( () 'ObserveBinding' ( (lv_name_2_0= ruleEString ) ) '{' ( 'button' ( (lv_button_5_0= ruleEString ) ) )? '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:994:2: () 'ObserveBinding' ( (lv_name_2_0= ruleEString ) ) '{' ( 'button' ( (lv_button_5_0= ruleEString ) ) )? '}'
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:994:2: ()
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:995:5: 
            {
             
                    temp=factory.create(grammarAccess.getObserveBindingAccess().getObserveBindingAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getObserveBindingAccess().getObserveBindingAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleObserveBinding1963); 

                    createLeafNode(grammarAccess.getObserveBindingAccess().getObserveBindingKeyword_1(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1009:1: ( (lv_name_2_0= ruleEString ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1010:1: (lv_name_2_0= ruleEString )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1010:1: (lv_name_2_0= ruleEString )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1011:3: lv_name_2_0= ruleEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getObserveBindingAccess().getNameEStringParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleObserveBinding1984);
            lv_name_2_0=ruleEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getObserveBindingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"EString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleObserveBinding1994); 

                    createLeafNode(grammarAccess.getObserveBindingAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1037:1: ( 'button' ( (lv_button_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1037:3: 'button' ( (lv_button_5_0= ruleEString ) )
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleObserveBinding2005); 

                            createLeafNode(grammarAccess.getObserveBindingAccess().getButtonKeyword_4_0(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1041:1: ( (lv_button_5_0= ruleEString ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1042:1: (lv_button_5_0= ruleEString )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1042:1: (lv_button_5_0= ruleEString )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1043:3: lv_button_5_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObserveBindingAccess().getButtonEStringParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleObserveBinding2026);
                    lv_button_5_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObserveBindingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"button",
                    	        		lv_button_5_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleObserveBinding2038); 

                    createLeafNode(grammarAccess.getObserveBindingAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObserveBinding


    // $ANTLR start entryRuleObserveDisplay
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1077:1: entryRuleObserveDisplay returns [EObject current=null] : iv_ruleObserveDisplay= ruleObserveDisplay EOF ;
    public final EObject entryRuleObserveDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserveDisplay = null;


        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1078:2: (iv_ruleObserveDisplay= ruleObserveDisplay EOF )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1079:2: iv_ruleObserveDisplay= ruleObserveDisplay EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObserveDisplayRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleObserveDisplay_in_entryRuleObserveDisplay2074);
            iv_ruleObserveDisplay=ruleObserveDisplay();
            _fsp--;

             current =iv_ruleObserveDisplay; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObserveDisplay2084); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleObserveDisplay


    // $ANTLR start ruleObserveDisplay
    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1086:1: ruleObserveDisplay returns [EObject current=null] : ( () 'ObserveDisplay' '{' ( 'value' ( (lv_value_4_0= ruleEString ) ) )? '}' ) ;
    public final EObject ruleObserveDisplay() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1091:6: ( ( () 'ObserveDisplay' '{' ( 'value' ( (lv_value_4_0= ruleEString ) ) )? '}' ) )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1092:1: ( () 'ObserveDisplay' '{' ( 'value' ( (lv_value_4_0= ruleEString ) ) )? '}' )
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1092:1: ( () 'ObserveDisplay' '{' ( 'value' ( (lv_value_4_0= ruleEString ) ) )? '}' )
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1092:2: () 'ObserveDisplay' '{' ( 'value' ( (lv_value_4_0= ruleEString ) ) )? '}'
            {
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1092:2: ()
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1093:5: 
            {
             
                    temp=factory.create(grammarAccess.getObserveDisplayAccess().getObserveDisplayAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getObserveDisplayAccess().getObserveDisplayAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleObserveDisplay2128); 

                    createLeafNode(grammarAccess.getObserveDisplayAccess().getObserveDisplayKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleObserveDisplay2138); 

                    createLeafNode(grammarAccess.getObserveDisplayAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1111:1: ( 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1111:3: 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleObserveDisplay2149); 

                            createLeafNode(grammarAccess.getObserveDisplayAccess().getValueKeyword_3_0(), null); 
                        
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1115:1: ( (lv_value_4_0= ruleEString ) )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1116:1: (lv_value_4_0= ruleEString )
                    {
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1116:1: (lv_value_4_0= ruleEString )
                    // ../SimulatorSpecificationLanguage/src-gen/simulator/parser/antlr/internal/InternalSpecificationLanguage.g:1117:3: lv_value_4_0= ruleEString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObserveDisplayAccess().getValueEStringParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleObserveDisplay2170);
                    lv_value_4_0=ruleEString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObserveDisplayRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
                    	        		"EString", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleObserveDisplay2182); 

                    createLeafNode(grammarAccess.getObserveDisplayAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObserveDisplay


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecification85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSpecification129 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSpecification139 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleSpecification150 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSpecification160 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleTestcase_in_ruleSpecification181 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSpecification192 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleTestcase_in_ruleSpecification213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSpecification225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSpecification237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetMode_in_ruleCondition329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressButton_in_ruleAction419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObservation_in_entryRuleObservation453 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObservation463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserveMode_in_ruleObservation510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserveBinding_in_ruleObservation537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserveDisplay_in_ruleObservation564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTestcase_in_entryRuleTestcase599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTestcase609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleTestcase644 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTestcase654 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTestcase664 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleGiven_in_ruleTestcase685 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTestcase696 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleWhen_in_ruleTestcase717 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTestcase729 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleThen_in_ruleTestcase750 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTestcase760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGiven_in_entryRuleGiven796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGiven806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleGiven841 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGiven851 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleGiven861 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGiven871 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleGiven892 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGiven903 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleGiven924 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleGiven936 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGiven946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhen_in_entryRuleWhen982 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhen992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleWhen1027 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWhen1037 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleWhen1047 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWhen1057 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleWhen1078 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleWhen1089 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleWhen1110 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleWhen1122 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWhen1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThen_in_entryRuleThen1168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleThen1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleThen1213 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleThen1223 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleThen1233 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleThen1243 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_ruleObservation_in_ruleThen1264 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleThen1275 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_ruleObservation_in_ruleThen1296 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleThen1308 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleThen1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetMode_in_entryRuleSetMode1354 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetMode1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSetMode1408 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSetMode1418 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleSetMode1429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSetMode1450 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSetMode1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1499 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressButton_in_entryRulePressButton1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressButton1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulePressButton1675 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePressButton1685 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_29_in_rulePressButton1696 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePressButton1717 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePressButton1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserveMode_in_entryRuleObserveMode1765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObserveMode1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleObserveMode1819 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObserveMode1829 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleObserveMode1840 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleObserveMode1861 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleObserveMode1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserveBinding_in_entryRuleObserveBinding1909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObserveBinding1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleObserveBinding1963 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleObserveBinding1984 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObserveBinding1994 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_29_in_ruleObserveBinding2005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleObserveBinding2026 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleObserveBinding2038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserveDisplay_in_entryRuleObserveDisplay2074 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObserveDisplay2084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleObserveDisplay2128 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObserveDisplay2138 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_33_in_ruleObserveDisplay2149 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleObserveDisplay2170 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleObserveDisplay2182 = new BitSet(new long[]{0x0000000000000002L});
    }


}