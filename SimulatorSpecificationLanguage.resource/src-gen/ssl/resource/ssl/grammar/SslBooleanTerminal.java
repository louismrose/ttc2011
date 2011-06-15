/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class SslBooleanTerminal extends ssl.resource.ssl.grammar.SslTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public SslBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, ssl.resource.ssl.grammar.SslCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
