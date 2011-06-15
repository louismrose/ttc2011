/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslBracketInformationProvider {
	
	public class BracketPair implements ssl.resource.ssl.ISslBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<ssl.resource.ssl.ISslBracketPair> getBracketPairs() {
		java.util.Collection<ssl.resource.ssl.ISslBracketPair> result = new java.util.ArrayList<ssl.resource.ssl.ISslBracketPair>();
		result.add(new BracketPair("\"", "\"", true));
		return result;
	}
	
}
