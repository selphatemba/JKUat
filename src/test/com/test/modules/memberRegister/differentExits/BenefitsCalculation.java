package com.test.modules.memberRegister.differentEJKUatts;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.claimActivities.ClaimActivities;
import com.JKUat.modules.memberModule.members.BenefitCalculationDetails;
import org.apache.log4j.Logger;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.test.base.JyperionListener.takeSnapShot;


public class BenefitsCalculation extends BaseClass {
	Screen screen = new Screen();
    Pattern jkuatsposor = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\JKUAT.PNG");
    Pattern viewmembers = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\viewmembers.PNG");
	Pattern checkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\check box.PNG");
	Pattern Saved = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");
	Pattern OkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\ok.PNG");
	Pattern movementProcessing = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\movementProcessing.PNG");
	Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");
	Pattern CaptureMovements = new Pattern("C:\\Users\\rowanisky\\Pictures\\CaptureMovements.PNG");
	Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
	Pattern claimactivities = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\claims Activities.PNG");
	Pattern sponsor = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\mRegister.PNG");

	public static final Logger log = Logger.getLogger(BenefitsCalculation.class.getName());

	@BeforeClass
	public void setUp() throws Exception {
	//	init();

	}

    @Test(priority =0)
    public void login(){
//        try {
//            LoginPage lp = new LoginPage(driver);
//            log.info("=========== Starting  login Test=============");
//            Thread.sleep(5000);
//            lp.login("admin", "admin");
//            Thread.sleep(5000);
//            log.info("=========== Finished login Test=============");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
	@Test(priority = 1)
	public void showBenefitsCalculation() throws Exception {

		log.info("=========== starting show Benefits Calculation Test===========");
		ClaimActivities cActive = new ClaimActivities(driver);
		Thread.sleep(5000);
		screen.click(memberReg);
		Thread.sleep(10000);
		screen.click(sponsor);
		Thread.sleep(5500);
        screen.click(jkuatsposor);
        Thread.sleep(5000);
        screen.click(viewmembers);
        Thread.sleep(5000);
		cActive.enterMemberNumber("128");
//		Thread.sleep(1000);
//		System.out.println(num);
		Thread.sleep(5000);
		screen.click(checkBox);
		Thread.sleep(5000);
		screen.click(CaptureMovements);
		Thread.sleep(5000);
		cActive.clickOninitiateMovement();
		Thread.sleep(5000);
		cActive.enterDateOfEJKUatt("02/14/2018");
		Thread.sleep(5000);
		cActive.enterDateOfCalculation("02/14/2018");
		Thread.sleep(2500);
		cActive.enterCurrencyUsed("Kenya Shillings");
		Thread.sleep(1500);
		cActive.reasonsForEJKUatt("Early Retirement");
        Thread.sleep(1500);
        cActive.enterRemarks("Unkown Conditions");
        Thread.sleep(5000);
        takeSnapShot(driver);
        Thread.sleep(1500);
		screen.click(Saved);
		Thread.sleep(1500);
		screen.click(OkBox);
		Thread.sleep(3000);
		screen.click(claimactivities);
		Thread.sleep(4500);
		screen.click(movementProcessing);
		Thread.sleep(5000);
		cActive.enterMemberNumber2("128");
		Thread.sleep(5000);
		screen.click(checkBox);
		Thread.sleep(5600);
		cActive.clickOnBenefitsCalculation();
		Thread.sleep(1500);
		cActive.showBenefitsCalculation();
		Thread.sleep(15000);
		log.info("=========== Finished show Benefits Calculation Test===========");

	}

	@Test(priority = 2)
	public void getBenefitCalculationsDets() throws Exception {
		BenefitCalculationDetails bcd = new BenefitCalculationDetails(driver);
		log.info("=========== Started get benefit calculation=============");
		log.info("=========== starting to write to file===========");
		bcd.writeToFile();
		log.info("=========== finished to write to file=============");
		screen.click(Saved);
		Thread.sleep(5000);
		screen.click(OkBox);
		Thread.sleep(5000);
		screen.click(close);
		Thread.sleep(3000);
			log.info("=========== finished get benefit calculation=============");

	}




}
