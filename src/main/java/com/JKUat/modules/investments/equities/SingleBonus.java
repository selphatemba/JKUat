package com.JKUat.modules.investments.equities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SingleBonus extends BaseClass {

    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen42\"]")
    WebElement equities;

    @FindBy(linkText = "Companies")
    WebElement companies;

    @FindBy(name = "companyNameField")
    WebElement searchCompany;

    @FindBy(xpath = "//*[@id=\"ext-gen106-gp-sector-Insurance-bd\"]/div")
    WebElement selectAcompany;

    @FindBy(xpath = "//*[@id=\"ext-gen149\"]")
    WebElement bonus;

    @FindBy(linkText = "Single Bonus")
    WebElement singleBonus;

    @FindBy(id = "fundManagerId")
    WebElement fundManager;

    @FindBy(name = "equityBonus.bonusDate")
    WebElement bonusIssueDate;

    @FindBy(name = "equityBonus.commencementDate")
    WebElement bookClosureDate;

    @FindBy(name = "equityBonus.creditDate")
    WebElement bonusCreditDate;

//    @FindBy(name = "equityBonus.sharesB4Bonus")
//    WebElement sharesBeforeBonus;

    @FindBy(name = "equityBonus.thisShares")
    WebElement getShares;

    @FindBy(name = "equityBonus.sharesHeld")
    WebElement forThisSharesHeld;

    @FindBy(xpath = "//*[@id=\"ext-gen252\"]")
    WebElement save;



    public SingleBonus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule(){
        investment.click();
    }

    public void clickOnEquities(){
        equities.click();
    }

    public void clickOnCompanies(){
        companies.click();
    }

    public void searchACompany(String comp){
        searchCompany.sendKeys(comp,Keys.ENTER);
    }

    public void clickOnBonus(){
        bonus.click();}

    public void selectCompany(){
        selectAcompany.click();}

    public void selectSingleBonus(){
        singleBonus.click();}

    public void captureFundManager(String fm){
        fundManager.sendKeys(fm,Keys.ENTER);}

    public void enterbonusIssueDate(String bonusissDate){
        bonusIssueDate.sendKeys(bonusissDate,Keys.ENTER);}

    public void enterBookClosureDate(String bCd){
        bookClosureDate.sendKeys(bCd,Keys.ENTER);}

    public void enterBonusCreditDate(String bCdat){
        bonusCreditDate.sendKeys(bCdat,Keys.ENTER);}

//    public void enterSharesBeforeBonus(String sbb){
//        sharesBeforeBonus.sendKeys(sbb,Keys.ENTER);}

    public void captureGetShares(String getsh){
        getShares.sendKeys(getsh,Keys.ENTER);}

    public void captureForThisSharesHeld(String sharesh){
        forThisSharesHeld.sendKeys(sharesh,Keys.ENTER);}

    public void clickSave(){
        save.click();}
}
