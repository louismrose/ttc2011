/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl;

public interface ISslProblem {
	public String getMessage();
	public ssl.resource.ssl.SslEProblemType getType();
	public java.util.Collection<ssl.resource.ssl.ISslQuickFix> getQuickFixes();
}
