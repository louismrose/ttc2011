/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class SslExpectedStructuralFeature extends ssl.resource.ssl.mopp.SslAbstractExpectedElement {
	
	private ssl.resource.ssl.grammar.SslPlaceholder placeholder;
	
	public SslExpectedStructuralFeature(ssl.resource.ssl.grammar.SslPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SslExpectedStructuralFeature) {
			return getFeature().equals(((SslExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
