package com.JKUat.modules.memberModule.contributions;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class SingleContribution extends BaseClass {

	public static final Logger log = Logger.getLogger(SingleContribution.class.getName());

	public WebDriver driver ;


	@FindBy(xpath = "//button[contains(.,'Contributions')]")
    WebElement clickContributions;

	@FindBy(xpath = "//span[contains(.,'New Single Contribution')]")
    WebElement newSingleContribution;

	@FindBy(xpath = "//input[@name='contr.ee']")
    WebElement eneterEE;

	@FindBy(id = "mMemberNo")
    WebElement memberNumber2;
	
	@FindBy(xpath = "//input[@name='contr.er']")
    WebElement eneterER;

	@FindBy(xpath = "//input[@name='contr.salary']")
    WebElement enterSalary;
	
	@FindBy(xpath = "//*[@id=\"ext-comp-2239\"]")
    WebElement EnterContrType;
	
	@FindBy(xpath = "//*[@id=\"ext-comp-2250\"]")
    WebElement EnterMonth;
	
	@FindBy(name = "contr.year")
    WebElement enterYear;

	@FindBy(id = "ext-comp-2252")
    WebElement EnterSattus;

//	@FindBy(xpath = "//*[@id=\"sponsorMNameField\"]")
//    WebElement sposorName;


	
	
	
	public SingleContribution(WebDriver driver) {
		this.driver = driver;
	 PageFactory.initElements(driver, this);
	}



	public void enterMemberNumber2(String num) {
		String numStr = num.trim();
        memberNumber2.sendKeys(numStr,Keys.ENTER);

	}

	public void clickOnContributions() {
		clickContributions.click();

	}
	
	
	public void clickSingleContribution() {
		newSingleContribution.click();
		
	}
	

	public void eneterEEAmount(String EEAmount) {
		eneterEE.sendKeys(EEAmount, Keys.ENTER);


	}
	
	public void eneterERAmount(String ERAmount) {
		eneterER.sendKeys(ERAmount, Keys.ENTER);

	}
	
	public void eneterSalary(String salary) {
		enterSalary.sendKeys(salary, Keys.ENTER);

	}
	
	
	public void entercontrType(String contrType) {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("document.getElementsByName('contr.type')[0].setAttribute('type', 'text');");
		  EnterContrType.sendKeys(contrType, Keys.ENTER);

	}
	

	public void enterMonth(String month) {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement enterMonth = (WebElement) jse.executeScript("document.getElementsByName('contr.month')[0].setAttribute('type', 'text');");
		EnterMonth.sendKeys(month, Keys.ARROW_DOWN,Keys.ENTER);

	}
	

	public void enterYear(String year) {
		enterYear.sendKeys(year, Keys.ENTER);

	}
	

	public void enterStatus(String status) {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement enterSattus = (WebElement) jse.executeScript("document.getElementsByName('contr.status')[0].setAttribute('type', 'text');");
		EnterSattus.sendKeys(status, Keys.RETURN);
	}

//	public void setSposorName(String sposorname) {
//		sposorName.sendKeys(sposorname);
//	}
}


