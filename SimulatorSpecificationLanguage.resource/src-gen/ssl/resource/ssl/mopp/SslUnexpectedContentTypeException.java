/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see ssl.resource.ssl.ISslOptions.RESOURCE_CONTENT_TYPE
 */
public class SslUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SslUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
