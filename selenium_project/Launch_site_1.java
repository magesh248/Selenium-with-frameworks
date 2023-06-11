package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Launch_site_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.Chrome.driver","D:\\First_selenium_project\\chromedriver_win32 (2)\\chromedriver.exe");	
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	   WebDriver driver =new ChromeDriver(ops);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
		
	
		driver.findElement(By.id("firstName")).sendKeys("Magesh");
		driver.findElement(By.id("lastName")).sendKeys("V");
		driver.findElement(By.id("userEmail")).sendKeys("mageshwar248@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8667205787");
		WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		String selectAll = Keys.chord(Keys.CONTROL, "a");
	    dob.sendKeys(selectAll);
	    dob.sendKeys("28 Mar 1998");
	   System.out.println(js.executeScript("window.scrollBy(0,500)")); 
	    WebElement upload =driver.findElement(By.id("uploadPicture"));
	    upload.sendKeys("C:\\Users\\MagesH\\Downloads\\My Resume.docx");
	    
	    
		
		
		
	
		System.out.println("completed");
	
//		Select select =new Select(dob);
//		select.selectByIndex(5);
			
	}

}
