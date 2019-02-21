package com.test.modules.memberRegister.reserveFund;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.test.base.JyperionListener.takeSnapShot;
import static java.lang.Thread.sleep;

public class UnregisteredReserveBalancesTest extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern reserveFund = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\reservefund.PNG");
    Pattern Balances = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\balances.PNG");
    Pattern importing  = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\import.PNG");
    Pattern browse = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\browse.PNG");
    Pattern upload = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\upload.PNG");
    Pattern yes = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\yes.PNG");


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
    public void ReserveBalances() throws Exception {
        log.info("===========Started Endorsments Test===========");
        sleep(7000);
        screen.click(memberReg);
        sleep(7000);
        screen.click(reserveFund);
        sleep(2500);
//        screen.click(Balances);
        driver.findElement(By.xpath("//*[@id=\"ext-gen100\"]")).click();
        sleep(3000);
        screen.click(importing);
        sleep(2500);
        driver.findElement(By.id("accperiodcbx")).sendKeys("Jul 1, 2017 - Jun 30, 2018", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.id("sponsorCombo")).sendKeys("JKUAT Sponsor", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.id("companyCombo")).sendKeys("Default Companys", Keys.ENTER);
        sleep(2500);
        screen.click(browse);
        sleep(2500);
        Runtime.getRuntime().exec("C:\\Users\\rowanisky\\Desktop\\autoIt\\reserveregister.exe");
        sleep(1500);
        screen.click(upload);
        sleep(5000);
        takeSnapShot(driver);

    }

}
