package com.JKUat.modules.investments.equities;

import com.JKUat.base.BaseClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewCompany extends BaseClass {
    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement equities;

    @FindBy(linkText = "Companies")
    WebElement companies;

    @FindBy(xpath = "//*[@id=\"ext-gen125\"]")
    WebElement newCompany;

    @FindBy(name = "listedCompany.name")
    WebElement companyName;

    @FindBy(name = "listedCompany.code")
    WebElement ISIN;

    @FindBy(xpath = "//*[@id=\"ext-comp-1235\"]")
    WebElement sector;

    @FindBy(xpath = "//*[@id=\"ext-comp-1236\"]")
    WebElement category;

    @FindBy(xpath = "//*[@id=\"ext-comp-1237\"]")
    WebElement equityType;

    @FindBy(xpath = "//*[@id=\"ext-gen240\"]")
    WebElement save;



    public NewCompany(WebDriver driver) {
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

    public void createAnewCompany(){
        newCompany.click();
    }
    public void captureCompanyName(String name){
        companyName.sendKeys(name,Keys.ENTER);
    }
    public void captureISIN(String isin){
        ISIN.sendKeys(isin,Keys.ENTER);
    }
    public void captureSector(String sctr){
        sector.sendKeys(sctr,Keys.ENTER);
    }
    public void enterCategory(String cat){
        category.sendKeys(cat,Keys.ENTER);
    }
    public void enterEquityType(String eqtype){
        equityType.sendKeys(eqtype,Keys.ENTER);
    }
    public void clickOnSave(){
        save.click();
    }
}
