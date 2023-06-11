	package testNG_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testsuite_Example2 {

	WebDriver driver;

	long start_time;
	long end_time;

	@BeforeSuite // It will Execute first before @Test
	public void Lauch_Browser() {

		start_time =System.currentTimeMillis();// It will calculate the system time
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(ops);
		driver.manage().window().maximize();

	}
         //Note: It execution time will be less compared to previous example:TestsuiteExample
	@Test(priority = 1)
	public void Bing() {

	driver.get("https://www.bing.com/?cc=in");

	}

	@Test(priority = 2)
	public void Opera() {

		driver.get("https://www.opera.co.in/");
	}

	@Test(priority = 3)
	public void Google() {

		driver.get("https://www.google.co.in/");

	}

	@AfterSuite // It will Execute last after @Test
	public void Close_Browser() {
		driver.quit();
		end_time =System.currentTimeMillis();
		long Total_time=end_time -start_time;
		System.out.println("Total time is=" + Total_time);

	}
}



