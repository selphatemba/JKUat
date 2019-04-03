package com.test.modules.memberRegister.member;


import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.NewMember;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.test.base.JyperionListener;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({JyperionListener.class})
public class NewMemberRegisterTest extends BaseClass {
    public static String number;


    @BeforeClass
    public void setUp() throws Exception {
        init();

    }
    @Test(priority = 0)
    public void login()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(2000);
        asd.enterloginUsername("admin");
        Thread.sleep(1000);
        asd.enterloginPasswd("admin");
        Thread.sleep(1000);
        asd.clickSaveLogin();
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void createANewMember()throws Exception {
                NewMember newMember = new NewMember(driver);
                Thread.sleep(1500);
                driver.findElement(By.id("membLnk")).click();
//                for(int i=0;i<=3;i++) {
                Thread.sleep(1500);
                newMember.clickMemberButton();
                Thread.sleep(3000);
                newMember.clicNewkMemberOption();
                log.info("=======adding a new newMember==========");
                Thread.sleep(2000);
                newMember.enterTitle("Mr.");
                Thread.sleep(1500);
                newMember.enterSurname("Jackson");
                Thread.sleep(1500);
                newMember.enterFirstName("Oloo");
                Thread.sleep(1500);
                newMember.enterGender("Male");
                Thread.sleep(1500);
                newMember.enterMaritalStatus("Married");
                Thread.sleep(1500);
                newMember.enterDOB("07/01/1950");
                Thread.sleep(1500);
                newMember.enterIDType("National ID");
                Thread.sleep(1500);
                newMember.enterIDNumber("40040014");
                Thread.sleep(1500);
                newMember.enterDateOfAppointment("02/13/2013");
                Thread.sleep(1500);
                newMember.enterDateOfJoiningScheme("01/01/2015");
                Thread.sleep(1500);
                newMember.enterCostCenter("JKUAT SRBS Cost Centre");
                Thread.sleep(1500);
                newMember.enterMemberClass("Management");
                Thread.sleep(5000);
//        newMember.enterSavingsCategory("");
//        Thread.sleep(5000);
//        newMember.enterSavingPeriod("120");
//        Thread.sleep(5000);
//        newMember.enterDateOfSubscription("11/12/2016");
//        Thread.sleep(5000);
                driver.findElement(By.name("member.datesConfirmed")).click();
                Thread.sleep(1000);
                newMember.clickSaveButton();
                Thread.sleep(1000);
                number = driver.findElement(By.name("member.memberNo")).getAttribute("value");
                log.info("NewMember number==" + number + " ===has succesfully been added");
               // driver.navigate().refresh();
                driver.quit();
                }
            }






//    //After complete execution send pdf report by email
//    @AfterSuite
//    public void tearDown()throws  Exception {
//        sendPDFreportByGMail("systechinterns@gmail.com", "Systech123", "selphatemba@gmail.com", "PDF Report","Attached find a test report");
//    }









