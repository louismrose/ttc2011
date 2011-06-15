/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class SslPlaceholder extends ssl.resource.ssl.grammar.SslTerminal {
	
	private final String tokenName;
	
	public SslPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, ssl.resource.ssl.grammar.SslCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
