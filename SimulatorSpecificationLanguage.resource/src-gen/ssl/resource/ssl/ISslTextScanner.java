/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl;

/**
 * A common interface for scanners to be used by EMFText. A scanner is initialized
 * with a text and delivers a sequence of tokens.
 */
public interface ISslTextScanner {
	
	/**
	 * Sets the text that must be scanned.
	 */
	public void setText(String text);
	
	/**
	 * Returns the next token found in the text.
	 */
	public ssl.resource.ssl.ISslTextToken getNextToken();
	
}
