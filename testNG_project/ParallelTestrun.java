package testNG_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTestrun {

	@Test(priority = 2)
	public void openGoogle()  {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	
		
		
	}
	@Test(priority = 1)
	public void openbing() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/?cc=in");
		
	}

	
}
