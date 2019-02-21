package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;

import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.contributions.BatchContributions;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BatchContributionsTest extends BaseClass {


    @BeforeClass
    public void setUp() throws Exception {
        init();

    }

    @Test(priority = 0)
    public void switchScheme()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        asd.enterloginUsername("selly1");
        Thread.sleep(3000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(3000);
        asd.clickSaveLogin();
    }



    @Test(priority = 1)
    public void doBatchContributions()throws Exception{
        BatchContributions bc = new BatchContributions(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(3000);
//        driver.findElement(By.id("membLnk")).click();
//        Thread.sleep(3000);
        driver.findElement(By.id("memReg")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ext-gen53")).click();
        Thread.sleep(3000);
        bc.clickOnBatchContributions();
        Thread.sleep(3000);
        bc.enterBatchTitle("New Contributions");
        Thread.sleep(3000);
        bc.enterBatchDate("03/06/2018");
        Thread.sleep(3000);
        bc.enterSponsorname("JKUAT TESTING SPONSOR2");
        Thread.sleep(3000);
        bc.enterCostCentre("JKUAT TESTING SPONSOR2 Cost Centre");
        Thread.sleep(3000);
        bc.enterYear("2019");
        Thread.sleep(3000);
        bc.enterMonth("February");
        Thread.sleep(3000);
        driver.findElement(By.name("batch.chequeAmount")).sendKeys("2000000");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen254\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\contribution_upload.xls");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen352\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen436\"]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen446\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ext-gen348")).click();
        driver.navigate().refresh();
         log.info("finished Batch Contributions");

    }
}
