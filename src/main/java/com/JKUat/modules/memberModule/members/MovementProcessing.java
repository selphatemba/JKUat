package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.reasonsForExit.EarlyRetirement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class MovementProcessing extends BaseClass {
    public static final Logger log = Logger.getLogger(EarlyRetirement.class.getName());
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-comp-1333\"]/tbody/tr[2]/td[2]/em")
    WebElement members;

    @FindBy(xpath = "//*[@id=\"membRegMenu\"]")
    WebElement sponsorRegister;

    @FindBy(name = "sponsorMNameField")
    WebElement sponsorName;

    @FindBy(xpath = "//*[@id=\"ext-gen129-gp-sector-Educational-bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectsponsor;

    @FindBy(xpath = "//*[@id=\"ext-gen148\"]")
    WebElement viewMembers;

    @FindBy(xpath = "//*[@id=\"ext-gen202-gp-mclass-Management-bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectmbr;

    @FindBy(xpath = "//*[@id=\"ext-gen261\"]")
    WebElement movement;

    @FindBy(xpath = "//*[@id=\"ext-comp-1994\"]")
    WebElement movementProcessing;

    @FindBy(xpath = "//*[@id=\"ext-gen438-gp-exitCategory-Death In Service-bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectMember;

    @FindBy(xpath = "//*[@id=\"ext-gen484\"]")
    WebElement benefitsCalculation;

    @FindBy(xpath = "//*[@id=\"ext-comp-2141\"]")
    WebElement showBenefitsCalc;

    @FindBy(xpath ="//*[@id=\"ext-gen635\"]")
    WebElement save;

    public MovementProcessing(WebDriver driver) {
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
        sponsorName.sendKeys(spons, Keys.ENTER);
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
    public void clickOnMovementProcessing(){
        movementProcessing.click();
    }
    public void selectAReadyMember(){
        selectMember.click();
    }
    public void calculateBenefits(){
        benefitsCalculation.click();
    }
    public void clickOnShowBenefitsCalc(){
        showBenefitsCalc.click();
    }
    public void clickSave(){
        save.click();
    }
}
