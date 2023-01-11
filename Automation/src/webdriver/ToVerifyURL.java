package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		String expectedURL = "facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL: "+actualURL);
		System.out.println("Expected URL: "+expectedURL);
		
		if(actualURL.contains(expectedURL)) {
			System.out.println("Pass: The URL is verified");
		}
		else
			System.out.println("Fail: The URL is not verified");

	}

}
