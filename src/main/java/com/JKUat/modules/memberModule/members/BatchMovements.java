package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BatchMovements extends BaseClass {

    public static final Logger log = Logger.getLogger(BatchMovements.class.getName());
    public WebDriver driver;

    @FindBy(linkText = "Batch Movement")
    WebElement batchmovements;
    @FindBy(id="sponsorCombo")
    WebElement eJKUattReasons;
    @FindBy(xpath = "//*[@id=\"ext-comp-1610\"]")
    WebElement enterMemberNumber;



    public BatchMovements(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public  void clickOnBatchMovements() throws Exception{
        batchmovements.click();

    }

    public  void enterEJKUattReasons(String res) throws Exception{
        eJKUattReasons.sendKeys(res, Keys.ENTER);
    }

    public  void enterMNumber(String numero) throws Exception {
        enterMemberNumber.sendKeys(numero,Keys.ENTER);
    }

}
