/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.analysis;

public class SslTEXTTokenResolver implements ssl.resource.ssl.ISslTokenResolver {
	
	private ssl.resource.ssl.analysis.SslDefaultTokenResolver defaultTokenResolver = new ssl.resource.ssl.analysis.SslDefaultTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, ssl.resource.ssl.ISslTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
