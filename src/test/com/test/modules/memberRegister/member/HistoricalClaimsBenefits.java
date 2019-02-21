package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HistoricalClaimsBenefits extends BaseClass {

    Screen screen = new Screen();
    Pattern Save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Capturesave.PNG");
    Pattern OkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Captureok.PNG");
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\memberRegister.PNG");
    Pattern membersBtn = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\membersbtn.PNG");
    Pattern addBtchSched  = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\addBatch.PNG");
    Pattern out = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\white.PNG");
    Pattern browse = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\browse.PNG");
    Pattern upload = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\upload.PNG");

    @BeforeClass
    public void setUp() throws Exception {
      //  init();

    }


    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Login===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        log.info("============Login Succesful===========");
    }


    @Test(priority = 1)
    public void ImportHistoricalClaimsBenefits()throws Exception {

        log.info("===========Started Importing Closing Balances===========");
        Thread.sleep(7000);
        screen.click(memberReg);
        Thread.sleep(7000);
        screen.click(membersBtn);
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        WebElement w = driver.findElement(By.linkText("Historical Claims"));
        action.moveToElement(w).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Benefits")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath(" //*[@id=\"ext-comp-1625\"]")).sendKeys("JKUAT Sponsor");
        Thread.sleep(2500);
        screen.click(out);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1626\"]")).sendKeys("Default Company");
        Thread.sleep(1500);
        screen.click(out);
        Thread.sleep(1500);
        screen.click(addBtchSched);
        Thread.sleep(2500);
        driver.findElement(By.id("sponsorCombo")).sendKeys("Resignation");
        Thread.sleep(2500);
        screen.click(out);
        Thread.sleep(1500);
        screen.click(browse);
        Thread.sleep(2500);
        Runtime.getRuntime().exec("C:\\Users\\rowanisky\\Desktop\\autoIt\\HistoricalBenefits.exe");
        Thread.sleep(4500);
        screen.click(upload);
        Thread.sleep(4500);
        screen.click(Save);
        Thread.sleep(4500);
        screen.click(OkBox);
        Thread.sleep(4500);

        log.info("============Finished Succesfully===========");


    }
}
