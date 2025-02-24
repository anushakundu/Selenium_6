package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.teicenties.genericutility.BaseClass;
import com.tricenties.objectrepository.HomePage;

public class TC_002_Test extends BaseClass {

	 @Test
	 public void clickOnComputers()
	 {
		 ExtentTest test =exReport.createTest("clickOnComputers");
		hp = new HomePage(driver);
		 hp.getComputerlinklink().click();
		 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "computer page is not displayed");
		 test.log(Status.PASS, "Computer page is displayed");
		 
	 }
}
