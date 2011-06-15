/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslParseResult implements ssl.resource.ssl.ISslParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>> commands = new java.util.ArrayList<ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>>();
	
	public SslParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<ssl.resource.ssl.ISslCommand<ssl.resource.ssl.ISslTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
