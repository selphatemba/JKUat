package com.test.modules.memberRegister.member;


import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.members.NewMember;
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
    public void login() throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        log.info("=============successfully logged in===========");
    }


    @Test(priority = 1)
    public void createANewMember()throws Exception {
        NewMember newMember =new NewMember(driver);
        Thread.sleep(1500);
        newMember.clickMembeRegister();
        Thread.sleep(2000);
        newMember.clickMemberButton();
        Thread.sleep(1500);
        newMember.clickMemberOption();
        log.info("=======adding a new newMember==========");
        Thread.sleep(3000);
        newMember.clickTitleDropDown();
        Thread.sleep(1500);
        newMember.clicktitleOption();
        Thread.sleep(1500);
        newMember.enterSurname("Atemba");
        Thread.sleep(1500);
        newMember.enterFirstName("Selpha");
        Thread.sleep(1500);
        newMember.enterGender("Female");
        Thread.sleep(1500);
        newMember.enterMaritalStatus("Married");
        Thread.sleep(1500);
        newMember.enterDOB("07/01/2000");
        Thread.sleep(1500);
        newMember.enterDateOfAppointment("07/01/2017");
        Thread.sleep(1500);
        newMember.enterDateOfJoiningScheme("07/10/2017");
        Thread.sleep(1500);
        newMember.enterCostCenter("Default Company");
        Thread.sleep(1500);
        newMember.enterMemberClass("Default");
        Thread.sleep(5000);
        newMember.clickSaveButton();
        Thread.sleep(5000);
        number=driver.findElement(By.name("member.memberNo")).getAttribute("value");

        driver.navigate().refresh();

        log.info("NewMember number==" +number+" ===has succesfully been added");

    }


//    //After complete execution send pdf report by email
//    @AfterSuite
//    public void tearDown()throws  Exception {
//        sendPDFreportByGMail("systechinterns@gmail.com", "Systech123", "selphatemba@gmail.com", "PDF Report","Attached find a test report");
//    }

}







