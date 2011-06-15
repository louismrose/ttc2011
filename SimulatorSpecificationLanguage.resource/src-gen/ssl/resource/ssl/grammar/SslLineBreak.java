/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslLineBreak extends ssl.resource.ssl.grammar.SslFormattingElement {
	
	private final int tabs;
	
	public SslLineBreak(ssl.resource.ssl.grammar.SslCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
