package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.RunBalances;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunBalancesTest extends BaseClass {

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
    }

    @Test(priority = 1)
    public void runBalances()throws Exception{
        log.info("started running balances");
        RunBalances rb=new RunBalances(driver);
        Thread.sleep(2000);
        //member Register
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1467\"]/tbody/tr[2]/td[2]/em")).click();
        Thread.sleep(3000);
        //financial periods
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1469\"]")).click();
        Thread.sleep(3000);

        //select a financial period  //div[text()='Apr 3, 2017 - Apr 2, 2018'] //*[@id="ext-gen118"]/div[2] #ext-gen118 > div:nth-child(2)
        driver.findElement(By.xpath("//div[text()='Apr 3, 2017 - Apr 2, 2018']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen135\"]")).click();
        Thread.sleep(3000);
        rb.hoverIncomeAllocationUsingInterestRate();
        Thread.sleep(3000);
        rb.clickIndividualRun();
        Thread.sleep(3000);
        rb.enterInterestRateType("Provisional");
        Thread.sleep(3000);
        rb.enterMemberNumber("Bad   Good - 00048");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen236\"]")).click();
        Thread.sleep(3000);
        driver.navigate().refresh();
        log.info("completed running balances");

    }


}
