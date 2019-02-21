package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AdditionalSchemeDetails extends BaseClass {
    public static final Logger log = Logger.getLogger(AdditionalSchemeDetails.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement scheme;

    @FindBy(linkText = "Additional Scheme Details")
    WebElement additionalSchemeDetails;

    @FindBy(xpath = "//*[@id=\"ext-comp-1147\"]")
    WebElement memberClasses;

    @FindBy(xpath = "//*[@id=\"ext-comp-1148\"]")
    WebElement multiCompany;

    @FindBy(xpath = "//*[@id=\"ext-comp-1149\"]")
    WebElement pensionableServiceMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1150\"]")
    WebElement interestRatesMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1152\"]")
    WebElement schemeAdministrationMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1153\"]")
    WebElement contributionStatus;

    @FindBy(xpath = "//*[@id=\"ext-comp-1154\"]")
    WebElement interestFormula;

    @FindBy(xpath = "//*[@id=\"ext-comp-1155\"]")
    WebElement currentSchemeStatus;

    @FindBy(xpath = "//*[@id=\"ext-comp-1168\"]")
    WebElement isSchemeActive;

    @FindBy(xpath = "//*[@id=\"ext-comp-1169\"]")
    WebElement excesscontrAllocMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1170\"]")
    WebElement notEqualToChequeAmnt;

    @FindBy(id = "deficitPostingMode")
    WebElement postBatchTo;

    @FindBy(xpath = "//*[@id=\"ext-comp-1172\"]")
    WebElement deficitTreatmentMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1173\"]")
    WebElement contributionsSalaryBased;

    @FindBy(xpath = "//*[@id=\"ext-comp-1174\"]")
    WebElement howExcessContrDetermined;

    @FindBy(xpath = "//*[@id=\"ext-comp-1176\"]")
    WebElement isItADiffScheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1179\"]")
    WebElement convertContrUnitsWhenPosting;

    @FindBy(xpath = "//*[@id=\"ext-gen146\"]")
    WebElement save;


    public AdditionalSchemeDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnScheme(){scheme.click();}

    public void clickOnAdditionalSchemeDetails(){additionalSchemeDetails.click();}

    public void enterMemberClass(String mclass){
        memberClasses.sendKeys(mclass, Keys.TAB);
    }

    public void enterMultiCompany(String mcompany){
        multiCompany.sendKeys(mcompany,Keys.TAB);
    }

    public void enterPensionableServices(String pservices){
        pensionableServiceMode.sendKeys(pservices,Keys.TAB);
    }

    public void  enterInterestRatesMode(String irm){
        interestRatesMode.sendKeys(irm,Keys.TAB);
    }

    public void enterSchemeAdminMode(String samod){
        schemeAdministrationMode.sendKeys(samod,Keys.TAB);
    }

    public void enterContributionStatus(String contrStat){
        contributionStatus.sendKeys(contrStat,Keys.TAB);
    }

    public void enterInterestFormula(String intrForm){
        interestFormula.sendKeys(intrForm,Keys.TAB);
    }

    public void enterCurrentSchemeStatus(String  curScSt){
        currentSchemeStatus.sendKeys(curScSt,Keys.TAB);
    }

    public void enterIsSchemeActive(String yn){
        isSchemeActive.sendKeys(yn,Keys.TAB);
    }

    public void enterExcessiveAllocMode(String  exAlloc){
        excesscontrAllocMode.sendKeys(exAlloc,Keys.TAB);
    }

    public void enterNotEquallToChequeAmt(String cheqamt){
        notEqualToChequeAmnt.sendKeys(cheqamt,Keys.TAB);
    }

    public void postBatchTo(String pbt){
        postBatchTo.sendKeys(pbt,Keys.TAB);
    }

    public void  enterDeficitTreatmentMode(String defTrrmtmd){
        deficitTreatmentMode.sendKeys(defTrrmtmd,Keys.TAB);
    }

    public void enterContributionsSalaryBased(String yn){
        contributionsSalaryBased.sendKeys(yn,Keys.TAB);
    }

    public void hoewExcessContrAreDetermined(String excContr){
        howExcessContrDetermined.sendKeys(excContr,Keys.TAB);
    }

    public void  isItAdiffCsheme(String yn){
        isItADiffScheme.sendKeys(yn,Keys.TAB);
    }

    public void setConvertContrUnitsWhenPosting(String cvn){
        convertContrUnitsWhenPosting.sendKeys(cvn,Keys.TAB);
    }

    public void clickSave(){
        save.click();
    }
}
