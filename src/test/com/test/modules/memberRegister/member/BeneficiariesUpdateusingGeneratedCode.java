package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.test.base.JyperionListener.takeSnapShot;

public class BeneficiariesUpdateusingGeneratedCode extends BaseClass {



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
    public void usingGeneratedCode()throws  Exception{
        log.info("===========Started Updating Beneficiary===========");
        Thread.sleep(7000);
        WebElement memberReg=driver.findElement(By.id("membLnk"));
        memberReg.click();
        Thread.sleep(7000);
        WebElement membersBtn=driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]"));
        membersBtn.click();
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        WebElement w = driver.findElement(By.linkText("Beneficiaries Updates"));
        action.moveToElement(w).build().perform();
        Thread.sleep(2500);
        WebElement generated=driver.findElement(By.xpath("//*[@id=\"ext-gen141\"]"));
        generated.click();
        Thread.sleep(2500);
        WebElement upload=driver.findElement(By.xpath("//*[@id=\"ext-gen163\"]"));
        upload.click();
        Thread.sleep(3000);
        WebElement browse=driver.findElement(By.name("batchSchedule"));
        browse.sendKeys("/home/selpha/Xi templates/Beneficiaries_upload_update_template.xls");
        Thread.sleep(3000);
        WebElement upld=driver.findElement(By.xpath("//*[@id=\"ext-gen306\"]"));
        upld.click();
        Thread.sleep(7000);
        takeSnapShot(driver);
        Thread.sleep(1500);
        WebElement save=driver.findElement(By.xpath("//*[@id=\"ext-gen315\"]"));
        save.click();
        Thread.sleep(7000);
        WebElement okBox=driver.findElement(By.xpath("//*[@id=\"ext-gen408\"]"));
        okBox.click();
        Thread.sleep(2000);
        log.info("===========Finished Updating Beneficiary===========");
        driver.quit();

    }

}
