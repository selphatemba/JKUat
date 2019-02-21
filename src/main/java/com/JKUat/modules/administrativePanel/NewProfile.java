package com.JKUat.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewProfile extends BaseClass {
    public static final Logger log = Logger.getLogger(NewProfile.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[4]/center/a")
    WebElement adminPanel;

    @FindBy(xpath = "//*[@id=\"profiles\"]")
    WebElement profiles;

    @FindBy(xpath = "//*[@id=\"ext-gen105\"]")
    WebElement newProfile;

    @FindBy(name = "profile.name")
    WebElement name;

    @FindBy(name = "profile.desc")
    WebElement description;

    @FindBy(xpath = "//*[@id=\"ext-comp-1123\"]")
    WebElement fundAdministrator;

    @FindBy(xpath = "//*[@id=\"ext-gen158\"]")
    WebElement save;

    public NewProfile(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdminPanel(){
        adminPanel.click();
    }

    public void clickOnProfiles(){
        profiles.click();
    }

    public void clickOnNewProfile(){
        newProfile.click();
    }

    public void enterName(String nm){
        name.sendKeys(nm, Keys.TAB);
    }

    public void enterDesc(String desc){
        description.sendKeys(desc,Keys.TAB);
    }

    public void enterFundAdministrator(String funAd){
        fundAdministrator.sendKeys(funAd,Keys.TAB);
    }

    public void  clickSave(){
        save.click();
    }
}
