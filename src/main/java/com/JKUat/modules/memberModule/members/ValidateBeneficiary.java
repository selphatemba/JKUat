package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ValidateBeneficiary extends BaseClass {
    public static final Logger log = Logger.getLogger(ValidateBeneficiary.class.getName());

    public WebDriver driver;

    @FindBy(linkText = "Overage Beneficiaries")
    WebElement overageBeneficiaries;

    @FindBy(name = "benName")
    WebElement beneficiaryName;

    @FindBy(linkText = "Validate Selected")
    WebElement validate;


    public ValidateBeneficiary(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    public void clickOnoverageBeneficiaries() {
        overageBeneficiaries.click();

    }

    public void enterBeneficiaryName(String benName) {

        beneficiaryName.sendKeys(benName, Keys.ENTER);
    }

    public void validateSelected(){
        validate.click();
    }

}
