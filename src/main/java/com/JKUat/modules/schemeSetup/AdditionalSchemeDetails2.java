package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AdditionalSchemeDetails2 extends BaseClass {
    public static final Logger log = Logger.getLogger(AdditionalSchemeDetails2.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement scheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1034\"]")
    WebElement additionalSchemeDetails2;

    @FindBy(xpath = "//*[@id=\"ext-comp-1147\"]")
    WebElement canMembersPurchasePension;

    @FindBy(xpath = "//*[@id=\"ext-comp-1150\"]")
    WebElement annuityAdiffScheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1152\"]")
    WebElement schemeInvPooled;

    @FindBy(xpath = "//*[@id=\"ext-comp-1154\"]")
    WebElement operationalCashBookShared;

    @FindBy(xpath = "//*[@id=\"ext-comp-1156\"]")
    WebElement spouseLumpsumApportionslFormula;

    @FindBy(xpath = "//*[@id=\"ext-comp-1159\"]")
    WebElement membersOfferedBonusUponExit;

    @FindBy(xpath = "//*[@id=\"ext-comp-1163\"]")
    WebElement allowAutoProcessOfPayments;

    @FindBy(xpath = "//*[@id=\"ext-comp-1166\"]")
    WebElement roundPaymentsTo;

    @FindBy(xpath = "//*[@id=\"ext-comp-1167\"]")
    WebElement roundTaxPaymentsTo;

    @FindBy(xpath = "//*[@id=\"ext-comp-1168\"]")
    WebElement gridDisplayMode;

    @FindBy(xpath = "//*[@id=\"ext-comp-1170\"]")
    WebElement membersIdentifier;

    @FindBy(name = "scheme.otherSchemeInfo.idUniqueLevel")
    WebElement identifierUniqueLevel;

    @FindBy(xpath = "//*[@id=\"ext-gen146\"]")
    WebElement save;

    public AdditionalSchemeDetails2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMainMenu(){mainMenu.click();}

    public void clickSchemeSetup(){schemeSetup.click();}

    public void clickOnScheme(){scheme.click();}

    public void clickOnAdditionalSchemeDetails2(){additionalSchemeDetails2.click();}

    public void enterCanMembersPurchasePension(String yn){canMembersPurchasePension.sendKeys(yn, Keys.TAB);}

    public void enterAnnuityAdiffScheme(String yn){annuityAdiffScheme.sendKeys(yn,Keys.TAB);}

    public void enterSchemeInvPooled(String yn){schemeInvPooled.sendKeys(yn,Keys.TAB);}

    public void enterOperationalCashBookShared(String yn){operationalCashBookShared.sendKeys(yn,Keys.TAB);}

    public void enterSpouseLumpsumApportionslFormula(String form){spouseLumpsumApportionslFormula.sendKeys(form,Keys.TAB);}

    public void  enterMembersOfferedBonusUponExit(String yn){membersOfferedBonusUponExit.sendKeys(yn,Keys.TAB);}

    public void  setAllowAutoProcessOfPayments(String yn){allowAutoProcessOfPayments.sendKeys(yn,Keys.TAB);}

    public void setRoundPaymentsTo(String rou){roundPaymentsTo.sendKeys(rou,Keys.TAB);}

    public void setRoundTaxPaymentsTo(String tr){roundTaxPaymentsTo.sendKeys(tr,Keys.TAB);}

    public void setGridDisplayMode(String dm){gridDisplayMode.sendKeys(dm,Keys.TAB);}

    public void setMembersIdentifier(String mid){membersIdentifier.sendKeys(mid,Keys.TAB);}

    public void clickOnIdentifierUniqueLevel(){
        identifierUniqueLevel.click();
    }

    public void clickSave(){
        save.click();
    }
}
