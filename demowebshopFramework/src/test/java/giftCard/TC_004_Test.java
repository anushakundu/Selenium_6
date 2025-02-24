package giftCard;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.teicenties.genericutility.BaseClass;
import com.tricenties.objectrepository.HomePage;

public class TC_004_Test extends BaseClass{
	 @Test
	 public void clickOnComputers()
	 {
		 ExtentTest test =exReport.createTest("clickOnGiftCard");
		hp = new HomePage(driver);
		 hp.getGiftcardlink().click();
		 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "GiftCard page is not displayed");
		 test.log(Status.PASS, "GiftCard page is displayed");
		 
	 }

}
