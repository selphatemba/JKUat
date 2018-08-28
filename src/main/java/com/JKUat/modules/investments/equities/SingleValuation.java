package com.JKUat.modules.investments.equities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SingleValuation extends BaseClass {


    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement equities;

    @FindBy(linkText = "Companies")
    WebElement companies;

    @FindBy(name = "companyNameField")
    WebElement searchCompany;

    @FindBy(xpath = "//*[@id=\"ext-gen106-gp-sector-Insurance-bd\"]/div")
    WebElement selectAcompany;

    @FindBy(xpath = "//*[@id=\"ext-gen145\"]")
    WebElement valuation;

    @FindBy(linkText = "Single Valuation")
    WebElement singleValuation;

    @FindBy(name = "price.actualPrice")
    WebElement equityPrice;

    @FindBy(xpath = "//*[@id=\"ext-gen253\"]")
    WebElement save;


    public SingleValuation(WebDriver driver) {
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

    public void searchACompany(String comp){
        searchCompany.sendKeys(comp,Keys.ENTER);
    }

    public void selectCompany(){
        selectAcompany.click();}

    public void selectValuation(){
        valuation.click();}

    public void selectSingleValuation(){
        singleValuation.click();}


    public void enterEquityPrice(String equityPrc){
        equityPrice.sendKeys(equityPrc,Keys.ENTER);}

    public void clickSave(){
        save.click();
    }


    }
