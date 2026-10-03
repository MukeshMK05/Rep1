package extendedReport;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class c1 {

	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public  void startTest()
	{
	//creating an object for extent reports class, pass path as input, globally
	report = new ExtentReports("dhivya.html");
	// test start ,finish, loging
	test = report.startTest("e1");

	test.log(LogStatus.ERROR,"it may fail");
	test.log(LogStatus.INFO,"in before class");

	}
	@Test
	public void extentReportsDemo()
	{
		System.setProperty("webdriver.edge.driver", "F:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals(driver.getTitle(),"Google");
	test.log(LogStatus.PASS,"Test case passed ");
	test.setDescription("this is about google");
	driver.quit();

	}

	@AfterClass
	public void endTest()
	{
	test.log(LogStatus.INFO,"in after class");
	report.endTest(test);
	report.flush();
	}
}
