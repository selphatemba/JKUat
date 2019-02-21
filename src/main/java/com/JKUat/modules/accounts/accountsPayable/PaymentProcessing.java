package com.JKUat.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PaymentProcessing extends BaseClass {

    public static final Logger log = Logger.getLogger(PaymentProcessing.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[1]")
    WebElement accounts;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement accountsPayable;

    @FindBy(linkText = "Payables Register")
    WebElement payablesRegister;

    @FindBy(name = "creditorField")
    WebElement creditor;

    @FindBy(xpath = "//*[@id=\"ext-gen167\"]")
    WebElement filter;

    @FindBy(xpath = "//*[@id=\"ext-gen110-gp-posted-Yes-bd\"]/div")
    WebElement searchcreditor;

    @FindBy(xpath = "//*[@id=\"ext-gen175\"]")
    WebElement processPayment;

    @FindBy(name = "payment.particulars")
    WebElement particulars;


    @FindBy(xpath = "//*[@id=\"ext-comp-1259\"]")
    WebElement cashBook;

    @FindBy(name = "payment.controlAmount")
    WebElement controlPayment;

    @FindBy(xpath = "//*[@id=\"ext-comp-1262\"]")
    WebElement paymentMode;

    @FindBy(xpath = "payment.chequeNo")
    WebElement refNo;

    @FindBy(xpath = "//*[@id=\"ext-comp-1268\"]")
    WebElement currency;

    public PaymentProcessing(WebDriver driver) {
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

    public void searchCreditor(String cr){creditor.sendKeys(cr,Keys.ENTER);}

    public void clickFilter(){filter.click();}

    public void selectAcreditor(){searchcreditor.click();}

    public void clickProcessPayment(){processPayment.click();}

    public void enterParticulars(String par){particulars.sendKeys(par,Keys.ENTER);}

    public void enterCashBook(String cb){cashBook.sendKeys(cb,Keys.ENTER);}

    public void enterControlPayment(String cnP){controlPayment.sendKeys(cnP,Keys.ENTER);}

    public void enterPaymentMode(String pm){paymentMode.sendKeys(pm,Keys.ENTER);}

    public void enterRefNo(String ref){refNo.sendKeys(ref,Keys.ENTER);}

    public void enterCurrency(String cur){currency.sendKeys(cur,Keys.ENTER);}
}
