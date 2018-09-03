package com.JKUat.modules.investments.otherSetups;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewExchangeRate extends BaseClass {

    public static final Logger log = Logger.getLogger(NewExchangeRate.class.getName());

    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen58\"]")
    WebElement otherSetups;

    @FindBy(linkText = "Forex Rates")
    WebElement forexRates;

    @FindBy(xpath = "//*[@id=\"ext-gen130\"]")
    WebElement newExchangeRate;

    @FindBy(xpath = "//*[@id=\"ext-comp-1197\"]")
    WebElement targetCurrency;

    @FindBy(name = "xrate.rate")
    WebElement xchangeRate;

    @FindBy(xpath = "//*[@id=\"ext-gen187\"]")
    WebElement set;



    public NewExchangeRate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule() {
        investment.click();
    }

    public void clickOtherSetups(){
        otherSetups.click();
    }
    public void clickForexRates(){
        forexRates.click();
    }

    public void clickNewExchangeRates(){
        newExchangeRate.click();
    }

    public void enterTargetCurrency(String tc){
        targetCurrency.sendKeys(tc);
    }

    public void enterXchangeRate(String xchangeRt){
        xchangeRate.sendKeys(xchangeRt);
    }

    public void setXchangeRate(){
        set.click();
    }

}
