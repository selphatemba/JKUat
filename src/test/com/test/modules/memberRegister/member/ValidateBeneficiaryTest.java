package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.members.ValidateBeneficiary;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateBeneficiaryTest extends BaseClass {

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
    public void validateBeneficiary()throws  Exception{
        log.info("===========Validating Beneficiary===========");
        ValidateBeneficiary vb = new ValidateBeneficiary(driver);
        Thread.sleep(7000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("ext-gen49")).click();
        Thread.sleep(2500);
        vb.clickOnoverageBeneficiaries();
        Thread.sleep(2500);
        vb.enterBeneficiaryName("Freddie");
        Thread.sleep(2500);
        //screen.click(checkBox);
        Thread.sleep(2500);
        vb.validateSelected();
        Thread.sleep(3500);
        //screen.click(yes);
        Thread.sleep(2500);
        //screen.click(ok);
        Thread.sleep(2500);


        log.info("===========Beneficiary Validated===========");
    }
}
