package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.members.NewBeneficiary;
import com.test.base.JyperionListener;
import com.test.base.LoginPageTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({JyperionListener.class})
public class NewBeneficiaryTest extends BaseClass {

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
    public void addNewBeneficiary() throws  Exception{
        log.info("===========Starting addNewBeneficiary===========");
        NewBeneficiary nb = new NewBeneficiary(driver);
        Thread.sleep(7000);
        nb.clickOnMemberRegister();
        Thread.sleep(5000);
        nb.selectMemberOption();
        Thread.sleep(5000);
        nb.clickOnNewBeneficiary();
        Thread.sleep(3500);
        nb.enterCategory("Both");
        Thread.sleep(2500);
        nb.enterMemberNumber("1000054");
        Thread.sleep(2500);
        nb.enterSurname("Freddie");
        Thread.sleep(2500);
        nb.enterFirstName("Octane");
        Thread.sleep(2500);
        nb.enterOthernames("BigMan");
        Thread.sleep(2500);
        nb.enterDOB("03/01/1944");
        Thread.sleep(2500);
        nb.enterDocumentsProvided("Yes");
        Thread.sleep(2500);
        nb.enterEntitlement("55");
        Thread.sleep(2500);
        nb.enterGender("Male");
        Thread.sleep(2500);
        nb.enterStatus("Eligible");
        Thread.sleep(2500);
        nb.enterRelationship("Brother");
        Thread.sleep(2500);
        nb.clickSaveButton();
        Thread.sleep(4000);
        log.info("===========Finished adding New Beneficiary===========");
    }
}
