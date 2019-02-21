package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MemberUpdatesTest extends BaseClass {
    Screen screen = new Screen();
    Pattern Save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Capturesave.PNG");
    Pattern OkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Captureok.PNG");
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\memberRegister.PNG");
    Pattern membersBtn = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\membersbtn.PNG");
    Pattern browse = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\browse.PNG");
    Pattern upload = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\upload.PNG");
    Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");




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

    public void doBatchMembersUpdates() throws Exception{

        log.info("===========Starting Updating Members===========");
        Thread.sleep(7000);
        screen.click(memberReg);
        Thread.sleep(7000);
        screen.click(membersBtn);
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        WebElement w = driver.findElement(By.linkText("Member Updates"));
        action.moveToElement(w).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Import Updates")).click();
        Thread.sleep(3000);
        screen.click(browse);
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\rowanisky\\Desktop\\autoIt\\membersUpdates.au3");
        Thread.sleep(5000);
        screen.click(upload);
        Thread.sleep(7000);
        screen.click(Save);
        Thread.sleep(7000);
        screen.click(OkBox);
        Thread.sleep(7000);
        screen.click(close);
        Thread.sleep(7000);

        log.info("===========Finished Updating Members===========");


    }


}
