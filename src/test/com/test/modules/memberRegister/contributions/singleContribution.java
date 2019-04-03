package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.SingleContribution;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
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
        Thread.sleep(2000);
        asd.enterloginUsername("admin");
        Thread.sleep(2000);
        asd.enterloginPasswd("admin");
        Thread.sleep(1000);
        asd.clickSaveLogin();
    }


    @Test(priority = 1)
    public void doSingleEEContribution() throws Exception {
        SingleContribution sc = new SingleContribution(driver);

        log.info("=========== Started Single contribution Test=============");
        //loop starts here
        Thread.sleep(2000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(2000);

        for (int i = 0; i < 12; i++) {
            //members
            driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]")).click();
            Thread.sleep(3000);
            //sponsor Register
            driver.findElement(By.id("membRegMenu")).click();
            Thread.sleep(2000);
            //enter sponsor
            driver.findElement(By.name("sponsorMNameField")).sendKeys("JKUAT SRBS", Keys.ENTER);
            Thread.sleep(2000);
            //select a sponsor
            driver.findElement(By.xpath("//*[@id=\"ext-gen129-gp-sector-Educational-bd\"]/div/table/tbody/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            //view members
            driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]")).click();
            Thread.sleep(1000);
            sc.enterMemberNumber2("1000022");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"ext-gen202-gp-mclass-Management-bd\"]/div/table/tbody/tr/td[1]/div/div")).click();
            Thread.sleep(3000);
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
            sc.entercontrType("Normal Contributions");
            Thread.sleep(3000);

            try {
                if (i == 0)
                    sc.enterMonth("July");
                else if (i == 1)
                    sc.enterMonth("August");
                else if (i == 2)
                    sc.enterMonth("September");
                else if (i == 3)
                    sc.enterMonth("October");
                else if (i == 4)
                    sc.enterMonth("November");
                else if (i == 5)
                    sc.enterMonth("December");
                else if (i == 6)
                    sc.enterMonth("January");
                else if (i == 7)
                    sc.enterMonth("February");
                else if (i == 8)
                    sc.enterMonth("March");
                else if (i == 9)
                    sc.enterMonth("April");
                else if (i == 10)
                    sc.enterMonth("May");
                else if (i == 11)
                    sc.enterMonth("June");
                Thread.sleep(2000);
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                    Thread.sleep(1000);
                    sc.enterYear("2017");
                    Thread.sleep(2000);
                    sc.enterStatus("Registered");
                    Thread.sleep(2000);
                    //save
                    driver.findElement(By.xpath("//*[@id=\"ext-gen458\"]")).click();
                    Thread.sleep(2000);
                }else
                {
                    Thread.sleep(2000);
                    sc.enterYear("2018");
                    Thread.sleep(2000);
                    sc.enterStatus("Registered");
                    Thread.sleep(2000);
                    //save
                    driver.findElement(By.xpath("//*[@id=\"ext-gen458\"]")).click();
                    Thread.sleep(2000);
                }
//              //yes
//              driver.findElement(By.xpath("//*[@id=\"ext-gen581\"]")).click();
//              Thread.sleep(2000);
                    //ok
//              driver.findElement(By.xpath("//*[@id=\"ext-gen579\"]")).click();
//              Thread.sleep(2000);
                    driver.navigate().refresh();
                } catch(Exception e){
                    e.getCause();
                    e.printStackTrace();
                }
            }


    }

    @Test(priority = 2)
    public void doSingleERContribution() throws Exception {
        SingleContribution sc = new SingleContribution(driver);

        log.info("=========== Started Single contribution Test=============");
        //loop starts here
//        Thread.sleep(2000);
//        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(2000);

        for (int i = 0; i < 12; i++) {
            //members
            driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]")).click();
            Thread.sleep(3000);
            //sponsor Register
            driver.findElement(By.id("membRegMenu")).click();
            Thread.sleep(2000);
            //enter sponsor
            driver.findElement(By.name("sponsorMNameField")).sendKeys("JKUAT SRBS", Keys.ENTER);
            Thread.sleep(2000);
            //select a sponsor
            driver.findElement(By.xpath("//*[@id=\"ext-gen129-gp-sector-Educational-bd\"]/div/table/tbody/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            //view members
            driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]")).click();
            Thread.sleep(1000);
            sc.enterMemberNumber2("1000022");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"ext-gen202-gp-mclass-Management-bd\"]/div/table/tbody/tr/td[1]/div/div")).click();
            Thread.sleep(3000);
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
            sc.entercontrType("Normal Contributions");
            Thread.sleep(3000);

            try {
                if (i == 0)
                    sc.enterMonth("July");
                else if (i == 1)
                    sc.enterMonth("August");
                else if (i == 2)
                    sc.enterMonth("September");
                else if (i == 3)
                    sc.enterMonth("October");
                else if (i == 4)
                    sc.enterMonth("November");
                else if (i == 5)
                    sc.enterMonth("December");
                else if (i == 6)
                    sc.enterMonth("January");
                else if (i == 7)
                    sc.enterMonth("February");
                else if (i == 8)
                    sc.enterMonth("March");
                else if (i == 9)
                    sc.enterMonth("April");
                else if (i == 10)
                    sc.enterMonth("May");
                else if (i == 11)
                    sc.enterMonth("June");
                Thread.sleep(2000);
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                    Thread.sleep(2000);
                    sc.enterYear("2017");
                    Thread.sleep(2000);
                    sc.enterStatus("Unregistered");
                    Thread.sleep(2000);
                    //save
                    driver.findElement(By.xpath("//*[@id=\"ext-gen458\"]")).click();
                    Thread.sleep(2000);
                }else
                {
                    Thread.sleep(2000);
                    sc.enterYear("2018");
                    Thread.sleep(2000);
                    sc.enterStatus("Unregistered");
                    Thread.sleep(2000);
                    //save
                    driver.findElement(By.xpath("//*[@id=\"ext-gen458\"]")).click();
                    Thread.sleep(2000);
                }
                driver.navigate().refresh();
//              //yes
//              driver.findElement(By.xpath("//*[@id=\"ext-gen581\"]")).click();
//              Thread.sleep(2000);
                //ok
//              driver.findElement(By.xpath("//*[@id=\"ext-gen579\"]")).click();
//              Thread.sleep(2000);

            } catch (Exception e) {
                e.getCause();
                e.printStackTrace();
            }
        }

    }


}
