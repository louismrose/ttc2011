/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

/**
 * A basic implementation of the ssl.resource.ssl.ISslURIMapping interface that
 * can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * ssl.resource.ssl.ISslURIMapping.
 */
public class SslURIMapping<ReferenceType> implements ssl.resource.ssl.ISslURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public SslURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
