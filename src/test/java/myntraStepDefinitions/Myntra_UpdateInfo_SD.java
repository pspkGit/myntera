package myntraStepDefinitions;

import org.testng.Assert;

import basic.LaunchBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Myntra_UpdateInfo_SD extends LaunchBrowser {

	@And("clicks on edit account information")
	public void clicks_on_edit_account_information() throws Throwable {
		System.out.println(driver.getCurrentUrl());
		//Assert.assertTrue(false);
	}

	@And("update {string} and {string} fields")
	public void update_something_and_something_fields(String strArg1, String strArg2) throws Throwable {

	}

	@Then("information should be updated")
	public void information_should_be_updated() throws Throwable {

	}

}
