/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

public class SslHoverTextProvider implements ssl.resource.ssl.ISslHoverTextProvider {
	
	private ssl.resource.ssl.ui.SslDefaultHoverTextProvider defaultProvider = new ssl.resource.ssl.ui.SslDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
