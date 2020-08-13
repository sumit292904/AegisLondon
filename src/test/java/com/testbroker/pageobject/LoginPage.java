package com.testbroker.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.Reporter;

import com.testbroker.generic.WaitStatementLib;


import io.qameta.allure.Step;

public class LoginPage  {
		
	@FindBy(xpath="//span")
	private WebElement proceedButton;
	
	@FindBy(xpath="//input[@id='input-17']")
	private WebElement usernameField;
	
	@FindBy(xpath="//input[@id='input-21']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@class='login-button aegis-login-button v-btn v-btn--depressed theme--light v-size--large']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[@class='v-btn__content']")
	private WebElement authorize;
	
	@FindBy(xpath="//button[@id='dismiss-btn']")
	private WebElement remindmelater;
	 WebDriver driver;

	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("User has clicked on Proceed to Dashboard button....")
	public void dashboardClick(){
		proceedButton.click();;

	}
	@Step("User has clicked on remind me later button of Zenmate VPN....")
	public void remindmeLater(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 20, remindmelater);
		driver.switchTo().frame("iframe-widget");
		remindmelater.click();;

	}
	@Step("User has enter the username: {0} successfully....")
	public void usernameField(String username) throws InterruptedException{
		//WaitStatementLib.explicitlyWaitForClickable(driver, 20, usernameField);
		//WaitStatementLib.threadSleepOfEightSec();
		Thread.sleep(10000);
		usernameField.sendKeys(username);
	}
	@Step("User has enter the password: {0} successfully....")
	public void passwordField(String password) throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		passwordField.sendKeys(password);

	}
	@Step("User has clicked on login button....")
	public void LoginClick() throws InterruptedException{
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver1, 20, loginButton);
		WaitStatementLib.threadSleepOfFourSec();
		loginButton.click();
	}
	
	@Step("User has clicked on authorize button to land on login screen step....")
	public void authorizeButton() throws InterruptedException{
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver, 20, authorize);
WaitStatementLib.threadSleepOfEightSec();
		authorize.click();
	}
	
}
