package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeathProcessing extends BaseClass {

	public static final Logger log = Logger.getLogger(DeathProcessing.class.getName());

	public WebDriver driver;

	@FindBy(name = "sponsorMNameField")
    WebElement sponsorNames;

	@FindBy(name = "mMemberNo")
    WebElement memberNumber;
	
	@FindBy(name = "mMemberNo2")
    WebElement memberNumbers;

	@FindBy(linkText = "Death Processing")
    WebElement deathProcessingButton;

	@FindBy(name = "ben.natureOfDeath")
    WebElement natureOfDeath;

	@FindBy(name = "ben.actualCauseOfDeath")
    WebElement actualCauseOfDeath;

	@FindBy(name = "ben.dateOfEJKUatt")
    WebElement dateDeceased;

	@FindBy(name = "ben.dateOfCalculation")
    WebElement dateOfCalculation;

	@FindBy(xpath = "//*[@id=\"ext-comp-2008\"]")
    WebElement deceasedWhileOnDuty;

	@FindBy(name = "ben.deathCertNo")
    WebElement deathCertNumber;

	@FindBy(name = "ben.comments")
    WebElement remarks;

	@FindBy(xpath= "//*[@id=\"ext-comp-2011\"]")
    WebElement reasonForEJKUatt;

	@FindBy(xpath = "//*[@id=\"ext-comp-2012\"]")
    WebElement currencyUsed;

	@FindBy(xpath = "//*[@id=\"ext-comp-2017\"]")
    WebElement PayMonthlyPensionToBeneficiaries;

	@FindBy(xpath = "//*[@id=\"ext-comp-2020\"]")
    WebElement DeathGratuityCalculationMode;

	@FindBy(xpath = "//*[@id=\"ext-comp-2021\"]")
    WebElement PayBenefitsTo;

	@FindBy(xpath = "//button[contains(.,'Benefits Calculation')]")
    WebElement BenefitsCalculation;

	@FindBy(xpath = "//span[contains(.,'Show Benefits Calculation')]")
    WebElement showBCalculation;

	@FindBy(name = "ben.member")
    WebElement memberName;

	@FindBy(name = "ben.membershipId")
    WebElement memberNumber2;

	@FindBy(name = "ben.dateOfEJKUatt")
    WebElement dateOfEJKUatt;

	@FindBy(name = "ben.ageAtEJKUatt")
    WebElement getAgeAtEJKUatt;

	@FindBy(name = "ben.yearsWorked2")
    WebElement getYearsWorked;

	@FindBy(name = "ben.eeBal")
    WebElement getEE;

	@FindBy(name = "ben.eeTot")
    WebElement getER;

	@FindBy(name = "ben.avc")
    WebElement getAVC;

	@FindBy(name = "ben.avcer")
    WebElement getAVCER;

	@FindBy(name = "ben.eeTot")
    WebElement getEETotal;

	@FindBy(name = "ben.erTot")
    WebElement getERTotal;

	@FindBy(name = "ben.totBen")
    WebElement getTotalBenefits;

	@FindBy(name = "ben.deferred")
    WebElement getDeferedAmount;

	@FindBy(name = "payment.regTot")
    WebElement getLumpsumAmount;

	@FindBy(name = "payment.lumpsumTaxFree")
    WebElement getTaxExemptAmount;

	@FindBy(name = "payment.regTaxable")
    WebElement getTAxableAmount;

	@FindBy(name = "payment.regTax")
    WebElement getWitholdingTax;

	@FindBy(name = "payment.regNet")
    WebElement getNetLumpsum;

	@FindBy(name = "ben.taxBandUsed")
    WebElement getTaxBandUsed;

	@FindBy(name = "payment.netBefLiability")
    WebElement getNetbeforeliabilities;

	@FindBy(name = "ben.totLiabilities")
    WebElement getTotalLiabilities;

	@FindBy(name = "payment.netPay")
    WebElement getNetPay;

	@FindBy(name = "ben.purchasePrice")
    WebElement getPurchasePrice;

	@FindBy(name = "ben.annualSal")
    WebElement getAnnualPensionSalary;

	@FindBy(name = "ben.monthlySalary")
    WebElement getMonthlyPensionSalary;

	
	public DeathProcessing(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void clickOnBenefitsCalculation() {
		BenefitsCalculation.click();
		log.info("click on sign in and object is:-" + BenefitsCalculation.toString());
	}

	public void showBenefitsCalculation() {
		showBCalculation.click();
		log.info("click on sign in and object is:-" + showBCalculation.toString());

	}

	public void enterSponsorName(String name) {

		sponsorNames.sendKeys(name, Keys.ENTER);

	}

	public void enterMemberNumber(String number) {

		memberNumber.sendKeys(number, Keys.ENTER);

	}


	public void clickDeathProcessing() {

		deathProcessingButton.click();

	}

	public void enterNatureOfDeath(String nature) {

		natureOfDeath.sendKeys(nature, Keys.ENTER);

	}

	public void entercauseOfDeath(String cause) {

		actualCauseOfDeath.sendKeys(cause, Keys.ENTER);

	}

	public void enterdateDeceased(String date) {

		dateDeceased.sendKeys(date, Keys.ENTER);

	}

	public void enterdateOfCalculation(String date) {

		dateOfCalculation.sendKeys(date, Keys.ENTER);

	}

	public void DeceasedWhileOnDuty(String option) {

		deceasedWhileOnDuty.sendKeys(option, Keys.ENTER);

	}

	public void DeathCertNo(String dNumber) {

		deathCertNumber.sendKeys(dNumber, Keys.ENTER);

	}

	public void enterRemarks(String comment) {

		remarks.sendKeys(comment, Keys.ENTER);

	}

	public void enterReasonForEJKUatt(String reason) {

		reasonForEJKUatt.sendKeys(reason, Keys.ENTER);

	}

	public void enterCurrency(String currency) {

		currencyUsed.sendKeys(currency, Keys.ENTER);

	}

	public void enterpayTobenefeciary(String option) {

		PayMonthlyPensionToBeneficiaries.sendKeys(option, Keys.ENTER);

	}

	public void entercalculationMode(String reason) {

		DeathGratuityCalculationMode.sendKeys(reason, Keys.ENTER);

	}

	public void enterpayTo(String option) {

		PayBenefitsTo.sendKeys(option, Keys.ENTER);

	}
	
	public void enterMemberNumbers (String number) {
		memberNumbers.sendKeys(number,Keys.ENTER );
	}
	

	public void writeToFile() throws Exception {

		String idForTxtFile = memberName.getAttribute("value");
		new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
		// Create File In F: Driver.
		String TestFile = "C:\\JKUat Benefits Calculations\\" + idForTxtFile + "Benefits Calculations " + ".txt";
		File FC = new File(TestFile);// Created object of java File class.
		FC.createNewFile();// Create file.

		// Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);

		BW.write(">>>>>>Member Details<<<<<<<<<<");
		BW.newLine();
		BW.write("Member Name :" + memberName.getAttribute("value"));
		BW.newLine();// To write next string on new line.
		BW.write("Member Number :" + memberNumber2.getAttribute("value"));
		BW.newLine();
		BW.write("date Of EJKUatt :" + dateOfEJKUatt.getAttribute("value"));
		BW.newLine();
		BW.write("date Of Calculation :" + dateOfCalculation.getAttribute("value"));
		BW.newLine();

		BW.write("Age at EJKUatt :" + getAgeAtEJKUatt.getAttribute("value"));
		BW.newLine();
		BW.write("Service Period:" + getYearsWorked.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>>Opening Balances<<<<<<<<<<");
		BW.newLine();

		BW.write("EE:" + getEE.getAttribute("value"));
		BW.newLine();
		BW.write("ER:" + getER.getAttribute("value"));
		BW.newLine();
		BW.write("AVC:" + getAVC.getAttribute("value"));
		BW.newLine();
		BW.write("AVCER:" + getAVCER.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Current Year Contributions <<<<<<<<<<");
		BW.newLine();

		BW.write("Defered Amount:" + getDeferedAmount.getAttribute("value"));
		BW.newLine();
		BW.write("EE total:" + getEETotal.getAttribute("value"));
		BW.newLine();
		BW.write("ER total:" + getERTotal.getAttribute("value"));
		BW.newLine();
		BW.write("Total Benefits:" + getTotalBenefits.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Registered tax Calculation <<<<<<<<<<");
		BW.newLine();

		BW.write("Lumpsum Amount :" + getLumpsumAmount.getAttribute("value"));
		BW.newLine();
		BW.write("Net lumpsum:" + getNetLumpsum.getAttribute("value"));
		BW.newLine();
		BW.write("Taxable Amount:" + getTAxableAmount.getAttribute("value"));
		BW.newLine();
		BW.write("Tax Band Used:" + getTaxBandUsed.getAttribute("value"));
		BW.newLine();
		BW.write("Tax Exempt amount :" + getTaxExemptAmount.getAttribute("value"));
		BW.newLine();
		BW.write("Witholdinhg Tax Amount :" + getWitholdingTax.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Amount Payable <<<<<<<<<<");
		BW.newLine();

		BW.write("Net before liabilities:" + getNetbeforeliabilities.getAttribute("value"));
		BW.newLine();
		BW.write("Total liabilities:" + getTotalLiabilities.getAttribute("value"));
		BW.newLine();
		BW.write("Net Payment:" + getNetPay.getAttribute("value"));
		BW.newLine();

		BW.close();

		// Reading from file.
		// Create Object of java FileReader and BufferedReader class.
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";

		// Loop to read all lines one by one from file and print It.
		while ((Content = BR.readLine()) != null) {
			System.out.println(Content);

		}

	}

	public void log(String data) {
		log.info(data);
		Reporter.log(data);
	}

}