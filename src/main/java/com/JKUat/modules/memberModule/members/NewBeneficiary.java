package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewBeneficiary extends BaseClass {

    public static final Logger log = Logger.getLogger(NewBeneficiary.class.getName());

    public WebDriver driver;
    Actions builder;
        @FindBy(id = "membLnk")
        WebElement memberRegister;


        @FindBy(id = "ext-gen49")
        WebElement memberOption;

        @FindBy(linkText = "New Beneficiary")
        WebElement newBeneficiary;

        @FindBy(css = "#ext-comp-1676")
        WebElement category;

        @FindBy(id = "ext-comp-1677")
        WebElement memberToSearch;

        @FindBy(name = "ben.surname")
        WebElement surName;

        @FindBy(name = "ben.firstname")
        WebElement firstName;

        @FindBy(name = "ben.othernames")
        WebElement OtherNames;

        @FindBy(name = "ben.dob")
        WebElement DateOfBirth;

        @FindBy(id = "ext-comp-1682")
        WebElement DocumentsProvided;

        @FindBy(css = "#ext-comp-1685")
        WebElement Relationship;

        @FindBy(name = "ben.lumpsumEntitlement")
        WebElement Entitlement;

        @FindBy(xpath = "//*[@id=\"ext-comp-1686\"]")
        WebElement Gender;


        @FindBy(id ="ext-comp-1694")
        WebElement Status;

        @FindBy(xpath = "//*[@id=\"ext-gen138\"]")
        WebElement saveButton;





        public NewBeneficiary(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
             builder=new Actions(driver);

        }

        public void clickOnMemberRegister(){
            memberRegister.click();
        }

        public void selectMemberOption(){
            memberOption.click();

        }



    public void clickOnNewBeneficiary() {

        newBeneficiary.click();
    }

    public void enterCategory(String Title) {
        category.sendKeys(Title, Keys.TAB);

    }

    public void enterMemberNumber(String num) {
            memberToSearch.sendKeys(num,Keys.ARROW_DOWN,Keys.ENTER);



    }

    public void enterSurname(String surname) {
        surName.sendKeys(surname, Keys.TAB);
    }

    public void enterFirstName(String fname) {
        firstName.sendKeys(fname, Keys.TAB);
    }

    public void enterOthernames(String othernames)  {
        OtherNames.sendKeys(othernames, Keys.TAB);

    }

    public void enterDocumentsProvided(String doc) {
        DocumentsProvided.sendKeys(doc, Keys.ENTER);
    }

    public void enterDOB(String dob)  {
        DateOfBirth.sendKeys(dob, Keys.TAB);

    }

    public void enterStatus(String status)  {
        Status.sendKeys(status, Keys.ARROW_DOWN, Keys.ENTER);

    }

    public void enterGender(String gender){
        Gender.sendKeys(gender, Keys.ENTER);
    }

    public void enterEntitlement(String lumpsum) {
        Entitlement.sendKeys(lumpsum, Keys.ENTER);
    }

    public void enterRelationship(String Rship) {

        Relationship.sendKeys(Rship, Keys.ENTER);

    }

    public void clickSaveButton(){
            saveButton.click();
    }





}
