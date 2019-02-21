package com.test.modules.memberRegister.claimActivities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TrustFundsTest extends BaseClass {
    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern claimsactivities = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\claims Activities.PNG");
    Pattern showdetails = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\showdetails.PNG");
    Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");
    Pattern ok = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\ok.PNG");
    Pattern processpayment = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\processpayment.PNG");
    Pattern save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");


    @BeforeClass
    public void setUp() throws Exception {
       // init();

    }

    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Login===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin", "admin");
//        log.info("============Login Succesful===========");
    }


    @Test(priority = 1)
    public void seeEndorsments() throws Exception {
        log.info("===========Started Endorsments Test===========");
        Thread.sleep(7000);
        screen.click(memberReg);
        Thread.sleep(7000);
        screen.click(claimsactivities);
        Thread.sleep(2500);
        driver.findElement(By.linkText("Trust Funds")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"ext-gen155\"]/div[1]/table/tbody/tr/td[3]/div")).click();
        Thread.sleep(2500);
        screen.click(showdetails);
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"ext-gen220\"]/div/table/tbody/tr/td[3]/div")).click();
        Thread.sleep(2500);
        screen.click(processpayment);
        Thread.sleep(2500);
        driver.findElement(By.name("payment.dateProcessed")).sendKeys("03/06/2018", Keys.ENTER);
        Thread.sleep(2500);
        driver.findElement(By.name("payment.paymentDate")).sendKeys("03/15/2018", Keys.ENTER);
        Thread.sleep(2500);
        driver.findElement(By.name("payment.comments")).sendKeys("None", Keys.ENTER);
        Thread.sleep(2500);
        String Tamount =driver.findElement(By.name("payment.gross")).getAttribute("value");
        Thread.sleep(500);
        System.out.println("Trust Amount is :"+ Tamount);
        Thread.sleep(500);
        screen.click(save);
        Thread.sleep(1500);
        screen.click(ok);
        Thread.sleep(500);
        screen.click(close);
        Thread.sleep(500);
        driver.navigate().refresh();








    }
}
