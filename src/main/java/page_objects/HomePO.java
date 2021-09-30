package page_objects;

import org.uitnet.testing.smartfwk.ui.core.commons.LocateBy;
import org.uitnet.testing.smartfwk.ui.core.config.PlatformType;
import org.uitnet.testing.smartfwk.ui.standard.domobj.ButtonSD;
import org.uitnet.testing.smartfwk.ui.standard.domobj.LabelSD;

/**
 * 
 * @author Ajita Krishna
 *
 */
public interface HomePO {
	ButtonSD Button_ToggleMenu = new ButtonSD("Toggle Menu")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "TogglePaneButton");
	
	LabelSD Label_StandardMode = new LabelSD("Standard Mode")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.Name, "Standard Calculator mode");
}
