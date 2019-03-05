package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class RunBalances extends BaseClass {

    public static final Logger log = Logger.getLogger(RunBalances.class.getName());
    public WebDriver driver;

    @FindBy(linkText = "Individual Run")
    WebElement IndividualRun;

    @FindBy(xpath = "//*[@id=\"ext-comp-1925\"]")
    WebElement InterestRateType;

    @FindBy(xpath = "//*[@id=\"ext-comp-1932\"]")
    WebElement memberNumber;

    @FindBy(id = "fsYrReg")
    WebElement FiscalYearsRegister;

    @FindBy(xpath = "//*[@id=\"ext-gen124\"]")
    WebElement PeriodEndProcess;


    public RunBalances(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void hoverIncomeAllocationUsingInterestRate() throws Exception{
        Actions hover = new Actions(driver);
        WebElement Elem_to_hover = driver.findElement(By.xpath("//*[@id=\"ext-comp-1831\"]"));
        hover.moveToElement(Elem_to_hover).build().perform();

    }

    public void clickIndividualRun(){

        IndividualRun.click();
    }




    public void enterInterestRateType(String rate){

        InterestRateType.sendKeys(rate, Keys.TAB);
    }

    public void enterMemberNumber(String num){

        memberNumber.sendKeys(num, Keys.RETURN);

    }

    public void clickFinancialRegister(){


        FiscalYearsRegister.click();
    }

    public void clickPeriodEndProcess(){

        PeriodEndProcess.click();

    }



}
