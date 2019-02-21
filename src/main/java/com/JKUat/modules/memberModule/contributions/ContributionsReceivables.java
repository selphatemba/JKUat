package com.JKUat.modules.memberModule.contributions;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ContributionsReceivables extends BaseClass {

    public static final Logger log = Logger.getLogger(ContributionsReceivables.class.getName());

    public WebDriver driver;

    @FindBy(name = "invoice.date")
    WebElement BookingDate;

    @FindBy(name = "invoice.dateDue")
    WebElement DueDate;

    @FindBy(name = "invoice.controlAmnt")
    WebElement Total;

    @FindBy(xpath = "//*[@id=\"ext-gen423\"]")
    WebElement save;




    public ContributionsReceivables(WebDriver driver) {
        this.driver = driver;
        // BaseClass testBase = new BaseClass();
        PageFactory.initElements(driver, this);
    }

    public void EnterBookingDate(String date) {

        BookingDate.sendKeys(date, Keys.ENTER);

    }

    public void EnterDueDate(String Ddate) {

        DueDate.sendKeys(Ddate,Keys.ENTER);

    }
    public void GetTotal( ) {

        Total.getText();

    }

    public void clickSaveButton(){
        save.click();
    }













}
