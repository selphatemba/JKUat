package com.JKUat.modules.memberModule.claimActivities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.logging.Logger;

public class ClaimActivities extends BaseClass {

	public static final Logger log = Logger.getLogger(ClaimActivities.class.getName());

	public WebDriver driver;


	@FindBy(xpath = "//*[@id=\"memReg\"]/img")
    WebElement sponsorRegister;

	@FindBy(xpath = "//*[@id=\"ext-comp-2001\"]")
    WebElement maritalStatus;

	@FindBy(xpath="//*[@id=\"ext-comp-2012\"]")
    WebElement phoneNumber;

	@FindBy(xpath = "//*[@id=\"mMemberNo\"]")
    WebElement MemberNumber;

	@FindBy(xpath = "//*[@id=\"mMemberNo2\"]")
    WebElement MemberNumber2;

	@FindBy(xpath = "//input[@id='eMemberName']")
    WebElement memName;

	@FindBy(xpath = "//button[contains(.,'Benefits Calculation')]")
    WebElement BenefitsCalculation;

	@FindBy(xpath = "//a[contains(.,'Initiate Movement')]")
    WebElement initiateMovement;

	@FindBy(xpath = "//span[contains(.,'Show Benefits Calculation')]")
    WebElement showBCalculation;

	@FindBy(name = "sponsorMNameField")
    WebElement enterSponsorName;

	@FindBy(linkText = "View Members")
    WebElement clickViewMembers;

	@FindBy(name = "mMemberNo")
    WebElement enterSponsorNumber;

	@FindBy(name = "members.datesConfirmed")
    WebElement confirmDates;

    @FindBy(name = "ben.comments")
    WebElement remarks;

	@FindBy(xpath = "//input[@name='ben.dateOfEJKUatt']")
    WebElement enterDateOfEJKUatt;

	@FindBy(xpath = "//input[contains(@name,'ben.dateOfCalculation')]")
    WebElement enterDateOfCalculation;

	@FindBy(xpath = "//*[@id=\"ext-comp-2007\"]")
    WebElement enterCurrencyUsed;

	@FindBy(xpath = "//*[@id=\"ext-comp-2013\"]")
    WebElement reasonsForEJKUatt;

	public ClaimActivities(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void clearPhoneNumber(){
		phoneNumber.clear();

	}

	public void enterDateOfEJKUatt(String date) {

		enterDateOfEJKUatt.sendKeys(date, Keys.TAB);

	}

	public void enterDateOfCalculation(String date) {

		enterDateOfCalculation.sendKeys(date, Keys.TAB);

	}


	public  void enterRemarks(String rmk) throws Exception{
		remarks.sendKeys(rmk, Keys.ENTER);
	}

	public void enterCurrencyUsed(String currency) {

		enterCurrencyUsed.sendKeys(currency, Keys.ENTER);

	}

	public void reasonsForEJKUatt(String reason) {

		reasonsForEJKUatt.sendKeys(reason, Keys.ENTER);

	}

	public void clickYes() {
		confirmDates.click();

	}

	public void viewMembers() {

		clickViewMembers.click();

	}

	public void entersponsorNumber(String number) {

		enterSponsorNumber.sendKeys(number);

	}

	public void enterMaritalStatus (String status) throws InterruptedException {

		maritalStatus.sendKeys(status, Keys.ENTER);
		
	}


	public void enterSponsorName(String name) {
		enterSponsorName.sendKeys(name, Keys.ENTER);

	}

	public void enterMemberNumber(String memberNumber) throws InterruptedException {
		MemberNumber.sendKeys(memberNumber, Keys.ENTER);

	}
	public void enterMemberNumber2(String memberNumber) throws InterruptedException {
		MemberNumber2.sendKeys(memberNumber, Keys.ENTER);

	}
	
	
	

	public void enterMembername(String memberName) throws InterruptedException {
		memName.sendKeys(memberName, Keys.ENTER);

	}

	public void clickOninitiateMovement() throws InterruptedException {
		initiateMovement.click();
	}

	public void clickOnBenefitsCalculation() {
		BenefitsCalculation.click();
		log.info("click on sign in and object is:-" + BenefitsCalculation.toString());
	}

	public void showBenefitsCalculation() {
		showBCalculation.click();
		log.info("click on sign in and object is:-" + showBCalculation.toString());

	}

	public void clickSponsorsRegister() {
		sponsorRegister.click();

	}

	public void log(String data) {
		log.info(data);
		Reporter.log(data);
	}
}
