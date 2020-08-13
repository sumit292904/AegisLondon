package com.testbroker.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class DofeShoppingPage {

	@FindBy(xpath = "(//ul[@class='menu']//a[text()='DofE Shopping'])[2]")
	private WebElement dofeShopping;

	@FindBy(xpath = "(//ul[@class='menu']//a[text()='DofE Clothing'])[2]")
	private WebElement dofeClothing;

	// scroll
	@FindBy(xpath = "//div[@class='btn_group align_c']//a[text()='SHOP DOFE CLOTHING']")
	private WebElement shopDofeClothing;

	// scroll
	@FindBy(xpath = "(//button[text()='Shop Now'])[1]")
	private WebElement shopNow;

	// scroll
	@FindBy(xpath = "(//div[@class='main']//div[@class='description'])[1]")
	private WebElement buy;

	// scroll
	@FindBy(xpath = "//div[@class='terms']//input[@type='checkbox']")
	private WebElement agreeCheckbox;

	@FindBy(xpath = "//button[@id='addToBasket']")
	private WebElement addToBasket;
	@FindBy(xpath = "//a[text()='Go to Basket']")
	private WebElement gotothebasket;
	WebDriver driver;

	public  DofeShoppingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Step("1.Click on Dofe Shopping step....")
	public void dofeShoppingClick() throws InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();

		dofeShopping.click();

	}

	@Step("2.Click on Dofe Clothing step....")
	public void dofeClothingClick() throws InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();

		dofeClothing.click();

	}

	@Step("3.Click on Shop Dofe Shopping step....")
	public void shopDofeClothingClick() throws InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();
		//WaitStatementLib.threadSleepOfEightSec();
		Actions actions = new Actions(driver);

		actions.moveToElement(shopDofeClothing);

		actions.perform();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", shopDofeClothing);
		shopDofeClothing.click();
	}

	@Step("4.Click on Shop Now step....")
	public void shopNowClick() throws InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();
		//WaitStatementLib.threadSleepOfEightSec();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", shopNow);

		shopNow.click();
	}

	@Step("5.Click on Buy step....")
	public void buyClick() throws InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();
		//WaitStatementLib.threadSleepOfEightSec();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", buy);

		buy.click();
	}
	
	@Step("6.Click on Agree Checkbox step....")
	public void agreeCheckboxClick() throws InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();
		//WaitStatementLib.threadSleepOfEightSec();

		agreeCheckbox.click();
	}
	
	@Step("7.Click on Add To Basket step....")
	public void addToBasketClick() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
		WaitStatementLib.threadSleepOfEightSec();

		addToBasket.click();
		gotothebasket.click();
	}
}
