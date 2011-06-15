/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface ISslElementMapping<ReferenceType> extends ssl.resource.ssl.ISslReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
