/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

/**
 * This exception is used to terminate generated parsers. Depending on the state
 * of a stop flag the parser throws this exception to break the control flow and
 * allow users of the parser to stop parsing.
 */
public class SslTerminateParsingException extends java.lang.RuntimeException {
	
	private static final long serialVersionUID = 117529647036954724L;
	
}
