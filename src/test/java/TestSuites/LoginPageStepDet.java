package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDet {

	@Given ("admin is on login page")
	
	public void admin_is_on_login_page() {
		Config.confChrome();
		Config.driver= new ChromeDriver();
		Config.maximaseWindow();
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		
		
	}
	@When("admin enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String username, String password) {
	LoginPage page = new LoginPage();
	page.connect (username, password);
	}
	@Then ("admin is directed to the home page that contains message (string)")
	public void admin_is_directed_to_the_home_page_that_contains_message(String ExpectedText) {
		LoginPage page = new LoginPage();
		String actualText = page.verifMessageLogin();
		Assert.assertEquals(ExpectedText, actualText);
}
	@When("admin enter correct username {string} and wrong password {string}")
	public void admin_enter_correct_username_and_wrong_password(String username, String password) {
		LoginPage page = new LoginPage();
		page.connect (username, password);
	}
	@Then ("admin still on login page that contains message (string)")
	public void admin_still_on_login_page_that_contains_message(String ExpectedText) {
		LoginPage page = new LoginPage();
		String actualText = page.verifLog();
		Assert.assertEquals(ExpectedText, actualText);
}
}