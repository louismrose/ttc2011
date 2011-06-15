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
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_0_0 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__GIVEN), ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN), ssl.resource.ssl.grammar.SslCardinality.QUESTIONMARK, 0);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_1_0_0_2 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN), ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_1_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_0_0, SSL_1_0_0_1, SSL_1_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_1_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_1_0_0);
	public final static Rule SSL_1 = new Rule(ssl.SslPackage.eINSTANCE.getTestcase(), SSL_1_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_2_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("given", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_2_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getGiven().getEStructuralFeature(ssl.SslPackage.GIVEN__CONDITIONS), ssl.resource.ssl.grammar.SslCardinality.PLUS, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_2_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_2_0_0_0, SSL_2_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_2_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_2_0_0);
	public final static Rule SSL_2 = new Rule(ssl.SslPackage.eINSTANCE.getGiven(), SSL_2_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_3_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("when", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_3_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getWhen().getEStructuralFeature(ssl.SslPackage.WHEN__ACTIONS), ssl.resource.ssl.grammar.SslCardinality.PLUS, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_3_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_3_0_0_0, SSL_3_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_3_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_3_0_0);
	public final static Rule SSL_3 = new Rule(ssl.SslPackage.eINSTANCE.getWhen(), SSL_3_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_4_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("then", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslContainment SSL_4_0_0_1 = new ssl.resource.ssl.grammar.SslContainment(ssl.SslPackage.eINSTANCE.getThen().getEStructuralFeature(ssl.SslPackage.THEN__OBSERVATIONS), ssl.resource.ssl.grammar.SslCardinality.PLUS, 0);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_4_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_4_0_0_0, SSL_4_0_0_1);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_4_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_4_0_0);
	public final static Rule SSL_4 = new Rule(ssl.SslPackage.eINSTANCE.getThen(), SSL_4_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_5_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the watch is in mode \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_5_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getSetMode().getEStructuralFeature(ssl.SslPackage.SET_MODE__MODE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_5_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_5_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_5_0_0_0, SSL_5_0_0_1, SSL_5_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_5_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_5_0_0);
	public final static Rule SSL_5 = new Rule(ssl.SslPackage.eINSTANCE.getSetMode(), SSL_5_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_6_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_6_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getPressButton().getEStructuralFeature(ssl.SslPackage.PRESS_BUTTON__BUTTON), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_6_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword(" button is pressed", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_6_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_6_0_0_0, SSL_6_0_0_1, SSL_6_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_6_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_6_0_0);
	public final static Rule SSL_6 = new Rule(ssl.SslPackage.eINSTANCE.getPressButton(), SSL_6_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_7_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the watch must be in mode \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_7_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveMode().getEStructuralFeature(ssl.SslPackage.OBSERVE_MODE__MODE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_7_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_7_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_7_0_0_0, SSL_7_0_0_1, SSL_7_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_7_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_7_0_0);
	public final static Rule SSL_7 = new Rule(ssl.SslPackage.eINSTANCE.getObserveMode(), SSL_7_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_8_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the ", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_8_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveBinding().getEStructuralFeature(ssl.SslPackage.OBSERVE_BINDING__BUTTON), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_8_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword(" button must be bound to \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_8_0_0_3 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveBinding().getEStructuralFeature(ssl.SslPackage.OBSERVE_BINDING__NAME), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_8_0_0_4 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_8_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_8_0_0_0, SSL_8_0_0_1, SSL_8_0_0_2, SSL_8_0_0_3, SSL_8_0_0_4);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_8_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_8_0_0);
	public final static Rule SSL_8 = new Rule(ssl.SslPackage.eINSTANCE.getObserveBinding(), SSL_8_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_9_0_0_0 = new ssl.resource.ssl.grammar.SslKeyword("the display must show \"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslPlaceholder SSL_9_0_0_1 = new ssl.resource.ssl.grammar.SslPlaceholder(ssl.SslPackage.eINSTANCE.getObserveDisplay().getEStructuralFeature(ssl.SslPackage.OBSERVE_DISPLAY__VALUE), "TEXT", ssl.resource.ssl.grammar.SslCardinality.ONE, 0);
	public final static ssl.resource.ssl.grammar.SslKeyword SSL_9_0_0_2 = new ssl.resource.ssl.grammar.SslKeyword("\"", ssl.resource.ssl.grammar.SslCardinality.ONE);
	public final static ssl.resource.ssl.grammar.SslSequence SSL_9_0_0 = new ssl.resource.ssl.grammar.SslSequence(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_9_0_0_0, SSL_9_0_0_1, SSL_9_0_0_2);
	public final static ssl.resource.ssl.grammar.SslChoice SSL_9_0 = new ssl.resource.ssl.grammar.SslChoice(ssl.resource.ssl.grammar.SslCardinality.ONE, SSL_9_0_0);
	public final static Rule SSL_9 = new Rule(ssl.SslPackage.eINSTANCE.getObserveDisplay(), SSL_9_0, ssl.resource.ssl.grammar.SslCardinality.ONE);
}
