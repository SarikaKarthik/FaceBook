package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentsHomePage {
	//private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Sarika Sarika K']")  
	private WebElement homeicon;
	
	public ContentsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnHomeIcon()
	{
		homeicon.click();
	}
	
	
}
