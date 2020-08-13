package com.testbroker.scripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.testbroker.generic.BaseLib;
import com.testbroker.pageobject.AegisLodonPage;
import com.testbroker.pageobject.BuildingCoverPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AegisLodonTest extends BaseLib {

public class VacantBuildingTest extends BaseLib {
	static final String LoginCredentials = "LoginCredentials_Sheet";
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify when user is able to login with correct username and passowrd")
	@Story("Story Name: To check login page functionality")
	public void verifyOfficeLocation() throws InterruptedException, IOException, IllegalStateException, InvalidFormatException{
		logger.info("URL is opened");
		AegisLodonPage aiges= new AegisLodonPage(driver);
		//BuildingCoverPage cover= new BuildingCoverPage(driver);
		aiges.contactUs();
		aiges.enquiryLink();
		aiges.officeLocation();
		aiges.MediaContacts();
		//aiges.complaintLink();
}
}
}