package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.NewSponsor;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewSponsorTest extends BaseClass {

//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//    @Test(priority = 0)
//    public void login()throws Exception {
//        ChangeUserPassword asd = new ChangeUserPassword(driver);
//        Thread.sleep(2000);
//        asd.enterloginUsername("user50");
//        Thread.sleep(1000);
//        asd.enterloginPasswd("S@lpha123");
//        Thread.sleep(1000);
//        asd.clickSaveLogin();
//        Thread.sleep(1000);
//    }
    @Test(priority = 0)
    public void createASponsor()throws Exception{
        log.info("=======Started Creating a Sponsor========");
        NewSponsor ns=new NewSponsor(driver);
        Thread.sleep(2000);
//        ns.clickOnMainMenu();
//        Thread.sleep(2000);
        ns.clickOnSchemeSetup();
        Thread.sleep(2000);
        ns.clickOnScheme();
        Thread.sleep(2000);
        ns.hoverOverSponsor();
        Thread.sleep(2000);
        ns.clickSponsorList();
        Thread.sleep(2000);
        ns.clickNewSponsor();
        Thread.sleep(2000);
        ns.enterName("SCHEME SCHEMA SPONSOR11");
        Thread.sleep(2000);
        ns.enterApplicationDate("12/31/2014");
        Thread.sleep(2000);
        ns.enterTaxNumber("P021111911N");
        Thread.sleep(2000);
        ns.enterSector("Financial");
        Thread.sleep(2000);
        ns.clickgenerateclu();
        Thread.sleep(2000);
        ns.clickSave();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"ext-gen395\"]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"ext-gen227\"]")).click();
//        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        log.info("=====Completed creating a Sponsor=====");
    }
}
