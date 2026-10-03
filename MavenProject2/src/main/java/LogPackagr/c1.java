package LogPackagr;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	static Logger log= LogManager.getLogger(c1.class);
	@Test
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "F:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver ob = new EdgeDriver();
		log.info("visited wbsite");
		ob.get("https://www.letskodeit.com/practice");
		log.info("clicking on radio buttons");
		ob.findElementById("bmwradio").click();
		
		Thread.sleep(2000);
		ob.findElementById("benzradio").click();
		
		
		Thread.sleep(2000);
		ob.findElementById("hondaradio").click();
		log.warn("may fail");
		Thread.sleep(2000);
		ob.quit();
	}
}
