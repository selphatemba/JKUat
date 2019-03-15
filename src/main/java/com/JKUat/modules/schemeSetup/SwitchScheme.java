package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SwitchScheme extends BaseClass {
    public static final Logger log = Logger.getLogger(SwitchScheme.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen4\"]")
    WebElement start;

    @FindBy(linkText = "Switch Scheme")
    WebElement switchScheme;

    @FindBy(name = "schemeNameField")
    WebElement schemeName;

    @FindBy(xpath = "//*[@id=\"ext-gen78-gp-none--bd\"]/div[1]/table/tbody/tr/td[1]/div/div")
    WebElement selectScheme;

    @FindBy(xpath = "//*[@id=\"ext-gen104\"]")
    WebElement setAsWorkingScheme;

    @FindBy(xpath = "//*[@id=\"ext-gen157\"]")
    WebElement yes;


    public SwitchScheme(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSchemeSetup(){
        schemeSetup.click();
    }

    public void clickOnStart(){start.click();}

    public void clickOnswitchScheme(){switchScheme.click();}

    public void enterSchemeName(String sc){schemeName.sendKeys(sc, Keys.ENTER);}

    public void selectAscheme(){selectScheme.click();}

    public void clickOnSetAsWorkingScheme(){setAsWorkingScheme.click();}

    public void  clickYes(){yes.click();}

}
