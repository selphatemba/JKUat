package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.NewScheme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BatchSponsorsTest extends BaseClass {



    public static String num;

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }

    @Test(priority = 0)
    public void login() throws InterruptedException {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        log.info("=============successfully logged in===========");
  }

    @Test(priority = 1)
    public void createSceme() throws Exception {
        NewScheme ns = new NewScheme(driver);
        ns.clickOnSchemeSetup();
        Thread.sleep(7000);
        ns.clickOnScheme();
        Thread.sleep(5000);
        Actions actions=new Actions(driver);
        WebElement sponsor=driver.findElement(By.xpath("//*[@id=\"ext-comp-1047\"]"));
        actions.moveToElement(sponsor).build().perform();
        Thread.sleep(5000);
        WebElement importFromTemplate=driver.findElement(By.xpath("//*[@id=\"ext-gen125\"]"));
        importFromTemplate.click();
        Thread.sleep(5000);
        WebElement browse=driver.findElement(By.name("batchSchedule"));
        browse.sendKeys("/home/selpha/Xi templates/sponsors upload template.xls");
        Thread.sleep(5000);
        WebElement upload=driver.findElement(By.xpath("//*[@id=\"ext-gen155\"]"));
        upload.click();
        WebElement save=driver.findElement(By.xpath("//*[@id=\"ext-gen164\"]"));
        save.click();
        Thread.sleep(5000);
        driver.quit();
    }
}