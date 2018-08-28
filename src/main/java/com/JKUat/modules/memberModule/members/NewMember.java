package com.JKUat.modules.memberModule.members;
import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class NewMember extends BaseClass {
    private WebDriver driver;


    @FindBy(id = "membLnk")
    private WebElement memberRegisterModule;
    @FindBy(id = "ext-gen49")
    private WebElement memberButton;
    @FindBy(id = "ext-gen93")
    private WebElement memberOption;
    @FindBy(id = "ext-gen192")
    private WebElement titleDropDown;
    @FindBy(xpath = "//*[@id=\"ext-gen463\"]/div[3]")
    private WebElement titleOption;
    @FindBy(id = "ext-gen14")
    private WebElement title;
    @FindBy(name = "member.surname")
    private WebElement surName;
    @FindBy(name = "member.firstname")
    private WebElement firstName;
    @FindBy(xpath= "//*[@id=\"ext-comp-1673\"]")
    private WebElement gender;
    @FindBy(xpath = "//*[@id=\"ext-comp-1674\"]")
    private WebElement maritalStatus;
    @FindBy(name = "member.dob")
    private WebElement dateOfBirth;
    @FindBy(name = "member.dateOfEmployment")
    private WebElement dateOfAppointment;
    @FindBy(name = "member.dateJoinedScheme")
    private WebElement dateOfJoiningScheme;
    @FindBy(xpath = "//*[@id=\"ext-comp-1702\"]")
    private WebElement costCenter;
    @FindBy(xpath= "//*[@id=\"ext-comp-1703\"]")
    private WebElement memberClass;
    @FindBy(css = "#ext-gen153")
    WebElement saveButton;

    @FindBy(partialLinkText = "Close")
    WebElement close;

    public NewMember(WebDriver driver) {
        this.driver = driver;
        //log.info("driver is+++++++++++"+driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }


    public void clickMembeRegister() {
        memberRegisterModule.click();
    }

    public void clickMemberButton() {
        memberButton.click();
    }

    public void clickMemberOption() {
        memberOption.click();
    }

    public void clickTitleDropDown() {
        titleDropDown.click();
    }

    public void clicktitleOption() {
        titleOption.click();
    }

    public void enterSurname(String surname) {
        surName.sendKeys(surname);
    }

    public void enterFirstName(String firstNm) {
        firstName.sendKeys(firstNm);
    }

    public void enterGender(String gendr) {
        gender.sendKeys(gendr, Keys.ENTER);
    }

    public void enterMaritalStatus(String maristatus) {
        maritalStatus.sendKeys(maristatus, Keys.TAB);
    }

    public void enterDOB(String dob) {
        dateOfBirth.sendKeys(dob);
    }

    public void enterDateOfAppointment(String dateOfAppoint) {
        dateOfAppointment.clear();
        dateOfAppointment.sendKeys(dateOfAppoint);
    }

    public void enterDateOfJoiningScheme(String dofjoininsch) {
        dateOfJoiningScheme.clear();
        dateOfJoiningScheme.sendKeys(dofjoininsch);
    }

    public void enterCostCenter(String costcntr) {
        costCenter.sendKeys(costcntr);
    }

    public void enterMemberClass(String mbrclass) {
        memberClass.sendKeys(mbrclass);
    }

    public void clickSaveButton() {
        saveButton.click();
    }
}



