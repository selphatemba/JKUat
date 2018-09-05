package com.JKUat.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement accountsPayable;

    @FindBy(linkText = "Creditors Register")
    WebElement creditorRegister;

    @FindBy(xpath = "//*[@id=\"ext-gen123\"]")
    WebElement newCreditor;

    @FindBy(name = "creditorDebtor.name")
    WebElement name;

    @FindBy(xpath = "//*[@id=\"ext-comp-1185\"]")
    WebElement creditorType;

    @FindBy(name = "creditorDebtor.address.cellPhone")
    WebElement cellPhone;

    @FindBy(name = "creditorDebtor.address.country")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"ext-gen181\"]")
    WebElement save;


    public CreditorsRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openAccountsModule(){
        accounts.click();
    }
    public  void clickOnAccountsPayable(){
        accountsPayable.click();
    }
    public void clickOnCreditorRegister(){
        creditorRegister.click();
    }
    public void clickOnNewCreditor(){
        newCreditor.click();
    }

    public void enterName(String nm){
        name.sendKeys(nm,Keys.ENTER);
    }

    public void enterCreditorType(String cryt){
        creditorType.sendKeys(cryt, Keys.ENTER);
    }

    public void enterCellphone(String cell){
        cellPhone.sendKeys(cell,Keys.ENTER);
    }

    public void enterCountry(String con){
        country.sendKeys(con,Keys.ENTER);
    }

    public void clickSave(){
        save.click();
    }
}
