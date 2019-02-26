package com.JKUat.modules.memberModule.claimActivities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaimPayments extends BaseClass {
	@FindBy(xpath = "//*[@id=\"ext-gen57\"]")
	WebElement claimAct;

	@FindBy(linkText = "Claim Payments")
    WebElement ClaimPayments;

	@FindBy(id = "memNoClaimPayment")
    WebElement memberNo;

	@FindBy(xpath = "//*[@id=\"ext-gen147-gp-exitCategory-Withdrawal-bd\"]/div")
	WebElement member;

	@FindBy(xpath = "//*[@id=\"ext-gen178\"]")
    WebElement processpayment;

	@FindBy(xpath = "//*[@id=\"ext-gen314\"]")
	WebElement payment;

	@FindBy(xpath = "//*[@id=\"ext-gen333\"]")
	WebElement yes;

	@FindBy(name = "ben.members")
    WebElement memberName;

	@FindBy(xpath = "//*[@id=\"ext-gen146-gp-eJKUattCategory-Withdrawal-bd\"]/div[1]/table/tbody/tr/td[4]/div")
    WebElement tableRow;
	
	@FindBy(name = "payment.gross")
    WebElement grossBenefits;

	@FindBy(name = "payment.regTot")
    WebElement totalRegistered;

	@FindBy(name = "payment.unregTot")
    WebElement totalUnregistered;

	@FindBy(name = "payment.lumpsumTaxFree")
    WebElement lumpSumTaxFree;

	@FindBy(name = "payment.lumpsum")
    WebElement lumpSum;
	
	@FindBy(name = "payment.regTax")
    WebElement registeredTax;

	@FindBy(name = "payment.unregTax")
    WebElement unregisteredTax;

	@FindBy(name = "payment.withHoldingTax")
    WebElement withholdingtax;

	@FindBy(name = "payment.netPayment")
    WebElement netPayment;

	@FindBy(name = "payment.regNet")
    WebElement registeredNet;

	@FindBy(name = "payment.regTaxable")
    WebElement taxableRegistered;

	@FindBy(name = "payment.unregTaxable")
    WebElement taxableUnregistered;

	@FindBy(name = "payment.unregNet")
    WebElement unregisteredNet;

	@FindBy(name = "payment.paymentDate")
    WebElement paymentDate;

	@FindBy(name = "payment.servicePeriod")
    WebElement servicePeriod;

	public ClaimPayments(WebDriver driver) {
		this.driver = driver;
		// BaseClass testBase = new BaseClass();
		PageFactory.initElements(driver, this);
	}
	public void clickClaimActivities(){
		claimAct.click();
	}

	public void clickOnClaimPayments() {

		ClaimPayments.click();

	}

	public void enterMemberNo(String memNo) {

		memberNo.sendKeys(memNo, Keys.ENTER);

	}
	public void selectAmember(){
		member.click();
	}

	public void clickOnProcessPayment() {

		processpayment.click();

	}
	public void clickOnPayment(){
		payment.click();
	}
	public void clickYes(){
		yes.click();
	}

	@SuppressWarnings("resource")
	public void getPaymentDetails() throws Exception {

		String idForTxtFile = tableRow.getText();
		new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
		// Create File In F: Driver.
		String TestFile = "C:\\Payment Details\\" + idForTxtFile + "PaymentDetails " + ".txt";
		File FC = new File(TestFile);// Created object of java File class.
		FC.createNewFile();// Create file.

		// Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("NewMember Name :" + tableRow.getText());
		BW.newLine();// To write next string on new line.
		BW.write("gross benefits are :" + grossBenefits.getAttribute("value"));
		BW.newLine();
		BW.write("total Registered Is :" + totalRegistered.getAttribute("value"));
		BW.newLine();
		BW.write("total Unregistered is:" + totalUnregistered.getAttribute("value"));
		BW.newLine();
		BW.write("lumpSum Tax Free:" + lumpSumTaxFree.getAttribute("value"));
		BW.newLine();
		BW.write("lumpSum :" + lumpSum.getAttribute("value"));
		BW.newLine();
		BW.write("registered Tax:" + registeredTax.getAttribute("value"));
		BW.newLine();
		BW.write("unregistered Tax:" + unregisteredTax.getAttribute("value"));
		BW.newLine();
		BW.write("withholding tax:" + withholdingtax.getAttribute("value"));
		BW.newLine();
		BW.write("net Payment:" + netPayment.getAttribute("value"));
		BW.newLine();
		BW.write("registered Net:" + registeredNet.getAttribute("value"));
		BW.newLine();
		BW.write("taxable Registered:" + taxableRegistered.getAttribute("value"));
		BW.newLine();
		BW.write("taxable Unregistered:" + taxableUnregistered.getAttribute("value"));
		BW.newLine();
		BW.write("unregistered Net :" + unregisteredNet.getAttribute("value"));
		BW.newLine();
		BW.write("payment Date:" + paymentDate.getAttribute("value"));
		BW.newLine();
		BW.write("service Period:" + servicePeriod.getAttribute("value"));
		BW.close();
 
		getScreenShots("PaymentDetails for " + tableRow.getText());
		
		// Reading from file.
		// Create Object of java FileReader and BufferedReader class.
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";

		// Loop to read all lines one by one from file and print It.
		while ((Content = BR.readLine()) != null) {
//			System.out.println(Content);

		}

	}

}
