package com.JKUat.modules.investments.equities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewStockBroker extends BaseClass {

    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement equities;

    @FindBy(linkText = "Stock Brokers")
    WebElement stockBroker;

    @FindBy(xpath = "//*[@id=\"ext-gen119\"]")
    WebElement newStockBroker;

    @FindBy(name = "stockBroker.name")
    WebElement name;

    @FindBy(name = "stockBroker.description")
    WebElement description;

    @FindBy(xpath = "//*[@id=\"ext-gen169\"]")
    WebElement save;


    public NewStockBroker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule(){
        investment.click();
    }

    public void clickOnEquities(){
        equities.click();
    }

    public void clickOnStockBroker(){
        stockBroker.click();
    }

    public void clickOnNewStockBroker(){
        newStockBroker.click();
    }

    public void enterName(String nm){
        name.sendKeys(nm,Keys.ENTER);
    }

    public void enterdescription(String desc){
        description.sendKeys(desc,Keys.ENTER);
    }

    public void clickOnSave(){
        save.click();
    }

}
