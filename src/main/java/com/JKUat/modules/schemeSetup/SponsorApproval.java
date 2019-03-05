package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SponsorApproval extends BaseClass {

    public static final Logger log = Logger.getLogger(SponsorApproval.class.getName());

    public WebDriver driver;
    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-comp-1024\"]/tbody/tr[2]/td[2]/em")
    WebElement scheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1055\"]")
    WebElement sponsorApproval;

    @FindBy(name = "sponsorNameFieldUA")
    WebElement sponsorName;

    @FindBy(xpath = "//*[@id=\"ext-gen146-gp-sector-Financial-bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectsponsor;

    @FindBy(xpath = "//*[@id=\"ext-gen165\"]")
    WebElement approve;

    @FindBy(xpath = "//*[@id=\"ext-comp-1038\"]")
    WebElement memberClasses;

    @FindBy(xpath = "//*[@id=\"ext-gen153\"]")
    WebElement newMemberClass;

    @FindBy(name = "mc.name")
    WebElement name;

    @FindBy(name = "mc.code")
    WebElement code;

    @FindBy(xpath = "//*[@id=\"ext-comp-1180\"]")
    WebElement sponsor;

    @FindBy(xpath = "//*[@id=\"ext-gen212\"]")
    WebElement save;

    public SponsorApproval(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnMainMenu(){mainMenu.click();}

    public void clickOnSchemeSetup(){
        schemeSetup.click();
    }

    public void clickOnScheme(){
        scheme.click();
    }

    public void hoverOverSponsor(){
        Actions action = new Actions(driver);
        WebElement sp=driver.findElement(By.xpath("//*[@id=\"ext-comp-1051\"]"));
        action.moveToElement(sp).build().perform();
    }

    public void clickSponsorApproval(){
        sponsorApproval.click();
    }
    public void  enterSponsorName(String spons){
        sponsorName.sendKeys(spons, Keys.ENTER);
    }

    public void selectASponsor(){
        selectsponsor.click();
    }

    public void clickApprove(){
        approve.click();
    }

    public void clickMemberClasses(){
        memberClasses.click();
    }
    public void clickNewMemberClass(){
        newMemberClass.click();
    }
    public void enterName(String nm){
        name.sendKeys(nm,Keys.TAB);
    }
    public void enterCode(String cod){
        code.sendKeys(cod,Keys.TAB);
    }
    public void enterSponsor(String sponsr){
        sponsor.sendKeys(sponsr,Keys.TAB);
    }
    public void clickSave(){
        save.click();
    }
}
