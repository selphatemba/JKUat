package com.test.modules.memberRegister.financialPeriods;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class FinancialPeriodsRegisterTest extends BaseClass {
    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern financialPeriods = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\financialPeriods.PNG");
    Pattern periodendprocess = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\periodendprocess.PNG");
    Pattern batchRun = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\batchrun.PNG");
    Pattern runbalances = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\runbalances.PNG");
    Pattern checkbox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\check8.PNG");
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
    public void financialPeriods() throws Exception {
        log.info("===========Started Endorsments Test===========");
        sleep(7000);
        screen.click(memberReg);
        sleep(7000);
        screen.click(financialPeriods);
        sleep(2500);
        driver.findElement(By.linkText("Financial Periods Register")).click();
        sleep(2500);
        screen.click(checkbox);
        sleep(2500);
        screen.click(periodendprocess);
        sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Income Allocation Using Interest Rate"));
        action.moveToElement(we).build().perform();
        sleep(5000);
        screen.click(batchRun);
        sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1820\"]")).sendKeys("Provisional", Keys.ENTER);
        sleep(5000);
        screen.click(runbalances);
        sleep(5000);
        screen.click(yes);
        sleep(5000);
        waitForProgressBarToDisappear();
        sleep(5000);
        driver.navigate().refresh();

    }

    public boolean waitForProgressBarToDisappear() throws  Exception{
        WebElement progressBar =driver.findElement(By.xpath("//*[@id=\"ext-gen342\"]"));
        while (true) {
            if (progressBar.isDisplayed())
                return true;
            sleep(1000);
        }
    }


}
