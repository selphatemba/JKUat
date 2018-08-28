package com.JKUat.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseClass{

     private WebDriver driver;

    @FindBy(xpath = "//*[@name=\"user.username\"]")
    public WebElement username;

    @FindBy(name = "user.password")
    public  WebElement password;

    @FindBy(id = "ext-gen32")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
    }

    public void login (String name, String pass)throws InterruptedException{
        //System.out.println("driver is========="+driver);
        username.sendKeys(name);
        Thread.sleep(1500);
        password.sendKeys(pass);
        Thread.sleep(1500);
        loginButton.click();
    }

}
