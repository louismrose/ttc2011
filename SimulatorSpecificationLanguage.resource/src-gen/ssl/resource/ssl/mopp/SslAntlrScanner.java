/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslAntlrScanner implements ssl.resource.ssl.ISslTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public SslAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public ssl.resource.ssl.ISslTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		ssl.resource.ssl.ISslTextToken result = new ssl.resource.ssl.mopp.SslTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
