package com.test.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.accounts.accountsPayable.NewPayable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewPayableTest extends BaseClass {


    @BeforeClass
    public void setUp() throws Exception {
        init();

    }


    @Test(priority = 0)
    public void login() throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        log.info("=============successfully logged in===========");
    }

    @Test(priority = 1)
    public void createAnewPayable() throws Exception {
        NewPayable np = new NewPayable(driver);
        log.info("==========started creating a new Payable============");
        np.openAccountsModule();
        Thread.sleep(5000);
        np.clickOnAccountsPayable();
        Thread.sleep(3000);
        np.clickOnPayablesRegister();
        Thread.sleep(3000);
        np.clickOnNew();
        Thread.sleep(3000);
        np.clickOnNewPayable();
        Thread.sleep(3000);
        np.enterCreditor("Good Samaritan");
        Thread.sleep(3000);
        np.enterParticulars("For supply of air");
        Thread.sleep(3000);
        np.enterTransactionDate("09/04/2018");
        Thread.sleep(3000);
        np.paymentCategory("Fees Payments");
        Thread.sleep(3000);
        np.enterInvoiceNumber("0000786");
        Thread.sleep(3000);
        np.enterInvoiceDate("09/04/2018");
        Thread.sleep(3000);
        np.enterAmountDue("2000000");
        Thread.sleep(3000);
        for(int i=0;i<2;i++) {
            np.addInvoiceLinea();
            Thread.sleep(3000);
            np.enterPartic("Payment For supply of air");
            Thread.sleep(3000);
            if(i==0){
                np.enterAcc("Liabilities->Other Payables->Other Payables - 200-25-140");Thread.sleep(5000);
            np.clickRadioButton();
            Thread.sleep(3000);
            np.enterAmount("2000000");
            Thread.sleep(3000);
            np.clickSave();
            Thread.sleep(3000);
            np.clickOkBox();}
            else{
                np.enterAcc1("Assets->KCB Current Account->KCB Current Account - 100-15-220");Thread.sleep(5000);
                np.clickRadioButton2();
                Thread.sleep(3000);
                np.enterAmount("2000000");
                Thread.sleep(3000);
                WebElement save=driver.findElement(By.xpath("//*[@id=\"ext-gen561\"]"));
                save.click();
                Thread.sleep(3000);
                WebElement okBox=driver.findElement(By.xpath("//*[@id=\"ext-gen434\"]"));
                okBox.click();
                Thread.sleep(3000);
            }
        }
        WebElement saveInvoice=driver.findElement(By.xpath("//*[@id=\"ext-gen298\"]"));
        saveInvoice.click();
        Thread.sleep(3000);
        log.info("==========Finished creating a new Payable============");

    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

