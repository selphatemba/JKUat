package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EndYearParameters extends BaseClass {
    public static final Logger log = Logger.getLogger(EndYearParameters.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement otherSetup;

    @FindBy(linkText = "End Year Parameters")
    WebElement endYearParameters;

    @FindBy(xpath = "//*[@id=\"ext-comp-1148\"]")
    WebElement benCalcBeforeYrEnd;

    @FindBy(xpath = "//div[text()='Use Provisional Rate of Interest']")
    WebElement provisionalInterestRate;

    @FindBy(xpath = "//*[@id=\"ext-comp-1149\"]")
    WebElement payBalOfRevenue;

    @FindBy(xpath = "//*[@id=\"ext-comp-1150\"]")
    WebElement showExitsWithinTheYr;

    @FindBy(xpath = "//*[@id=\"ext-comp-1151\"]")
    WebElement applyFinalRevenueDeclared;

    @FindBy(xpath = "//*[@id=\"ext-comp-1152\"]")
    WebElement whoBearsTaxOnIncome;

    @FindBy(xpath = "//*[@id=\"ext-comp-1153\"]")
    WebElement autoCalculateAdminFeesOnEXit;

    @FindBy(xpath = "//*[@id=\"ext-comp-1154\"]")
    WebElement treatTaxFromUnregAsExpense;

    @FindBy(xpath = "//*[@id=\"ext-comp-1157\"]")
    WebElement discardRevenueEarnedDuringExitMonth;

    @FindBy(name = "yearend.maxBenefitsProcessingDate")
    WebElement doNotAllowBenefitsProcessing;

    @FindBy(name = "yearend.allowEditOfDeferredBenefits")
    WebElement allowEditOfDefferedbenefits;

    @FindBy(xpath = "//*[@id=\"ext-comp-1162\"]")
    WebElement incomeDistributionFrequency;

    @FindBy(xpath = "//*[@id=\"ext-comp-1163\"]")
    WebElement incomeDistributionMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1164\"]")
    WebElement selectTheReportingFrequency;

    @FindBy(xpath = "//*[@id=\"ext-comp-1195\"]")
    WebElement tieIncomeAmountsToSponsors;

    @FindBy(xpath = "//*[@id=\"ext-comp-1200\"]")
    WebElement tieIncomeAmountsToInvestmentOptions;

    @FindBy(xpath = "//*[@id=\"ext-comp-1205\"]")
    WebElement tieNavsToInvestmentOptions;

    @FindBy(xpath = "//*[@id=\"ext-comp-1210\"]")
    WebElement allowMembersWithWithdrawnStatus;

    @FindBy(xpath = "//*[@id=\"ext-comp-1185\"]")
    WebElement useExitDateToDetermine;

    @FindBy(xpath = "//*[@id=\"ext-comp-1190\"]")
    WebElement dateOfCalculation;

    @FindBy(xpath = "//*[@id=\"ext-gen143\"]")
    WebElement save;

    public EndYearParameters(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnOtherSetup(){otherSetup.click();}

    public void clickOnEndYearParameters(){endYearParameters.click();}

    public void enterBenCalcBeforeYrEnd(String yn){benCalcBeforeYrEnd.click();
    provisionalInterestRate.click();}

    public void enterPayBalOfRevenue(String yn){payBalOfRevenue.sendKeys(yn,Keys.TAB);}

    public void enterShowExitsWithinTheYr(String yn){showExitsWithinTheYr.sendKeys(yn,Keys.TAB);}

    public void enterApplyFinalRevenueDeclared(String yn){applyFinalRevenueDeclared.sendKeys(yn,Keys.TAB);}

    public void enterWhoBearsTaxOnIncome(String who){whoBearsTaxOnIncome.sendKeys(who,Keys.TAB);}

    public void enterAutoCalculateAdminFeesOnEXit(String yn){autoCalculateAdminFeesOnEXit.sendKeys(yn,Keys.TAB);}

    public void enterTreatTaxFromUnregAsExpense(String yn){treatTaxFromUnregAsExpense.sendKeys(yn,Keys.TAB);}

    public void enterDiscardRevenueEarnedDuringExitMonth(String yn){discardRevenueEarnedDuringExitMonth.sendKeys(yn,Keys.TAB);}

    public void enterDoNotAllowBenefitsProcessing(String yn){doNotAllowBenefitsProcessing.sendKeys(yn,Keys.TAB);}

    public void clickAllowEditOfDefferedbenefits(){allowEditOfDefferedbenefits.click();}

    public void enterIncomeDistributionFrequency(String idf){incomeDistributionFrequency.sendKeys(idf,Keys.TAB);}

    public void enterIncomeDistributionMode(String idm){incomeDistributionMode.sendKeys(idm,Keys.TAB);}

    public void setSelectTheReportingFrequency(String rf){selectTheReportingFrequency.sendKeys(rf,Keys.TAB);}

    public void setTieIncomeAmountsToSponsors(){tieIncomeAmountsToSponsors.click();}

    public void setTieIncomeAmountsToInvestmentOptions(){tieIncomeAmountsToInvestmentOptions.click();}

    public void setTieNavsToInvestmentOptions(){tieNavsToInvestmentOptions.click();}

    public  void setAllowMembersWithWithdrawnStatus(){allowMembersWithWithdrawnStatus.click();}

    public void setUseExitDateToDetermine(){useExitDateToDetermine.click();}

    public void setDateOfCalculation(){dateOfCalculation.click();}

    public void clickSave(){save.click();}


}
