package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ContributionRates extends BaseClass {
    public static final Logger log = Logger.getLogger(ContributionRates.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    public ContributionRates(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void clickOnSchemeSetup(){
        schemeSetup.click();
    }
}
