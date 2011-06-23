/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public static class Rule extends ssl.resource.ssl.grammar.SslSyntaxElement {
		
		private final org.eclipse.emf.ecore.EClass metaclass;
		
		public Rule(org.eclipse.emf.ecore.EClass metaclass, ssl.resource.ssl.grammar.SslChoice choice, ssl.resource.ssl.grammar.SslCardinality cardinality) {
			super(cardinality, new ssl.resource.ssl.grammar.SslSyntaxElement[] {choice});
			this.metaclass = metaclass;
		}
		
		public org.eclipse.emf.ecore.EClass getMetaclass() {
			return metaclass;
		}
		
		public ssl.resource.ssl.grammar.SslChoice getDefinition() {
			return (ssl.resource.ssl.grammar.SslChoice) getChildren()[0];
		}
	}
	
	public final static ssl.resource.ssl.grammar.SslContainment SSL_0_0_0_0 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getSpecification().getEStructuralFeature(ssl.SslPackage.SPECIFICATION__TESTCASES), ssl.resource.ssl.grammar.SslCardinality.STAR, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_0_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_0_0_0_0);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_0_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_0_0_0);
	public final static Rule SSL_0 = new Rule(ssl.SslPackage.eINSTANCE.getSpecification(), SSL_0_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_0_0_0_0_0 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__GIVEN), ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_0_0_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN), ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK, 0);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_0_0_0_0_2 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN), ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_1_0_0_0_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_0_0_0_0_0, SSL_1_0_0_0_0_0_1, SSL_1_0_0_0_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_1_0_0_0_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_0_0_0_0);
	public final static ssl.resource.ssl.grammar.SslCompound SSL_1_0_0_0 = new ssl.resource.ssl.grammar.SslCompound(SSL_1_0_0_0_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_1_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_0_0);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_1_0_0_0_0 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN), ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_1_0_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN), ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_1_0_1_0_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_1_0_0_0_0, SSL_1_0_1_0_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_1_0_1_0_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_1_0_0_0);
	public final static ssl.resource.ssl.grammar.SslCompound SSL_1_0_1_0 = new ssl.resource.ssl.grammar.SslCompound(SSL_1_0_1_0_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_1_0_1 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_1_0);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_1_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_0, SSL_1_0_1);
	public final static Rule SSL_1 = new Rule(ssl.SslPackage.eINSTANCE.getTestcase(), SSL_1_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_2_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("Given", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_2_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getGiven().getEStructuralFeature(ssl.SslPackage.GIVEN__CONDITIONS), ssl.resource.ssl.grammar.SslCardinality.PLUS, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_2_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_2_0_0_0, SSL_2_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_2_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_2_0_0);
	public final static Rule SSL_2 = new Rule(ssl.SslPackage.eINSTANCE.getGiven(), SSL_2_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_3_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("When", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_3_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getWhen().getEStructuralFeature(ssl.SslPackage.WHEN__ACTIONS), ssl.resource.ssl.grammar.SslCardinality.PLUS, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_3_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_3_0_0_0, SSL_3_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_3_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_3_0_0);
	public final static Rule SSL_3 = new Rule(ssl.SslPackage.eINSTANCE.getWhen(), SSL_3_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_4_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("Then", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_4_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getThen().getEStructuralFeature(ssl.SslPackage.THEN__OBSERVATIONS), ssl.resource.ssl.grammar.SslCardinality.PLUS, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_4_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_4_0_0_0, SSL_4_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_4_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_4_0_0);
	public final static Rule SSL_4 = new Rule(ssl.SslPackage.eINSTANCE.getThen(), SSL_4_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_5_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the watch is in mode \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_5_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getCheckMode().getEStructuralFeature(ssl.SslPackage.CHECK_MODE__MODE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_5_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_5_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_5_0_0_0, SSL_5_0_0_1, SSL_5_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_5_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_5_0_0);
	public final static Rule SSL_5 = new Rule(ssl.SslPackage.eINSTANCE.getCheckMode(), SSL_5_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_6_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_6_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getCheckLabel().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__LABEL_TYPE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_6_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\" is showing \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_6_0_0_3 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getCheckLabel().getEStructuralFeature(ssl.SslPackage.CHECK_LABEL__VALUE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_6_0_0_4 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_6_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_6_0_0_0, SSL_6_0_0_1, SSL_6_0_0_2, SSL_6_0_0_3, SSL_6_0_0_4);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_6_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_6_0_0);
	public final static Rule SSL_6 = new Rule(ssl.SslPackage.eINSTANCE.getCheckLabel(), SSL_6_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_7_0_0_0 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getCheckTimePastOther().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__FIRST_VARIABLE_NAME), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_7_0_0_1 = new ssl.resource.ssl.grammar.SslKeyword(" is past ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_7_0_0_2 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getCheckTimePastOther().getEStructuralFeature(ssl.SslPackage.CHECK_TIME_PAST_OTHER__SECOND_VARIABLE_NAME), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_7_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_7_0_0_0, SSL_7_0_0_1, SSL_7_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_7_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_7_0_0);
	public final static Rule SSL_7 = new Rule(ssl.SslPackage.eINSTANCE.getCheckTimePastOther(), SSL_7_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_8_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the watch enters mode \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_8_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getEntersMode().getEStructuralFeature(ssl.SslPackage.ENTERS_MODE__MODE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_8_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_8_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_8_0_0_0, SSL_8_0_0_1, SSL_8_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_8_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_8_0_0);
	public final static Rule SSL_8 = new Rule(ssl.SslPackage.eINSTANCE.getEntersMode(), SSL_8_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_9_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_9_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getPressButton().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_9_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword(" button is pressed", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_9_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_9_0_0_0, SSL_9_0_0_1, SSL_9_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_9_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_9_0_0);
	public final static Rule SSL_9 = new Rule(ssl.SslPackage.eINSTANCE.getPressButton(), SSL_9_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_10_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the watch must be in mode \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_10_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveMode().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_10_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_10_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_10_0_0_0, SSL_10_0_0_1, SSL_10_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_10_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_10_0_0);
	public final static Rule SSL_10 = new Rule(ssl.SslPackage.eINSTANCE.getObserveMode(), SSL_10_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_11_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_11_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveButton().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__BUTTON), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_11_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword(" button must be called \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_11_0_0_3 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveButton().getEStructuralFeature(ssl.SslPackage.OBSERVE_BUTTON__NAME), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_11_0_0_4 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_11_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_11_0_0_0, SSL_11_0_0_1, SSL_11_0_0_2, SSL_11_0_0_3, SSL_11_0_0_4);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_11_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_11_0_0);
	public final static Rule SSL_11 = new Rule(ssl.SslPackage.eINSTANCE.getObserveButton(), SSL_11_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_12_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_12_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveLabelValue().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__LABEL_TYPE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_12_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\" must show \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_12_0_0_3 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveLabelValue().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VALUE__VALUE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_12_0_0_4 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_12_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_12_0_0_0, SSL_12_0_0_1, SSL_12_0_0_2, SSL_12_0_0_3, SSL_12_0_0_4);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_12_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_12_0_0);
	public final static Rule SSL_12 = new Rule(ssl.SslPackage.eINSTANCE.getObserveLabelValue(), SSL_12_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_13_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_13_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveLabelVariable().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__LABEL_TYPE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_13_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\" must show the ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_13_0_0_3 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveLabelVariable().getEStructuralFeature(ssl.SslPackage.OBSERVE_LABEL_VARIABLE__VARIABLE_NAME), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_13_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_13_0_0_0, SSL_13_0_0_1, SSL_13_0_0_2, SSL_13_0_0_3);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_13_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_13_0_0);
	public final static Rule SSL_13 = new Rule(ssl.SslPackage.eINSTANCE.getObserveLabelVariable(), SSL_13_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_14_0_0_0 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveVariableChange().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_14_0_0_1 = new ssl.resource.ssl.grammar.SslKeyword(" must be incremented by 1 ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_14_0_0_2 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveVariableChange().getEStructuralFeature(ssl.SslPackage.OBSERVE_VARIABLE_CHANGE__UNIT), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_14_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_14_0_0_0, SSL_14_0_0_1, SSL_14_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_14_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_14_0_0);
	public final static Rule SSL_14 = new Rule(ssl.SslPackage.eINSTANCE.getObserveVariableChange(), SSL_14_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_15_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the alarm must ring", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_15_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_15_0_0_0);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_15_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_15_0_0);
	public final static Rule SSL_15 = new Rule(ssl.SslPackage.eINSTANCE.getObserveRing(), SSL_15_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
}
