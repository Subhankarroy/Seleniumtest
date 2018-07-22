package Utiity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoker {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Books\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		// TODO Auto-generate  commethod stub
		driver.get("google.com");
		System.out.println("Google launched!!");
		driver.quit();

	}

}
