package com.JKUat.modules.memberModule.reasonsForEJKUatt;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EarlyRetirement extends BaseClass {

    public static final Logger log = Logger.getLogger(IllHealth.class.getName());
    public WebDriver driver;

    @FindBy(name = "mMemberNo")
    WebElement memberNumber;
    @FindBy(name = "ben.comments")
    WebElement remarks;
    @FindBy(linkText = "Initiate Movement")
    WebElement initiateMovement;
    @FindBy(name = "ben.dateOfEJKUatt")
    WebElement dateOfEJKUatt;
    @FindBy(name = "ben.dateOfCalculation")
    WebElement dateOfCalculation;
    @FindBy(xpath = "//*[@id=\"ext-comp-2007\"]")
    WebElement currency;
    @FindBy(xpath = "//*[@id=\"ext-comp-2013\"]")
    WebElement reasonForEJKUatt;


    public EarlyRetirement(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public  void searchForMember(String mNumber) throws Exception{
        memberNumber.sendKeys(mNumber, Keys.ENTER);
    }
    public  void ClickOnInitiateMovement() throws Exception{
        initiateMovement.click();
    }
    public  void enterDateOfEJKUatt(String dte) throws Exception{
        dateOfEJKUatt.sendKeys(dte, Keys.ENTER);
    }
    public  void enterDateOfCalculation(String dt) throws Exception{
        dateOfCalculation.sendKeys(dt,Keys.ENTER);
    }
    public  void enterReasonForEJKUatt(String reason) throws Exception{
        reasonForEJKUatt.sendKeys(reason, Keys.ENTER);
    }
    public  void enterCurrency(String curr) throws Exception{
        currency.sendKeys(curr, Keys.ENTER);
    }

    public  void enterRemarks(String rmk) throws Exception{
        remarks.sendKeys(rmk, Keys.ENTER);
    }

}
