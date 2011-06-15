/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class SslSyntaxElement {
	
	private SslSyntaxElement[] children;
	private SslSyntaxElement parent;
	private ssl.resource.ssl.grammar.SslCardinality cardinality;
	
	public SslSyntaxElement(ssl.resource.ssl.grammar.SslCardinality cardinality, SslSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (SslSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(SslSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public SslSyntaxElement[] getChildren() {
		if (children == null) {
			return new SslSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public ssl.resource.ssl.grammar.SslCardinality getCardinality() {
		return cardinality;
	}
	
}
