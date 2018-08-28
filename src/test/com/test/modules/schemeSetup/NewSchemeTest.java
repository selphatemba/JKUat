package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.NewScheme;
import com.test.base.LoginPageTest;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewSchemeTest extends BaseClass {

    public static String  num;

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
        ns.clickOnSchemeSetup();
        Thread.sleep(7000);
        ns.clickOnScheme();
        Thread.sleep(5000);
        ns.clickOnNewScheme();
        Thread.sleep(5000);
        ns.enterSchemeName("JKUAT TESTING SCHEME1");
        Thread.sleep(5000);
        ns.enterSchemeType("Pension Fund");
        Thread.sleep(5000);
        ns.enterFundType("Savings & Retirement Fund");
        Thread.sleep(5000);
        ns.enterTakeOnDate("4/2/2018");
        Thread.sleep(5000);
        ns.clickOnStartDay();
        Thread.sleep(5000);
        ns.clickOnStartMonth();
        Thread.sleep(5000);
        ns.enterBaseCurrency("KENYA SHILLINGS");
        Thread.sleep(5000);
        ns.clickSaveButton();
        Thread.sleep(5000);
        ns.clickOkBox();
        Thread.sleep(5000);
        driver.quit();
        log.info("scheme ");


    }

}
