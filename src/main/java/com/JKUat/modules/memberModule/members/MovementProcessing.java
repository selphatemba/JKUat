package com.JKUat.modules.memberModule.members;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.reasonsForExit.EarlyRetirement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class MovementProcessing extends BaseClass {
    public static final Logger log = Logger.getLogger(EarlyRetirement.class.getName());
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ext-comp-1333\"]/tbody/tr[2]/td[2]/em")
    WebElement members;

    @FindBy(xpath = "//*[@id=\"membRegMenu\"]")
    WebElement sponsorRegister;

    @FindBy(name = "sponsorMNameField")
    WebElement sponsorName;

    @FindBy(xpath = "//*[@id=\"ext-gen129-gp-sector-Financial-bd\"]/div")
    WebElement selectsponsor;

    @FindBy(xpath = "//*[@id=\"ext-gen148\"]")
    WebElement viewMembers;

    @FindBy(xpath = "//*[@id=\"ext-gen202-gp-mclass-Teaching Staff-bd\"]/div")
    WebElement selectmbr;

    @FindBy(xpath = "//*[@id=\"ext-gen261\"]")
    WebElement movement;

    @FindBy(xpath = "//*[@id=\"ext-comp-1994\"]")
    WebElement movementProcessing;

    @FindBy(xpath = "//*[@id=\"ext-gen438-gp-exitCategory-Withdrawal-bd\"]/div/table/tbody/tr/td[1]/div/div")
    WebElement selectMember;

    @FindBy(xpath = "//*[@id=\"ext-gen484\"]")
    WebElement benefitsCalculation;

    @FindBy(xpath = "//*[@id=\"ext-comp-2141\"]")
    WebElement showBenefitsCalc;

    @FindBy(xpath ="//*[@id=\"ext-gen635\"]")
    WebElement save;

    @FindBy(name = "ben.member")
    WebElement memberName;

    @FindBy(name = "ben.dos")
    WebElement dateofJoiningScheme;

    @FindBy(name = "ben.dateOfExit")
    WebElement dateOfExit;

    @FindBy(name = "ben.ageAtExit")
    WebElement ageOfExit;

    @FindBy(name = "ben.yearsWorked2")
    WebElement servicePeriod;

    @FindBy(name = "ben.dateOfCalculation")
    WebElement dateOfCalculation;

    @FindBy(name = "ben.eeBal")
    WebElement openBalEE;

    @FindBy(name = "ben.erBal")
    WebElement openBalER;

    @FindBy(name = "ben.avcBal")
    WebElement openBalAVC;

    @FindBy(name = "ben.avcerBal")
    WebElement openBalAVCER;

    @FindBy(name = "ben.unregTaxOnOpeningBalance")
    WebElement openBalUNregTAx;

    @FindBy(name ="ben.ee" )
    WebElement currYrContrEE;

    @FindBy(name = "ben.er")
    WebElement currYrContrER;

    @FindBy(name = "ben.avc")
    WebElement currYrContrAVC;

    @FindBy(name = "ben.avcer")
    WebElement currYrContrAVCER;

    @FindBy(name = "ben.eeTot")
    WebElement totalsEE;

    @FindBy(name = "ben.erTot")
    WebElement totalsER;

    @FindBy(name = "ben.totBen")
    WebElement totalBenefits;

    @FindBy(name ="ben.deferred" )
    WebElement deferredAmt;

    @FindBy(name ="payment.regTot" )
    WebElement lumpsumAmt;

    @FindBy(name = "payment.lumpsumTaxFree")
    WebElement taxExemptAmt;

    @FindBy(name = "payment.regTaxable")
    WebElement taxableAmt;

    @FindBy(name = "payment.regTax")
    WebElement withHoldingTax;

    @FindBy(name = "payment.regNet")
    WebElement NetLumpsum;

    @FindBy(name = "ben.taxBandUsed")
    WebElement taxBandUsed;

    @FindBy(name = "payment.unregTot")
    WebElement unregLumpsumAmt;

    @FindBy(name = "payment.unregTaxable")
    WebElement unregTaxableAmt;

    @FindBy(name = "payment.unregTax")
    WebElement unregWithHoldingTax;

    @FindBy(name = "payment.unregNet")
    WebElement unregNetLumpsum;

    @FindBy(name = "payment.netBefLiability")
    WebElement amtPayableNetBeforeLiab;

    @FindBy(name = "ben.totLiabilities")
    WebElement amtPayableTotalLiab;

    @FindBy(name = "payment.netPay")
    WebElement amtPayableNetPayment;

    @FindBy(xpath = "//*[@id=\"ext-gen146-gp-eJKUattCategory-Withdrawal-bd\"]/div[1]/table/tbody/tr/td[4]/div")
    WebElement tableRow;


    public MovementProcessing(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnMembers(){
        members.click();
    }
    public void clickOnSponsorRegister(){
        sponsorRegister.click();
    }
    public void enterSponsorName(String spons){
        sponsorName.sendKeys(spons, Keys.ENTER);
    }
    public void selectASponsor(){
        selectsponsor.click();
    }
    public void clickOnViewMembers(){
        viewMembers.click();
    }
    public void selectAmember(){
        selectmbr.click();
    }
    public void clickMovement(){
        movement.click();
    }
    public void clickOnMovementProcessing(){
        movementProcessing.click();
    }
    public void selectAReadyMember(){
        selectMember.click();
    }
    public void calculateBenefits(){
        benefitsCalculation.click();
    }
    public void clickOnShowBenefitsCalc(){
        showBenefitsCalc.click();
    }
    public void clickSave(){
        save.click();
    }

    @SuppressWarnings("resource")
    public void getPaymentDetails() throws Exception {

        //String idForTxtFile = tableRow.getText();
        new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
        // Create File In F: Driver.
        String TestFile = "F:\\Payment Details\\" + "PaymentDetails " + ".txt";
        File FC = new File(TestFile);// Created object of java File class.
        FC.createNewFile();// Create file.

        // Create Object of java FileWriter and BufferedWriter class.
        FileWriter FW = new FileWriter(TestFile);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write( "MEMBER NAME:           " + memberName.getAttribute("value"));
        BW.newLine();
        BW.write( "DATE OF JOINING SCHEME:" + dateofJoiningScheme.getAttribute("value"));
        BW.newLine();
        BW.write( "DATE OF EXIT:          " + dateOfExit.getAttribute("value"));
        BW.newLine();
        BW.write( "AGE AT EXIT:           " + ageOfExit.getAttribute("value"));
        BW.newLine();
        BW.write( "SERVICE PERIOD(YRS):   " + servicePeriod.getAttribute("value"));
        BW.newLine();
        BW.write( "DATE OF CALCULATION:   " + dateOfCalculation.getAttribute("value"));
        BW.newLine();

        BW.newLine();// To write next string on new line.
        BW.write("==================OPENING BALANCES==================================");
        BW.newLine();
        BW.write("EE:       "+openBalEE.getAttribute("value"));
        BW.newLine();
        BW.write("ER:       "+openBalER.getAttribute("value"));
        BW.newLine();
        BW.write("AVC:      "+openBalAVC.getAttribute("Value"));
        BW.newLine();
        BW.write("AVCER:    "+openBalAVCER.getAttribute("value"));
        BW.newLine();
        BW.write("UNREG TAX:"+openBalUNregTAx.getAttribute("value"));
        BW.newLine();
        BW.write("==================CURRENT YEAR CONTRIBUTIONS===========================");
        BW.newLine();
        BW.write("EE:          "+currYrContrEE.getAttribute("value"));
        BW.newLine();
        BW.write("ER:          "+currYrContrER.getAttribute("value"));
        BW.newLine();
        BW.write("AVC:         "+currYrContrAVC.getAttribute("value"));
        BW.newLine();
        BW.write("AVCER:        "+currYrContrAVCER.getAttribute("value"));
        BW.newLine();
        BW.write("==========TOTALS(OPENING BALANCES-LESS TAX +CONTRIBUTIONS+INTEREST)====");
        BW.newLine();
        BW.write("EE:           "+totalsEE.getAttribute("value"));
        BW.newLine();
        BW.write("ER:           "+totalsER.getAttribute("value"));
        BW.newLine();
        BW.write("Total Benefits:"+totalBenefits.getAttribute("value"));
        BW.newLine();
        BW.write("===========================DEFERREMENT DETAILS===========================");
        BW.newLine();
        BW.write("Deferred Amount:"+deferredAmt.getAttribute("value"));
        BW.newLine();
        BW.write("============================TAX CALCULATION(REGISTERED)===================");
        BW.newLine();
        BW.write("Lumpsum Amount:    "+lumpsumAmt.getAttribute("value"));
        BW.newLine();
        BW.write("Tax Exempt Amount: "+taxExemptAmt.getAttribute("value"));
        BW.newLine();
        BW.write("Taxable Amount:    "+taxableAmt.getAttribute("value"));
        BW.newLine();
        BW.write("WithHolding Tax:   "+withHoldingTax.getAttribute("value"));
        BW.newLine();
        BW.write("Net Lumpsum:       "+NetLumpsum.getAttribute("value"));
        BW.newLine();
        BW.write("Tax Band Used:      "+taxBandUsed.getAttribute("value"));
        BW.newLine();
        BW.write("==============================TAX CALCULATION(UNREGISTERED)===================");
        BW.newLine();
        BW.write("Lumpsum Amount:"+unregLumpsumAmt.getAttribute("value"));
        BW.newLine();
        BW.write("Taxable Amount:"+unregTaxableAmt.getAttribute("value"));
        BW.newLine();
        BW.write("WithHolding Tax:"+unregWithHoldingTax.getAttribute("value"));
        BW.newLine();
        BW.write("Net lumpsum:    "+unregNetLumpsum.getAttribute("value"));
        BW.newLine();
        BW.write("==============================AMOUNT PAYABLE==================================");
        BW.newLine();
        BW.write("Net Before Liabilities:"+amtPayableNetBeforeLiab.getAttribute("value"));
        BW.newLine();
        BW.write("Total Liabilities:     "+amtPayableTotalLiab.getAttribute("value"));
        BW.newLine();
        BW.write("Net Payments:          "+amtPayableNetPayment.getAttribute("value"));
        BW.newLine();
        BW.close();
        log.info("completed recording payments");

//        getScreenShots("PaymentDetails for " + tableRow.getText());

        // Reading from file.
        // Create Object of java FileReader and BufferedReader class.
        FileReader FR = new FileReader(TestFile);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";

        // Loop to read all lines one by one from file and print It.
        while ((Content = BR.readLine()) != null) {
            System.out.println(Content);

        }

    }
}
