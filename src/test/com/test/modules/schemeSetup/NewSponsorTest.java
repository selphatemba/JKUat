package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.NewSponsor;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewSponsorTest extends BaseClass {

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }
    @Test(priority = 0)
    public void login()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        asd.enterloginUsername("selly1");
        Thread.sleep(3000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(3000);
        asd.clickSaveLogin();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void createASponsor()throws Exception{
        log.info("=======Started Creating a Sponsor========");
        NewSponsor ns=new NewSponsor(driver);
        Thread.sleep(3000);
        ns.clickOnMainMenu();
        Thread.sleep(3000);
        ns.clickOnSchemeSetup();
        Thread.sleep(3000);
        ns.clickOnScheme();
        Thread.sleep(3000);
        ns.hoverOverSponsor();
        Thread.sleep(3000);
        ns.clickSponsorList();
        Thread.sleep(3000);
        ns.clickNewSponsor();
        Thread.sleep(3000);
        ns.enterName("JKUAT TESTING SPONSOR3");
        Thread.sleep(3000);
        ns.enterApplicationDate("02/06/2019");
        Thread.sleep(3000);
        ns.enterTaxNumber("P021111911N");
        Thread.sleep(3000);
        ns.enterSector("Financial");
        Thread.sleep(3000);
        ns.clickgenerateclu();
        Thread.sleep(3000);
        ns.clickSave();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen395\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen227\"]")).click();
        Thread.sleep(3000);
        log.info("=====Completed creating a Sponsor=====");
    }
}
