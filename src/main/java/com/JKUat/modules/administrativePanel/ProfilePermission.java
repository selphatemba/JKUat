package com.JKUat.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ProfilePermission extends BaseClass {

    public static final Logger log = Logger.getLogger(ProfilePermission.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[4]/center/a")
    WebElement adminPanel;

    @FindBy(xpath = "//*[@id=\"profilePerms\"]")
    WebElement profilePermissions;

    public ProfilePermission(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdminPanel(){
        adminPanel.click();
    }

    public void clickProfilePermissions(){
        profilePermissions.click();
    }
}
