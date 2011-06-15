/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslCompound extends ssl.resource.ssl.grammar.SslSyntaxElement {
	
	public SslCompound(ssl.resource.ssl.grammar.SslChoice choice, ssl.resource.ssl.grammar.SslCardinality cardinality) {
		super(cardinality, new ssl.resource.ssl.grammar.SslSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
