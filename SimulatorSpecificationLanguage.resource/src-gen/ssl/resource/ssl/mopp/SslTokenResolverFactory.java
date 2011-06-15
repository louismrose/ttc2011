/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslTokenResolverFactory implements ssl.resource.ssl.ISslTokenResolverFactory {
	
	private java.util.Map<String, ssl.resource.ssl.ISslTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, ssl.resource.ssl.ISslTokenResolver> featureName2CollectInTokenResolver;
	private static ssl.resource.ssl.ISslTokenResolver defaultResolver = new ssl.resource.ssl.analysis.SslDefaultTokenResolver();
	
	public SslTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, ssl.resource.ssl.ISslTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, ssl.resource.ssl.ISslTokenResolver>();
		registerTokenResolver("TEXT", new ssl.resource.ssl.analysis.SslTEXTTokenResolver());
	}
	
	public ssl.resource.ssl.ISslTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public ssl.resource.ssl.ISslTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, ssl.resource.ssl.ISslTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, ssl.resource.ssl.ISslTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected ssl.resource.ssl.ISslTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private ssl.resource.ssl.ISslTokenResolver internalCreateResolver(java.util.Map<String, ssl.resource.ssl.ISslTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, ssl.resource.ssl.ISslTokenResolver> resolverMap, String key, ssl.resource.ssl.ISslTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
