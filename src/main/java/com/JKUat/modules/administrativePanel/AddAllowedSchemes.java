package com.JKUat.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AddAllowedSchemes extends BaseClass {
    public static final Logger log = Logger.getLogger(AddAllowedSchemes.class.getName());

    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[4]/center/a")
    WebElement adminPanel;

    @FindBy(xpath = "//*[@id=\"existingUsers\"]")
    WebElement existingUsers;

    @FindBy(name = "user-name")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"ext-gen86-gp-profile-System Administrators-bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectAuser;

    @FindBy(xpath = "//*[@id=\"ext-gen109\"]")
    WebElement details;

    @FindBy(linkText = "Allowed Schemes")
    WebElement allowedSchemes;

    @FindBy(xpath = "//*[@id=\"ext-gen328\"]")
    WebElement addAlowedSchemes;

    @FindBy(name = "schemeNameField")
    WebElement schemeName;

    @FindBy(xpath = "//*[@id=\"ext-gen368-gp-none--bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectScheme;

    @FindBy(xpath = "//*[@id=\"ext-gen389\"]")
    WebElement add;

    public AddAllowedSchemes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAdminPanel(){
        adminPanel.click();
    }

    public void clickOnExistingUsers(){existingUsers.click();}

    public void enterUserName(String uname){userName.sendKeys(uname, Keys.ENTER);}

    public void selectUser(){selectAuser.click();}

    public void clickOnDetails(){details.click();}

    public void clickOnAllowedSchemes(){allowedSchemes.click();}

    public void clickOnAddAllowedSchemes(){addAlowedSchemes.click();}

    public void enterSchemeName(String sn){schemeName.sendKeys(sn,Keys.ENTER);}

    public void selectAscheme(){selectScheme.click();}

    public void clickAdd(){add.click();}
}
