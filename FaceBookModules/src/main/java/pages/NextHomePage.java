package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NextHomePage {
	private WebDriver driver;
	private JavascriptExecutor js;
	
	@FindBy(xpath="//span[contains(text(),'Bangalore, India')]")  
	private WebElement stateandCountry;
	
	@FindBy(xpath="//span[contains(text(),'Dharwad')]")  
	private WebElement city;
	
	public NextHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		js=(JavascriptExecutor)driver;
	}
	public String getTextOFStateAndCountry()
	{
		js.executeScript("arguments[0].scrollIntoView(true)", stateandCountry);
		js.executeScript("window.scrollBy(0,600)");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(1000));
		wait.until(ExpectedConditions.textToBePresentInElement(stateandCountry, getTextOFStateAndCountry()));
		String text1=stateandCountry.getText();
		System.out.println(text1);
		return text1;
		
	}
	public String getTextOfCity()
	{	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));

		wait.until(ExpectedConditions.textToBePresentInElement(city, getTextOFStateAndCountry()));

		String text2=city.getText();
		System.out.println(text2);
		return text2;
	}
	
}
