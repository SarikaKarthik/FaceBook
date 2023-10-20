package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton;
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotbutton;
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement creatnewaccountbutton;
	private WebDriver driver;
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void enterUserNAme(String userid)
	{
		username.sendKeys(userid);
	}

	public void enterPassword(String passwrd)
	{
		password.sendKeys(passwrd);
	}

	public void clickOnLoginButton(){
		loginbutton.click();
	}

	public void clickOnForgotPassButton()
	{
		creatnewaccountbutton.click();
	}

	
	
}
