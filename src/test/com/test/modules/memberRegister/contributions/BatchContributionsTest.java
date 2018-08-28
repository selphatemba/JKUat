package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;

import com.JKUat.modules.memberModule.contributions.BatchContributions;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BatchContributionsTest extends BaseClass {


    @Test(priority = 0)
    public void openMemberPage()throws Exception{
        log.info("==============logging in user====================");
        LoginPageTest loginPageTest=new LoginPageTest();
        loginPageTest.loginUser();
        log.info("==============user successfully logged in===========");
    }



    @Test(priority = 1)
    public void doBatchContributions()throws Exception{
        BatchContributions bc = new BatchContributions(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(3000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(3000);
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
        bc.enterSponsorname("BANK OF UGANDA");
        Thread.sleep(3000);
        bc.enterCostCentre("BANK OF UGANDA");
        Thread.sleep(3000);
        bc.enterYear("2018");
        Thread.sleep(3000);
        bc.enterMonth("February");
        Thread.sleep(3000);
        driver.findElement(By.name("batch.chequeAmount")).sendKeys("2000000");
        Thread.sleep(3000);
        driver.findElement(By.id("ext-gen394")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("batchSchedule")).sendKeys("/home/selpha/JKUat templates/contribution_upload.xls");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen496\"]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"ext-gen643\"]/div/table/tbody/tr/td[1]/div/div")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"ext-gen349\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ext-gen348")).click();
        driver.navigate().refresh();
         log.info("finished Batch Contributions");

    }
}
