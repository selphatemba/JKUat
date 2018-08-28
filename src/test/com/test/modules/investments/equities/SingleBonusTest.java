package com.test.modules.investments.equities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.equities.SingleBonus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingleBonusTest extends BaseClass {

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

    public void doSingleBonus()throws Exception{
        SingleBonus sb=new SingleBonus(driver);


    }
}
