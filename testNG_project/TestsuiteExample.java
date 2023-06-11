package testNG_project;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestsuiteExample {

	@Test
	public void Bing() {

		long start_time =System.currentTimeMillis();// It will calculate the system time
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/?cc=in");
		driver.quit();
		long end_time =System.currentTimeMillis();
		long Total_time=end_time -start_time;
		System.out.println("Total time is=" + Total_time);
	}

	@Test
	public void Opera() {
		long start_time =System.currentTimeMillis();
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.opera.co.in/");
		driver.quit();
		long end_time =System.currentTimeMillis();
		long Total_time=end_time -start_time;
		System.out.println("Total time is=" + Total_time);
	}

	@Test
	public void Google() {
		long start_time =System.currentTimeMillis();
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.quit();
		long end_time =System.currentTimeMillis();
		long Total_time=end_time -start_time;
		System.out.println("Total time is=" + Total_time);
	}
}
