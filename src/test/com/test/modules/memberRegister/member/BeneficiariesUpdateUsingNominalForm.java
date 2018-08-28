package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeneficiariesUpdateUsingNominalForm extends BaseClass {



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
    public void doWork()throws  Exception{
        log.info("===========Started Updating Beneficiary===========");
        Thread.sleep(7000);
        WebElement memberReg=driver.findElement(By.id("membLnk"));
        memberReg.click();
        Thread.sleep(7000);
        WebElement membersBtn=driver.findElement(By.id("ext-gen49"));
        membersBtn.click();
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        WebElement w = driver.findElement(By.linkText("Beneficiaries Updates"));
        action.moveToElement(w).build().perform();
        Thread.sleep(2500);
        WebElement nominalForm=driver.findElement(By.linkText("Using Nomination Form Number"));
        nominalForm.click();
        Thread.sleep(2500);
        WebElement browse=driver.findElement(By.name("batchSchedule"));
        browse.sendKeys("/home/selpha/Xi templates/Beneficiaries_upload_update_template.xls");
        Thread.sleep(2500);
        WebElement upload=driver.findElement(By.xpath("//*[@id=\"ext-gen228\"]"));
        upload.click();
        Thread.sleep(7000);
        WebElement save=driver.findElement(By.xpath("//*[@id=\"ext-gen174\"]"));
        save.click();
        //screen.click(close);
        Thread.sleep(5000);
        log.info("===========Finished Updating Beneficiary===========");
        driver.quit();
    }

}
