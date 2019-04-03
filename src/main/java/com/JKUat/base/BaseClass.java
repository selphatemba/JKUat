package com.JKUat.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public abstract class BaseClass {


    public Properties OR = new Properties();
    public static ExtentReports extent;
    public static ExtentTest test;
    public ITestResult result;

    //connection parameters for the browser
    //public  String webUrl="http://192.168.10.191:8080/Xi/";
    public  String driverLocation="/home/mfuon/IdeaProjects/jkuat1/drivers/chromedriver";
    public static WebDriver driver;

    public static Logger log=Logger.getLogger(BaseClass.class.getName());


    public void configLogger(){
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        // BasicConfigurator.configure();
    }

    //to connect to webdriver
    public void getConnection(){
        configLogger();
        System.setProperty("webdriver.chrome.driver",driverLocation);
        driver=new ChromeDriver();
       // driver.get(webUrl);
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //to connect to webdriver
    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","src/main/drivers/chromedriver");
            driver=new ChromeDriver();
        }
        return driver;

    }

    public static void takeSnapshot(WebDriver webDriver,String fileWidthPath)throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot= (TakesScreenshot) webDriver;

        //Call getScreenshotAs method to create image file
        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destFile=new File(fileWidthPath);

        //Copy file at destination
        FileUtils.copyFile(srcFile,destFile);


    }

    public static void sendPDFreportByGMail(String from, String pass, String to, String subject, String body) throws MessagingException {
        log.info("Trying to send Mail");

        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {

            //Set from address

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//Set subject

            message.setSubject(subject);

            message.setText(body);

            BodyPart objMessageBodyPart = new MimeBodyPart();

            objMessageBodyPart.setText("Please Find The Attached Report File!");

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart(objMessageBodyPart);

            objMessageBodyPart = new MimeBodyPart();

//Set path to the pdf report file

            String filename = System.getProperty("user.dir") + "/BOU.pdf";

//Create data source to attach the file in mail

            DataSource source = new FileDataSource(filename);

            objMessageBodyPart.setDataHandler(new DataHandler(source));

            objMessageBodyPart.setFileName(filename);

            multipart.addBodyPart(objMessageBodyPart);

            message.setContent(multipart);

            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            log.info("sent Mail");

        } catch (AddressException ae) {

            ae.printStackTrace();
        }


    }


    public static void getScreenShot(WebDriver driver, ITestResult result, String folderName) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

        // String methodName = result.getName();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
                    + "/src/main/java/com/test/uiAutomation/screenshot/";
            File destFile = new File((String) reportDirectory + "/" + folderName + "/" + "_"
                    + formater.format(calendar.getTime()) + ".png");

            FileUtils.copyFileToDirectory(scrFile, destFile);

            Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
                    + "' height='100' width='100'/> </a>");

        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();

        // Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File(folderName));
        }

        catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }



    public void getScreenShotOnSucess(WebDriver driver, ITestResult result) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

        String methodName = result.getName();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
                    + "/src/main/java/com/test/automation/uiAutomation/";
            File destFile = new File((String) reportDirectory + "/failure_screenshots/" + methodName + "_"
                    + formater.format(calendar.getTime()) + ".png");

            FileUtils.copyFile(scrFile, destFile);

            Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
                    + "' height='100' width='100'/> </a>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void getScreenShots(String name) throws Exception {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");


        try {
            String screenshotsDir = "screenshot";
            String filename = name+"_"+ formater.format(calendar.getTime()) + ".png";
            Path screenshotPath = Paths.get(screenshotsDir, filename);
            File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SrcFile, screenshotPath.toFile());



