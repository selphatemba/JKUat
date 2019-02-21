package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;



public class MemberApproval extends BaseClass {


     WebDriver driver;


    @FindBy(id = "ext-gen111")
    private WebElement memberApprovalOption;
    @FindBy(name = "mMemberNo2")
    private WebElement enterMemberNo;
    @FindBy(xpath = "//*[@id=\"ext-gen129-gp-mclass-CLASS ONE-bd\"]/div")
    private WebElement selectMember;
    @FindBy(xpath = "//*[@id=\"ext-gen172\"]")
    WebElement approve;
    @FindBy(xpath = "//*[@id=\"ext-gen200\"]")
    WebElement selectedmember;

    public MemberApproval(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
    }

    public void selectMemberApprovalOption(){
        memberApprovalOption.click();
    }

    public void searchMember(String mnumber){
        enterMemberNo.sendKeys(mnumber, Keys.ENTER);
    }

    public void selectAmember(){
        selectMember.click();

    }

    public void clickApprove(){
        approve.click();
    }

    public void clickSelectedMember(){
        selectedmember.click();
    }


}
