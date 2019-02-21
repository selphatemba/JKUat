package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MembersEndorsments extends BaseClass {

    Screen screen = new Screen();
    Pattern Save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");
    Pattern OkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Captureok.PNG");
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\memberRegister.PNG");
    Pattern membersBtn = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\membersbtn.PNG");
    Pattern approve = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\approve.PNG");
    Pattern selectedMembers = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\selectedmembers.PNG");
    Pattern checkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\CaptureCheckBox.PNG");

    @BeforeClass
    public void setUp() throws Exception {
        //init();

    }
    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Login===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        log.info("============Login Succesful===========");
    }


    @Test(priority = 1)
    public void seeEndorsments()throws Exception{
        log.info("===========Started Endorsments Test===========");
        Thread.sleep(7000);
        screen.click(memberReg);
        Thread.sleep(7000);
        screen.click(membersBtn);
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Endorsements"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Members")).click();
        Thread.sleep(2500);
        screen.click(checkBox);
        Thread.sleep(2500);
        screen.click(approve);
        Thread.sleep(2500);
        screen.click(selectedMembers);
        Thread.sleep(2500);
        screen.click(OkBox);
        Thread.sleep(2500);
        driver.navigate().refresh();


        log.info("===========Finished Endorsments Test===========");

    }


}
