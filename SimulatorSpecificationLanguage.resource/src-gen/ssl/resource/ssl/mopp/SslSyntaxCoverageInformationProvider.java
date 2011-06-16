/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			ssl.SslPackage.eINSTANCE.getSpecification(),
			ssl.SslPackage.eINSTANCE.getTestcase(),
			ssl.SslPackage.eINSTANCE.getGiven(),
			ssl.SslPackage.eINSTANCE.getWhen(),
			ssl.SslPackage.eINSTANCE.getThen(),
			ssl.SslPackage.eINSTANCE.getCheckMode(),
			ssl.SslPackage.eINSTANCE.getCheckLabel(),
			ssl.SslPackage.eINSTANCE.getCheckTimePastOther(),
			ssl.SslPackage.eINSTANCE.getPressButton(),
			ssl.SslPackage.eINSTANCE.getObserveMode(),
			ssl.SslPackage.eINSTANCE.getObserveButton(),
			ssl.SslPackage.eINSTANCE.getObserveLabelValue(),
			ssl.SslPackage.eINSTANCE.getObserveLabelVariable(),
			ssl.SslPackage.eINSTANCE.getObserveVariableChange(),
			ssl.SslPackage.eINSTANCE.getObserveRing(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			ssl.SslPackage.eINSTANCE.getSpecification(),
		};
	}
	
}
