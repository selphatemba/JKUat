package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class InterestRate extends BaseClass {
    public static final Logger log = Logger.getLogger(InterestRate.class.getName());

    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement otherSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen87\"]")
    WebElement interestRates;

    @FindBy(xpath = "//*[@id=\"ext-gen151\"]")
    WebElement newInterestRate;

    @FindBy(name = "rate.dateDeclared")
    WebElement dateDeclared;

    @FindBy(xpath = "//*[@id=\"ext-comp-1181\"]")
    WebElement period;

    @FindBy(name = "rate.contributions")
    WebElement contributions;

    @FindBy(name = "rate.openingBalances")
    WebElement openingBalances;

    @FindBy(name = "rate.pensionDrawDown")
    WebElement pensionDrawdown;

    @FindBy(xpath = "//*[@id=\"ext-comp-1186\"]")
    WebElement interestRateType;

    @FindBy(xpath = "//*[@id=\"ext-comp-1187\"]")
    WebElement regUnreg;

    @FindBy(xpath = "//*[@id=\"ext-gen208\"]")
    WebElement save;


    public InterestRate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSchemeSetup(){
        schemeSetup.click();
    }

    public void clickOnOtherSetup(){
        otherSetup.click();
    }
    public void clickOnInterestRates(){
        interestRates.click();
    }

    public void clickOnNewInterestRate(){
        newInterestRate.click();
    }

    public void enterDateDeclared(String datedclr){
        dateDeclared.clear();
        dateDeclared.sendKeys(datedclr, Keys.TAB);
    }
    public void enterPeriod(String per){
        period.sendKeys(per,Keys.TAB);
    }
    public void enterContr(String cntr){
        contributions.sendKeys(cntr,Keys.TAB);
    }

    public void enterOpeningBal(String openBal){
        openingBalances.sendKeys(openBal,Keys.TAB);
    }
    public void enterPensionDrawdown(String pend){
        pensionDrawdown.sendKeys(pend,Keys.TAB);
    }
    public void enterInterestRateType(String irt){
        interestRateType.sendKeys(irt,Keys.TAB);
    }

    public void enterRegUnre(String runr){
        regUnreg.sendKeys(runr,Keys.TAB);
    }

    public void clickSave(){
        save.click();
    }
}
