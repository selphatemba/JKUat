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

	@FindBy(xpath = "//*[@id=\"ext-comp-1758\"]")
	WebElement payment;

	@FindBy(xpath = "//*[@id=\"ext-gen333\"]")
	WebElement yes;



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



}
