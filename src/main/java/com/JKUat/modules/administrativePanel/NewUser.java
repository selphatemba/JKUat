package com.JKUat.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.logging.Logger;

public class NewUser extends BaseClass {

    public static final Logger log = Logger.getLogger(NewUser.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[4]/center/a")
    WebElement adminPanel;

    @FindBy(xpath = "//*[@id=\"existingUsers\"]")
    WebElement existingUsers;

    @FindBy(xpath = "//*[@id=\"ext-gen105\"]")
    WebElement newUser;

    @FindBy(name = "user.surname")
    WebElement surname;

    @FindBy(name = "user.othernames")
    WebElement otherNames;

    @FindBy(name = "user.username")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"ext-comp-1173\"]")
    WebElement profile;

    @FindBy(xpath = "//*[@id=\"ext-comp-1177\"]")
    WebElement isAdmin;

    @FindBy(xpath = "//*[@id=\"ext-comp-1179\"]")
    WebElement defaultModule;

    @FindBy(xpath = "//*[@id=\"ext-gen250\"]")
    WebElement save;



    public NewUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdminPanel(){
        adminPanel.click();
    }

    public void clickExistingUsers(){
        existingUsers.click();
    }

    public void clickNewUser(){
        newUser.click();
    }

    public void enterSurname(String sname){
        surname.sendKeys(sname, Keys.TAB);
    }

    public void enterOtherNames(String oname){
        otherNames.sendKeys(oname,Keys.TAB);
    }

    public void enterUserName(String uname){
        username.sendKeys(uname,Keys.TAB);
    }

    public void enterProfile(String pro){
        profile.sendKeys(pro,Keys.TAB);
    }

    public void enterIsAdmin(String isAd){
        isAdmin.sendKeys(isAd,Keys.TAB);
    }

    public void enterDefaultScheme(String defaultsch){
        defaultModule.sendKeys(defaultsch,Keys.TAB);
    }

    public void clickSave(){
        save.click();
    }


}
