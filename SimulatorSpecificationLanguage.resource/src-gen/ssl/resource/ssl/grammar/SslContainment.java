/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslContainment extends ssl.resource.ssl.grammar.SslTerminal {
	
	public SslContainment(org.eclipse.emf.ecore.EStructuralFeature feature, ssl.resource.ssl.grammar.SslCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
