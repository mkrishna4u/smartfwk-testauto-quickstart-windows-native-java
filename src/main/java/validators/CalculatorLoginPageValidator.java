package validators;

import org.uitnet.testing.smartfwk.ui.core.appdriver.SmartAppDriver;
import org.uitnet.testing.smartfwk.ui.core.objects.logon.LoginPageValidator;

/**
 * 
 * @author Ajita Krishna
 *
 */
public class CalculatorLoginPageValidator extends LoginPageValidator {

	public CalculatorLoginPageValidator() {
		super(null, null);
	}

	@Override
	public void setInitParams(SmartAppDriver appDriver) {
		this.appDriver = appDriver;
	}

	@Override
	protected void tryLogin(String activeUserProfileName) {
		// nothing needed
	}

	@Override
	protected void validateInfo(String activeUserProfileName) {
		// nothing needed.
	}

	@Override
	public boolean checkLoginPageVisible(String activeUserProfileName) {
		return false;
	}

}
