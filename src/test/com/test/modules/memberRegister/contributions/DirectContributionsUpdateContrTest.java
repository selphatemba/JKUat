package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.DirectContr;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DirectContributionsUpdateContrTest extends BaseClass {


    @Test(priority = 0)
    public void openMemberPage()throws Exception{

        log.info("==============logging in user====================");
        LoginPageTest loginPageTest=new LoginPageTest();
        loginPageTest.loginUser();
        log.info("==============user successfully logged in===========");
    }

    @Test(priority = 1)
    public void doTest()throws Exception {
        Actions actions=new Actions(driver);
        DirectContr cd = new DirectContr(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(7000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("memReg")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ext-gen53")).click();
        Thread.sleep(2000);

        WebElement directContr=driver.findElement(By.xpath("//*[@id=\"ext-gen318\"]"));
        actions.moveToElement(directContr).build().perform();
        Thread.sleep(7000);
        driver.findElement(By.id("ext-gen341")).click();
        Thread.sleep(3000);
        cd.enterBatchTitle("March2018 Batch");
        Thread.sleep(2500);
        WebElement costCentr=driver.findElement(By.xpath("//*[@id=\"ext-comp-2022\"]"));
        actions.moveToElement(costCentr);
        actions.click();
        actions.sendKeys("BANK OF UGANDA");
        actions.build().perform();
        Thread.sleep(2500);

        WebElement contribtnType=driver.findElement(By.xpath("//*[@id=\"ext-comp-2017\"]"));
        actions.moveToElement(contribtnType);
        actions.click();
        actions.sendKeys("Normal Contributions");
        actions.build().perform();
        Thread.sleep(2500);

        WebElement sponsor=driver.findElement(By.xpath("//*[@id=\"ext-comp-2020\"]"));
        actions.moveToElement(sponsor);
        actions.click();
        actions.sendKeys("BANK OF UGANDA");
        actions.build().perform();
        Thread.sleep(2500);

        cd.enterYear("2018");
        Thread.sleep(2500);
        cd.enterMonth("January");
        Thread.sleep(2500);

        WebElement contrStatus=driver.findElement(By.xpath("//*[@id=\"ext-comp-2028\"]"));
        actions.moveToElement(contrStatus);
        actions.click();
        actions.sendKeys("Registered");
        actions.build().perform();
        Thread.sleep(3000);


        driver.findElement(By.id("ext-gen408")).click();
        Thread.sleep(2500);
       driver.findElement(By.name("batchSchedule")).sendKeys("/home/selpha/JKUat templates/Direct Contributions Template.xls");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"ext-gen565\"]")).click();
        Thread.sleep(7500);
        String batchtotal = driver.findElement(By.name("batch.batchTotal")).getAttribute("value");
        log.info("the batch totall is:======"+batchtotal);
        Thread.sleep(2500);
        driver.findElement(By.name("batch.chequeAmount")).sendKeys(batchtotal);
        Thread.sleep(2500);
        driver.navigate().refresh();
    }
}
