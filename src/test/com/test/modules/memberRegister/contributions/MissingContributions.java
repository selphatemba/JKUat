package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.DirectContr;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MissingContributions extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern addMissingContr = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\missing.PNG");
    Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");
    Pattern browse = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureBrowse.PNG");
    Pattern contributions = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\contributions.PNG");
    Pattern Creceivables = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\contributionsreceivables.PNG");
    Pattern upload = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\upload.PNG");
    Pattern save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");
    Pattern ok = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\ok.PNG");
    Pattern blue = new Pattern("C:\\Users\\rowanisky\\Pictures\\blue.PNG");



    @BeforeClass
    public void setUp() throws Exception {
       // init();

    }
    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        log.info("============Login Succesful===========");
    }
    @Test(priority = 1)
    public void doTest()throws Exception {
        DirectContr cd = new DirectContr(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(7500);
        screen.click(memberReg);
        Thread.sleep(8500);
        screen.click(contributions);
        Thread.sleep(2500);
        driver.findElement(By.linkText("Missing Contributions")).click();
        Thread.sleep(2500);
        screen.click(addMissingContr);
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1631\"]")).sendKeys("00167", Keys.ENTER);
        Thread.sleep(2500);
        driver.findElement(By.name("contr.ee")).sendKeys("25000", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.name("contr.er")).sendKeys("35000", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.name("contr.avc")).sendKeys("2500", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.name("contr.avcer")).sendKeys("6500", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1640\"]")).sendKeys("January", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.name("contr.year")).sendKeys("2017", Keys.ENTER);
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1642\"]")).sendKeys("Registered", Keys.ENTER);
        Thread.sleep(1500);
        screen.click(blue);
        Thread.sleep(500);
        screen.click(save);
        Thread.sleep(1500);
        screen.click(ok);
        Thread.sleep(1500);
        screen.click(close);
        Thread.sleep(1500);
        driver.navigate().refresh();
        Thread.sleep(1500);






    }

    }
