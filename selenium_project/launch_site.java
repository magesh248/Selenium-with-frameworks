package selenium_project;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class launch_site {
public static void main(String[] args) throws InterruptedException {
	//System.getProperty("webdriver.chrome.driver","D:\\First_selenium_project\\chromedriver_win32 (2)\\chromedriver.exe");
	EdgeOptions ops= new EdgeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver =new EdgeDriver(ops);
	
//	ChromeOptions ops =new ChromeOptions();
//	ops.addArguments("--remote-allow-origins=*");
//	WebDriver driver =new ChromeDriver(ops);
	driver.navigate().to("https://www.google.co.in/");
	driver.manage().window().maximize();
   WebElement insert=driver.findElement(By.className("gLFyf"));
   Thread.sleep(2000);
   insert.sendKeys("gmail"+Keys.ENTER);
   driver.close();
   System.out.println("TESTED SUCCESSFULLY");
  
	
}
}
