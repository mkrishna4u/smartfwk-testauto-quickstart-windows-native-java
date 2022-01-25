package stepdefs.features.ui.home;

import org.testng.Assert;
import org.uitnet.testing.smartfwk.ui.core.AbstractAppConnector;
import org.uitnet.testing.smartfwk.ui.core.appdriver.SmartAppDriver;
import org.uitnet.testing.smartfwk.ui.core.cache.DefaultSmartCache;
import org.uitnet.testing.smartfwk.ui.core.cache.SmartCache;
import org.uitnet.testing.smartfwk.ui.core.cache.SmartCacheSubscriber;
import org.uitnet.testing.smartfwk.ui.core.objects.validator.mechanisms.TextMatchMechanism;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.HomePO;
import page_objects.StandardCalculatorPO;
import page_objects.ToggleMenuPO;

/**
 * Step definitions for calculator standard page.
 * 
 * @author Ajita Krishna
 *
 */
public class StandardCalculatorStepDefs {
	// ------------- Common Code for step definition - START -------
	private AbstractAppConnector appConnector;
	private Scenario runningScenario;
	private SmartAppDriver appDriver;
	private SmartCache globalCache;

	/**
	 * Constructor
	 */
	public StandardCalculatorStepDefs() {
		globalCache = DefaultSmartCache.getInstance();

		appConnector = globalCache.getAppConnector();
		runningScenario = globalCache.getRunningScenario();
		appDriver = globalCache.getAppDriver();

		// Subscribe to the the cache to get the latest data
		globalCache.subscribe(new SmartCacheSubscriber() {
			@Override
			protected void onMessage(SmartCache message) {
				appConnector = message.getAppConnector();
				runningScenario = message.getRunningScenario();
				appDriver = message.getAppDriver();
			}
		});
	}

	// ------------- Common Code for step definition - END -------

	// ------------- Step definition starts here -----------------

	@Given("Standard menu item is already selected.")
	public void standard_menu_item_is_already_selected() {
		if (!HomePO.Label_StandardMode.getValidator(appDriver, null).isPresent(2)) {
			HomePO.Button_ToggleMenu.getValidator(appDriver, null).click(0);
			ToggleMenuPO.Menu_Standard.getValidator(appDriver, null).click(2);
			appDriver.waitForSeconds(3);
		}
	}

	@When("User clicks on {int} {string} {int} = buttons.")
	public void user_clicks_on_operator_buttons(Integer num1, String operator, Integer num2) {
		String num1Str = "" + num1;
		String num2Str = "" + num2;
		for (int i = 0; i < num1Str.length(); i++) {
			clickDigitButton(num1Str.charAt(i));
		}

		clickOperatorButton(operator);

		for (int i = 0; i < num2Str.length(); i++) {
			clickDigitButton(num2Str.charAt(i));
		}

		StandardCalculatorPO.Button_Equals.getValidator(appDriver, null).click(1);
	}

	@Then("The {int} is displayed on result textbox.")
	public void the_is_displayed_on_result_textbox(Integer result) {
		StandardCalculatorPO.Textbox_CalculatorResults.getValidator(appDriver, null).validateValue(
				"Display is " + result, TextMatchMechanism.exactMatchWithExpectedValueWithRemovedWhiteSpace, 1);
	}

	private void clickDigitButton(char digit) {
		switch (digit) {
		case '0':
			StandardCalculatorPO.Button_0.getValidator(appDriver, null).click(1);
			break;
		case '1':
			StandardCalculatorPO.Button_1.getValidator(appDriver, null).click(1);
			break;
		case '2':
			StandardCalculatorPO.Button_2.getValidator(appDriver, null).click(1);
			break;
		case '3':
			StandardCalculatorPO.Button_3.getValidator(appDriver, null).click(1);
			break;
		case '4':
			StandardCalculatorPO.Button_4.getValidator(appDriver, null).click(1);
			break;
		case '5':
			StandardCalculatorPO.Button_5.getValidator(appDriver, null).click(1);
			break;
		case '6':
			StandardCalculatorPO.Button_6.getValidator(appDriver, null).click(1);
			break;
		case '7':
			StandardCalculatorPO.Button_7.getValidator(appDriver, null).click(1);
			break;
		case '8':
			StandardCalculatorPO.Button_8.getValidator(appDriver, null).click(1);
			break;
		case '9':
			StandardCalculatorPO.Button_9.getValidator(appDriver, null).click(1);
			break;
		default:
			Assert.fail("Invalid numeric digit '" + digit + "'.");
		}
	}

	private void clickOperatorButton(String operator) {
		switch (operator) {
		case "+":
			StandardCalculatorPO.Button_Plus.getValidator(appDriver, null).click(1);
			break;
		case "-":
			StandardCalculatorPO.Button_Minus.getValidator(appDriver, null).click(1);
			break;
		case "*":
			StandardCalculatorPO.Button_Multiply.getValidator(appDriver, null).click(1);
			break;
		case "/":
			StandardCalculatorPO.Button_Divide.getValidator(appDriver, null).click(1);
			break;
		default:
			Assert.fail("Operator '" + operator + "' is not supported.");
		}
	}
}
