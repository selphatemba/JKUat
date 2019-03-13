package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.hotkey.Keys;

import javax.xml.xpath.XPath;
import java.util.logging.Logger;

public class DatesAndInsuranceCover extends BaseClass {
    public static final Logger log = Logger.getLogger(DatesAndInsuranceCover.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement scheme;

    @FindBy(linkText = "Dates & Insurance Covers")
    WebElement datesInsuranceCover;

    @FindBy(xpath = "//*[@id=\"ext-comp-1147\"]")
    WebElement isSchemeRegistered;

    @FindBy(xpath = "//*[@id=\"ext-comp-1152\"]")
    WebElement doesTheSchemePayTax;

    @FindBy(xpath = "//*[@id=\"ext-comp-1152\"]")
    WebElement applyTaxOnClaims;

    @FindBy(xpath = "//*[@id=\"ext-comp-1159\"]")
    WebElement groupDisabilityBen;

    @FindBy(xpath = "//*[@id=\"ext-comp-1160\"]")
    WebElement lastExpenseProvided;

    @FindBy(xpath = "//*[@id=\"ext-comp-1160\"]")
    WebElement trusteesLiabilityInsurance;

    @FindBy(xpath = "//*[@id=\"ext-comp-1166\"]")
    WebElement separateServicePeriod;

    @FindBy(xpath = "//*[@id=\"ext-comp-1167\"]")
    WebElement lifeCoverProvided;

    @FindBy(xpath = "//*[@id=\"ext-gen146\"]")
    WebElement save;


    public DatesAndInsuranceCover(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnScheme(){scheme.click();}

    public void clickOnDatesInsuranceCover(){
        datesInsuranceCover.click();
    }
    public void checkIfSchemeIsRegisteredWithRegBody(String yn){
        isSchemeRegistered.sendKeys(yn, Keys.TAB);
    }

    public void checkIfSchemePaysTax(String yn){
        doesTheSchemePayTax.sendKeys(yn,Keys.TAB);
    }

    public void checkIfTaxShouldBeAppliedOnClaims(String yn){
        applyTaxOnClaims.sendKeys(yn,Keys.TAB);
    }

    public void shudWeGroupDisabilityBen(String yn){
        groupDisabilityBen.sendKeys(yn,Keys.TAB);
    }

    public void isLastExpenseProvided(String yn){
        lastExpenseProvided.sendKeys(yn,Keys.TAB);
    }
    public void isTrusteesLiabilityInsurance(String yn){
        trusteesLiabilityInsurance.sendKeys(yn,Keys.TAB);
    }

    public void doWeSeparateServicePeriod(String yn){
        separateServicePeriod.sendKeys(yn,Keys.TAB);
    }

    public void islifeCoverProvided(String yn){
        lifeCoverProvided.sendKeys(yn,Keys.TAB);
    }

    public void clickSave(){
        save.click();
    }

}
