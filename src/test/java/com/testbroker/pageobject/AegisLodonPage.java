package com.testbroker.pageobject;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class AegisLodonPage {
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactus;
	
	@FindBy(xpath="//li//span[contains(text(),'Enquiry')]")
	private WebElement enquiry;
	
	@FindBy(xpath="(//li//span[contains(text(),'Office Locations')])[2]")
	private WebElement officelocation;
	
	@FindBy(xpath="(//li//span[contains(text(),'Media Contacts')])[2]")
	private WebElement mediacontact;
	
	@FindBy(xpath="(//li//span[contains(text(),'Complaints')])[2]")
	private WebElement complaint;
	 WebDriver driver;

	 
	public AegisLodonPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("User has clicked on contact us....")
	public void contactUs(){
		contactus.click();

	}
	@Step("User has clicked on enquiry link....")
	public void enquiryLink() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));
		enquiry.click();

	}
	@Step("User has clicked on office location....")
	public void officeLocation() throws InterruptedException{
        WaitStatementLib.threadSleepOfEightSec();
        String actualOfficeLoc=officelocation.getText();
		officelocation.click();
		AssertDataWithMultipleWindows(actualOfficeLoc);
	}
	@Step("User has clicked on media Contacts....")
	public void MediaContacts() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
	    String actualMediaContact=mediacontact.getText();
		mediacontact.click();
		AssertDataWithMultipleWindows(actualMediaContact);
	}
	@Step("User has clicked on contact us....")
	public void complaintLink() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
		String actualComplaintsText=complaint.getText();
		complaint.click();
		AssertDataWithMultipleWindows(actualComplaintsText);
	}
	
	public void AssertDataWithMultipleWindows(String datatoAssert){
		String parentWindow=driver.getWindowHandle();
		for(String childWindow:driver.getWindowHandles()){
			driver.switchTo().window(childWindow);
		}
        String PageTitle=driver.getTitle();
        Assert.assertTrue(PageTitle.contains(datatoAssert));
        driver.switchTo().window(parentWindow);
	}
	
	
}
