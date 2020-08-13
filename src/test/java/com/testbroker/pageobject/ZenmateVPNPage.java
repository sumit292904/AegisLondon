package com.testbroker.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.qameta.allure.Step;

public class ZenmateVPNPage {
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement vpnLoginButton;
	
	@FindBy(xpath="//input[@placeholder='Username/Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']/../preceding-sibling::input[@placeholder='Username/Email']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath="//button[@type='submit']//span[text()='Log In']")
	private WebElement submitButton;
	 WebDriver driver;

	
	public ZenmateVPNPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void zenmateLoginButton(){
		vpnLoginButton.click();;
	}
	@Step("2.Click on Proceed to Dashboard step....")
	public void emailField(String emailField){
		email.sendKeys(emailField);
	}	
	@Step("3.Click on Proceed to Dashboard step....")
	public void passwordField(String passwordField){
		password.sendKeys(passwordField);
	}
	@Step("4.Click on Proceed to Dashboard step....")
	public void checkButton(){
		checkbox.click();
	}
	@Step("5.Click on Proceed to Dashboard step....")
	public void submitButton(){
		submitButton.click();
	}
}
