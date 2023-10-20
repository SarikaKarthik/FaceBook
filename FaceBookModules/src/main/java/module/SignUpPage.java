package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobilenumber;
	@FindBy(xpath="//input[@aria-label='New password']")
	private WebElement newpassword;
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signInButton;
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterUserNAme(String first)
	{
		firstname.sendKeys(first);
	}

	public void enterPassword(String last)
	{
		lastname.sendKeys(last);
	}
	public void enterMobileNumber(String mobilenum)
	{
		mobilenumber.sendKeys(mobilenum);
	}
	public void enterNewPassword(String newpass)
	{
		newpassword.sendKeys(newpass);
	}

	public void clickOnSigninButton(){
		signInButton.click();
	}

	}
