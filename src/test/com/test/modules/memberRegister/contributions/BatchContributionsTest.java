package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.BatchContributions;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BatchContributionsTest extends BaseClass {

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
    public void doBatchContributions()throws Exception{
        BatchContributions bc = new BatchContributions(driver);
        int i;
        for (i=0;i<=3;i++) {
            if(i==0){
            log.info("Starting Batch Contributions");
            Thread.sleep(3000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(3000);
            driver.findElement(By.id("memReg")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("ext-gen53")).click();
            Thread.sleep(3000);
            bc.clickOnBatchContributions();
            Thread.sleep(3000);
            bc.enterBatchTitle("New Contributions");
            Thread.sleep(3000);
            bc.enterBatchDate("03/04/2019");
            Thread.sleep(3000);
            bc.enterSponsorname("JKUAT SRBS");
            Thread.sleep(3000);
            bc.enterCostCentre("JKUAT SRBS Cost Centre");
            Thread.sleep(3000);
            bc.enterYear("2018");
            Thread.sleep(3000);
            bc.enterMonth("November");
            Thread.sleep(3000);
            driver.findElement(By.name("batch.chequeAmount")).sendKeys("114701.02");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"ext-gen394\"]")).click();
            Thread.sleep(5000);
            driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\Batch Contr.xls");
            Thread.sleep(3000);
            //upload
            driver.findElement(By.xpath("//*[@id=\"ext-gen492\"]")).click();
            Thread.sleep(7000);
            //selecting a sheet
            driver.findElement(By.xpath("//*[@id=\"ext-gen575\"]/div/table/thead/tr/td[1]/div/div")).click();
            Thread.sleep(3000);
            //apply this sheet
            driver.findElement(By.xpath("//*[@id=\"ext-gen586\"]")).click();
            Thread.sleep(40000);
            //save
            driver.findElement(By.xpath("//*[@id=\"ext-gen208\"]")).click();
            Thread.sleep(3000);
            driver.navigate().refresh();
            log.info("finished Batch Contributions");
            Thread.sleep(3000);
            //contributions
            driver.findElement(By.xpath("//*[@id=\"ext-gen53\"]")).click();
            Thread.sleep(3000);
            //previous Batch Contributions
            driver.findElement(By.xpath("//*[@id=\"ext-gen96\"]")).click();
            Thread.sleep(3000);
            //serach by unposted
            driver.findElement(By.xpath("//*[@id=\"ext-gen191\"]")).click();
            Thread.sleep(3000);
            //unposted
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1825\"]")).click();
            Thread.sleep(3000);
            //select all batches
            driver.findElement(By.xpath("//*[@id=\"ext-gen153\"]/div/table/thead/tr/td[1]/div/div")).click();
            Thread.sleep(3000);
            //certification
            driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
            Thread.sleep(3000);
            //certify
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1781\"]")).click();
            Thread.sleep(3000);
            //yes
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
            //certification
            driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
            Thread.sleep(3000);
            //Approve
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1782\"]")).click();
            Thread.sleep(3000);
            //yes
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
//        //batchPosting
            driver.findElement(By.xpath("//*[@id=\"ext-gen179\"]")).click();
            Thread.sleep(3000);
            //Post Batch
            driver.findElement(By.xpath("//*[@id=\"postbatchbutton\"]")).click();
            Thread.sleep(9000);
            //yes
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
            log.info("Batch successfully posted");
            Thread.sleep(10000);
            driver.navigate().refresh();
            }else if(i==1){
                log.info("Starting Batch Contributions");
                Thread.sleep(3000);
//        driver.findElement(By.id("membLnk")).click();
//        Thread.sleep(3000);
                driver.findElement(By.id("memReg")).click();
                Thread.sleep(3000);
                driver.findElement(By.id("ext-gen53")).click();
                Thread.sleep(3000);
                bc.clickOnBatchContributions();
                Thread.sleep(3000);
                bc.enterBatchTitle("New Contributions");
                Thread.sleep(3000);
                bc.enterBatchDate("03/04/2019");
                Thread.sleep(3000);
                bc.enterSponsorname("SCHEME SCHEMA SPONSOR5");
                Thread.sleep(3000);
                bc.enterCostCentre("SCHEME SCHEMA SPONSOR5 Cost Centre");
                Thread.sleep(3000);
                bc.enterYear("2018");
                Thread.sleep(3000);
                bc.enterMonth("December");
                Thread.sleep(3000);
                driver.findElement(By.name("batch.chequeAmount")).sendKeys("114701.02");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-gen394\"]")).click();
                Thread.sleep(5000);
                driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\Batch Contr.xls");
                Thread.sleep(3000);
                //upload
                driver.findElement(By.xpath("//*[@id=\"ext-gen492\"]")).click();
                Thread.sleep(7000);
                //selecting a sheet
                driver.findElement(By.xpath("//*[@id=\"ext-gen575\"]/div/table/thead/tr/td[1]/div/div")).click();
                Thread.sleep(3000);
                //apply this sheet
                driver.findElement(By.xpath("//*[@id=\"ext-gen586\"]")).click();
                Thread.sleep(40000);
                //save
                driver.findElement(By.xpath("//*[@id=\"ext-gen208\"]")).click();
                Thread.sleep(3000);
                driver.navigate().refresh();
                log.info("finished Batch Contributions");
                Thread.sleep(3000);
                //contributions
                driver.findElement(By.xpath("//*[@id=\"ext-gen53\"]")).click();
                Thread.sleep(3000);
                //previous Batch Contributions
                driver.findElement(By.xpath("//*[@id=\"ext-gen96\"]")).click();
                Thread.sleep(3000);
                //serach by unposted
                driver.findElement(By.xpath("//*[@id=\"ext-gen191\"]")).click();
                Thread.sleep(3000);
                //unposted
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1825\"]")).click();
                Thread.sleep(3000);
                //select all batches
                driver.findElement(By.xpath("//*[@id=\"ext-gen153\"]/div/table/thead/tr/td[1]/div/div")).click();
                Thread.sleep(3000);
                //certification
                driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
                Thread.sleep(3000);
                //certify
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1781\"]")).click();
                Thread.sleep(3000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
                //certification
                driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
                Thread.sleep(3000);
                //Approve
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1782\"]")).click();
                Thread.sleep(3000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
//        //batchPosting
                driver.findElement(By.xpath("//*[@id=\"ext-gen179\"]")).click();
                Thread.sleep(3000);
                //Post Batch
                driver.findElement(By.xpath("//*[@id=\"postbatchbutton\"]")).click();
                Thread.sleep(9000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(10000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
                log.info("Batch successfully posted");
                Thread.sleep(10000);
                driver.navigate().refresh();
            }else if(i==2){
                log.info("Starting Batch Contributions");
                Thread.sleep(3000);
//        driver.findElement(By.id("membLnk")).click();
//        Thread.sleep(3000);
                driver.findElement(By.id("memReg")).click();
                Thread.sleep(3000);
                driver.findElement(By.id("ext-gen53")).click();
                Thread.sleep(3000);
                bc.clickOnBatchContributions();
                Thread.sleep(3000);
                bc.enterBatchTitle("New Contributions");
                Thread.sleep(3000);
                bc.enterBatchDate("03/04/2019");
                Thread.sleep(3000);
                bc.enterSponsorname("SCHEME SCHEMA SPONSOR5");
                Thread.sleep(3000);
                bc.enterCostCentre("SCHEME SCHEMA SPONSOR5 Cost Centre");
                Thread.sleep(3000);
                bc.enterYear("2019");
                Thread.sleep(3000);
                bc.enterMonth("January");
                Thread.sleep(3000);
                driver.findElement(By.name("batch.chequeAmount")).sendKeys("114701.02");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-gen394\"]")).click();
                Thread.sleep(5000);
                driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\Batch Contr.xls");
                Thread.sleep(3000);
                //upload
                driver.findElement(By.xpath("//*[@id=\"ext-gen492\"]")).click();
                Thread.sleep(7000);
                //selecting a sheet
                driver.findElement(By.xpath("//*[@id=\"ext-gen575\"]/div/table/thead/tr/td[1]/div/div")).click();
                Thread.sleep(3000);
                //apply this sheet
                driver.findElement(By.xpath("//*[@id=\"ext-gen586\"]")).click();
                Thread.sleep(40000);
                //save
                driver.findElement(By.xpath("//*[@id=\"ext-gen208\"]")).click();
                Thread.sleep(3000);
                driver.navigate().refresh();
                log.info("finished Batch Contributions");
                Thread.sleep(3000);
                //contributions
                driver.findElement(By.xpath("//*[@id=\"ext-gen53\"]")).click();
                Thread.sleep(3000);
                //previous Batch Contributions
                driver.findElement(By.xpath("//*[@id=\"ext-gen96\"]")).click();
                Thread.sleep(3000);
                //serach by unposted
                driver.findElement(By.xpath("//*[@id=\"ext-gen191\"]")).click();
                Thread.sleep(3000);
                //unposted
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1825\"]")).click();
                Thread.sleep(3000);
                //select all batches
                driver.findElement(By.xpath("//*[@id=\"ext-gen153\"]/div/table/thead/tr/td[1]/div/div")).click();
                Thread.sleep(3000);
                //certification
                driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
                Thread.sleep(3000);
                //certify
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1781\"]")).click();
                Thread.sleep(3000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
                //certification
                driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
                Thread.sleep(3000);
                //Approve
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1782\"]")).click();
                Thread.sleep(3000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
//        //batchPosting
                driver.findElement(By.xpath("//*[@id=\"ext-gen179\"]")).click();
                Thread.sleep(3000);
                //Post Batch
                driver.findElement(By.xpath("//*[@id=\"postbatchbutton\"]")).click();
                Thread.sleep(9000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(10000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
                log.info("Batch successfully posted");
                Thread.sleep(10000);
                driver.navigate().refresh();

            }else{
                log.info("Starting Batch Contributions");
                Thread.sleep(3000);
//        driver.findElement(By.id("membLnk")).click();
//        Thread.sleep(3000);
                driver.findElement(By.id("memReg")).click();
                Thread.sleep(3000);
                driver.findElement(By.id("ext-gen53")).click();
                Thread.sleep(3000);
                bc.clickOnBatchContributions();
                Thread.sleep(3000);
                bc.enterBatchTitle("New Contributions");
                Thread.sleep(3000);
                bc.enterBatchDate("03/04/2019");
                Thread.sleep(3000);
                bc.enterSponsorname("SCHEME SCHEMA SPONSOR5");
                Thread.sleep(3000);
                bc.enterCostCentre("SCHEME SCHEMA SPONSOR5 Cost Centre");
                Thread.sleep(3000);
                bc.enterYear("2019");
                Thread.sleep(3000);
                bc.enterMonth("February");
                Thread.sleep(3000);
                driver.findElement(By.name("batch.chequeAmount")).sendKeys("114701.02");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-gen394\"]")).click();
                Thread.sleep(5000);
                driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\Batch Contr.xls");
                Thread.sleep(3000);
                //upload
                driver.findElement(By.xpath("//*[@id=\"ext-gen492\"]")).click();
                Thread.sleep(7000);
                //selecting a sheet
                driver.findElement(By.xpath("//*[@id=\"ext-gen575\"]/div/table/thead/tr/td[1]/div/div")).click();
                Thread.sleep(3000);
                //apply this sheet
                driver.findElement(By.xpath("//*[@id=\"ext-gen586\"]")).click();
                Thread.sleep(40000);
                //save
                driver.findElement(By.xpath("//*[@id=\"ext-gen208\"]")).click();
                Thread.sleep(3000);
                driver.navigate().refresh();
                log.info("finished Batch Contributions");
                Thread.sleep(3000);
                //contributions
                driver.findElement(By.xpath("//*[@id=\"ext-gen53\"]")).click();
                Thread.sleep(3000);
                //previous Batch Contributions
                driver.findElement(By.xpath("//*[@id=\"ext-gen96\"]")).click();
                Thread.sleep(3000);
                //serach by unposted
                driver.findElement(By.xpath("//*[@id=\"ext-gen191\"]")).click();
                Thread.sleep(3000);
                //unposted
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1825\"]")).click();
                Thread.sleep(3000);
                //select all batches
                driver.findElement(By.xpath("//*[@id=\"ext-gen153\"]/div/table/thead/tr/td[1]/div/div")).click();
                Thread.sleep(3000);
                //certification
                driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
                Thread.sleep(3000);
                //certify
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1781\"]")).click();
                Thread.sleep(3000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
                //certification
                driver.findElement(By.xpath("//*[@id=\"ext-gen175\"]")).click();
                Thread.sleep(3000);
                //Approve
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1782\"]")).click();
                Thread.sleep(3000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
//              //batchPosting
                driver.findElement(By.xpath("//*[@id=\"ext-gen179\"]")).click();
                Thread.sleep(3000);
                //Post Batch
                driver.findElement(By.xpath("//*[@id=\"postbatchbutton\"]")).click();
                Thread.sleep(9000);
                //yes
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1838\"]/tbody/tr[2]/td[2]")).click();
                Thread.sleep(10000);
                driver.findElement(By.xpath("//*[@id=\"ext-comp-1837\"]/tbody/tr[2]/td[2]")).click();
                log.info("Batch successfully posted");
                Thread.sleep(10000);
                //driver.navigate().refresh();
                driver.quit();
            }
        }


    }
}
