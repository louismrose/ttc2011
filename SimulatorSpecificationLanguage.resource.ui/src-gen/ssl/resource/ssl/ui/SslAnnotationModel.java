/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

public class SslAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel implements org.eclipse.jface.text.source.IAnnotationModel {
	
	public SslAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new ssl.resource.ssl.ui.SslMarkerAnnotation(marker);
	}
	
}