//			File scrFile = ((TakesScreenshot) drivers).getScreenshotAs(OutputType.FILE);
//
//
//			FileUtils.copyFile(scrFile,	new File("C:\\screenshot" + name + "_" + formater.format(calendar.getTime()) + ".png"));
//
//             //This will help us to link the screen shot in testNG report
//             Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" +
//             destFile.getAbsolutePath()
//             + "' height='100' width='100'/> </a>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void GridStart(String browser) throws IOException {

        if (System.getProperty("os.name").contains("Mac")) {
            if (browser.equals("chrome")) {
                // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                // + "/drivers/chromedriver");
                System.out.println(" Executing on CHROME");
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                cap.setBrowserName("chrome");
                String Node = "http://192.168.10.239:4444/wd/hub";
                driver = new RemoteWebDriver(new URL(Node), cap);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // Launch website
                loadData();
                getUrl(OR.getProperty("url"));
            } else if (browser.equals("firefox")) {
                // System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
                // "/drivers/geckodriver.exe");
                System.out.println(" Executing on FireFox");
                String Node = "http://192.168.10.239:4444/wd/hub";
                DesiredCapabilities cap = DesiredCapabilities.firefox();
                cap.setBrowserName("firefox");
                driver = new RemoteWebDriver(new URL(Node), cap);
                loadData();
                getUrl(OR.getProperty("url"));
            } else if (browser.equalsIgnoreCase("ie")) {
                System.out.println(" Executing on IE");
                DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
                cap.setBrowserName("ie");
                String Node = "http://192.168.10.239:4444/wd/hub";
                driver = new RemoteWebDriver(new URL(Node), cap);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // Launch website
                loadData();
                getUrl(OR.getProperty("url"));
            } else {
                throw new IllegalArgumentException("The Browser Type is Undefined");
            }
        }
        if (System.getProperty("os.name").contains("Window")) {
            if (browser.equals("chrome")) {
                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                System.out.println(" Executing on CHROME");
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                cap.setBrowserName("chrome");
                String Node = "http://192.168.10.239:4444/wd/hub";
                driver = new RemoteWebDriver(new URL(Node), cap);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // Launch website
                loadData();
                getUrl(OR.getProperty("url"));
            } else if (browser.equals("firefox")) {
                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/drivers/geckodriver.exe");
                System.out.println(" Executing on FireFox");
                String Node = "http://192.168.10.239:4444/wd/hub";
                DesiredCapabilities cap = DesiredCapabilities.firefox();
                cap.setBrowserName("firefox");
                driver = new RemoteWebDriver(new URL(Node), cap);
                loadData();
                getUrl(OR.getProperty("url"));
            } else if (browser.equalsIgnoreCase("ie")) {
                System.out.println(" Executing on IE");
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                cap.setBrowserName("ie");
                String Node = "http://192.168.10.239:4444/wd/hub";
                driver = new RemoteWebDriver(new URL(Node), cap);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // Launch website
                getUrl(OR.getProperty("url"));
            } else {
                throw new IllegalArgumentException("The Browser Type is Undefined");
            }
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        extent = new ExtentReports(
                System.getProperty("user.dir") + "/src/main/resources/configurations.properties"
                        + formater.format(calendar.getTime()) + ".html",
                false);
    }

    public void loadData() throws IOException {
        File file = new File(
                System.getProperty("user.dir") + "/src/main/resources/configurations.properties");
        FileInputStream f = new FileInputStream(file);
        OR.load(f);

    }


    public void setDriver(EventFiringWebDriver driver) {
        this.driver = driver;
    }




    public void init() throws Exception {

        loadData();
        String log4jConfPath = "/home/mfuon/IdeaProjects/jkuat1/src/main/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        System.out.println(OR.getProperty("browser"));
        selectBrowser(OR.getProperty("browser"));
        getUrl(OR.getProperty("url"));
//        Thread.sleep(1500);
//			screen.click(closeThis);
//		Thread.sleep(1500);

    }



    public void waitForPageLoaded(){
        ExpectedCondition<Boolean> expectation =new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }




    public void selectBrowser(String browser) {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").contains("Window")) {
            if (browser.equals("chrome")) {

                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "drivers/chromedriver");
//                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--headless");
//                driver = new ChromeDriver(chromeOptions);
//				driver.manage().window().maximize();
                // driver = new EventFiringWebDriver(dr);
                // eventListener = new WebEventListener();
                // driver.register(eventListener);
                driver=new ChromeDriver();
            } else if (browser.equals("firefox")) {
                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "src/main/drivers/chromedriver");
                driver = new FirefoxDriver();
                // driver = new EventFiringWebDriver(dr);

                // driver.register(eventListener);
                // setDriver(driver);
            }
        } else if (System.getProperty("os.name").contains("Mac")) {
            if (browser.equals("chrome")) {
                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "src/main/drivers/chromedriver");
                driver = new ChromeDriver();
                // driver = new EventFiringWebDriver(dr);
                // eventListener = new WebEventListener();
                // driver.register(eventListener);
            } else if (browser.equals("firefox")) {
                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.firefox.marionette",
                        System.getProperty("user.dir") + "/drivers/geckodriver");
                driver = new FirefoxDriver();
                // driver = new EventFiringWebDriver(dr);

                // driver.register(eventListener);
                // setDriver(driver);
            }
        }
    }

    public void getUrl(String url) {
        log.info("navigating to :-" + url);
        getDriver();
        driver.get(url);
        driver.manage().window().maximize();

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void pressEnter()throws  Exception{
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }





}
