package com.JKUat.modules.memberModule.contributions;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class DirectContr extends BaseClass {

    public static final Logger log = Logger.getLogger(DirectContr.class.getName());

    public WebDriver driver;


    @FindBy(name = "batch.title")
    WebElement BatchTitle ;


    @FindBy(id = "directMonthCombo")
    WebElement Month;

    @FindBy(id = "directYearField")
    WebElement Year;






    public DirectContr(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterBatchTitle(String name) {

        BatchTitle.sendKeys(name, Keys.ENTER);

    }


    public void enterMonth(String date) {

        Month.sendKeys(date,Keys.ENTER);

    }

    public void enterYear(String yr){
        Year.sendKeys(yr, Keys.ENTER);
    }



}
