package com.JKUat.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SchemePreferences extends BaseClass {
    public static final Logger log = Logger.getLogger(SchemePreferences.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[2]/td[4]/center/a")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"sysPref\"]")
    WebElement systemConfig;

    @FindBy(xpath = "//*[@id=\"ext-gen105\"]")
    WebElement addSystemPreferences;

    @FindBy(xpath = "//*[@id=\"ext-gen155\"]")
    WebElement save;

    public SchemePreferences(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnSystemConfig(){systemConfig.click();}

    public void clickOnAddSystemPreferences(){addSystemPreferences.click();}

    public void clickSave(){save.click();}
}
