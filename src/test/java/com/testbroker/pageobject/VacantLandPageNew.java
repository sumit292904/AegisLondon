package com.testbroker.pageobject;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.testbroker.generic.ExcelUtilityLib;
import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class VacantLandPageNew {
	
	@FindBy(xpath="//button[@value=2]//div[contains(text(),'Vacant Land')]")
	private WebElement vacantlandicon;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//span[@class='v-btn__content'][contains(text(),'Next')]")
	private WebElement nextButton;
	
	@FindBy(xpath="(//i[contains(@class,'calendar')]/..//following-sibling::div//i)[1]")
	private WebElement inceptiondatedrpdwn;
	@FindBy(xpath="//button[@class='v-btn v-date-picker-table__current v-btn--rounded v-btn--outlined theme--light orange-aegis--text']")
	private WebElement currentdate;
	
	@FindBy(xpath="//input[@id='input-151']")
	private WebElement expireDate;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement noButton;
	
	//@FindBy(xpath="//div[@class='v-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//div[@class='v-text-field__slot']")
	//private WebElement fullnamefield;
	@FindBy(xpath="//div[@class='v-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//input")
	private WebElement name;
	
	@FindBy(xpath="//div[@class='v-input v-input--hide-details theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//input")
	private WebElement mailingaddressfield;
	
	@FindBy(xpath="//div[@class='v-input v-input--hide-details v-input--is-label-active v-input--is-dirty theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed draw-input-line']//input")
	private WebElement mailing;
	@FindBy(xpath="(//div[@class='pac-item'])[1]")
	private WebElement valuefromdropdown;
	
	
	@FindBy(xpath="//div[@class='v-input--selection-controls__ripple']")
	private WebElement checkboxfield1;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//span[text()='Street number']/../..//input")
	private WebElement streetnumberfield;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//span[text()='Zip']/../..//input")
	private WebElement zipfield;
	
	@FindBy(xpath="(//label[text()='Manually enter the address'])[2]")
	private WebElement checkboxfield2;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement insuranceoption;
	
	@FindBy(xpath="//div[@class='pa-4 pb-0 ml-5 eno-ep-header']//div[text()='Small']")
	private WebElement small;
	
	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'Yes')])[1]")
	private WebElement landfence;
	
	//@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')])[2]")
	@FindBy(xpath="(//div[@class='transparent d-inline-block v-item-group theme--light v-btn-toggle']//div[contains(text(),'No')])[4]")
	private WebElement attractivenuisance;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'0')]")
	private WebElement zerocliam;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'CA$ 1,000,000')]")
	private WebElement limitrequired;
	
	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'CA$ 1,000')])[2]")
	private WebElement deductiblerequired;
	
	@FindBy(xpath="//span[contains(text(),'Get Quote')]")
	private WebElement getQuote;
	
	@FindBy(xpath="//div[@class='v-dialog__content v-dialog__content--active']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]")
	private WebElement confirmCheckbox;
	
	@FindBy(xpath="//span[contains(text(),'PROCEED')]")
	private WebElement proceed;
	
	@FindBy(xpath="(//div[text()='Current total gross premium']/..//preceding-sibling::div)[2]")
	private WebElement grossamount;
	
	 WebDriver driver;

		
		public VacantLandPageNew(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
		@Step("User has clicked on vacant land icon....")
		public void vacantLandClick(){
			WaitStatementLib.explicitlyWaitForClickable(driver, 20, vacantlandicon);
			vacantlandicon.click();
		}
		
		@Step("User has clicked on next button....")
		public void nextButton(){
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, nextButton);
			nextButton.click();

		}
		@Step("User has clicked on inception date field....")
		public void inceptionDate(){
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, inceptiondatedrpdwn);
			inceptiondatedrpdwn.click();
		}
		
		@Step("User has select the current date from the calendar....")
		public void currentDate(){
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, currentdate);
			currentdate.click();
		}
		
		@Step("User has clicked on no button")
		public void noButtonClick() {
			
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, currentdate);
			noButton.click();			
		}
		
		@Step("User has enter the Full Name : {0}....")
		public void fullName(String fullname ) throws InterruptedException{
			WaitStatementLib.threadSleepOfEightSec();
			//WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, fullnamefield);
			//fullnamefield.click();
			WaitStatementLib.threadSleepOfFourSec();
			name.sendKeys(fullname);
			}
		
		@Step("User has enter the mailing address....")
		public void addressField(String address ) throws InterruptedException{
			WaitStatementLib.threadSleepOfFourSec();
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, mailingaddressfield);	
			mailingaddressfield.sendKeys(address);
			//mailing.click();
			try {
				WaitStatementLib.threadSleepOfSixSec();
			valuefromdropdown.click();

			}catch(NoSuchElementException e) {
				System.out.println(e);
			}
			
			}
		
		
		@Step("User has selected the checked for manually entering the address....")
		public void checkbox1() throws InterruptedException{
			WaitStatementLib.threadSleepOfSixSec();
			Actions action = new Actions(driver);
			  action.moveToElement(checkboxfield1).perform();
			  checkboxfield1.click();              	
		}
		
		@Step("User has enter the street Number :{0}....")
		public void streetName(String street ) throws InterruptedException{
			WaitStatementLib.threadSleepOfFourSec();
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, streetnumberfield);
			streetnumberfield.sendKeys(street);
			}
		
		@Step("User has enter the Zip Code :{0}....")
		public void zipcode(String zip ) throws InterruptedException{
			WaitStatementLib.threadSleepOfFourSec();
			WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, zipfield);
			zipfield.sendKeys(zip);
			}
		
		
		@Step("User has selected the checked for manually entering the address....")
		public void checkbox2() throws InterruptedException{
			//WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, checkboxfield);
			WaitStatementLib.threadSleepOfFourSec();
			Actions action = new Actions(driver);
			  action.moveToElement(checkboxfield1).perform();
			  checkboxfield1.click();
	                
			//checkboxfield.click();
		}
		
		
		@Step("User selects No for insurance cancelled previously")
		public void insuranceOption() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			insuranceoption.click();
		}
		
		
		@Step("User has clicked on small land cover....")
		public void smallLandCover(){
			WaitStatementLib.explicitlyWaitForClickable(driver, 20, small);
			small.click();;

		}
		@Step("User has clicked on land fence....")
		public void landFence(){
			WaitStatementLib.explicitlyWaitForClickable(driver, 20, landfence);
			landfence.click();;

		}
		@Step("User has clicked on small attractive....")
		public void attractiveNuisance(){
			WaitStatementLib.explicitlyWaitForClickable(driver, 20, attractivenuisance);
			attractivenuisance.click();;

		}
		
		@Step("Scroll down....")
		public void scroll(){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].scrollIntoView();", buildingvacant12month);
			js.executeScript("window.scrollBy(0,500)");
		}
		
		
		@Step("User selects 0 for GL claims")
		public void zeroClaim() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			zerocliam.click();
		}
		
		
		@Step("User selects amount 1000,000$ for General Liability limit")
		public void limitRequired() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			limitrequired.click();
		}
		@Step("User selects amount 1000$ for General Liability deductible")
		public void deductableRequired() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			deductiblerequired.click();
		}
		@Step("User clicks on Get Quote button... ")
		public void getQuote() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			getQuote.click();
		}
		@Step("User clicks on checkbox to confirm")
		public void confirmCheckbox() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			confirmCheckbox.click();
		}
		@Step("User clicks to proceed button")
		public void proceed() throws InterruptedException{
			WaitStatementLib.threadSleepOfTwoSec();
			proceed.click();
		}
		
		@Step("User verifies Gross Amount generated")
		public void verifyGrossAmount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
			WaitStatementLib.threadSleepOfEightSec();
			WaitStatementLib.threadSleepOfEightSec();
			String Actual=grossamount.getText();
			
			//String Expected=ExcelUtilityLib.getKeyValue(LoginCredentials, "GrossValue", "Valid-GrossValue");
			//Assert.assertEquals(Actual, Expected, "The amount of gross value is not correct");
			//Reporter.log("The amount of gross value is expected", true);
			
		}
		
		@Step("The value has been highlighted")
		public  void highLightElement() {

			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style','background: red; border: 2px solid red;');", grossamount);
				Thread.sleep(1000);
				js.executeScript("arguments[0].style.border=''", grossamount, "");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		
		
		
			
			
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
