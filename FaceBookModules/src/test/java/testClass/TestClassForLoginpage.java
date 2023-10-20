package testClass;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ContentsHomePage;
import pages.HomePage;
import pages.LogInPage;
import pages.NextHomePage;

public class TestClassForLoginpage {
	private WebDriver driver;
	private HomePage homepage;
	private LogInPage login;
	private ContentsHomePage contentshomepage;
	private NextHomePage nexthomepage;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dudes co\\Desktop\\sarika\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	@BeforeClass
	public void createPomClassObject()
	{
		
		nexthomepage=new NextHomePage(driver);
		contentshomepage=new ContentsHomePage(driver);
		login=new LogInPage(driver);
		 homepage=new HomePage(driver);
 
		
	}
	
	@BeforeMethod
	public void openLoginPage() throws InterruptedException
	{	
		driver.get("https://www.facebook.com/");
		//LogInPage login=new LogInPage(driver);
		//Thread.sleep(2000);
		login.enterUserNAme("ksarika938@gmail.com");
		login.enterPassword("sarika7022761930");
		//Thread.sleep(1000);
		login.clickOnLoginButton();
	}
	@Test
	public void ClickonHomeIcon() throws InterruptedException
	{	
		Thread.sleep(1000);
		contentshomepage.clickOnHomeIcon();
		Thread.sleep(1000);
		
	}
	@Test
	public void toVerifyHomePageStateandCountry() throws InterruptedException
	{
		//Thread.sleep(1000);
		String text=nexthomepage.getTextOFStateAndCountry();
		text.trim();
		
		if(text=="Bangalore, India")
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
			
	}
	@Test
	public void toVerifyHomePageCity() throws InterruptedException
	{
		//Thread.sleep(1000);
		String text=nexthomepage.getTextOFStateAndCountry();
		 
		text.trim();
		String a="dharwad";
		if(text==a) //I have changed to lowercase
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
			
	}
	
	@AfterMethod
	public void LogOutIcon() throws InterruptedException
	{
		Thread.sleep(5000);
		homepage.LogOutIcon();
		//homepage=null;
		
	}
	@AfterClass
	public void afterClass()
	{
		homepage=null;
		contentshomepage=null;
		login=null;
		nexthomepage=null;
		
		
	}	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		//driver=null;
	}
	
}
