/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SslAbstractExpectedElement implements ssl.resource.ssl.ISslExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<ssl.resource.ssl.util.SslPair<ssl.resource.ssl.ISslExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<ssl.resource.ssl.util.SslPair<ssl.resource.ssl.ISslExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public SslAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(ssl.resource.ssl.ISslExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new ssl.resource.ssl.util.SslPair<ssl.resource.ssl.ISslExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<ssl.resource.ssl.util.SslPair<ssl.resource.ssl.ISslExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
