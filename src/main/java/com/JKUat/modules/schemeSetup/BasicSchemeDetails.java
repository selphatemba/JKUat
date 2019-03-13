package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BasicSchemeDetails extends BaseClass {
    public static final Logger log = Logger.getLogger(AdditionalSchemeDetails.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement scheme;

    @FindBy(linkText = "Basic Scheme Details")
    WebElement basicSchemeDetails;

    @FindBy(name = "scheme.schemeDetails.schemePin")
    WebElement schemeTaxIdNo;

    @FindBy(xpath = "//*[@id=\"ext-comp-1156\"]")
    WebElement schemeMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1157\"]")
    WebElement contributionMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1159\"]")
    WebElement sponsorOnContrHoliday;

    @FindBy(xpath = "//*[@id=\"ext-comp-1160\"]")
    WebElement contrRemmitanceMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1162\"]")
    WebElement baseTaxRegime;

    @FindBy(id = "offShoreField")
    WebElement offShoreCurrency;

    @FindBy(xpath = "//*[@id=\"ext-gen146\"]")
    WebElement save;

    public BasicSchemeDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnScheme(){scheme.click();}

    public void clickOnBasicSchemeDetails(){basicSchemeDetails.click();}

    public void enterSchemeTaxIdNo(String tax){schemeTaxIdNo.sendKeys(tax, Keys.TAB);}

    public void enterSchemeMode(String mode){schemeMode.sendKeys(mode,Keys.TAB);}

    public void enterContributionMode(String contr){contributionMode.sendKeys(contr,Keys.TAB);}

    public void enterSponsorOnContrHoliday(String hol){sponsorOnContrHoliday.sendKeys(hol,Keys.TAB);}

    public void enterContrRemmitanceMod(String mod){contrRemmitanceMode.sendKeys(mod,Keys.TAB);}

    public void enterBaseTaxRegime(String tax){baseTaxRegime.sendKeys(tax,Keys.TAB);}

    public void enterOffshoreCurrency(String off){offShoreCurrency.sendKeys(off,Keys.TAB);}

    public void clickSave(){save.click();}
}
