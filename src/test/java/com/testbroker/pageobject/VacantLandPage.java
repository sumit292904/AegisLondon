package com.testbroker.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class VacantLandPage {
	@FindBy(xpath="//button[@value=2]//div[contains(text(),'Vacant Land')]")
	private WebElement vacantlandicon;
	
	@FindBy(xpath="//div[@class='pa-4 pb-0 ml-5 eno-ep-header']//div[text()='Small']")
	private WebElement small;
	
	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'Yes')])[1]")
	private WebElement landfence;
	
	//@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')])[2]")
	@FindBy(xpath="(//div[@class='transparent d-inline-block v-item-group theme--light v-btn-toggle']//div[contains(text(),'No')])[4]")
	private WebElement attractivenuisance;
	
	@FindBy(xpath="//span[@class='v-btn__content']")
	private WebElement authorize;
	
	@FindBy(xpath="//button[@id='dismiss-btn']")
	private WebElement remindmelater;
	 WebDriver driver;

	
	public VacantLandPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("User has clicked on vacant land icon....")
	public void vacantLandClick(){
		WaitStatementLib.explicitlyWaitForClickable(driver, 20, vacantlandicon);
		vacantlandicon.click();
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
}
