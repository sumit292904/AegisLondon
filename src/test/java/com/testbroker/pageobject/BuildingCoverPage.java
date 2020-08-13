package com.testbroker.pageobject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.testbroker.generic.ExcelUtilityLib;
import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class BuildingCoverPage {
	static final String LoginCredentials = "LoginCredentials_Sheet";

	@FindBy(xpath="(//input[@type='checkbox']/../..//label)[3]")
	private WebElement useAddressCheckBox;

	@FindBy(xpath="//div[@class='v-input theme--light v-input--selection-controls v-input--checkbox']//div[@class='v-input--selection-controls__ripple']")
	private WebElement manualAddressCheckbox;

	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')])[1]")
	private WebElement buildingvacant12month;

	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')])[2]")
	private WebElement structuredemolition;

	@FindBy(xpath="//div[@class='v-input create-activity-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed v-select v-autocomplete']")
	private WebElement fusScore;

	@FindBy(xpath="//div[contains(text(),'1-4')]")
	private WebElement score;

	@FindBy(xpath="//span[text()='Total Insured Value']/..//following-sibling::input")
	private WebElement totolInsuredValue;

	@FindBy(xpath="//div[contains(text(),'CA$ 2,500')]")
	private WebElement cavalue;
	@FindBy(xpath="//div[contains(text(),'Frame / Timber')]")
	private WebElement frametimber;
	@FindBy(xpath="//div[contains(text(),'Under 15 years')]")
	private WebElement buildingAge;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'Yes')]")
	private WebElement yesoption;
	@FindBy(xpath="//div[contains(text(),'All Risks')]")
	private WebElement allriskvalue;

	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement insuranceoption;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'0')]")
	private WebElement zerocliam;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'CA$ 1,000,000')]")
	private WebElement limitrequired;
	@FindBy(xpath="(//div[contains(text(),'CA$ 2,500')])[2]")
	private WebElement deductiblerequired;
	@FindBy(xpath="//div[@id='c2ms5d77742985f6c3_88132932']//button[1]")
	private WebElement loss;

	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'0')])[2]")
	private WebElement mortageorloan;

	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[@class='v-card__text']//button[1]")
	private WebElement generalLiabiltyCover;

	@FindBy(xpath="//span[contains(text(),'Get Quote')]")
	private WebElement getQuote;

	@FindBy(xpath="//span[contains(text(),'PROCEED')]")
	private WebElement proceed;

	@FindBy(xpath="//div[@class='v-dialog__content v-dialog__content--active']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]")
	private WebElement confirmCheckbox;
	@FindBy(xpath="(//div[text()='Current total gross premium']/..//preceding-sibling::div)[2]")
	private WebElement grossamount;
	WebDriver driver;


	public BuildingCoverPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step("User clicks on Use entered mailing address checkbox....")
	public void usemailingAddress(){
		useAddressCheckBox.click();
	}
	
	@Step("User clicks on Manually enter the address Checkbx....")
	public void manualAddressCheckbox(){
		manualAddressCheckbox.click();
	}
	@Step("User clicks on No option for builiding Vacant for 12 months option....")
	public void buildingVacantOption(){
		buildingvacant12month.click();
	}
	@Step("User clicks on No option for demolition during the policy period....")
	public void structureDemolition(){
		structuredemolition.click();
	}
	@Step("Scroll down....")
	public void scroll(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", buildingvacant12month);
		js.executeScript("window.scrollBy(0,500)");
	}
	@Step("User selects Frame/Timber option from Construction Type....")
	public void frameTimberClick() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();
		frametimber.click();
	}
	@Step("User selects 1-4 from FUS score dropdown....")
	public void fuscSore() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		fusScore.click();
		WaitStatementLib.threadSleepOfTwoSec();
		score.click();
	}
	@Step("User entered Total Insured Value: {0}....")
	public void totolInsuredValue(String totalvalue) throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
		WaitStatementLib.explicitlyWaitForClickable(driver, 20, totolInsuredValue);
		totolInsuredValue.sendKeys(totalvalue);
	}
	@Step("User selects first option:1000$ for deductible required ")
	public void caValue() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		cavalue.click();
	}

	@Step("User selects :Under 15 years from Building Age ")
	public void buildingAge() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		buildingAge.click();
	}

	@Step("User selects Yes Option")
	public void yesoption() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		yesoption.click();
	}

	@Step("User clicks on All Risks option for Required Cover level")
	public void allRiskValue() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();

		allriskvalue.click();
	}

	@Step("User selects No for insurance cancelled previously")
	public void insuranceOption() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		insuranceoption.click();
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

	@Step("User selects 0 as previous losses")
	public void lossValue() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		loss.click();
	}
	@Step("User selects 0 as mortgages secured")
	public void mortageOrLoan() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();
		mortageorloan.click();
	}

	@Step("User selects Yes for general liability cover ")
	public void generalLiabilityCover() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		generalLiabiltyCover.click();
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
		String Expected=ExcelUtilityLib.getKeyValue(LoginCredentials, "GrossValue", "Valid-GrossValue");
		Assert.assertEquals(Actual, Expected, "The amount of gross value is not correct");
		Reporter.log("The amount of gross value is expected", true);
	}
	@Step("The value has been highlighted")
	public  void highLightElement() {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", grossamount);
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.border=''", grossamount, "");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
