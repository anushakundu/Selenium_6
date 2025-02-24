package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.teicenties.genericutility.BaseClass;
import com.tricenties.objectrepository.HomePage;

 com.tricenties.objectrepository.HomePage;
@Listeners(ListenersUtility.class)
public class TC_001_Test extends BaseClass {
	 @Test
	 public void clickOnBooks()
	 {
		 ExtentTest test = exReport.createTest("clickOnBooks");
		 hp = new HomePage(driver);
		 hp.getBookslink().click();
		 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page is not displayed");
		 test.log(Status.PASS, "Book page is displayed");
		 
	 }
	

}
