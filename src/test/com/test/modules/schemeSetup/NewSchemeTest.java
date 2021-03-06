package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.NewScheme;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewSchemeTest extends BaseClass {


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
    public void createSceme() throws Exception{
        NewScheme ns = new NewScheme(driver);
        ns.clickSchemeSetup();
        Thread.sleep(3000);
        ns.clickScheme();
        Thread.sleep(5000);
        ns.clickOnNewScheme();
        Thread.sleep(5000);
        ns.enterSchemeName("SCHEME SCHEMA");
        Thread.sleep(2000);
        ns.enterSchemeType("Pension Fund");
        Thread.sleep(2000);
        ns.enterFundType("Defined Contribution");
        Thread.sleep(2000);
        ns.enterFundAdministrator("JKUAT Pension");
        Thread.sleep(2000);
        ns.enterTakeOnDate("12/31/2014");
        Thread.sleep(2000);
        ns.enterDateOfCommencement("12/31/2014");
        Thread.sleep(2000);
        ns.enterBaseCurrency("KENYA SHILLINGS");
        Thread.sleep(2000);
        ns.clickSaveButton();
        Thread.sleep(2000);
        ns.clickOkBox();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]")).click();
        //driver.quit();
        log.info("scheme ");


    }

}
