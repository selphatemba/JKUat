package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.SponsorApproval;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SponsorApprovalTest extends BaseClass {


//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//    @Test(priority = 0)
//    public void switchScheme()throws Exception {
//        ChangeUserPassword asd = new ChangeUserPassword(driver);
//        Thread.sleep(3000);
//        asd.enterloginUsername("selly1");
//        Thread.sleep(3000);
//        asd.enterloginPasswd("S@lpha123");
//        Thread.sleep(3000);
//        asd.clickSaveLogin();
//        Thread.sleep(3000);
//    }
    @Test(priority = 1)
    public void createASponsor()throws Exception{
        log.info("=======Started Creating a Sponsor========");
        SponsorApproval sa=new SponsorApproval(driver);
        Thread.sleep(3000);
//        sa.clickOnMainMenu();
//        Thread.sleep(3000);
//        sa.clickOnSchemeSetup();
//        Thread.sleep(3000);
        sa.clickOnScheme();
        Thread.sleep(3000);
        sa.hoverOverSponsor();
        Thread.sleep(3000);
        sa.clickSponsorApproval();
        Thread.sleep(3000);
        sa.enterSponsorName("JKUAT TESTING SPONSOR3");
        Thread.sleep(3000);
        sa.selectASponsor();
        Thread.sleep(3000);
        sa.clickApprove();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen395\"]")).click();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen62\"]")).click();
        Thread.sleep(3000);
    }

}
