package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.AnnuityRate;
import com.JKUat.modules.schemeSetup.NewScheme;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnuityRatesTest extends BaseClass {

//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//    @Test(priority = 0)
//    public void login() throws Exception {
//        log.info("=========logging in user ================");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("user63", "S@lpha123");
//        log.info("=============successfully logged in===========");
//
//    }

    @Test(priority = 0)
    public void createAnewAnnuityRate() throws Exception {
        AnnuityRate ar = new AnnuityRate(driver);
        Thread.sleep(2000);
        //main menu
//        driver.findElement(By.xpath("//*[@id=\"ext-gen77\"]")).click();
//        Thread.sleep(2000);
//        ar.clickOnSchemeSetup();
//        Thread.sleep(3000);
        ar.clickOnActuarialFactors();
        Thread.sleep(2000);
        ar.clickOnAnnuityRates();
        Thread.sleep(2000);
        ar.clickOnNewAnnuity();
        Thread.sleep(2000);
        ar.enterAge("60");
        Thread.sleep(2000);
        ar.enterRateWithSpouse("60");
        Thread.sleep(2000);
        ar.enterRateWithoutSpouse("50");
        Thread.sleep(2000);
        ar.enterGender("FEMALE");
        Thread.sleep(2000);
        ar.enterBeneficiaryPenAlloc("1000");
        Thread.sleep(2000);
        ar.enterPensionEscFactor("45");
        Thread.sleep(2000);
        ar.enterAnnuityBracket("10 Years");
        Thread.sleep(2000);
        ar.clickSave();
        Thread.sleep(1000);
        driver.navigate().refresh();
    }
}
