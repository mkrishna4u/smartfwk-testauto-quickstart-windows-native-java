package stepdefs.features.ui.home;

import org.uitnet.testing.smartfwk.ui.core.DefaultAppConnector;
import org.uitnet.testing.smartfwk.ui.core.SmartAppConnector;
import org.uitnet.testing.smartfwk.ui.core.appdriver.SmartAppDriver;
import org.uitnet.testing.smartfwk.ui.core.cache.DefaultSmartCache;
import org.uitnet.testing.smartfwk.ui.core.cache.SmartCache;

import global.AppConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

/**
 * This class contains the login steps and the shared steps that can be used in all the scenarios defined in cucumber feature file.
 * 
 * @author Ajita Krishna
 *
 */
public class LoginAndSharedStepDefs {
	private DefaultAppConnector appConnector;
	private Scenario runningScenario;
	private SmartAppDriver appDriver; 
	private SmartCache globalCache;
	
	public LoginAndSharedStepDefs() {
		globalCache = DefaultSmartCache.getInstance();
		appConnector = SmartAppConnector.connect(AppConstants.APP_NAME);
		globalCache.setAppConnector(appConnector);
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		runningScenario = scenario;
		
		globalCache.setRunningScenario(scenario);
		globalCache.publish(globalCache);
		
		appConnector.captureScreenshot(runningScenario, "scenario-started");
	}

	@After
	public void afterScenario(Scenario scenario) {
		appConnector.captureScreenshot(scenario, "scenario-" + scenario.getStatus());
	}
	
	@Given("Calculator is already opened.")
	public void calculator_is_already_opened() {
		appDriver = appConnector.setActiveUserProfileName("StandardUserProfile");
		globalCache.setAppDriver(appDriver);
		globalCache.publish(globalCache);
	}
}
