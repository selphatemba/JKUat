package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.ContributionsReceivables;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContributionReceivablesTest extends BaseClass {


    @Test(priority = 0)
    public void openMemberPage()throws Exception{
        log.info("==============logging in user====================");
        LoginPageTest loginPageTest=new LoginPageTest();
        loginPageTest.loginUser();
        log.info("==============user successfully logged in===========");
    }


    @Test(priority = 1)
    public void doTest()throws Exception {
        ContributionsReceivables cr = new ContributionsReceivables(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(7000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("memReg")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ext-gen53")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Contribution Receivables")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen363\"]")).click();
        Thread.sleep(3000);
        cr.EnterBookingDate("03/15/2017");
        Thread.sleep(1500);
        cr.EnterDueDate("03/15/2018");
        Thread.sleep(2000);
        String total = driver.findElement(By.name("invoice.controlAmnt")).getAttribute("value");
        log.info("total amount is================"+total);
        Thread.sleep(2000);
        String contributors = driver.findElement(By.name("invoice.contributors")).getAttribute("value");
        log.info("The contributors are======"+contributors);
        Thread.sleep(2000);
        driver.navigate().refresh();












    }

}
