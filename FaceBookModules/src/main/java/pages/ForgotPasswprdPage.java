package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswprdPage {

	@FindBy(xpath="//div[contains(text(),'Please enter your email address ')]")
	private WebElement forgotpasswordtext;
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement enterpasswordtext;
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelbutton;
	@FindBy(xpath="(//button[text()='Search'])")
	private WebElement searchbutton;
	public ForgotPasswprdPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String getForgotPasswordText()
	{
		 String textmessage = forgotpasswordtext.getText();
				
				return textmessage;
	}
	public void enterPasswordText()
	{
		enterpasswordtext.sendKeys("7022761930");
	}

	public void cliclOnCancelButton()
	{
		cancelbutton.click();
	}

	public void clickOnsearchButton()
	{
		searchbutton.click();
	}
	
}
