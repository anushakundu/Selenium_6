package electronics;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.teicenties.genericutility.BaseClass;
import com.tricenties.objectrepository.HomePage;

public class TC_003_Test extends BaseClass {
	 @Test
	 public void clickOnComputers()
	 {
		 ExtentTest test =exReport.createTest("clickOnElectronics");
		hp = new HomePage(driver);
	    hp.getElectroniclink().click();
		 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronic page is not displayed");
		 test.log(Status.PASS, "Electronic page is displayed");
		 
	 }

}
