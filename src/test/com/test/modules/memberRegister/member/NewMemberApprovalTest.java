package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.members.MemberApproval;
import com.JKUat.modules.memberModule.members.NewMember;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//@Listeners({RetryTestListener.class})
public class NewMemberApprovalTest extends BaseClass {

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
    public void openNewMemberPage()throws Exception {
        NewMember newMember =new NewMember(driver);
        Thread.sleep(1500);
        newMember.clickMembeRegister();
        Thread.sleep(1400);
        newMember.clickMemberButton();
    }

    @Test(priority = 2)
    public void approveMember() throws Exception{
        log.info("======started approving a member===========");
        MemberApproval memberApproval=new MemberApproval(driver);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        memberApproval.selectMemberApprovalOption();
        Thread.sleep(1500);
        memberApproval.searchMember("1000090");
        Thread.sleep(1500);
        memberApproval.selectAmember();
        Thread.sleep(3000);
        memberApproval.clickApprove();
        Thread.sleep(1500);
        memberApproval.clickSelectedMember();
        Thread.sleep(1500);
        log.info("======member successfully approved ===========");
    }
}
