package com.test.modules.investments.bondsNSecurities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.bondsNsecurities.IssuedDebtApproval;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IssuedDebtApprovalTest extends BaseClass {

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

    @Test(priority = 2)
    public void approveIssuedDebt()throws Exception{
        IssuedDebtApproval ida=new IssuedDebtApproval(driver);
        log.info("===========started approval of issued debt=======");
        ida.openInvestmentModule();
        Thread.sleep(5000);
        ida.clickOnBondNsecurities();
        Thread.sleep(3000);
        ida.clickOnIssuedDebts();
        Thread.sleep(3000);
        ida.setEnterSecurityName("Corporate Bond1");
        Thread.sleep(3000);
        ida.selectDebtSecurity();
        Thread.sleep(3000);
        ida.clickOnAcquisition();
        Thread.sleep(3000);
        ida.clickOnBatchAcquisition();
        Thread.sleep(3000);
        ida.browseForIssuedDebts("/home/selpha/Xi templates/Investment Module/Debts Acquistions-new template.xls");
        Thread.sleep(3000);
        ida.clickUpload();
        Thread.sleep(3000);
        ida.clickSave();
        Thread.sleep(3000);
        log.info("===========Completed approval of issued debt=======");
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
