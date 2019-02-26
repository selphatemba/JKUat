package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.members.NewBeneficiary;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
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
    public void switchScheme()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        asd.enterloginUsername("selly1");
        Thread.sleep(3000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(3000);
        asd.clickSaveLogin();
    }

    @Test(priority = 1)
    public void addNewBeneficiary() throws  Exception{
        log.info("===========Starting addNewBeneficiary===========");
        NewBeneficiary nb = new NewBeneficiary(driver);
//        Thread.sleep(7000);
//        nb.clickOnMemberRegister();
        Thread.sleep(5000);
        nb.selectMemberOption();
        Thread.sleep(5000);
        nb.clickOnNewBeneficiary();
        Thread.sleep(3500);
        nb.enterCategory("Both");
        Thread.sleep(2500);
        nb.enterMemberNumber("Bad   Good - 00001");
        Thread.sleep(2500);
        nb.enterSurname("Key");
        Thread.sleep(2500);
        nb.enterFirstName("Seed");
        Thread.sleep(2500);
        nb.enterOthernames("Already");
        Thread.sleep(2500);
        nb.enterDOB("03/01/2010");
        Thread.sleep(2500);
        nb.enterDocumentsProvided("Yes");
        Thread.sleep(2500);
        nb.enterEntitlement("25");
        Thread.sleep(2500);
        nb.enterGender("Male");
        Thread.sleep(2500);
        nb.enterStatus("Eligible");
        Thread.sleep(2500);
        nb.enterRelationship("Daughter");
        Thread.sleep(2500);
        nb.clickSaveButton();
        Thread.sleep(4000);
        log.info("===========Finished adding New Beneficiary===========");
    }
}
