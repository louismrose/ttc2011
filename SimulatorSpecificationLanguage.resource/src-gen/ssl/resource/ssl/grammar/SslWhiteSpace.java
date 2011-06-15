/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

public class SslWhiteSpace extends ssl.resource.ssl.grammar.SslFormattingElement {
	
	private final int amount;
	
	public SslWhiteSpace(int amount, ssl.resource.ssl.grammar.SslCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
