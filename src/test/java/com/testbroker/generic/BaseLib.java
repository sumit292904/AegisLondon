package com.testbroker.generic;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.testbroker.pageobject.ZenmateVPNPage;

public class BaseLib {
	public WebDriver driver;
	String project="TestBroker";
	public static Logger logger;
	static final String LoginCredentials = "LoginCredentials_Sheet";

	@BeforeMethod
	//@Parameters(value={"browser"})
	public void preCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		logger = Logger.getLogger("testbroker");
		PropertyConfigurator.configure("Log4j.properties");
//		if (browserName.equalsIgnoreCase("firefox")){
//			
//			driver= new FirefoxDriver();
//			Reporter.log("firefox is launched",true);
//		}
//		else{
//			if (browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
				 if(project.equalsIgnoreCase("TestBroker")){
				ChromeOptions options = new ChromeOptions();
		        options.addExtensions(new File(".\\exefiles\\ZenmateExtension.crx"));
		         driver = new ChromeDriver(options);
		        WaitStatementLib.threadSleepOfFourSec();

		        Thread.sleep(2000);

		        ZenmateVPNPage zenmate= new ZenmateVPNPage(driver);
		        zenmate.zenmateLoginButton();
		        zenmate.emailField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-Email", "Valid-Email"));
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]")).sendKeys(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-Password", "Valid-Password"));
		       
		        zenmate.checkButton();
		        zenmate.submitButton();
		        Thread.sleep(2000);
		        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		        driver.switchTo().window(tabs2.get(1));
		        driver.close();
		        driver.switchTo().window(tabs2.get(0));
		        driver.manage().window().maximize();
		        WaitStatementLib.threadSleepOfFourSec();
		        WaitStatementLib.pageLoadTime(driver);
		        WaitStatementLib.threadSleepOfEightSec();
		        //driver.get("https://www.dofe.org/"); 
		       
		        driver.get(ExcelUtilityLib.getKeyValue(LoginCredentials, "TestBroker", "Valid-URL"));
		        }else {		       
			         driver = new ChromeDriver();
			         driver.manage().window().maximize();
		        driver.get(ExcelUtilityLib.getKeyValue(LoginCredentials, "AegisLodon", "Valid-URL"));
		        }
	       
//			}
//			else{
//				if(browserName.equalsIgnoreCase("ie")){
//					System.setProperty("webdriver.ie.driver", ".\\exefiles\\IEDriverServer.exe");
//					driver= new InternetExplorerDriver();
//					Reporter.log("ie is launched");
//				}
//			}
//		}
	}
	@AfterMethod
	public void postCondition(ITestResult result){
		if (result.isSuccess()){
		}
		else{
			ScreenshotLib slib = new ScreenshotLib();
			String fileName = result.getMethod().getMethodName();
			slib.getScreenShot(driver,fileName);
		}
		//driver.close();
		Reporter.log("Browser closed",true);
	}
}

