package page_objects;

import org.uitnet.testing.smartfwk.ui.core.commons.LocateBy;
import org.uitnet.testing.smartfwk.ui.core.config.PlatformType;
import org.uitnet.testing.smartfwk.ui.standard.domobj.LabelSD;

/**
 * 
 * @author Ajita Krishna
 *
 */
public interface ToggleMenuPO {
	LabelSD Menu_Standard = new LabelSD("Standard Menu")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "Standard");
	LabelSD Menu_Scientific = new LabelSD("Scientific Menu")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "Scientific");
}
