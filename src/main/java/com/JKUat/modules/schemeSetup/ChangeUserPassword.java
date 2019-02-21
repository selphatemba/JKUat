package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ChangeUserPassword extends BaseClass {
    public static final Logger log = Logger.getLogger(ChangeUserPassword.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(name = "user.password")
    WebElement currentPasswd;

    @FindBy(name = "newPassword")
    WebElement newPasswd;

    @FindBy(name = "confirmPassword")
    WebElement confirmpasswd;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement save;

    @FindBy(name = "user.username")
    WebElement loginUsername;

    @FindBy(name = "user.password")
    WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"ext-gen32\"]")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"ext-gen4\"]")
    WebElement loginButton;

    @FindBy(linkText = "Switch Scheme")
    WebElement switchScheme;

    @FindBy(name = "schemeNameField")
    WebElement typeSchemeName;

    @FindBy(xpath = "//*[@id=\"ext-gen78-gp-none--bd\"]/div")
    WebElement selectPlanType;

    @FindBy(xpath = "//*[@id=\"ext-gen78-gp-none--bd\"]/div")
    WebElement selectAScheme;

    @FindBy(xpath = "//*[@id=\"ext-gen104\"]")
    WebElement setAsWorkingScheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1073\"]/tbody/tr[2]/td[2]")
    WebElement clickOk;

    @FindBy(xpath = "//*[@id=\"ext-gen71\"]")
    WebElement close;



    public ChangeUserPassword(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){
        mainMenu.click();
    }

    public void enterCurrentPasswd(String curpass){
        currentPasswd.sendKeys(curpass,Keys.TAB);
    }

    public void enterNewPassword(String newpswd){
        newPasswd.sendKeys(newpswd,Keys.TAB);
    }

    public void enterConfirmPswd(String cnfrmp){
        confirmpasswd.sendKeys(cnfrmp,Keys.TAB);
    }

    public void clickSave(){
        save.click();
    }

    public void enterloginUsername(String usr){
        loginUsername.sendKeys(usr,Keys.TAB);
    }

    public void enterloginPasswd(String pswd){
        loginPassword.sendKeys(pswd,Keys.TAB);
    }

    public void  clickSaveLogin(){
        login.click();
    }

    public void clickloginButton(){
        loginButton.click();
    }

    public void clickSwitchScheme(){
        switchScheme.click();
    }

    public void enterSchemeNAme(String schName){
        typeSchemeName.sendKeys(schName, Keys.TAB);
    }

    public void enterPlanType(String planTy){
        selectPlanType.sendKeys(planTy,Keys.TAB);
    }

    public void selectcheme(){
        selectAScheme.click();
    }

    public void clickSetAsWorkingScheme(){
        setAsWorkingScheme.click();
    }

    public void clickOnOk(){clickOk.click();}

    public void clickClose(){close.click();}




}

