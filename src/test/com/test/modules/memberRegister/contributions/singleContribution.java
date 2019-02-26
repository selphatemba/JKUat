package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.SingleContribution;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class singleContribution extends BaseClass {

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
    public void doSingleContribution() throws Exception {
        SingleContribution sc = new SingleContribution(driver);

        log.info("=========== Started Single contribution Test=============");
        //loop starts here
        for (int i = 0; i < 12; i++) {
//            Thread.sleep(7000);
//            driver.findElement(By.id("membLnk")).click();
            Thread.sleep(7000);
            driver.findElement(By.id("ext-gen53")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"ext-gen93\"]")).click();
            Thread.sleep(5000);
            driver.findElement(By.name("sponsorMNameField")).sendKeys("JKUAT TESTING SPONSOR2", Keys.TAB);
            Thread.sleep(7000);
            driver.findElement(By.xpath("//*[@id=\"ext-gen96-gp-sector-Financial-bd\"]/div")).click();
            Thread.sleep(7000);
            driver.findElement(By.id("ext-gen115")).click();
            Thread.sleep(3000);
            sc.enterMemberNumber2("00001");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"ext-gen167-gp-mclass-CLASS ONE-bd\"]/div")).click();
            Thread.sleep(7000);
            sc.clickOnContributions();
            Thread.sleep(5000);
            sc.clickSingleContribution();
            Thread.sleep(5000);
            sc.eneterEEAmount("7500.00");
            Thread.sleep(2000);
            sc.eneterERAmount("2500.00");
            Thread.sleep(2000);
            sc.eneterSalary("55000.00");
            Thread.sleep(2000);
            sc.entercontrType("Normal Contributions");
            Thread.sleep(2000);

            try {
                if (i == 0)
                    sc.enterMonth("January");
                else if (i == 1)
                    sc.enterMonth("February");
                else if (i == 2)
                    sc.enterMonth("March");
                else if (i == 3)
                    sc.enterMonth("April");
                else if (i == 4)
                    sc.enterMonth("May");
                else if (i == 5)
                    sc.enterMonth("June");
                else if (i == 6)
                    sc.enterMonth("July");
                else if (i == 7)
                    sc.enterMonth("August");
                else if (i == 8)
                    sc.enterMonth("September");
                else if (i == 9)
                    sc.enterMonth("October");
                else if (i == 10)
                    sc.enterMonth("November");
                else if (i == 11)
                    sc.enterMonth("December");
                Thread.sleep(2000);
                sc.enterYear("2018");
                Thread.sleep(3000);
                sc.enterStatus("Registered");
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id=\"ext-gen422\"]")).click();
              Thread.sleep(1000);
              driver.findElement(By.xpath("//*[@id=\"ext-gen545\"]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("//*[@id=\"ext-gen543\"]")).click();
              Thread.sleep(2000);
              driver.navigate().refresh();
            } catch (Exception e) {
                e.getCause();
                e.printStackTrace();
            }

        }


    }

}
