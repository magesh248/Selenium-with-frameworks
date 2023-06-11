package selenium_project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Form_Filling {
	static WebDriver driver;

	public void form_detail() {

		driver.findElement(By.id("name")).sendKeys("Mageshwar");
		driver.findElement(By.id("phone")).sendKeys("8667205787");
		driver.findElement(By.id("email")).sendKeys("Mageshwar248@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Chennai2027@");
		driver.findElement(By.id("address")).sendKeys("No: 3/33 4th  Moogambigai nagar Ramapurom");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("optionsRadios")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("friday")).click();
	}

	public void drop_down() {
		WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
		Select select =new Select(dropdown);
		select.selectByIndex(6);
	}

	public void upload_file() {
		WebElement uploadfile=driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]"));
		uploadfile.sendKeys("C:\\Users\\MagesH\\OneDrive\\Pictures\\Take.jpg");

		System.out.println("Successfully uploaded");


	}


	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.Chrome.driver","D:\\First_selenium_project\\chromedriver_win32 (2)\\chromedriver.exe");	
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(3000);
		Form_Filling obj =new Form_Filling();
		obj.form_detail();
		obj.drop_down();
		obj.upload_file();
		driver.get("https://www.youtube.com/");
		driver.quit();
	}


}
