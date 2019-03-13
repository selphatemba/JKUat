package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AnnuityRate extends BaseClass {
    public static final Logger log = Logger.getLogger(AnnuityRate.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen46\"]")
    WebElement actuarialFactors;

    @FindBy(xpath = "//*[@id=\"ext-gen82\"]")
    WebElement annuityRates;

    @FindBy(xpath = "//*[@id=\"ext-gen112\"]")
    WebElement newAnnuity;

    @FindBy(name = "rate.age")
    WebElement age;

    @FindBy(name = "rate.rateWithSpouce")
    WebElement rateWithSpouse;

    @FindBy(name = "rate.rateWithoutSpouce")
    WebElement rateWithoutSpouse;

    @FindBy(xpath = "//*[@id=\"ext-comp-1180\"]")
    WebElement gender;

    @FindBy(name = "rate.benPensAlloc")
    WebElement beneficiaryPensionAlloc;

    @FindBy(name = "rate.pensionEscFact")
    WebElement pensionEscalationFactor;

    @FindBy(xpath = "//*[@id=\"ext-comp-1183\"]")
    WebElement annuityBracket;

    @FindBy(xpath = "//*[@id=\"ext-gen165\"]")
    WebElement save;

    public AnnuityRate(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void clickOnSchemeSetup(){
        schemeSetup.click();
    }

    public void clickOnActuarialFactors(){
        actuarialFactors.click();
    }
    public void clickOnAnnuityRates(){
        annuityRates.click();
    }
    public void clickOnNewAnnuity(){
        newAnnuity.click();
    }

    public void enterAge(String ag){
        age.sendKeys(ag, Keys.TAB);
    }

    public void enterRateWithSpouse(String rws){
        rateWithSpouse.sendKeys(rws,Keys.TAB);
    }
    public void enterRateWithoutSpouse(String rwss){
        rateWithoutSpouse.sendKeys(rwss,Keys.TAB);
    }

    public void enterGender(String gndr){
        gender.sendKeys(gndr,Keys.TAB);
    }
    public void enterBeneficiaryPenAlloc(String benPen){
        beneficiaryPensionAlloc.sendKeys(benPen,Keys.TAB);
    }

    public void enterPensionEscFactor(String penEscFac){
        pensionEscalationFactor.sendKeys(penEscFac,Keys.TAB);
    }

    public void enterAnnuityBracket(String annuityBr){
        annuityBracket.sendKeys(annuityBr,Keys.TAB);
    }

    public void clickSave(){
        save.click();
    }
}
