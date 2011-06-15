/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SslResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new ssl.resource.ssl.mopp.SslResource(uri);
	}
	
}
