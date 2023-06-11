package EmranAutomationProject;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
@Test
	public void firstTest() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://mvnrepository.com/");
	Thread.sleep(10000);
	System.out.println(driver.getTitle());
//driver.get("");	//
}
}
