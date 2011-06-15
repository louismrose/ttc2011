/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SslExpectedCsString extends ssl.resource.ssl.mopp.SslAbstractExpectedElement {
	
	private ssl.resource.ssl.grammar.SslKeyword keyword;
	
	public SslExpectedCsString(ssl.resource.ssl.grammar.SslKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SslExpectedCsString) {
			return getValue().equals(((SslExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
