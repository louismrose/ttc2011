/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.mopp;

public class SslTokenStyleInformationProvider {
	
	public ssl.resource.ssl.ISslTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("Given".equals(tokenName)) {
			return new ssl.resource.ssl.mopp.SslTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("When".equals(tokenName)) {
			return new ssl.resource.ssl.mopp.SslTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Then".equals(tokenName)) {
			return new ssl.resource.ssl.mopp.SslTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
