package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class BatchBeneficiariesTest extends BaseClass {

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
    public void doBatchBeneficiaries()throws  Exception{
        log.info("===========Started Updating Beneficiary===========");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]")).click();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Beneficiaries")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\ben1.xls");
        Thread.sleep(4500);
        driver.findElement(By.xpath("//*[@id=\"ext-gen160\"]")).click();
        Thread.sleep(2500);
        log.info("===========Completed Updating Beneficiary===========");
        //driver.quit();

    }

}
