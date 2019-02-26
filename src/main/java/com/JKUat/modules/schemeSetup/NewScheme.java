package com.JKUat.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class NewScheme extends BaseClass {

    public static final Logger log = Logger.getLogger(NewScheme.class.getName());

    public WebDriver driver;

//    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]/center/a")
//    WebElement schemeSetUp;
//

//    @FindBy(xpath = "//*[@id=\"ext-gen77\"]")
//    WebElement mainMenu;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[1]")
    WebElement schemeSetup;

    @FindBy(xpath = "//*[@id=\"ext-gen38\"]")
    WebElement scheme;

    @FindBy(xpath = "//*[@id=\"ext-comp-1026\"]")
    WebElement newScheme;

    @FindBy(name = "scheme.schemeDetails.schemeName")
    WebElement schemeName;

    @FindBy(xpath = "//*[@id=\"ext-comp-1150\"]")
    WebElement SchemeType;

    @FindBy(xpath = "//*[@id=\"ext-comp-1151\"]")
    WebElement FundType;

    @FindBy(xpath = "//*[@id=\"ext-comp-1152\"]")
    WebElement fundAdministrator;

    @FindBy(xpath = "//*[@id=\"ext-comp-1158\"]")
    WebElement BaseCurrency;

    @FindBy(name = "scheme.schemeDetails.takeOnDate")
    WebElement TakeOnDate;

    @FindBy(name = "scheme.schemeDetails.finStartDay")
    WebElement startDay;

    @FindBy(xpath = "//*[@id=\"ext-comp-1150\"]")
    WebElement startMonth;

    @FindBy(name = "scheme.schemeDetails.dateCommenced")
    WebElement dateOfCommencement;

    @FindBy(xpath = "//*[@id=\"ext-gen146\"]")
    WebElement save;

    @FindBy(xpath = "//*[@id=\"ext-gen271\"]")
    WebElement okBox;





    public NewScheme(WebDriver driver) {
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

    public void clickOnNewScheme(){
        newScheme.click();
    }

    public void enterSchemeName(String name) {

        schemeName.sendKeys(name, Keys.TAB);

    }


    public void enterSchemeType(String type) {

        SchemeType.sendKeys(type, Keys.TAB);

    }


    public void enterFundType(String fund) {

        FundType.sendKeys(fund, Keys.TAB);

    }

    public void enterFundAdministrator(String fundAdmin){
        fundAdministrator.sendKeys(fundAdmin,Keys.TAB);
    }


    public void enterBaseCurrency(String curr) {

        BaseCurrency.sendKeys(curr, Keys.TAB);

    }


    public void enterTakeOnDate(String Sdate) throws InterruptedException {

        TakeOnDate.clear();
        Thread.sleep(500);
        TakeOnDate.sendKeys(Sdate, Keys.TAB);

    }

    public void clickOnStartDay(){
        startDay.click();
    }

    public void clickOnStartMonth(){
        startMonth.click();
    }

    public void enterDateOfCommencement(String dateOfComm){
        dateOfCommencement.clear();
        dateOfCommencement.sendKeys(dateOfComm,Keys.TAB);
    }

    public void clickSaveButton(){
        save.click();
    }

    public void clickOkBox(){
        okBox.click();
    }







}
