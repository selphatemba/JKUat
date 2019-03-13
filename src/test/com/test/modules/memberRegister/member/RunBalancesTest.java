package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
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
        Thread.sleep(2000);
        asd.enterloginUsername("user60");
        Thread.sleep(1000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(1000);
        asd.clickSaveLogin();
        Thread.sleep(3000);
    }


    @Test(priority = 1)
    public void runBalances()throws Exception{
        log.info("started running balances");
        RunBalances rb=new RunBalances(driver);
        //member Register
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1467\"]/tbody/tr[2]/td[2]/em")).click();
        Thread.sleep(2000);
        //financial periods
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1469\"]")).click();
        Thread.sleep(2000);

        //select a financial period  //div[text()='Apr 3, 2017 - Apr 2, 2018'] //*[@id="ext-gen118"]/div[2] #ext-gen118 > div:nth-child(2)
        driver.findElement(By.xpath("//*[@id=\"ext-gen118\"]/div[2]/table/tbody/tr/td[1]/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen135\"]")).click();
        Thread.sleep(2000);
        rb.hoverIncomeAllocationUsingInterestRate();
        Thread.sleep(2000);
        rb.clickIndividualRun();
        Thread.sleep(2000);
        rb.enterInterestRateType("Provisional");
        Thread.sleep(2000);
        rb.enterMemberNumber("Bad   Good - 13181");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen236\"]")).click();
        Thread.sleep(2000);
        //driver.navigate().refresh();
        log.info("completed running balances");

    }


}
