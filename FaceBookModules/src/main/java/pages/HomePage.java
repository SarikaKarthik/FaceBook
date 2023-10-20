package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	private JavascriptExecutor js;
	Actions act;

	
	@FindBy(xpath="(//div[@role='button'])[3]")  
	private WebElement logouticon;
	@FindBy(xpath="//span[text()='Log Out']")  
	private WebElement logout;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js=(JavascriptExecutor)driver;
		act=new Actions(driver);
	}
	
	
	public void LogOutIcon() throws InterruptedException
	{	 
		Thread.sleep(5000);
		logouticon.click();
		Thread.sleep(2000);
		act.moveToElement(logout).build().perform();
		Thread.sleep(1000);
		logout.click();
	}
	
	
}
