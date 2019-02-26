package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.RunBalances;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunBalancesTest extends BaseClass {

//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//
//    @Test(priority = 0)
//    public void switchScheme()throws Exception {
//        ChangeUserPassword asd = new ChangeUserPassword(driver);
//        Thread.sleep(3000);
//        asd.enterloginUsername("selly1");
//        Thread.sleep(3000);
//        asd.enterloginPasswd("S@lpha123");
//        Thread.sleep(3000);
//        asd.clickSaveLogin();
//    }

    @Test(priority = 0)
    public void runBalances()throws Exception{
        log.info("started running balances");
        RunBalances rb=new RunBalances(driver);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1467\"]/tbody/tr[2]/td[2]/em")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen93\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen118\"]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1829\"]/tbody/tr[2]/td[2]/em")).click();
        Thread.sleep(3000);
        rb.hoverIncomeAllocationUsingInterestRate();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1834\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1925\"]")).sendKeys("Provisional", Keys.ENTER,Keys.TAB);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1932\"]")).sendKeys("Bad   Good - 0017",Keys.TAB);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen236\"]")).click();
        Thread.sleep(3000);
//        rb.hoverIncomeAllocationUsingInterestRate();
//        Thread.sleep(3000);
//        rb.clickIndividualRun();
//        Thread.sleep(3000);
//        rb.enterInterestRateType("");
//        Thread.sleep(3000);
//        rb.enterMemberNumber("0001");
//        Thread.sleep(3000);
//        rb.clickFinancialRegister();
//        Thread.sleep(3000);
//        rb.clickPeriodEndProcess();
        log.info("completed running balances");

    }


}
