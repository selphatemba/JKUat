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

public class NewSponsor extends BaseClass {

    public static final Logger log = Logger.getLogger(NewScheme.class.getName());

    public WebDriver driver;
    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-comp-1024\"]/tbody/tr[2]/td[2]/em")
    WebElement scheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1054\"]")
    WebElement sponsorList;

    @FindBy(xpath = "//*[@id=\"ext-gen165\"]")
    WebElement newSponsor;

    @FindBy(name = "sponsor.name")
    WebElement name;

    @FindBy(name = "sponsor.applicationDate")
    WebElement applicationDate;

    @FindBy(name = "sponsor.pin")
    WebElement taxNumber;

    @FindBy(xpath = "//*[@id=\"ext-comp-1206\"]")
    WebElement sector;

    @FindBy(name = "sponsor.generateCluster")
    WebElement generatememManClu;

    @FindBy(xpath = "//*[@id=\"ext-gen225\"]")//*[@id="ext-gen225"]
    WebElement save;



    public NewSponsor(WebDriver driver) {
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

    public void clickSponsorList(){
        sponsorList.click();
    }

    public void clickNewSponsor(){
        newSponsor.click();
    }

    public void enterName(String nm){
        name.sendKeys(nm, Keys.TAB);
    }

    public void enterApplicationDate(String appDate){
        applicationDate.sendKeys(appDate,Keys.TAB);
    }

    public void enterTaxNumber(String taxN){
        taxNumber.sendKeys(taxN,Keys.TAB);
    }

    public void enterSector(String sec){
        sector.sendKeys(sec,Keys.TAB);
    }

    public void clickgenerateclu(){
        generatememManClu.sendKeys();
    }


    public void clickSave(){
        save.click();
    }
}
