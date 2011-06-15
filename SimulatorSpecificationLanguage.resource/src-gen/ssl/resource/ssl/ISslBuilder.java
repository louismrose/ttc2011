/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl;

public interface ISslBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(ssl.resource.ssl.mopp.SslResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
