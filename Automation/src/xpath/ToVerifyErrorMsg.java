package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Username or Password is invalid. Please try again.";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		String actualErrorMsg = driver.findElement(By.className("errormsg")).getText();
	
		if(actualErrorMsg.equals(expectedErrorMsg)) {
			System.out.println("Pass: The error msg is verified");
		}
		else
		System.out.println("Fail: The error msg is not verified");
		
		driver.quit();

	}

}
