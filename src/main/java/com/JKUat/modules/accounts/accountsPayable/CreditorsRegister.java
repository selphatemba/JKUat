package com.JKUat.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class CreditorsRegister extends BaseClass {

    public static final Logger log = Logger.getLogger(CreditorsRegister.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[1]")
    WebElement accounts;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement accountsReceivable;

    @FindBy(linkText = "Debtors Register")
    WebElement debtorRegister;

    @FindBy(xpath = "//*[@id=\"ext-gen139\"]")
    WebElement newDebtor;

    @FindBy(name = "creditorDebtor.name")
    WebElement name;

    @FindBy(xpath = "//*[@id=\"ext-comp-1183\"]")
    WebElement creditorType;

    @FindBy(name = "creditorDebtor.address.cellPhone")
    WebElement cellPhone;

    @FindBy(name = "creditorDebtor.address.country")
    WebElement country;


    public CreditorsRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openAccountsModule(){
        accounts.click();
    }
    public  void clickOnAccountsReceivable(){
        accountsReceivable.click();
    }
    public void clickOndebtorRegister(){
        debtorRegister.click();
    }
    public void clickOnNewDebtor(){
        newDebtor.click();
    }
}
