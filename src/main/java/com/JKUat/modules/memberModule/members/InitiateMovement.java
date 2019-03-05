package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.RunBalances;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class InitiateMovement extends BaseClass {
    public static final Logger log = Logger.getLogger(RunBalances.class.getName());
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-comp-1333\"]/tbody/tr[2]/td[2]/em")
    WebElement members;

    @FindBy(xpath = "//*[@id=\"membRegMenu\"]")
    WebElement sponsorRegister;

    @FindBy(name = "sponsorMNameField")
    WebElement sponsorName;

    @FindBy(xpath = "//*[@id=\"ext-gen129-gp-sector-Financial-bd\"]/div")
    WebElement selectsponsor;

    @FindBy(xpath = "//*[@id=\"ext-gen148\"]")
    WebElement viewMembers;

    @FindBy(xpath = "//*[@id=\"ext-gen200-gp-mclass-CLASS ONE-bd\"]/div")
    WebElement selectmbr;

    @FindBy(xpath = "//*[@id=\"ext-gen259\"]")
    WebElement movement;

    @FindBy(xpath = "//*[@id=\"ext-comp-1990\"]")
    WebElement initiateMovement;

    @FindBy(name = "ben.dateOfExit")
    WebElement dateOfExit;

    @FindBy(name = "ben.dateOfCalculation")
    WebElement dateOfCalculation;

    @FindBy(name = "ben.comments")
    WebElement remarks;

    @FindBy(xpath = "//*[@id=\"ext-comp-2121\"]")
    WebElement currency;

    @FindBy(xpath = "//*[@id=\"ext-comp-2127\"]")
    WebElement reasonsForExit;

    @FindBy(xpath = "//*[@id=\"ext-gen444\"]")//*[@id="ext-gen444"]
    WebElement save;


    public InitiateMovement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnMembers(){
        members.click();
    }
    public void clickOnSponsorRegister(){
        sponsorRegister.click();
    }
    public void enterSponsorName(String spons){
        sponsorName.sendKeys(spons, Keys.TAB);
    }
    public void selectASponsor(){
        selectsponsor.click();
    }
    public void clickOnViewMembers(){
        viewMembers.click();
    }
    public void selectAmember(){
        selectmbr.click();
    }
    public void clickMovement(){
        movement.click();
    }
    public void clickOninitiateMovement(){
        initiateMovement.click();
    }
    public void enterDateOfExit(String dateOf){
        dateOfExit.sendKeys(dateOf,Keys.TAB);
    }
    public void dateOfCalculation(String dateOfCal){
        dateOfCalculation.sendKeys(dateOfCal,Keys.TAB);
    }

    public void enterRemarks(String rmks){
        remarks.sendKeys(rmks,Keys.TAB);
    }

    public void enterCurrency(String curr){
        currency.sendKeys(curr,Keys.TAB);
    }

    public void enterReasonsForExit(String rfe){
        reasonsForExit.sendKeys(rfe,Keys.TAB);
    }

    public void clicksave(){
        save.click();
    }

}
