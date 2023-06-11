package javaForAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PropertiesFileUsing {



	public static void main(String[] args) throws IOException {
		WebDriver driver = null;

		FileInputStream stream =new FileInputStream("config.properties");

		Properties fileproperty =new Properties();
		fileproperty.load(stream);

		String Driverlocation=fileproperty.getProperty("location");
		String browser=fileproperty.getProperty("Browser");


		if (browser.equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.Chrome.driver",Driverlocation);
			ChromeOptions ops=new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver =new ChromeDriver(ops);
			driver.manage().window().maximize();

		} else if(browser.equalsIgnoreCase("edge")) {
			System.getProperty("webdriver.edge.driver",Driverlocation);
			EdgeOptions ops= new EdgeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(ops);
			driver.manage().window().maximize();

		}
		driver.get("https://www.youtube.com/");
	}
}







