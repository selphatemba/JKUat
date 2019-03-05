package com.JKUat.modules.memberModule.contributions;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BatchContributions extends BaseClass {
    public static final Logger log = Logger.getLogger(BatchContributions.class.getName());
    public WebDriver driver;

    @FindBy(linkText = "New Batch Contribution")
    WebElement batchContributions;
    @FindBy(name = "batch.title")
    WebElement batchTitle;
    @FindBy(name = "batch.date")
    WebElement batchDate;
    @FindBy(xpath = "//*[@id=\"sponsorCombo\"]")
    WebElement sponsor;
    @FindBy(xpath = "//*[@id=\"companyCombo\"]")
    WebElement costCentre;
    @FindBy(id = "monthCombo")
    WebElement month;
    @FindBy(xpath = "//*[@id=\"ext-comp-2034\"]")
    WebElement year;


    public BatchContributions(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public  void clickOnBatchContributions() throws Exception{
        batchContributions.click();

    }

    public  void enterBatchTitle(String Title) throws Exception{
        batchTitle.sendKeys(Title,Keys.ENTER);

    }

    public void enterBatchDate(String date){

        batchDate.sendKeys(date,Keys.ENTER);
    }

    public void enterSponsorname(String sName){

        sponsor.sendKeys(sName, Keys.TAB);
    }

    public void enterCostCentre(String costcentre) {
        costCentre.sendKeys(costcentre,Keys.TAB);
    }

    public void enterMonth(String mnth){
        month.sendKeys(mnth,Keys.TAB);
    }

    public void enterYear(String yr){
        year.sendKeys(yr,Keys.TAB);
    }
}
