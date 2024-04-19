package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test {
	public static WebDriver driver;
	public static Properties prop= new Properties();
	public static FileReader fr;
	@BeforeTest
	public void setup() throws IOException{
		if (driver==null) {
			FileReader fr= new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Olabi_01_Maven_Project\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("olabiurl"));
			
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("olabiurl"));
		}
		
		
		
	}
	@AfterTest
	public void tearDown() {
//		driver.close();
		System.out.println("tear down successfully");
	}

}
