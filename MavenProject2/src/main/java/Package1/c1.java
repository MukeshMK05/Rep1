package Package1;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
	// Parameteraisation : Providing values to test data through the testng.xml file
	
	@Parameters({"USER" , "PASS"}) //user=u, pass = v the value we give for user and pass during testng file will be considered as u and v.
	
	
	@Test
	public void t1(String u , String v) {
		System.setProperty("webdriver.edge.driver", "F:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver ob = new EdgeDriver();
		ob.get("http://www.mycontactform.com");
		
		ob.findElementById("user").sendKeys(u);
		
		ob.findElementByName("pass").sendKeys(v);
		
		ob.findElementByClassName("btn_log").click();
	}

}
