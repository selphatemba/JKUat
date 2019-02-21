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

    @FindBy(xpath = "//*[@id=\"ext-gen86-gp-profile-System Administrators-bd\"]/div")
    WebElement selectUser;

    @FindBy(xpath = "//*[@id=\"ext-gen109\"]")
    WebElement details;

    @FindBy(linkText = "Allowed Schemes")
    WebElement allowedSchemes;

    @FindBy(xpath = "//*[@id=\"ext-gen326\"]")
    WebElement addAllowedSchemes;

    @FindBy(name = "schemeNameField")
    WebElement schemeName;

    @FindBy(xpath = "//*[@id=\"ext-gen366-gp-none--bd\"]/div")
    WebElement selectAScheme;

    @FindBy(xpath = "//*[@id=\"ext-gen387\"]")
    WebElement add;

    @FindBy(xpath = "//*[@id=\"ext-gen170\"]")
    WebElement allowedSponsors;

    @FindBy(xpath = "//*[@id=\"ext-gen433\"]/div[3]")
    WebElement selectASponsor;

    @FindBy(xpath = "//*[@id=\"ext-gen252\"]")
    WebElement sv;

    @FindBy(xpath = "//*[@id=\"ext-gen282\"]")
    WebElement ok;

    @FindBy(xpath = "//*[@id=\"ext-gen359\"]")
    WebElement closeWindow;

    @FindBy(xpath = "//*[@id=\"ext-gen252\"]")
    WebElement save;

    @FindBy(xpath = "//*[@id=\"ext-comp-1221\"]/tbody/tr[2]/td[2]")
    WebElement ok1;

    @FindBy(xpath = "//*[@id=\"ext-comp-1187\"]/tbody/tr[2]/td[2]")
    WebElement close;

    @FindBy(xpath = "//*[@id=\"ext-gen78\"]")
    WebElement logout;

    public AddAllowedSchemes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdminPanel(){
        adminPanel.click();
    }

    public void clickExistingUsers(){
        existingUsers.click();
    }

    public void enterUserName(String uName){
        userName.sendKeys(uName, Keys.ENTER);
    }
    public void clickAllowedSchemes(){
        allowedSchemes.click();
    }

    public void clickOnAddAllowedSchemes(){
        addAllowedSchemes.click();
    }

    public void enterShemeName(String schName){
        schemeName.sendKeys(schName,Keys.ENTER);
    }

    public void selectAUser(){
        selectUser.click();
    }

    public void clickOnDetails(){
        details.click();
    }

    public void selectAAscheme(){
        selectAScheme.click();
    }

    public void  clickOnAdd(){
        add.click();
    }
    public void clickOkBox(){
        ok.click();
    }

    public void clickcloseWindow(){
        closeWindow.click();
    }

    public void clickok1(){
        ok1.click();
    }

    public void clickClose(){
        close.click();
    }

    public void clickLogout(){
        logout.click();
    }

    public void clickOnAllowedSponsors(){
        allowedSponsors.click();
    }

    public void selectsponsor(){
        selectASponsor.click();
    }

    public void clickOnSave(){
        sv.click();
    }

}
