/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

public class SslQuickAssistProcessor implements org.eclipse.jface.text.quickassist.IQuickAssistProcessor {
	
	private ssl.resource.ssl.ui.SslEditor editor;
	
	public SslQuickAssistProcessor(ssl.resource.ssl.ui.SslEditor editor) {
		super();
		this.editor = editor;
	}
	
	public boolean canAssist(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(org.eclipse.jface.text.source.Annotation annotation) {
		java.util.Collection<ssl.resource.ssl.ISslQuickFix> quickFixes = getQuickFixes(annotation);
		return quickFixes.size() > 0;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeQuickAssistProposals(	org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		org.eclipse.jface.text.source.ISourceViewer sourceViewer = invocationContext.getSourceViewer();
		int offset = -1;
		int length = 0;
		if (invocationContext instanceof org.eclipse.jface.text.source.TextInvocationContext) {
			org.eclipse.jface.text.source.TextInvocationContext textContext = (org.eclipse.jface.text.source.TextInvocationContext) invocationContext;
			offset = textContext.getOffset();
			length = textContext.getLength();
		}
		java.util.List<ssl.resource.ssl.ISslQuickFix> quickFixes = getQuickFixes(sourceViewer, offset, length);
		org.eclipse.jface.text.contentassist.ICompletionProposal[] proposals = new org.eclipse.jface.text.contentassist.ICompletionProposal[quickFixes.size()];
		for (int i = 0; i < proposals.length; i++) {
			proposals[i] = createCompletionProposal(sourceViewer, quickFixes.get(i));
		}
		return proposals;
	}
	
	private org.eclipse.jface.text.contentassist.ICompletionProposal createCompletionProposal(final org.eclipse.jface.text.source.ISourceViewer sourceViewer, final ssl.resource.ssl.ISslQuickFix quickFix) {
		return new org.eclipse.jface.text.contentassist.ICompletionProposal() {
			
			public org.eclipse.swt.graphics.Point getSelection(org.eclipse.jface.text.IDocument document) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public org.eclipse.swt.graphics.Image getImage() {
				return new ssl.resource.ssl.ui.SslUIMetaInformation().getImageProvider().getImage(quickFix.getImageKey());
			}
			
			public String getDisplayString() {
				return quickFix.getDisplayString();
			}
			
			public org.eclipse.jface.text.contentassist.IContextInformation getContextInformation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getAdditionalProposalInfo() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void apply(org.eclipse.jface.text.IDocument document) {
				String currentContent = sourceViewer.getDocument().get();
				String newContent = quickFix.apply(currentContent);
				if (newContent != null) {
					// TODO maybe it is better to replace only the changed
					// part of the document
					sourceViewer.getDocument().set(newContent);
				}
			}
		};
	}
	
	private java.util.List<ssl.resource.ssl.ISslQuickFix> getQuickFixes(org.eclipse.jface.text.source.ISourceViewer sourceViewer, int offset, int length) {
		java.util.List<ssl.resource.ssl.ISslQuickFix> foundFixes = new java.util.ArrayList<ssl.resource.ssl.ISslQuickFix>();
		org.eclipse.jface.text.source.IAnnotationModel model = getAnnotationModel();
		
		if (model == null) {
			return foundFixes;
		}
		
		java.util.Iterator<?> iter = model.getAnnotationIterator();
		while (iter.hasNext()) {
			org.eclipse.jface.text.source.Annotation annotation = (org.eclipse.jface.text.source.Annotation) iter.next();
			org.eclipse.jface.text.Position position = model.getPosition(annotation);
			if (offset >= 0) {
				if (!position.overlapsWith(offset, length)) {
					continue;
				}
			}
			java.util.Collection<ssl.resource.ssl.ISslQuickFix> quickFixes = getQuickFixes(annotation);
			if (quickFixes != null) {
				foundFixes.addAll(quickFixes);
			}
		}
		return foundFixes;
	}
	
	private java.util.Collection<ssl.resource.ssl.ISslQuickFix> getQuickFixes(org.eclipse.jface.text.source.Annotation annotation) {
		
		java.util.Collection<ssl.resource.ssl.ISslQuickFix> foundQuickFixes = new java.util.ArrayList<ssl.resource.ssl.ISslQuickFix>();
		if (annotation.isMarkedDeleted()) {
			return foundQuickFixes;
		}
		
		if (annotation instanceof ssl.resource.ssl.ui.SslMarkerAnnotation) {
			ssl.resource.ssl.ui.SslMarkerAnnotation markerAnnotation = (ssl.resource.ssl.ui.SslMarkerAnnotation) annotation;
			org.eclipse.core.resources.IMarker marker = markerAnnotation.getMarker();
			foundQuickFixes.addAll(new ssl.resource.ssl.ui.SslMarkerResolutionGenerator().getQuickFixes(editor.getResource(), marker));
		}
		return foundQuickFixes;
	}
	
	private org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel() {
		return editor.getDocumentProvider().getAnnotationModel(editor.getEditorInput());
	}
	
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
