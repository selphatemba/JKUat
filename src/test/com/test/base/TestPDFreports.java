//package com.test.base;
//
//import com.JKUat.base.BaseClass;
//
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import java.util.Properties;
//
//import javax.mail.internet.AddressException;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//
//
//public class TestPDFreports extends BaseClass {
//    WebDriver driver;
//
//    //Testcase failed so screen shot generate
//    @Test
//    public void testPDFreport1() {
//        driver = BaseClass.getDriver();
//        log.info("====driver is=====" +driver);
//        driver.get("http://google.com");
//        Assert.assertTrue(false);
//    }
//
//    //Testcase failed so screen shot generate
//    @Test
//    public void testPDFreport2() throws Exception{
//        driver = BaseClass.getDriver();
//        log.info("====driver is=====" +driver);
//        driver.get("http:/guru99.com");
//        Thread.sleep(3000);
//        Assert.assertTrue(false);
//    }
//
//    //Test test case will be pass, so no screen shot on it
//    @Test
//    public void testPDFreport3() throws Exception{
//        driver = BaseClass.getDriver();
//        log.info("====driver is=====" +driver);
//        driver.get("http://demo.guru99.com");
//        Thread.sleep(3000);
//        Assert.assertTrue(true);
//    }
//
//
//
//
//
//
//}
//
//
//
//
