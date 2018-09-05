package com.JKUat.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ProcessPayment extends BaseClass {

    public static final Logger log = Logger.getLogger(ProcessPayment.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[1]")
    WebElement accounts;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement accountsPayable;

    @FindBy(linkText = "Payables Register")
    WebElement payablesRegister;

    @FindBy(xpath = "//*[@id=\"ext-gen110-gp-posted-Yes-bd\"]/div")
    WebElement selectPayable;

    @FindBy(xpath = "//*[@id=\"ext-gen171\"]")
    WebElement posting;

    @FindBy(xpath = "//*[@id=\"ext-comp-1211\"]")
    WebElement post;

    @FindBy(xpath = "//*[@id=\"ext-gen296\"]")
    WebElement yes;

    @FindBy(xpath = "//*[@id=\"ext-gen294\"]")
    WebElement okBox;

    @FindBy(xpath = "//*[@id=\"ext-gen175\"]")
    WebElement processPayment;

    public ProcessPayment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openAccountsModule(){
        accounts.click();
    }

    public  void clickOnAccountsPayable(){
        accountsPayable.click();
    }

    public void clickOnPayablesRegister(){
        payablesRegister.click();
    }

    public void selectAPayable(){selectPayable.click();}

    public void clickOnPosting(){posting.click();}

    public void clickOnPost(){post.click();}

    public void clickOnYes(){
        yes.click();
    }

    public void clickOkBox(){okBox.click();}

    public void clickOnPayment(){processPayment.click();}
}
