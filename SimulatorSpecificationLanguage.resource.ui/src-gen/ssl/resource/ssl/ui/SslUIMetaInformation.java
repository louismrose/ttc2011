/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

public class SslUIMetaInformation extends ssl.resource.ssl.mopp.SslMetaInformation {
	
	public ssl.resource.ssl.ISslHoverTextProvider getHoverTextProvider() {
		return new ssl.resource.ssl.ui.SslHoverTextProvider();
	}
	
	public ssl.resource.ssl.ui.SslImageProvider getImageProvider() {
		return ssl.resource.ssl.ui.SslImageProvider.INSTANCE;
	}
	
	public ssl.resource.ssl.ui.SslColorManager createColorManager() {
		return new ssl.resource.ssl.ui.SslColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(ssl.resource.ssl.ISslTextResource,
	 * ssl.resource.ssl.ui.SslColorManager) instead.
	 */
	public ssl.resource.ssl.ui.SslTokenScanner createTokenScanner(ssl.resource.ssl.ui.SslColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public ssl.resource.ssl.ui.SslTokenScanner createTokenScanner(ssl.resource.ssl.ISslTextResource resource, ssl.resource.ssl.ui.SslColorManager colorManager) {
		return new ssl.resource.ssl.ui.SslTokenScanner(resource, colorManager);
	}
	
	public ssl.resource.ssl.ui.SslCodeCompletionHelper createCodeCompletionHelper() {
		return new ssl.resource.ssl.ui.SslCodeCompletionHelper();
	}
	
}
