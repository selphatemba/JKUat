package com.JKUat.modules.investments.bondsNsecurities;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.investments.equities.NewCompany;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewDebt extends BaseClass {


    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen46\"]")
    WebElement bondsNsecurities;

    @FindBy(linkText = "Issued Debts")
    WebElement issuedDebts;

    @FindBy(xpath = "//*[@id=\"ext-gen135\"]")
    WebElement operations;


    @FindBy(linkText = "Single")
    WebElement single;

    @FindBy(name = "debt.refCode")
    WebElement ISIN;

    @FindBy(name = "debt.name")
    WebElement debtName;

    @FindBy(xpath = "//*[@id=\"ext-comp-1227\"]")
    WebElement issuer;

    @FindBy(xpath = "//*[@id=\"ext-comp-1228\"]")
    WebElement type;

    @FindBy(name = "debt.dealDate")
    WebElement issueDate;

    @FindBy(name = "timePeriod")
    WebElement tenure;
    @FindBy(xpath = "//*[@id=\"timeUnit_Cb\"]")
    WebElement timeUnit;

    @FindBy(name = "debt.couponRate")
    WebElement couponRate;

    @FindBy(name = "debt.interestStartDate")
    WebElement interestStartDate;

    @FindBy(xpath = "//*[@id=\"ext-comp-1231\"]")
    WebElement interesrType;

    @FindBy(xpath = "//*[@id=\"interestfreq-govt\"]")
    WebElement interestFrequency;

    @FindBy(name = "debt.daysInAyear")
    WebElement daysInAYear;

    @FindBy(xpath = "//*[@id=\"ext-comp-1233\"]")
    WebElement locality;

    @FindBy(xpath = "//*[@id=\"ext-comp-1234\"]")
    WebElement currency;

    @FindBy(xpath = "//*[@id=\"ext-gen267\"]")
    WebElement save;


    public NewDebt(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule() {
        investment.click();
    }

    public void clickOnBondNsecurities() {
        bondsNsecurities.click();
    }

    public void clickOnIssuedDebts() {
        issuedDebts.click();
    }

    public void clickOnOperations() {
        operations.click();
    }

    public void clickOnSingle() {
        single.click();
    }

    public void enterISIN(String is) {
        ISIN.sendKeys(is, Keys.ENTER);
    }

    public void enterDebtName(String dn){
        debtName.sendKeys(dn,Keys.ENTER);
    }

    public void  enterIssuer(String iss){
        issuer.sendKeys(iss,Keys.ENTER);
    }

    public void  enterType(String ty){
        type.sendKeys(ty,Keys.ENTER);
    }

    public void  enterIssueDate(String isd){
        issueDate.sendKeys(isd,Keys.ENTER);
    }

    public void  enterTenure(String tn){
        tenure.sendKeys(tn,Keys.ENTER);
    }

    public void enterTimeUnit(String tu){
        timeUnit.sendKeys(tu,Keys.ENTER);
    }

    public void  enterCouponRate(String cpr){
        couponRate.sendKeys(cpr,Keys.ENTER);
    }

    public void  enterInterestStartDate(String isd){
        interestStartDate.sendKeys(isd,Keys.ENTER);
    }

    public void  enterInterestType(String itt){
        interesrType.sendKeys(itt,Keys.ENTER);
    }
    public void  enterInterestFrequency(String ifr){
        interestFrequency.sendKeys(ifr,Keys.ENTER);
    }

    public void  enterDaysInAYr(String diy){
        daysInAYear.sendKeys(diy,Keys.ENTER);
    }

    public void  enterLocality(String loc){
        locality.sendKeys(loc,Keys.ENTER);
    }

    public void  enterCurrency(String cur){
        currency.sendKeys(cur,Keys.ENTER);
    }

    public void clickSave(){
        save.click();
    }

}
