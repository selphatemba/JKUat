package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
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
    public void login() throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        log.info("=============successfully logged in===========");

    }

    @Test(priority = 1)
    public void doBatchBeneficiaries()throws  Exception{
        log.info("===========Started Updating Beneficiary===========");
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("ext-gen49")).click();
        Thread.sleep(7000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Beneficiaries")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("batchSchedule")).sendKeys("/home/selpha/Xi templates/Members Register/Beneficiaries_update_template.xls");
        Thread.sleep(4500);
        driver.findElement(By.id("ext-gen166")).click();
        Thread.sleep(2500);
        driver.quit();

    }

}
