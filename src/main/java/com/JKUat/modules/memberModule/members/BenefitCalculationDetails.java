package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BenefitCalculationDetails extends BaseClass {
	public static final Logger log = Logger.getLogger(BenefitCalculationDetails.class.getName());

	public WebDriver driver;

	@FindBy(name = "ben.member")
    WebElement memberName;

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

	@FindBy(name = "ben.avcer")
    WebElement getUnregTax;


//	Current Year  Contributions

	@FindBy(name = "ben.ee")
    WebElement getEETotal;

	@FindBy(name = "ben.er")
    WebElement getERTotal;

	@FindBy(name = "ben.avc")
    WebElement getAvc;

	@FindBy(name = "ben.avcer")
    WebElement getAvcEr;

//	Totals

	@FindBy(name = "ben.unregTaxOnOpeningBalance")
    WebElement getUnregTaxOpeningBalance;

	@FindBy(name = "ben.eeTot")
    WebElement getTotalEE;

	@FindBy(name = "ben.erTot")
    WebElement getTotalEr;

	@FindBy(name = "ben.totBen")
    WebElement getTotalbenefits;


//	Totals Reg
	@FindBy(name = "payment.regTot")
WebElement getLumpsumAmount;

	@FindBy(name = "payment.lumpsumTaxFree")
    WebElement getLumpsumTaxFree;

	@FindBy(name = "payment.regTaxable")
    WebElement getTaxableAmount;


	@FindBy(name = "payment.regTax")
    WebElement getWithHoldingTax;

	@FindBy(name = "payment.lumpsumTaxFree")
    WebElement getnetLumpsum;

	@FindBy(name = "payment.regTaxable")
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


	public BenefitCalculationDetails(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}



	public void writeToFile() throws Exception {

		String idForTxtFile = memberName.getAttribute("value");
		new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
		// Create File In F: Driver.
		String TestFile = "C:\\JKUat Benefits Calculations\\" + idForTxtFile +"3"+ "Benefits Calculations " + ".txt";
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
		BW.write("UnregTaxOpeningBalance" + getUnregTaxOpeningBalance.getAttribute("value"));
		BW.newLine();


		BW.write(">>>>>> Current Year Contributions <<<<<<<<<<");
		BW.newLine();
		BW.write("EE :" + getEETotal.getAttribute("value"));
		BW.newLine();
		BW.write("ER :" + getERTotal.getAttribute("value"));
		BW.newLine();
		BW.write("Avc" + getAvc.getAttribute("value"));
		BW.newLine();
		BW.write("AvcEr" + getAvcEr.getAttribute("value"));
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
		BW.write("Net before liabilities:" + getNetbeforeliabilities.getAttribute("value"));
		BW.newLine();
		BW.write("WithHolding Tax" + getTotalLiabilities.getAttribute("value"));
		BW.newLine();
		BW.write("Net Lumpsum:" + getNetPay.getAttribute("value"));
		BW.newLine();
		BW.write("Purchase Price:" + getPurchasePrice.getAttribute("value"));
		BW.newLine();
		BW.write("annual pension is:" + getAnnualPensionSalary.getAttribute("value"));
		BW.newLine();
		BW.write("monthly pension is:" + getMonthlyPensionSalary.getAttribute("value"));
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
