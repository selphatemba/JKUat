package com.JKUat.modules.investments.equities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SingleTransactionAcquisition extends BaseClass {

    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement equities;

    @FindBy(linkText = "Companies")
    WebElement companies;

    @FindBy(name = "companyCodeField")
    WebElement code;

    @FindBy(xpath = "//*[@id=\"ext-gen106-gp-sector-Insurance-bd\"]/div")
    WebElement selectCompany;

    @FindBy(xpath = "//*[@id=\"ext-gen141\"]")
    WebElement acquisitions;

    @FindBy(linkText = "Single Transaction")
    WebElement singleTransaction;

    @FindBy(xpath = "//*[@id=\"ext-comp-1263\"]")
    WebElement locality;

    @FindBy(name = "transaction.settlementDate")
    WebElement settlementDate;

    @FindBy(name = "transaction.dealDate")
    WebElement dealDate;

    @FindBy(name = "transaction.pricePerShare")
    WebElement pricePerShare;

    @FindBy(name ="transaction.sharesBought")
    WebElement noOfSharesBought;

    @FindBy(xpath = "//*[@id=\"equity-currencyId\"]")
    WebElement currency;

    @FindBy(xpath = "//*[@id=\"ext-comp-1270\"]")
    WebElement fundManager;


    @FindBy(xpath = "//*[@id=\"ext-gen265\"]")
    WebElement save;

    public SingleTransactionAcquisition(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule(){
        investment.click();
    }

    public void clickOnEquities(){
        equities.click();
    }

    public void clickOnCompanies(){
        companies.click();
    }

    public void enterCompanyCode(String companyCode){
        code.sendKeys(companyCode, Keys.ENTER);
    }
    public void selectAcompany(){
        selectCompany.click();
    }
    public void clickOnAcquisitions(){
        acquisitions.click();
    }
    public void selectSingleTransaction(){
        singleTransaction.click();
    }
    public void enterLocality(String loc){
        locality.sendKeys(loc,Keys.ENTER);
    }

    public void enterSettlementDate(String setDate){
        settlementDate.sendKeys(setDate,Keys.ENTER);
    }
    public void enterDealDate(String dealDa){
        dealDate.sendKeys(dealDa,Keys.ENTER);
    }

    public void enterPricePerShare(String pps){
        pricePerShare.sendKeys(pps,Keys.ENTER);
    }

    public void enterNoOfSharesBought(String nosb){
        noOfSharesBought.sendKeys(nosb,Keys.ENTER);
    }

    public void enterCurrency(String cur){
        currency.sendKeys(cur,Keys.ENTER);
    }

    public void enterFundManager(String fm){
        fundManager.sendKeys(fm,Keys.ENTER);
    }


    public void clickSave(){
        save.click();
    }

}
