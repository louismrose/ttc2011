/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslProblem implements ssl.resource.ssl.ISslProblem {
	
	private String message;
	private ssl.resource.ssl.SslEProblemType type;
	private java.util.Collection<ssl.resource.ssl.ISslQuickFix> quickFixes;
	
	public SslProblem(String message, ssl.resource.ssl.SslEProblemType type) {
		this(message, type, java.util.Collections.<ssl.resource.ssl.ISslQuickFix>emptySet());
	}
	
	public SslProblem(String message, ssl.resource.ssl.SslEProblemType type, ssl.resource.ssl.ISslQuickFix quickFix) {
		this(message, type, java.util.Collections.singleton(quickFix));
	}
	
	public SslProblem(String message, ssl.resource.ssl.SslEProblemType type, java.util.Collection<ssl.resource.ssl.ISslQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.quickFixes = new java.util.LinkedHashSet<ssl.resource.ssl.ISslQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public ssl.resource.ssl.SslEProblemType getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<ssl.resource.ssl.ISslQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
