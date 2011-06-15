/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslChoice extends ssl.resource.ssl.grammar.SslSyntaxElement {
	
	public SslChoice(ssl.resource.ssl.grammar.SslCardinality cardinality, ssl.resource.ssl.grammar.SslSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return ssl.resource.ssl.util.SslStringUtil.explode(getChildren(), "|");
	}
	
}
