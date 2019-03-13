package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
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
    public void login()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(2000);
        asd.enterloginUsername("user60");
        Thread.sleep(1000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(1000);
        asd.clickSaveLogin();
    }

    @Test(priority = 1)
    public void doRegisteredSingleContribution() throws Exception {
        SingleContribution sc = new SingleContribution(driver);
        Thread.sleep(2000);
        //loop starts here
        for (int i = 0; i < 12; i++) {
            driver.findElement(By.id("memReg")).click();
            Thread.sleep(2000);
            sc.setSposorName("SCHEME SCHEMA SPONSOR11");
            Thread.sleep(2000);
            //select a sponsor
            driver.findElement(By.xpath("//*[@id=\"ext-gen105\"]/div/table/thead/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            //click on view members
            driver.findElement(By.xpath("//*[@id=\"ext-gen115\"]")).click();
            Thread.sleep(2000);
            log.info("=========== Started Single contribution Test=============");
            Thread.sleep(2000);
//            driver.findElement(By.id("memReg")).click();
//            Thread.sleep(3000);
            //enter member number
            sc.enterMemberNumber2("13182");
            Thread.sleep(3000);
            //select a member
            driver.findElement(By.xpath("//*[@id=\"ext-gen177\"]/div/table/thead/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            sc.clickOnContributions();
            Thread.sleep(2000);
            sc.clickSingleContribution();
            Thread.sleep(2000);
            sc.eneterEEAmount("7500.00");
            Thread.sleep(2000);
            sc.eneterERAmount("2500.00");
            Thread.sleep(2000);
            sc.eneterSalary("55000.00");
            Thread.sleep(2000);
            driver.findElement(By.name("contr.datePaid")).clear();
            Thread.sleep(1000);
            driver.findElement(By.name("contr.datePaid")).sendKeys("12/31/2018",Keys.ENTER);
            Thread.sleep(1000);
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
                driver.findElement(By.xpath("//*[@id=\"ext-gen426\"]")).click();
              Thread.sleep(4000);
              driver.findElement(By.xpath("//*[@id=\"ext-gen549\"]")).click();
                Thread.sleep(1000);
              driver.navigate().refresh();
            } catch (Exception e) {
                e.getCause();
                e.printStackTrace();
            }

        }


    }
    @Test(priority = 2)
    public void doUnRegisteredSingleContribution() throws Exception {
        SingleContribution sc = new SingleContribution(driver);
        Thread.sleep(2000);
        //loop starts here
        for (int i = 0; i < 12; i++) {
            driver.findElement(By.id("memReg")).click();
            Thread.sleep(2000);
            sc.setSposorName("SCHEME SCHEMA SPONSOR11");
            Thread.sleep(2000);
            //select a sponsor
            driver.findElement(By.xpath("//*[@id=\"ext-gen105\"]/div/table/thead/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            //click on view members
            driver.findElement(By.xpath("//*[@id=\"ext-gen115\"]")).click();
            Thread.sleep(2000);
            log.info("=========== Started Single contribution Test=============");
            Thread.sleep(2000);
//            driver.findElement(By.id("memReg")).click();
//            Thread.sleep(3000);
            //enter member number
            sc.enterMemberNumber2("13182");
            Thread.sleep(3000);
            //select a member
            driver.findElement(By.xpath("//*[@id=\"ext-gen177\"]/div/table/thead/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            sc.clickOnContributions();
            Thread.sleep(2000);
            sc.clickSingleContribution();
            Thread.sleep(2000);
            sc.eneterEEAmount("7500.00");
            Thread.sleep(2000);
            sc.eneterERAmount("2500.00");
            Thread.sleep(2000);
            sc.eneterSalary("55000.00");
            Thread.sleep(2000);
            driver.findElement(By.name("contr.datePaid")).clear();
            Thread.sleep(1000);
            driver.findElement(By.name("contr.datePaid")).sendKeys("12/31/2018",Keys.ENTER);
            Thread.sleep(1000);
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
                sc.enterStatus("Unregistered");
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id=\"ext-gen426\"]")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id=\"ext-gen549\"]")).click();
                Thread.sleep(1000);
                driver.navigate().refresh();
            } catch (Exception e) {
                e.getCause();
                e.printStackTrace();
            }

        }
    }

}
