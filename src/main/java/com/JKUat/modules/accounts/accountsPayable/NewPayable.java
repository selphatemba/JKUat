package com.JKUat.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewPayable extends BaseClass {
    public static final Logger log = Logger.getLogger(NewPayable.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[1]")
    WebElement accounts;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement accountsPayable;

    @FindBy(linkText = "Payables Register")
    WebElement payablesRegister;

    @FindBy(xpath = "//*[@id=\"ext-gen129\"]")
    WebElement newa;

    @FindBy(linkText = "New Payable")
    WebElement newPayable;

    @FindBy(id = "invoicedebtorid")
    WebElement creditor;

    @FindBy(name = "invoice.particulars")
    WebElement particulars;

    @FindBy(name = "invoice.date")
    WebElement transactionDate;

    @FindBy(xpath = "//*[@id=\"ext-comp-1257\"]")
    WebElement paymentCategory;

    @FindBy(name = "invoice.refInvoiceNo")
    WebElement invoiceNO;

    @FindBy(name = "invoice.refInvoiceDate")
    WebElement invoiceDate;

    @FindBy(name = "invoice.controlAmnt")
    WebElement amountDue;

    @FindBy(xpath = "//*[@id=\"ext-gen338\"]")
    WebElement addInvoiceLine;

    @FindBy(name = "invoiceLine.particulars")
    WebElement partic;

    @FindBy(xpath = "//*[@id=\"ext-comp-1286\"]")
    WebElement acc;

    @FindBy(xpath = "//*[@id=\"ext-comp-1306\"]")
    WebElement acc1;

    @FindBy(xpath = "//*[@id=\"ext-comp-1299\"]")
    WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"ext-comp-1321\"]")
    WebElement radioButton2;

    @FindBy(name = "invoiceLine.scValue")
    WebElement amnt;

    @FindBy(xpath = "//*[@id=\"ext-gen482\"]")
    WebElement save;

    @FindBy(xpath = "//*[@id=\"ext-gen434\"]")
    WebElement okBox;

    public NewPayable(WebDriver driver) {
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

    public void clickOnNew(){
        newa.click();
    }

    public void clickOnNewPayable(){
        newPayable.click();
    }

    public void enterCreditor(String cr){
        creditor.sendKeys(cr, Keys.ENTER);
    }

    public void enterParticulars(String par){
        particulars.sendKeys(par,Keys.ENTER);
    }

    public void enterTransactionDate(String transd){
        transactionDate.sendKeys(transd,Keys.ENTER);
    }

    public void paymentCategory(String paycat){
        paymentCategory.sendKeys(paycat,Keys.ENTER);
    }

    public void enterInvoiceNumber(String invNo){
        invoiceNO.sendKeys(invNo,Keys.ENTER);
    }

    public void enterInvoiceDate(String invd){
        invoiceDate.sendKeys(invd,Keys.ENTER);
    }

    public void enterAmountDue(String amtd){
        amountDue.clear();
        amountDue.sendKeys(amtd,Keys.ENTER);
    }

    public void addInvoiceLinea(){
        addInvoiceLine.click();
    }

    public void enterPartic(String part){
        partic.sendKeys(part,Keys.ENTER);
    }

    public  void enterAcc(String ac){
        acc.sendKeys(ac,Keys.ENTER,Keys.ENTER,Keys.ENTER);
    }

    public  void enterAcc1(String ac1){
        acc1.sendKeys(ac1,Keys.ENTER,Keys.ENTER,Keys.ENTER);
    }

    public void clickRadioButton(){
        radioButton.click();
    }

    public void clickRadioButton2(){radioButton2.click();}

    public void enterAmount(String am){
        amnt.sendKeys(am,Keys.ENTER);
    }

    public void clickSave(){
        save.click();
    }

    public void clickOkBox(){okBox.click();}


}
