/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslBuilder implements ssl.resource.ssl.ISslBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri) {
		// change this to return true to enable building of all resources
		return false;
	}
	
	public org.eclipse.core.runtime.IStatus build(ssl.resource.ssl.mopp.SslResource resource, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// set option overrideBuilder to 'false' and then perform build here
		return org.eclipse.core.runtime.Status.OK_STATUS;
	}
	
}
