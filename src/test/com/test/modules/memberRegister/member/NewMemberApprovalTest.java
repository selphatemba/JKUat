package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.members.MemberApproval;
import com.JKUat.modules.memberModule.members.NewMember;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//@Listeners({RetryTestListener.class})
public class NewMemberApprovalTest extends BaseClass {

//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//
//    @Test(priority = 0)
//    public void switchScheme()throws Exception {
//        ChangeUserPassword asd = new ChangeUserPassword(driver);
//        Thread.sleep(3000);
//        asd.enterloginUsername("selly1");
//        Thread.sleep(3000);
//        asd.enterloginPasswd("S@lpha123");
//        Thread.sleep(3000);
//        asd.clickSaveLogin();
//        Thread.sleep(3000);
//    }

    @Test(priority = 0)
    public void openNewMemberPage()throws Exception {
        NewMember newMember =new NewMember(driver);
        Thread.sleep(1500);
//        newMember.clickMembeRegister();
//        Thread.sleep(1400);
        newMember.clickMemberButton();
    }

    @Test(priority = 1)
    public void approveMember() throws Exception{
        log.info("======started approving a member===========");
        MemberApproval memberApproval=new MemberApproval(driver);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        memberApproval.selectMemberApprovalOption();
        Thread.sleep(1500);
        driver.findElement(By.name("trxntype")).sendKeys("CLASS ONE", Keys.TAB);
        Thread.sleep(1500);
        driver.findElement(By.name("spns")).sendKeys("JKUAT TESTING SPONSOR3",Keys.TAB);
        Thread.sleep(1500);
        memberApproval.searchMember("22");
        Thread.sleep(1500);
        memberApproval.selectAmember();
        Thread.sleep(3000);
        memberApproval.clickApprove();
        Thread.sleep(1500);
        memberApproval.clickSelectedMember();
        Thread.sleep(1500);
        driver.navigate().refresh();
        log.info("======member successfully approved ===========");
    }
}
