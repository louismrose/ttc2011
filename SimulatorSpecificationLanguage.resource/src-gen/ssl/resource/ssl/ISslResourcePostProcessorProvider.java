/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ISslResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public ssl.resource.ssl.ISslResourcePostProcessor getResourcePostProcessor();
	
}
