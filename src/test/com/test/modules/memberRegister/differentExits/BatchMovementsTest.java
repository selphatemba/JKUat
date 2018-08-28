package com.test.modules.memberRegister.differentEJKUatts;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.BatchMovements;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BatchMovementsTest extends BaseClass {

    Screen screen = new Screen();
    Pattern Save = new Pattern("C:\\Users\\rowanisky\\Pictures\\Capturesave.PNG");
    Pattern OkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Captureok.PNG");
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern newbatch = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\newBatch.PNG");
    Pattern claimactivities = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\claims Activities.PNG");
    Pattern add = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\add.PNG");
    Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");

    @BeforeClass
    public void setUp() throws Exception {
     //   init();

    }
    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        log.info("============Login Succesful===========");
    }

    @Test(priority = 1)
    public void doBatchMovements()throws  Exception{

        BatchMovements bm = new BatchMovements(driver);
        Thread.sleep(5000);
        screen.click(memberReg);
        Thread.sleep(5000);
        screen.click(claimactivities);
        Thread.sleep(5000);
        bm.clickOnBatchMovements();
        Thread.sleep(5000);
        screen.click(newbatch);
        Thread.sleep(5000);
        bm.enterEJKUattReasons("Ill Health");

        for (int i = 0; i < 5; i++) {

            Thread.sleep(5000);
            screen.click(add);
            Thread.sleep(3500);
            try {
                if (i == 0)
                    bm.enterMNumber("137");
                else if (i == 1)
                    bm.enterMNumber("161");
                else if (i == 2)
                    bm.enterMNumber("164");
                else if (i == 3)
                    bm.enterMNumber("167");
                else if (i == 4)
                    bm.enterMNumber("169");

            }catch (Exception e){
                e.printStackTrace();
            }

        }


        screen.click(Save);
        Thread.sleep(5000);
        screen.click(OkBox);
        Thread.sleep(5000);
        screen.click(close);



    }

}
