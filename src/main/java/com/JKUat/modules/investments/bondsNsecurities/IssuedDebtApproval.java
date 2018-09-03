package com.JKUat.modules.investments.bondsNsecurities;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.investments.equities.NewCompany;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class IssuedDebtApproval extends BaseClass {


    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    @FindBy(xpath = "//*[@id=\"ext-gen46\"]")
    WebElement bondsNsecurities;

    @FindBy(linkText = "Issued Debts")
    WebElement issuedDebts;

    @FindBy(name = "debt-security-name")
    WebElement enterSecurityName;

    @FindBy(xpath = "//*[@id=\"ext-gen114-gp-securityType-Corporate Bonds(Debentures)-bd\"]/div")
    WebElement debtSecurity;

    @FindBy(xpath = "//*[@id=\"ext-gen168\"]")
    WebElement acquisition;

    @FindBy(linkText = "Batch Acquisitions")
    WebElement batchAcquisition;

    @FindBy(name = "batchSchedule")
    WebElement browse;

    @FindBy(xpath = "//*[@id=\"ext-gen257\"]")
    WebElement upload;

    @FindBy(xpath = "//*[@id=\"ext-gen266\"]")
    WebElement save;

    public IssuedDebtApproval(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule(){
        investment.click();
    }

    public void clickOnBondNsecurities(){
        bondsNsecurities.click();
    }

    public void clickOnIssuedDebts(){
        issuedDebts.click();
    }

    public void setEnterSecurityName(String secName){
        enterSecurityName.sendKeys(secName, Keys.ENTER);
    }

    public void selectDebtSecurity(){
        debtSecurity.click();
    }

    public void clickOnAcquisition(){
        acquisition.click();
    }

    public void clickOnBatchAcquisition(){
        batchAcquisition.click();
    }

    public void  browseForIssuedDebts(String isd){
        browse.sendKeys(isd);
    }

    public void clickUpload(){
        upload.click();
    }

    public void clickSave(){
        save.click();
    }
}
