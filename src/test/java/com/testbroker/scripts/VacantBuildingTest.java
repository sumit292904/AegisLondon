package com.testbroker.scripts;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testbroker.generic.BaseLib;
import com.testbroker.generic.ExcelUtilityLib;
import com.testbroker.generic.WaitStatementLib;
import com.testbroker.pageobject.BuildingCoverPage;
import com.testbroker.pageobject.HomePage;
import com.testbroker.pageobject.LoginPage;
import com.testbroker.pageobject.VacantBuildingPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class VacantBuildingTest extends BaseLib {
	static final String LoginCredentials = "LoginCredentials_Sheet";
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify when user is able to login with correct username and passowrd")
	@Story("Story Name: To check login page functionality")
	public void vacantBuildingPremiumVerfification() throws InterruptedException, IOException, IllegalStateException, InvalidFormatException{
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.dashboardClick();
		//lp.remindmeLater();
		lp.usernameField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-UserEmail", "Valid-Email"));
		logger.info("Entered username");
		lp.passwordField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-UserPassword", "Valid-Password"));
		logger.info("Entered password");
		lp.LoginClick();
		logger.info("User has clicked on login Button");
		lp.authorizeButton();
		logger.info("User has clicked on authorize Button");
		HomePage home = new HomePage(driver);
		home.getQuotesClick();
		logger.info("User has clicked on get A Quotes Icon");
		home.vacantIconClick();
		logger.info("User has clicked on next Button");
		VacantBuildingPage vacantbuilding= new VacantBuildingPage(driver);
		vacantbuilding.vacantBuildingClick();
		logger.info("User has clicked on vacant building Icon");
		vacantbuilding.nextButton();
		logger.info("User has clicked on next Button");
		vacantbuilding.inceptionDate();
		vacantbuilding.currentDate();
		logger.info("User has clicked on inception date field");
		//vacantbuilding.dateSelect(ExcelUtilityLib.getKeyValue(LoginCredentials, "Date-Select", "Valid-date"));
		//logger.info("User has clicked on date passed from the excel sheet");
		//vacantbuilding.verifytimeBetween();
		vacantbuilding.nextButton();
		logger.info("User has clicked on next button");
		
		vacantbuilding.noButtonClick();
		logger.info("User has clicked no button to set a target price");
		
		//vacantbuilding.yesButtonClick();
		//logger.info("User has clicked on yes next button");
		//vacantbuilding.setTargetPrice(ExcelUtilityLib.getKeyValue(LoginCredentials, "TargetFieldKey", "TargetFieldValue"));
		//logger.info("User has enter the set target price");
		vacantbuilding.nextButton();
		logger.info("User has clicked next button");
		
		vacantbuilding.fullName(ExcelUtilityLib.getKeyValue(LoginCredentials, "FullName", "Valid-fullname"));
		logger.info("User has enter the fullname");
		
		vacantbuilding.addressField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Address", "Valid-address"));
		logger.info("User has enter the set mailing address");
		
		vacantbuilding.checkbox1();
		logger.info("User has selected the checkbox");
		
		vacantbuilding.streetName(ExcelUtilityLib.getKeyValue(LoginCredentials, "StreetName", "Valid-streetname"));
		logger.info("User has enter the street name");
		
		vacantbuilding.zipcode(ExcelUtilityLib.getKeyValue(LoginCredentials, "ZipCode", "Valid-ZipCode"));
		logger.info("User has enter the zip code");
		
		vacantbuilding.nextButton();
		logger.info("User has clicked on next button");
		
		BuildingCoverPage cover= new BuildingCoverPage(driver);
		vacantbuilding.checkbox2();
		logger.info("User has select the checkbox");
		
		cover.usemailingAddress();
		logger.info("User has select the use same mailing address");
		
		vacantbuilding.streetName(ExcelUtilityLib.getKeyValue(LoginCredentials, "StreetName", "Valid-streetname"));
		logger.info("User has enter the street name");
		
		vacantbuilding.zipcode(ExcelUtilityLib.getKeyValue(LoginCredentials, "ZipCode", "Valid-ZipCode"));
		logger.info("User has enter the zipcode");
		
		cover.scroll();
		logger.info("User has scroll");
		
		cover.buildingVacantOption();
		logger.info("User has select the building option");
		
		cover.structureDemolition();
		logger.info("User has select the demolition");
		
		vacantbuilding.nextButton();
		logger.info("User has select the frame and timber option");
		
		cover.frameTimberClick();
	
	
		cover.fuscSore();
		logger.info("User has select the fus score");
		cover.totolInsuredValue(ExcelUtilityLib.getKeyValue(LoginCredentials, "totalinsuredvalue", "Valid-totalinsuredvalue"));
		logger.info("User has enter the total insured value");
		
		cover.caValue();
		logger.info("User has select the ca value");
		
		cover.buildingAge();
		logger.info("User has select the building age");
		
		//cover.yesoption();
		cover.allRiskValue();
		logger.info("User has select the all the risk value");
		
		vacantbuilding.nextButton();
		logger.info("User has select the next button");
		
		cover.insuranceOption();
		logger.info("User has select the insurance option");
		
		cover.lossValue();
		logger.info("User has select the loss value");
		
		cover.mortageOrLoan();
		logger.info("User has select the mortage or loan");
		
		vacantbuilding.nextButton();
		logger.info("User has select the next button");
		
		cover.generalLiabilityCover();
		logger.info("User has select the general liability cover");
		
		cover.scroll();
		logger.info("User has scroll");
		
		cover.zeroClaim();
		logger.info("User has select the zero claim");
		
		cover.limitRequired();
		logger.info("User has select the limit required value");
		
		cover.deductableRequired();
		logger.info("User has select the deductable required value");
		
		cover.getQuote();
		logger.info("User has select the get the quote button");
		
		cover.confirmCheckbox();
		logger.info("User has select the confirm checkbox");
		
		cover.proceed();
		logger.info("User has select the proceed");
		
		cover.verifyGrossAmount();
		logger.info("User has verify the gross amount");
		
		cover.highLightElement();
		WaitStatementLib.threadSleepOfFourSec();

	}


}
