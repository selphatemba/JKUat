package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ContributionsRate extends BaseClass{
    public static final Logger log = Logger.getLogger(ContributionRates.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"contRts\"]")
    WebElement contributionsRate;

    @FindBy(xpath = "//*[@id=\"ext-gen102\"]")
    WebElement newContributionsRate;

    @FindBy(name = "contributionrate.augmentaryContRate")
    WebElement AVCrateforEmployees;

    @FindBy(name = "contributionrate.eeRate")
    WebElement employeeRate;

    @FindBy(name = "contributionrate.erRate")
    WebElement employerRate;

    @FindBy(xpath = "//*[@id=\"ext-comp-1202\"]")
    WebElement treatRateAs;

    @FindBy(name = "contributionrate.year")
    WebElement effectiveDate;

    @FindBy(xpath = "//*[@id=\"sponsorCombo\"]")
    WebElement sponsor;

    @FindBy(xpath = "//*[@id=\"ext-comp-1194\"]")
    WebElement memberClass;

    @FindBy(xpath = "//*[@id=\"ext-gen162\"]")
    WebElement save;

    public ContributionsRate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnContrRates(){
        contributionsRate.click();
    }

    public void  clickOnNewContrRate(){newContributionsRate.click();}

    public void enterEmployeeRate(String ee){employeeRate.sendKeys(ee, Keys.TAB);}

    public void enterEmployerRate(String er){employerRate.sendKeys(er,Keys.TAB);}

    public void clickreatRateas(){treatRateAs.click();}

    public void enterEffectiveDate(String effd){
        effectiveDate.clear();
        effectiveDate.sendKeys(effd,Keys.TAB);}

    public void enterSponsor(String spns){sponsor.sendKeys(spns,Keys.TAB);}

    public void enterMemberClass(String cls){memberClass.sendKeys(cls,Keys.TAB);}

    public void clickSave(){
        save.click();
    }
}
