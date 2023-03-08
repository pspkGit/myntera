package myntraStepDefinitions;

import org.testng.Assert;

import basic.LaunchBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjs.Myntra_Login_PO;
import pageObjs.Myntra_UpdateInfo_PO;

public class Myntra_Login_SD extends LaunchBrowser {

	private Myntra_Login_PO Login_PO;
	private Myntra_UpdateInfo_PO Info_PO;

	@Given("User opens browser and Navigated to login page")
	public void user_opens_browser_and_navigated_to_login_page() throws Throwable {
		System.out.println(configs.getProperty("QA"));
	}

	@When("user provided {string} and  {string}")
	public void user_provided_something_and_something(String strArg1, String strArg2) throws Throwable {
		Login_PO = new Myntra_Login_PO(driver);
		Info_PO = Login_PO.loginn(strArg1, strArg2);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() throws Throwable {
		Info_PO.ss();
	}

	@Then("user should be redirected to Account page")
	public void user_should_be_redirected_to_account_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "My Account");

	}
}
