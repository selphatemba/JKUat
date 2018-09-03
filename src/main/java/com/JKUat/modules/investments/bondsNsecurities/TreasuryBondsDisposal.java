package com.JKUat.modules.investments.bondsNsecurities;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.investments.equities.NewCompany;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class TreasuryBondsDisposal extends BaseClass {

    public static final Logger log = Logger.getLogger(NewCompany.class.getName());

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"x-desktop\"]/center/table/tbody/tr[1]/td[4]/center/a")
    WebElement investment;

    public TreasuryBondsDisposal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openInvestmentModule(){
        investment.click();
    }
}
