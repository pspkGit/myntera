package pageObjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.LaunchBrowser;
import myntraStepDefinitions.Myntra_UpdateInfo_SD;

public class Myntra_Login_PO extends LaunchBrowser {

	WebDriver localDriver1;

	@FindBy(name = "email")
	public WebElement eamilField;

	@FindBy(name = "password")
	public WebElement passwordField;

	@FindBy(css = "input[value='Login']")
	public WebElement login_btn;

	public Myntra_Login_PO(WebDriver Driver) {
		this.localDriver1 = Driver;
		PageFactory.initElements(localDriver1, this);
	}

	public Myntra_UpdateInfo_PO loginn(String mail, String passcode) {

		eamilField.sendKeys(mail);
		passwordField.sendKeys(passcode);
		login_btn.click();
		return new Myntra_UpdateInfo_PO();

	}



}
