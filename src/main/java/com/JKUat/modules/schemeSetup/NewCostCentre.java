package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewCostCentre extends BaseClass {

    public static final Logger log = Logger.getLogger(NewScheme.class.getName());

    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement scheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1049\"]")
    WebElement costCentres;

    @FindBy(xpath = "//*[@id=\"ext-gen153\"]")
    WebElement newCostCentre;

    @FindBy(name = "company.code")
    WebElement code;

    @FindBy(name = "company.name")
    WebElement name;

    @FindBy(name = "company.desc")
    WebElement description;

    @FindBy(xpath = "//*[@id=\"ext-comp-1182\"]")
    WebElement sponsor;

    @FindBy(id = "company_cre")
    WebElement cre;

    @FindBy(xpath = "//*[@id=\"ext-gen218\"]")
    WebElement save;

    public NewCostCentre(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void clickOnSchemeSetup(){
        schemeSetup.click();
    }

    public void clickOnScheme(){
        scheme.click();
    }
//    public void clickOnMainMenu(){
//        mainMenu.click();
//    }

    public void clickSchemeSetup(){
        schemeSetup.click();
    }

    public void clickScheme(){
        scheme.click();
    }

    public void clickOnCostCentres(){
        costCentres.click();
    }

    public void clickOnNewCostCentre(){newCostCentre.click();}

    public void enterCode(String cd){code.sendKeys(cd, Keys.TAB);}

    public void enterName(String nm){name.sendKeys(nm,Keys.TAB);}

    public void enterDesc(String ds){description.sendKeys(ds,Keys.TAB);}

    public void enterSponsor(String sps){sponsor.sendKeys(sps,Keys.TAB);}

    public void enterCre(String cr){cre.sendKeys(cr,Keys.TAB);}

    public void clickSave(){save.click();}
}
