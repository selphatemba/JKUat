package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class processTransfer extends BaseClass {

	public static final Logger log = Logger.getLogger(processTransfer.class.getName());

	public WebDriver driver;

	@FindBy(linkText = "Process Tranfer")
    WebElement processTransfer;

	@FindBy(name = "mMemberNo2")
    WebElement memNumber;

	@FindBy(linkText = "Movement Processing")
    WebElement movementProcessing;

	@FindBy(xpath = "//button[contains(.,'Benefits Calculation')]")
    WebElement benefitsCalculation;

	@FindBy(id = "ext-comp-1964")
    WebElement internalTransferYes;
	
	@FindBy(id = "ext-comp-1966")
    WebElement internalTransferNo;
	

	@FindBy(name = "ben.members")
    WebElement memberName;

	@FindBy(name = "eJKUattCat")
    WebElement eJKUattcartegory;

	@FindBy(name = "ben.membershipId")
    WebElement memberNumber;

	@FindBy(name = "ben.dateOfEJKUatt")
    WebElement dateOfEJKUatt;

	@FindBy(name = "ben.dateOfCalculation")
    WebElement dateOfCalculation;

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

	@FindBy(name = "ben.ee")
    WebElement getEETotal;

	@FindBy(name = "ben.er")
    WebElement getERTotal;

	@FindBy(name = "ben.avc")
    WebElement getAvc;

	@FindBy(name = "ben.unregTaxOnOpeningBalance")
    WebElement getUnregTaxOpeningBalance;

	@FindBy(name = "ben.eeTot")
    WebElement getTotalEE;

	@FindBy(name = "ben.erTot")
    WebElement getTotalEr;

	@FindBy(name = "ben.totBen")
    WebElement getTotalbenefits;

	@FindBy(name = "payment.regTot")
    WebElement getLumpsumAmount;

	@FindBy(name = "payment.lumpsumTaxFree")
    WebElement getLumpsumTaxFree;

	@FindBy(name = "payment.regTaxable")
    WebElement getTaxableAmount;

	@FindBy(name = "payment.regTax")
    WebElement getWithholdingTax;
	//
	@FindBy(name = "payment.regNet")
    WebElement getNetLumpsum;
	//
	@FindBy(name = "payment.unregTot")
    WebElement getUnregLumpsumAmount;

	@FindBy(name = "payment.unregTaxable")
    WebElement getUnregTaxableAmount;
	//
	@FindBy(name = "payment.unregTax")
    WebElement getUnregWithholdingTax;
	//
	@FindBy(name = "payment.unregNet")
    WebElement getUnregNetLumpsum;
	//
	@FindBy(name = "payment.netBefLiability")
    WebElement getNetBeforeLiabilities;

	@FindBy(name = "ben.totLiabilities")
    WebElement getTotalLiabilities;
	
	@FindBy(name = "payment.netPay")
    WebElement getNetPayment;
	
	@FindBy(name = "ben.purchasePrice")
    WebElement getPurchasePrice;
	
	@FindBy(name = "ben.annualSal")
    WebElement getAnnualPension;
	
	@FindBy(name = "ben.monthlySalary")
    WebElement getMonthlyPension;
	
	@FindBy(name = "payment.amountTransfered")
    WebElement getAmountTransfered;
	
	@FindBy(name = "payment.eeRefund")
    WebElement getRefundAmount;

	public processTransfer(WebDriver driver) {
		this.driver = driver;
//		 BaseClass testBase = new BaseClass();
		 
		PageFactory.initElements(driver, this);
	}

	public void clickinternalTransferYes() {
		 
		internalTransferYes.click();

	}
	
	public void clickinternalTransferNo() {
		 
		internalTransferNo.click();

	}

	public void clickOnprocessTransfer() {

		processTransfer.click();

	}

	public void enterMemberNumber(String number) {

		memNumber.sendKeys(number, Keys.ENTER);

	}

	public void clickOnMvmntProcessing() {
		movementProcessing.click();

	}

	public void clickOnBenefitsCalc() {
		benefitsCalculation.click();
	}
	
	public void writeToFile() throws Exception {

		String idForTxtFile = memberName.getAttribute("value");
		new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
		// Create File In F: Driver.
		String TestFile = "F:\\JKUat Benefits Calculations\\" + idForTxtFile + "Benefits Calculations " + ".txt";
		File FC = new File(TestFile);// Created object of java File class.
		FC.createNewFile();// Create file.

		// Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);

		BW.write(">>>>>>Member Details<<<<<<<<<<");
		BW.newLine();
		BW.write("Member Name :" + memberName.getAttribute("value"));
		BW.newLine();// To write next string on new line.
		BW.write("Member Number :" + memberNumber.getAttribute("value"));
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

		BW.write("UnregTaxOpeningBalance" + getUnregTaxOpeningBalance.getAttribute("value"));
		BW.newLine();
		BW.write("EE total:" + getEETotal.getAttribute("value"));
		BW.newLine();
		BW.write("ER total:" + getERTotal.getAttribute("value"));
		BW.newLine();
		BW.write("Avc" + getAvc.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Totals(Opening Balances - Less Tax + Contributions + Interest) <<<<<<<<<<");
		BW.newLine();

		BW.write("Total EE :" + getTotalEE.getAttribute("value"));
		BW.newLine();
		BW.write("Total Er :" + getTotalEr.getAttribute("value"));
		BW.newLine();
		BW.write("Total Benefits :" + getTotalbenefits.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Tax Calculation (Registered) <<<<<<<<<<");
		BW.newLine();
		BW.write("Lumpsum amount :" + getLumpsumAmount.getAttribute("value"));
		BW.newLine();
		BW.write("lumpsum Tax Free:" + getLumpsumTaxFree.getAttribute("value"));
		BW.newLine();
		BW.write("Taxable Amount:" + getTaxableAmount.getAttribute("value"));
		BW.newLine();
		BW.write("WithHolding Tax" + getWithholdingTax.getAttribute("value"));
		BW.newLine();
		BW.write("Net Lumpsum:" + getNetLumpsum.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Tax Calculation (UnRegistered) <<<<<<<<<<");
		BW.newLine();
		BW.write(" Lumpsum amount :" + getUnregLumpsumAmount.getAttribute("value"));
		BW.newLine();
		BW.write("Taxable Amount:" + getUnregTaxableAmount.getAttribute("value"));
		BW.newLine();
		BW.write("WithHolding Tax" + getUnregWithholdingTax.getAttribute("value"));
		BW.newLine();
		BW.write("Net Lumpsum:" + getNetLumpsum.getAttribute("value"));
		BW.newLine();

		BW.write(">>>>>> Amount Payable <<<<<<<<<<");
		BW.newLine();
		BW.write("Net Befaore Liabilities Is:" + getNetBeforeLiabilities.getAttribute("value"));
		BW.newLine();
		BW.write("Total Liabilities Is:" + getTotalLiabilities.getAttribute("value"));
		BW.newLine();
		BW.write("Net Payment Is:" + getNetPayment.getAttribute("value"));
		BW.newLine();
		
		BW.write(">>>>>> Pension Details <<<<<<<<<<");
		BW.newLine();
		BW.write("Purchase price Is:" + getPurchasePrice.getAttribute("value"));
		BW.newLine();
		BW.write("Annual Pension Is:" + getAnnualPension.getAttribute("value"));
		BW.newLine();
		BW.write("Monthly Pension Is:" + getMonthlyPension.getAttribute("value"));
		BW.newLine();
		BW.write("Amount Transfered Is:" + getAmountTransfered.getAttribute("value"));
		BW.newLine();
		BW.write("Refund Is:" + getRefundAmount.getAttribute("value"));
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

}
