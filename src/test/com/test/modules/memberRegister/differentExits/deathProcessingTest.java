package com.test.modules.memberRegister.differentEJKUatts;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.BenefitCalculationDetails;
import com.JKUat.modules.memberModule.members.DeathProcessing;
import org.apache.log4j.Logger;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class deathProcessingTest extends BaseClass {

	Screen screen = new Screen();

	Pattern checkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\check box.PNG");
	Pattern Saved = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\saves.PNG");
	Pattern OkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\ok.PNG");
	Pattern close = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\close.PNG");
	Pattern CaptureMovements = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\movements.PNG");
	Pattern viewMembers = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\viewmembers.PNG");
	Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
	Pattern claimactivities = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\claims Activities.PNG");
	Pattern sponsor = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\mRegister.PNG");
	Pattern movementProcessing = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\movementProcessing.PNG");

	public static final Logger log = Logger.getLogger(BenefitsCalculation.class.getName());

	@BeforeClass
	public void setUp() throws Exception {
		//init();

	}


	@Test(priority =0)
	public void login(){
//		try {
//			LoginPage lp = new LoginPage(driver);
//			log.info("=========== Starting  login Test=============");
//			Thread.sleep(5000);
//			lp.login("admin", "admin");
//			Thread.sleep(5000);
//			log.info("=========== Finished login Test=============");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}


	@Test(priority = 1)
	public void doDeathProcessing() throws Exception {
		log.info("=========== Starting death processing Test=============");
		DeathProcessing dp = new DeathProcessing(driver);
		Thread.sleep(8000);
		screen.click(memberReg);
		Thread.sleep(5000);
		screen.click(sponsor);
		Thread.sleep(5000);
		dp.enterSponsorName("JKUAT sponsor");
		Thread.sleep(5000);
		screen.click(checkBox);
		Thread.sleep(5000);
		screen.click(viewMembers);
		Thread.sleep(5000);
		dp.enterMemberNumber("128");
		Thread.sleep(5000);
		screen.click(checkBox);
		Thread.sleep(3000);
		screen.click(CaptureMovements);
		Thread.sleep(5000);
		dp.clickDeathProcessing();
		Thread.sleep(5000);
		dp.enterNatureOfDeath("Natural Death");
		Thread.sleep(5000);
		dp.entercauseOfDeath("Unknown");
		Thread.sleep(5000);
		dp.enterdateDeceased("02/14/2018");
		Thread.sleep(5000);
		dp.enterdateOfCalculation("02/14/2018");
		Thread.sleep(5000);
		dp.DeceasedWhileOnDuty("Yes");
		Thread.sleep(5000);
		dp.DeathCertNo("5589524");
		Thread.sleep(5000);
		dp.enterRemarks("No Remarks");
		Thread.sleep(5000);
		dp.enterReasonForEJKUatt("Death in Service");
		Thread.sleep(5000);
		dp.enterCurrency("KENYA SHILLINGS");
		Thread.sleep(5000);
		dp.enterpayTobenefeciary("YES");
		Thread.sleep(5000);
		dp.entercalculationMode("Accumulated Contributions");
		Thread.sleep(5000);
		dp.enterpayTo("Known Beneficiaries");
		Thread.sleep(5000);
		screen.click(Saved);
		Thread.sleep(1500);
		screen.click(OkBox);
		Thread.sleep(3000);
		screen.click(claimactivities);
		Thread.sleep(1500);
		screen.click(movementProcessing);
		Thread.sleep(5000);
		dp.enterMemberNumbers("128");
		Thread.sleep(5000);
		screen.click(checkBox);
		Thread.sleep(5600);
		dp.clickOnBenefitsCalculation();
		Thread.sleep(7000);
		dp.showBenefitsCalculation();
		Thread.sleep(7000);
		log.info("=========== Finished death processing Test=============");

	}

	@Test(priority = 2)
	public void getBenefitCalculationsDets() throws Exception {
		BenefitCalculationDetails bcd = new BenefitCalculationDetails(driver);

		log.info("=========== Started get benefit calculation=============");
		log.info("=========== starting to write to file===========");
		bcd.writeToFile();
		log.info("=========== finished to write to file=============");
		screen.click(Saved);
		Thread.sleep(7000);
		screen.click(OkBox);
		Thread.sleep(5000);
		screen.click(close);
		Thread.sleep(3000);
		log.info("=========== finished get benefit calculation=============");

	}

}
