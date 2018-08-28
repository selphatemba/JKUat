package com.JKUat.modules.memberModule.contributions;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PreviousBatchContributions extends BaseClass {

    public  static final Logger log =Logger.getLogger(PreviousBatchContributions.class.getName());
    public WebDriver driver;


    @FindBy(linkText = "Previous Batch Contributions")
    WebElement previousBatch;

    @FindBy(xpath = "//*[@id=\"ext-gen144-gp-posted-No-bd\"]/div[8]/table/tbody/tr/td[3]/div")
    WebElement batch;



    public PreviousBatchContributions(WebDriver driver) {
        this.driver = driver;
        // BaseClass testBase = new BaseClass();
        PageFactory.initElements(driver, this);
    }

    public void clickOnPreviousBatch() {

        previousBatch.click();

    }

    public void selectBatch() throws InterruptedException {

        batch.click();


    }


}
