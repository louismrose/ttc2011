/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SslKeyword extends ssl.resource.ssl.grammar.SslSyntaxElement {
	
	private final String value;
	
	public SslKeyword(String value, ssl.resource.ssl.grammar.SslCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
