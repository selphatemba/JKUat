package com.JKUat.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class DirectPayments extends BaseClass {

    public static final Logger log = Logger.getLogger(NewPayable.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[1]")
    WebElement accounts;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement accountsPayable;

    @FindBy(linkText = "Direct Payments")
    WebElement directPayments;

    @FindBy(xpath = "//*[@id=\"ext-gen123\"]")
    WebElement newdp;

    @FindBy(linkText = "Single Direct Payment")
    WebElement singleDirectPayment;

    @FindBy(xpath = "//*[@id=\"ext-comp-1215\"]")
    WebElement paymentFor;

    @FindBy(name = "payment.date")
    WebElement date;

    @FindBy(name = "payment.particulars")
    WebElement particulars;

    @FindBy(name = "payment.regAmount")
    WebElement registeredAmount;

    @FindBy(name = "payment.unRegAmount")
    WebElement unreg;

    @FindBy(xpath = "//*[@id=\"ext-comp-1221\"]")
    WebElement bankAcc;

    @FindBy(xpath = "//*[@id=\"ext-comp-1224\"]")
    WebElement creditor;

    @FindBy(xpath = "//*[@id=\"ext-comp-1225\"]")
    WebElement paymentMode;

    @FindBy(name = "payment.chequeNo")
    WebElement refNo;

    @FindBy(xpath = "//*[@id=\"ext-comp-1227\"]")
    WebElement currency;

    @FindBy(xpath = "//*[@id=\"ext-gen259\"]")
    WebElement addPaymentLine;

    @FindBy(name = "paymentLine.particulars")
    WebElement parti;

    @FindBy(xpath = "//*[@id=\"ext-comp-1270\"]")
    WebElement expenseAcc;

    @FindBy(name = "paymentLine.scValue")
    WebElement amount;

    @FindBy(xpath = "//*[@id=\"ext-comp-1290\"]")
    WebElement amtInclusiveofTax;

    @FindBy(xpath = "//*[@id=\"ext-gen397\"]")
    WebElement add;

    @FindBy(xpath = "//*[@id=\"ext-gen215\"]")
    WebElement save;

    public DirectPayments(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openAccountsModule(){
        accounts.click();
    }

    public  void clickOnAccountsPayable(){
        accountsPayable.click();
    }

    public void clickOnDirectPayments(){directPayments.click();}

    public void clicknewdp(){newdp.click();}

    public void enterSingleDirectP(){singleDirectPayment.click();}

    public void enterPaymentFor(String pf){paymentFor.sendKeys(pf,Keys.ENTER);}

    public void enterDate(String dt){date.sendKeys(dt,Keys.ENTER);}

    public void enterParticular(String par){particulars.sendKeys(par,Keys.ENTER);}

    public void enterRegisteredAmt(String regAmt){registeredAmount.sendKeys(regAmt,Keys.ENTER);}

    public void enterUnReg(String reg){unreg.sendKeys(reg,Keys.ENTER);}

    public void enterBankAcc(String bnkAcc){bankAcc.sendKeys(bnkAcc,Keys.ENTER);}

    public void enterCreditor(String cr){creditor.sendKeys(cr,Keys.ENTER);}

    public void enterPaymentMode(String pm){paymentMode.sendKeys(pm,Keys.ENTER);}

    public void enterRefNo(String ref){refNo.sendKeys(ref,Keys.ENTER);}

    public void enterCurrency(String cur){currency.sendKeys(cur,Keys.ENTER);}

    public void clickAddPaymentLine(){addPaymentLine.click();}

    public void enterPaymentLineParticular(String p){parti.sendKeys(p,Keys.ENTER);}

    public void enterExpenseAcc(String expAc){expenseAcc.sendKeys(expAc,Keys.ENTER);}

    public void enterAmount(String am){amount.sendKeys(am,Keys.ENTER,Keys.ENTER,Keys.ENTER);}

    public void isAmtIsInclusiveOfTax(){amtInclusiveofTax.click();}

    public void clickAdd(){add.click();}

    public void clickSave(){save.click();}
}
