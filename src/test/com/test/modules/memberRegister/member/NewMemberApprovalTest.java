package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.MemberApproval;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners({RetryTestListener.class})
public class NewMemberApprovalTest extends BaseClass {

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }
    @Test(priority = 0)
    public void login()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(1000);
        asd.enterloginUsername("admin");
        Thread.sleep(1000);
        asd.enterloginPasswd("admin");
        Thread.sleep(1000);
        asd.clickSaveLogin();
        Thread.sleep(1000);
    }



    @Test(priority = 1)
    public void approveMember() throws Exception{
        log.info("======started approving a member===========");
        MemberApproval memberApproval=new MemberApproval(driver);
        //member register
        driver.findElement(By.id("membLnk")).click();
        //members
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1333\"]/tbody/tr[2]/td[2]/em")).click();
        Thread.sleep(1000);
        memberApproval.selectMemberApprovalOption();
        Thread.sleep(1500);
        driver.findElement(By.name("trxntype")).sendKeys("", Keys.TAB);
        Thread.sleep(1500);
        driver.findElement(By.name("spns")).sendKeys("JKUAT SRBS",Keys.TAB);
        Thread.sleep(1500);
        memberApproval.searchMember("1000022");
        Thread.sleep(1500);
        memberApproval.selectAmember();
        Thread.sleep(1000);
        memberApproval.clickApprove();
        Thread.sleep(1500);
        memberApproval.clickSelectedMember();
        Thread.sleep(1500);
        //driver.navigate().refresh();
        driver.quit();
        log.info("======member successfully approved ===========");
    }
}
