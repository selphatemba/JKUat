package com.test.modules.investments.bondsNSecurities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.bondsNsecurities.NewDebt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewDebtTest extends BaseClass {

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
    public void createANewDebt()throws Exception {
        NewDebt nd=new NewDebt(driver);
        log.info("===========started creating a new Debt=======");
        nd.openInvestmentModule();
        Thread.sleep(5000);
        nd.clickOnBondNsecurities();
        Thread.sleep(3000);
        nd.clickOnIssuedDebts();
        Thread.sleep(3000);
        nd.clickOnOperations();
        Thread.sleep(3000);
        WebElement newDebt=driver.findElement(By.linkText("New Debt (s)"));
        Actions actions=new Actions(driver);
        actions.moveToElement(newDebt).build().perform();
        Thread.sleep(3000);
        nd.clickOnSingle();
        Thread.sleep(3000);
        nd.enterISIN("364");
        Thread.sleep(3000);
        nd.enterDebtName("Treasury Bill 123");
        Thread.sleep(3000);
        nd.enterIssuer("NIC BANK");
        Thread.sleep(3000);
        nd.enterType("Savings Development Bond");
        Thread.sleep(3000);
        nd.enterIssueDate("08/31/2018");
        Thread.sleep(3000);
        nd.enterTenure("5");
        Thread.sleep(3000);
        nd.enterTimeUnit("Years");
        Thread.sleep(3000);
        nd.enterCouponRate("25");
        Thread.sleep(3000);
        nd.enterInterestStartDate("09/08/2018");
        Thread.sleep(3000);
        nd.enterInterestType("Fixed");
        Thread.sleep(3000);
        nd.enterInterestFrequency("Monthly");
        Thread.sleep(3000);
        nd.enterDaysInAYr("366");
        Thread.sleep(3000);
        nd.enterLocality("Local");
        Thread.sleep(3000);
        nd.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(5000);
        nd.clickSave();
        log.info("===========Finished Creating a new Debt=======");

    }
@AfterTest
    public void afterTest(){
        driver.quit();
    }
}
