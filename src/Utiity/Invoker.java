package Utiity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoker {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_WORKSPACE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://authvchnform.cognizant.com/vpn/tmindex.html");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);	
		System.out.println("We are Launched!!");
		driver.quit();
        System.out.println("Browser Closed Successully");

	}

}
