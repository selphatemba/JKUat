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

public class RegisteredReserveTransactionTest extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern reserveFund = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\reservefund.PNG");
    Pattern transactions = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\transactions.PNG");
    Pattern addNew  = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\addNew.PNG");
    Pattern save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");
    Pattern ok = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\ok.PNG");
    Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");


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
//        screen.click(transactions);
        driver.findElement(By.xpath("//*[@id=\"ext-gen96\"]")).click();
        sleep(3000);
        screen.click(addNew);
        sleep(2500);
        driver.findElement(By.name("txn.date")).sendKeys("04/15/2017", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.name("txn.descr")).sendKeys("Test Transactions", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1622\"]")).sendKeys("Contributions", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.name("txn.inflow")).sendKeys("250000.00", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.name("txn.outflow")).sendKeys("750000.00", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.id("memberCombo")).sendKeys("", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.id("sponsorCombo")).sendKeys("JKUAT Sponsor", Keys.ENTER);
        sleep(2500);
        driver.findElement(By.id("companyCombo")).sendKeys("Default Company", Keys.ENTER);
        sleep(2500);
        screen.click(save);
        sleep(2500);
        screen.click(ok);
        sleep(5000);
        screen.click(close);
        sleep(5000);
        takeSnapShot(driver);

    }

}
