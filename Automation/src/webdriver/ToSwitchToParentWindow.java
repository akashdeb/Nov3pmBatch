package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		Thread.sleep(10000);
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
				if(!id.equals(parentWindowId)) {
					driver.findElement(By.linkText("Try Free")).click();
					break;
			}
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		
	}

}
