/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ssl.resource.ssl.ui;

/**
 * A class used to initialize default preference values.
 */
public class SslPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static ssl.resource.ssl.ui.SslAntlrTokenHelper tokenHelper = new ssl.resource.ssl.ui.SslAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = ssl.resource.ssl.ui.SslUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(ssl.resource.ssl.ui.SslPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(ssl.resource.ssl.ui.SslPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = ssl.resource.ssl.ui.SslUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new ssl.resource.ssl.mopp.SslMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = ssl.resource.ssl.ui.SslUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new ssl.resource.ssl.mopp.SslMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, ssl.resource.ssl.ISslMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		ssl.resource.ssl.ui.SslBracketSet bracketSet = new ssl.resource.ssl.ui.SslBracketSet(null, null);
		final java.util.Collection<ssl.resource.ssl.ISslBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (ssl.resource.ssl.ISslBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + ssl.resource.ssl.ui.SslPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, ssl.resource.ssl.ISslMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			ssl.resource.ssl.ISslTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(ssl.resource.ssl.ui.SslSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ssl.resource.ssl.ui.SslSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(ssl.resource.ssl.ui.SslSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ssl.resource.ssl.ui.SslSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(ssl.resource.ssl.ui.SslSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ssl.resource.ssl.ui.SslSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(ssl.resource.ssl.ui.SslSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ssl.resource.ssl.ui.SslSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(ssl.resource.ssl.ui.SslSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ssl.resource.ssl.ui.SslSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(ssl.resource.ssl.ui.SslSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ssl.resource.ssl.ui.SslSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
