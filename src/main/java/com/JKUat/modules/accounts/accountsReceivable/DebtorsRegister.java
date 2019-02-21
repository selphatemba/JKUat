package com.JKUat.modules.accounts.accountsReceivable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class DebtorsRegister extends BaseClass {

    public static final Logger log = Logger.getLogger(DebtorsRegister.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[1]")
    WebElement accounts;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement accountsReceivable;

    @FindBy(linkText = "Debtors Register")
    WebElement debtorRegister;

    @FindBy(xpath = "//*[@id=\"ext-gen126\"]")
    WebElement newDebtor;

    @FindBy(name = "creditorDebtor.name")
    WebElement name;

    @FindBy(name = "creditorDebtor.code")
    WebElement code;

    @FindBy(xpath = "//*[@id=\"ext-comp-1183\"]")
    WebElement creditorType;

    @FindBy(name = "creditorDebtor.address.cellPhone")
    WebElement cellPhone;

    @FindBy(name = "creditorDebtor.address.country")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"ext-gen180\"]")
    WebElement save;

    public DebtorsRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openAccountsModule(){
        accounts.click();
    }

    public void clickAccountsReceivable(){accountsReceivable.click();}

    public void clickDebtorRegister(){debtorRegister.click();}

    public void clickNewDebtor(){newDebtor.click();}

    public void enterName(String nm){name.sendKeys(nm, Keys.ENTER);}

    public void enterCode(String cod){code.sendKeys(cod,Keys.ENTER);}

    public void enterCreditorType(String crT){creditorType.sendKeys(crT,Keys.ENTER);}

    public void enterCellPhone(String cp){cellPhone.sendKeys(cp,Keys.ENTER);}

    public void enterCountry(String coun){country.sendKeys(coun,Keys.ENTER);}

    public void clickSave(){save.click();}
}
