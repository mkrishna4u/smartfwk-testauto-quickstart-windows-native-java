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
public interface StandardCalculatorPO {
	ButtonSD Button_0 = new ButtonSD("0")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num0Button");
	ButtonSD Button_1 = new ButtonSD("1")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num1Button");
	ButtonSD Button_2 = new ButtonSD("2")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num2Button");
	ButtonSD Button_3 = new ButtonSD("3")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num3Button");
	ButtonSD Button_4 = new ButtonSD("4")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num4Button");
	ButtonSD Button_5 = new ButtonSD("5")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num5Button");
	ButtonSD Button_6 = new ButtonSD("6")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num6Button");
	ButtonSD Button_7 = new ButtonSD("7")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num7Button");
	ButtonSD Button_8 = new ButtonSD("8")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num8Button");
	ButtonSD Button_9 = new ButtonSD("9")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "num9Button");
	
	ButtonSD Button_Plus = new ButtonSD("+")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "plusButton");
	ButtonSD Button_Minus = new ButtonSD("-")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "minusButton");
	ButtonSD Button_Multiply = new ButtonSD("*")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "multiplyButton");
	ButtonSD Button_Divide = new ButtonSD("/")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "divideButton");
	ButtonSD Button_Equals = new ButtonSD("=")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "equalButton");
	
	LabelSD Textbox_CalculatorResults = new LabelSD("Calculator Results")
			.addPlatformLocatorForNativeApp(PlatformType.windows, LocateBy.AccessibilityId, "CalculatorResults");
	
	
}
