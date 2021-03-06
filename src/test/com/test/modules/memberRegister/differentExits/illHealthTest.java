package com.test.modules.memberRegister.differentEJKUatts;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.reasonsForEJKUatt.IllHealth;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//This is for all other types of eJKUatts
//just edit on reasons for eJKUatt
public class illHealthTest extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern sponsorRegister = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\sponsor.PNG");
    Pattern ok = new Pattern("C:\\Users\\rowanisky\\Pictures\\Captureok.PNG");
    Pattern checkbox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\check box.PNG");
    Pattern jkuatsposor = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\JKUAT.PNG");
    Pattern viewmembers = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\viewmembers.PNG");
    Pattern blue = new Pattern("C:\\Users\\rowanisky\\Pictures\\blue.PNG");
    Pattern save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");
    Pattern movements = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\movements.PNG");
    Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");


    @BeforeClass
    public void setUp() throws Exception {
    //    init();

    }
    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        log.info("============Login Succesful===========");
    }
    @Test(priority = 1)
    public void doRetirementTest()throws Exception{
        IllHealth ih = new IllHealth(driver);
        log.info("Starting Members EJKUatt");
        Thread.sleep(5000);
        screen.click(memberReg);
        Thread.sleep(5000);
        screen.click(sponsorRegister);
        Thread.sleep(5000);
        screen.click(jkuatsposor);
        Thread.sleep(5000);
        screen.click(viewmembers);
        Thread.sleep(5000);
        ih.searchForMember("137");
        Thread.sleep(5000);
        screen.click(checkbox);
        Thread.sleep(5000);
        screen.click(movements);
        Thread.sleep(5000);
        ih.ClickOnInitiateMovement();
        Thread.sleep(5000);
        ih.enterDateOfCalculation("03/05/2018");
        Thread.sleep(5000);
        ih.enterDateOfEJKUatt("03/02/2018");
        Thread.sleep(5000);
        ih.enterReasonForEJKUatt("Ill Health");
        Thread.sleep(5000);
        ih.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(5000);
        ih.enterRemarks("Unkown Conditions");
        Thread.sleep(5000);
        screen.click(blue);
        Thread.sleep(5000);
        screen.click(save);
        Thread.sleep(5000);
        screen.click(ok);
        Thread.sleep(5000);
        screen.click(close);
        Thread.sleep(5000);
        log.info("Finished Members EJKUatt");





    }

}
