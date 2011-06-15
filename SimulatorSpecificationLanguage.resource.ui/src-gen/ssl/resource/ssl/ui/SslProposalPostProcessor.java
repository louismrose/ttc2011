/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SslProposalPostProcessor {
	
	public java.util.List<ssl.resource.ssl.ui.SslCompletionProposal> process(java.util.List<ssl.resource.ssl.ui.SslCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
