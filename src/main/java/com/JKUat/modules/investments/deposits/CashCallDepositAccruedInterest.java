package com.JKUat.modules.investments.deposits;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.investments.equities.NewCompany;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class CashCallDepositAccruedInterest extends BaseClass {

    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen50\"]")
    WebElement deposit;

    @FindBy(linkText = "View List")
    WebElement viewList;

    @FindBy(name = "searchCashcallApprovedIssuerId")
    WebElement issuer;

    @FindBy(xpath = "//*[@id=\"ext-gen163\"]")
    WebElement filter;

    @FindBy(xpath = "//*[@id=\"ext-gen111-gp-issuer-CBA BANK-bd\"]/div[1]")
    WebElement selectIssuer;

    @FindBy(xpath = "//*[@id=\"ext-gen136\"]")
    WebElement accruedInterest;

    @FindBy(linkText = "Calculate")
    WebElement calculate;

    @FindBy(name = "date")
    WebElement asAt;

    @FindBy(xpath = "//*[@id=\"ext-gen264\"]")
    WebElement calculateInterest;


    public CashCallDepositAccruedInterest(WebDriver driver) {
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
    public void enterIssuer(String iss){
        issuer.sendKeys(iss, Keys.ENTER);
    }
    public void clickFilter(){
        filter.click();
    }
    public void selectAnIssuer(){
        selectIssuer.click();
    }
    public void clickAccruedInterest(){
        accruedInterest.click();
    }
    public void selectCalculate(){
        calculate.click();
    }
    public void enterAsAt(String asat){
        asAt.sendKeys(asat,Keys.ENTER);
    }

    public void calculateAccruedInterest(){
        calculateInterest.click();
    }
}
