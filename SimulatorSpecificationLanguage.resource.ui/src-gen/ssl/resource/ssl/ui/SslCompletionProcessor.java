/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

public class SslCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private ssl.resource.ssl.ui.SslEditor editor;
	
	public SslCompletionProcessor(ssl.resource.ssl.ui.SslEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		ssl.resource.ssl.ISslTextResource textResource = (ssl.resource.ssl.ISslTextResource) resource;
		String content = viewer.getDocument().get();
		ssl.resource.ssl.ui.SslCodeCompletionHelper helper = new ssl.resource.ssl.ui.SslCodeCompletionHelper();
		ssl.resource.ssl.ui.SslCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		ssl.resource.ssl.ui.SslProposalPostProcessor proposalPostProcessor = new ssl.resource.ssl.ui.SslProposalPostProcessor();
		java.util.List<ssl.resource.ssl.ui.SslCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<ssl.resource.ssl.ui.SslCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<ssl.resource.ssl.ui.SslCompletionProposal> finalProposalList = new java.util.ArrayList<ssl.resource.ssl.ui.SslCompletionProposal>();
		for (ssl.resource.ssl.ui.SslCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (ssl.resource.ssl.ui.SslCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			ssl.resource.ssl.ui.ISslBracketHandler bracketHandler = editor.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
