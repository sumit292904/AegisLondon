//package com.testbroker.scripts;
//
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.testng.annotations.Test;
//
//import com.testbroker.generic.BaseLib;
//import com.testbroker.generic.ExcelUtilityLib;
//import com.testbroker.generic.WaitStatementLib;
//import com.testbroker.pageobject.BuildingCoverPage;
//import com.testbroker.pageobject.HomePage;
//import com.testbroker.pageobject.LoginPage;
//import com.testbroker.pageobject.VacantLandPage;
//import com.testbroker.pageobject.VacantLandPageNew;
//
//import io.qameta.allure.Description;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//
//public class VacantLandTestNew extends BaseLib {
//
//	static final String LoginCredentials = "LoginCredentials_Sheet";
//	@Test(priority=1)
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Test Case Description: To verify when user is able to login with correct username and passowrd")
//	@Story("Story Name: To check login page functionality")
//	public void vacantLandPremiumVerfification() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
//	
//      VacantLandPageNew land= new VacantLandPageNew(driver);
//      logger.info("URL is opened");
//      LoginPage lp = new LoginPage(driver);
//      lp.dashboardClick();
//      //lp.remindmeLater();
//      lp.usernameField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-UserEmail", "Valid-Email"));
//      logger.info("Entered username");
//      lp.passwordField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-UserPassword", "Valid-Password"));
//      logger.info("Entered password");
//      lp.LoginClick();
//      logger.info("User has clicked on login Button");
//      lp.authorizeButton();
//      logger.info("User has clicked on authorize Button");
//      HomePage home = new HomePage(driver);
//      home.getQuotesClick();
//      logger.info("User has clicked on get A Quotes Icon");
//      home.vacantIconClick();
//      logger.info("User has clicked on next Button");
//      
//      
//      land.vacantLandClick();
//      logger.info("User has clicked on vacant land icon");
//      
//      land.nextButton();
//      logger.info("User has clicked on next Button");
//      
//      
//      land.inceptionDate();
//      land.currentDate();
//      logger.info("User has clicked on inception date field");
//   
//      land.nextButton();
//      logger.info("User has clicked on next Button");
//
//
//      land.noButtonClick();
//      logger.info("User has clicked on no button");
//
//   
//      land.nextButton();
//      logger.info("User has clicked next button");
//      
//      land.fullName("James Smith");
//      logger.info("User has entered the fullname");
//      
//      land.addressField("Canada Way");
//      logger.info("User has enter the set mailing address");
//      
//      land.checkbox1();
//      logger.info("User has selected the checkbox");
//      
//      land.streetName("567");
//      logger.info("User has enter the street name");
//      
//      land.zipcode("V5G");
//      logger.info("User has enter the zip code");
//      
//      land.nextButton();
//      logger.info("User has clicked on next button");
//      
//     
//      land.checkbox2();
//      logger.info("User has select the checkbox");
//      land.usemailingAddress();
//      logger.info("User has select the use same mailing address");
//      
//      vacantbuilding.streetName(ExcelUtilityLib.getKeyValue(LoginCredentials, "StreetName", "Valid-streetname"));
//      logger.info("User has enter the street name");
//      vacantbuilding.zipcode(ExcelUtilityLib.getKeyValue(LoginCredentials, "ZipCode", "Valid-ZipCode"));
//      vacantbuilding.nextButton();
//      cover.insuranceOption();
//      vacantbuilding.nextButton();
//      land.smallLandCover();
//      land.landFence();
//      land.attractiveNuisance();
//      vacantbuilding.nextButton();
//      //cover.generalLiabilityCover();
//      logger.info("User has select the general liability cover");
//      cover.scroll();
//      logger.info("User has scroll");
//      cover.zeroClaim();
//      logger.info("User has select the zero claim");
//      cover.limitRequired();
//      logger.info("User has select the limit required value");
//      cover.deductableRequired();
//      logger.info("User has select the deductable required value");
//      cover.getQuote();
//      logger.info("User has select the get the quote button");
//      cover.confirmCheckbox();
//      logger.info("User has select the confirm checkbox");
//      cover.proceed();
//      logger.info("User has select the proceed");
//      cover.verifyGrossAmount();
//      logger.info("User has verify the gross amount");
//      cover.highLightElement();
//      WaitStatementLib.threadSleepOfSixSec();
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//      
//  }
//}
