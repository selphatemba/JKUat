package com.JKUat.modules.investments.deposits;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewCashCallDeposit extends BaseClass {
    public static final Logger log = Logger.getLogger(NewCashCallDeposit.class.getName());

    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen50\"]")
    WebElement deposit;

    @FindBy(linkText = "View List")
    WebElement viewList;

    @FindBy(xpath = "//*[@id=\"ext-gen132\"]")
    WebElement operations;

    @FindBy(linkText = "New Cash & Call")
    WebElement newCashCall;

    @FindBy(name = "callDeposit.name")
    WebElement investmentName;

    @FindBy(xpath = "//*[@id=\"ext-comp-1235\"]")
    WebElement issuer;

    @FindBy(name = "callDeposit.intrestRate")
    WebElement interestRate;

    @FindBy(name = "callDeposit.interestStartDate")
    WebElement interestStartDate;

    @FindBy(xpath = "//*[@id=\"ext-comp-1240\"]")
    WebElement interestType;

    @FindBy(name = "callDeposit.initialValue")
    WebElement principal;

    @FindBy(xpath = "//*[@id=\"ext-comp-1247\"]")
    WebElement interestFrequency;

    @FindBy(name = "callDeposit.daysInAyear")
    WebElement daysInAYr;

    @FindBy(xpath = "//*[@id=\"ext-comp-1250\"]")
    WebElement locality;

    @FindBy(xpath = "//*[@id=\"ext-comp-1251\"]")
    WebElement currency;

    @FindBy(xpath = "//*[@id=\"ext-comp-1252\"]")
    WebElement fundManager;

    @FindBy(xpath = "//*[@id=\"ext-gen271\"]")
    WebElement save;

    public NewCashCallDeposit(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule() {
        investment.click();
    }

    public void clickOnDeposit(){
        deposit.click();
    }

    public void clickOnViewList(){
        viewList.click();
    }

    public void selectOptions(){
        operations.click();
    }
    public void clickOnNewCashCall(){
        newCashCall.click();
    }

    public void enterInvestmentName(String invN){
        investmentName.sendKeys(invN);
    }

    public void enterIssuer(String iss){
        issuer.sendKeys(iss);
    }

    public void enterInterestRate(String ir){
        interestRate.sendKeys(ir);
    }

    public void enterInterestStartDate(String isd){
        interestStartDate.sendKeys(isd);
    }

    public void enterInterestType(String it){
        interestType.sendKeys(it);
    }

    public void enterPrinciple(String pr){
        principal.sendKeys(pr);
    }

    public void enterInterestFrequency(String inf){
        interestFrequency.sendKeys(inf);
    }

    public void enterDaysInAYr(String dIy){
        daysInAYr.sendKeys(dIy);
    }

    public void enterLocality(String loc){
        locality.sendKeys(loc);
    }

    public void enterCurrency(String cur){
        currency.sendKeys(cur);
    }

    public void enterFundManager(String fm){
        fundManager.sendKeys(fm);
    }

    public void clickSave(){
        save.click();
    }
}
