package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClosingBalances extends BaseClass {


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
    public void ImportClosingBalances()throws Exception{
        log.info("===========Started Importing Closing Balances===========");
        Thread.sleep(10000);
        WebElement memberReg=driver.findElement(By.id("membLnk"));
        memberReg.click();
        Thread.sleep(5000);
        WebElement membersBtn=driver.findElement(By.id("ext-gen49"));
        membersBtn.click();
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        WebElement w = driver.findElement(By.linkText("Closing Balances"));        action.moveToElement(w).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Import Batch")).click();
        Thread.sleep(2500);
        WebElement browse=driver.findElement(By.name("batchSchedule"));
        browse.sendKeys("/home/selpha/Xi templates/Members Register/New opening_balance template.xlsx");
        Thread.sleep(2500);
//        driver.findElement(By.xpath("//*[@id=\"aptextfield\"]")).sendKeys("Jul 1, 2016 - Jun 30, 2017");
//        Thread.sleep(2500);
        WebElement costCentre=driver.findElement(By.xpath("//*[@id=\"ext-comp-1703\"]"));
        costCentre.sendKeys("Default Company");
        Thread.sleep(2500);
        WebElement sponsor=driver.findElement(By.xpath("//*[@id=\"ext-comp-1701\"]"));
        sponsor.sendKeys("JKUAT SRBS");
        Thread.sleep(2500);
        WebElement upload=driver.findElement(By.xpath("//*[@id=\"ext-gen165\"]"));
        upload.click();
        Thread.sleep(2500);
        WebElement save=driver.findElement(By.xpath("//*[@id=\"ext-gen174\"]"));
        save.click();
        Thread.sleep(2500);
        WebElement okBox=driver.findElement(By.xpath("//*[@id=\"ext-gen317\"]"));
        okBox.click();
        Thread.sleep(2500);
        WebElement close=driver.findElement(By.xpath("//*[@id=\"ext-gen178\"]"));
        close.click();
        driver.quit();
    }




}
