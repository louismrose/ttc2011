/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl;

public interface ISslReferenceCache {
	public Object get(String identifier);
	public void put(String identifier, Object target);
}
