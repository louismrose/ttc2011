/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class SslFollowSetProvider {
	
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_0 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_2_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_1 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_3_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_2 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_4_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_3 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_4 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_5 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_6 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_7 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_0);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_8 = new ssl.resource.ssl.mopp.SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_1);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_9 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_5_0_0_2);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_10 = new ssl.resource.ssl.mopp.SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_1);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_11 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_6_0_0_2);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_12 = new ssl.resource.ssl.mopp.SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_1);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_13 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_7_0_0_2);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_14 = new ssl.resource.ssl.mopp.SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_1);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_15 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_2);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_16 = new ssl.resource.ssl.mopp.SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_3);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_17 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_8_0_0_4);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_18 = new ssl.resource.ssl.mopp.SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_1);
	public final static ssl.resource.ssl.ISslExpectedElement TERMINAL_19 = new ssl.resource.ssl.mopp.SslExpectedCsString(ssl.resource.ssl.grammar.SslGrammarInformationProvider.SSL_9_0_0_2);
	
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_0 = ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__GIVEN);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_1 = ssl.SslPackage.eINSTANCE.getSpecification().getEStructuralFeature(ssl.SslPackage.SPECIFICATION__TESTCASES);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_2 = ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__WHEN);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_3 = ssl.SslPackage.eINSTANCE.getTestcase().getEStructuralFeature(ssl.SslPackage.TESTCASE__THEN);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_4 = ssl.SslPackage.eINSTANCE.getGiven().getEStructuralFeature(ssl.SslPackage.GIVEN__CONDITIONS);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_5 = ssl.SslPackage.eINSTANCE.getWhen().getEStructuralFeature(ssl.SslPackage.WHEN__ACTIONS);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_6 = ssl.SslPackage.eINSTANCE.getThen().getEStructuralFeature(ssl.SslPackage.THEN__OBSERVATIONS);
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] EMPTY_FEATURE_ARRAY = new org.eclipse.emf.ecore.EStructuralFeature[0];
	
	public static void wire0() {
		TERMINAL_0.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_1.addFollower(TERMINAL_4, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_2.addFollower(TERMINAL_5, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_2.addFollower(TERMINAL_6, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_2.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_3.addFollower(TERMINAL_8, EMPTY_FEATURE_ARRAY);
		TERMINAL_8.addFollower(TERMINAL_9, EMPTY_FEATURE_ARRAY);
		TERMINAL_9.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_9.addFollower(TERMINAL_1, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_9.addFollower(TERMINAL_2, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_4.addFollower(TERMINAL_10, EMPTY_FEATURE_ARRAY);
		TERMINAL_10.addFollower(TERMINAL_11, EMPTY_FEATURE_ARRAY);
		TERMINAL_11.addFollower(TERMINAL_4, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_11.addFollower(TERMINAL_2, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_5.addFollower(TERMINAL_12, EMPTY_FEATURE_ARRAY);
		TERMINAL_12.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_13.addFollower(TERMINAL_5, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_13.addFollower(TERMINAL_6, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_13.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_13.addFollower(TERMINAL_0, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, FEATURE_1, });
		TERMINAL_6.addFollower(TERMINAL_14, EMPTY_FEATURE_ARRAY);
		TERMINAL_14.addFollower(TERMINAL_15, EMPTY_FEATURE_ARRAY);
		TERMINAL_15.addFollower(TERMINAL_16, EMPTY_FEATURE_ARRAY);
		TERMINAL_16.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_17.addFollower(TERMINAL_5, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_17.addFollower(TERMINAL_6, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_17.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_17.addFollower(TERMINAL_0, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, FEATURE_1, });
		TERMINAL_7.addFollower(TERMINAL_18, EMPTY_FEATURE_ARRAY);
		TERMINAL_18.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_19.addFollower(TERMINAL_5, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_19.addFollower(TERMINAL_6, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_19.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_19.addFollower(TERMINAL_0, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, FEATURE_1, });
	}
	// wire the terminals
	static {
		wire0();
	}
}
