package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.InterestRate;
import com.JKUat.modules.schemeSetup.NewScheme;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InterestRateTest extends BaseClass {
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
    public void createAnewInterestType() throws Exception {

            InterestRate ir = new InterestRate(driver);
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"ext-gen77\"]")).click();
//            Thread.sleep(2000);
//            ir.clickOnSchemeSetup();
            Thread.sleep(2000);

            for(int x=0;x<2;x++) {
            ir.clickOnOtherSetup();
            Thread.sleep(2000);
            ir.clickOnInterestRates();
            Thread.sleep(2000);
            ir.clickOnNewInterestRate();
            Thread.sleep(2000);
            ir.enterDateDeclared("03/11/2000");
            Thread.sleep(1000);
            ir.enterPeriod("Jan 1, 2019 - Dec 31, 2019");
            Thread.sleep(1000);
            ir.enterContr("12");
            Thread.sleep(1000);
            ir.enterOpeningBal("12");
            Thread.sleep(1000);
            ir.enterPensionDrawdown("0");
            Thread.sleep(1000);
            ir.enterInterestRateType("Provisional");
            Thread.sleep(1000);
            if(x==0){
            ir.enterRegUnre("Registered");
            }else{
                ir.enterRegUnre("Un Registered");
            }
            Thread.sleep(1000);
            ir.clickSave();
            Thread.sleep(3000);
            driver.navigate().refresh();
        }
    }
}
