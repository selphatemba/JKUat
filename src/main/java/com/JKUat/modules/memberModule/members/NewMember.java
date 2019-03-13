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

    @FindBy(xpath = "//*[@id=\"ext-comp-1333\"]/tbody/tr[2]/td[2]/em")
     WebElement members;
    @FindBy(linkText = "New Member")
    WebElement newMember;
    @FindBy(xpath="//*[@id=\"ext-comp-1690\"]")
     WebElement title;
    @FindBy(name = "member.surname")
     WebElement surName;
    @FindBy(name = "member.firstname")
    WebElement firstName;
    @FindBy(xpath= "//*[@id=\"ext-comp-1694\"]")
    WebElement gender;
    @FindBy(xpath = "//*[@id=\"ext-comp-1695\"]")
    WebElement maritalStatus;
    @FindBy(name = "member.dob")
    WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id=\"ext-comp-1696\"]")
    WebElement IDtype;
    @FindBy(name = "member.idNo")
    WebElement IDNumber;
    @FindBy(name = "member.dateJoinedScheme")
    WebElement dateOfJoiningScheme;
    @FindBy(xpath = "//*[@id=\"ext-comp-1723\"]")
    WebElement costCenter;
    @FindBy(xpath= "//*[@id=\"ext-comp-1724\"]")
    WebElement memberClass;
    @FindBy(name = "member.dateOfEmployment")
    WebElement dateOfAppointment;
    @FindBy(xpath = "//*[@id=\"ext-comp-1727\"]")
    WebElement savingsCategory;
    @FindBy(name = "member.savingsYears")
    WebElement savingsPeriod;
    @FindBy(name = "member.dateSubscribedToSavingsPlan")
    WebElement dateOfSubscription;
    @FindBy(xpath = "//*[@id=\"ext-gen156\"]")
    WebElement saveButton;

    @FindBy(partialLinkText = "Close")
    WebElement close;

    public NewMember(WebDriver driver) {
        this.driver = driver;
        //log.info("driver is+++++++++++"+driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }


    public void clickMemberButton() {
        members.click();
    }

    public void clicNewkMemberOption() {
        newMember.click();
    }

    public void enterTitle(String ttl) {
        title.sendKeys(ttl,Keys.TAB);
    }

    public void enterSurname(String surname) {
        surName.sendKeys(surname);
    }

    public void enterFirstName(String firstNm) {
        firstName.sendKeys(firstNm);
    }

    public void enterGender(String gendr) {
        gender.sendKeys(gendr, Keys.TAB);
    }

    public void enterMaritalStatus(String maristatus) {
        maritalStatus.sendKeys(maristatus, Keys.TAB);
    }

    public void enterDOB(String dob) {
        dateOfBirth.clear();
        dateOfBirth.sendKeys(dob,Keys.TAB);
    }

    public void enterIDType(String idt){
        IDtype.sendKeys(idt,Keys.TAB);
    }
    public void enterIDNumber(String idNo){
        IDNumber.sendKeys(idNo,Keys.TAB);
    }


    public void enterDateOfJoiningScheme(String dofjoininsch) {
        dateOfJoiningScheme.clear();
        dateOfJoiningScheme.sendKeys(dofjoininsch);
    }

    public void enterCostCenter(String costcntr) {
        costCenter.sendKeys(costcntr,Keys.TAB);
    }

    public void enterMemberClass(String mbrclass) {
        memberClass.sendKeys(mbrclass,Keys.TAB);
    }

    public void enterSavingsCategory(String sc){
        savingsCategory.sendKeys(sc,Keys.TAB);
    }

    public void enterSavingPeriod(String savingsPer){
        savingsPeriod.sendKeys(savingsPer,Keys.TAB);
    }

    public void enterDateOfSubscription(String sub){
        dateOfSubscription.sendKeys(sub,Keys.TAB);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void enterDateOfAppointment(String doa){
        dateOfAppointment.sendKeys(doa,Keys.TAB);
    }
}



