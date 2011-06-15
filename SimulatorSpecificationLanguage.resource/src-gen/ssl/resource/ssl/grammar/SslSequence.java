/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslSequence extends ssl.resource.ssl.grammar.SslSyntaxElement {
	
	public SslSequence(ssl.resource.ssl.grammar.SslCardinality cardinality, ssl.resource.ssl.grammar.SslSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return ssl.resource.ssl.util.SslStringUtil.explode(getChildren(), " ");
	}
	
}
