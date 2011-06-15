/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslMetaInformation implements ssl.resource.ssl.ISslMetaInformation {
	
	public String getSyntaxName() {
		return "ssl";
	}
	
	public String getURI() {
		return "ssl";
	}
	
	public ssl.resource.ssl.ISslTextScanner createLexer() {
		return new ssl.resource.ssl.mopp.SslAntlrScanner(new ssl.resource.ssl.mopp.SslLexer());
	}
	
	public ssl.resource.ssl.ISslTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new ssl.resource.ssl.mopp.SslParser().createInstance(inputStream, encoding);
	}
	
	public ssl.resource.ssl.ISslTextPrinter createPrinter(java.io.OutputStream outputStream, ssl.resource.ssl.ISslTextResource resource) {
		return new ssl.resource.ssl.mopp.SslPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new ssl.resource.ssl.mopp.SslSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new ssl.resource.ssl.mopp.SslSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public ssl.resource.ssl.ISslReferenceResolverSwitch getReferenceResolverSwitch() {
		return new ssl.resource.ssl.mopp.SslReferenceResolverSwitch();
	}
	
	public ssl.resource.ssl.ISslTokenResolverFactory getTokenResolverFactory() {
		return new ssl.resource.ssl.mopp.SslTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "SimulatorSpecificationLanguage/model/ssl.cs";
	}
	
	public String[] getTokenNames() {
		return new ssl.resource.ssl.mopp.SslParser(null).getTokenNames();
	}
	
	public ssl.resource.ssl.ISslTokenStyle getDefaultTokenStyle(String tokenName) {
		return new ssl.resource.ssl.mopp.SslTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<ssl.resource.ssl.ISslBracketPair> getBracketPairs() {
		return new ssl.resource.ssl.mopp.SslBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new ssl.resource.ssl.mopp.SslFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new ssl.resource.ssl.mopp.SslResourceFactory();
	}
	
	public ssl.resource.ssl.mopp.SslNewFileContentProvider getNewFileContentProvider() {
		return new ssl.resource.ssl.mopp.SslNewFileContentProvider();
	}
	
}
