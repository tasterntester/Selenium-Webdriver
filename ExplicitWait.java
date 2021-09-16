package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://en-gb.facebook.com/");
				
				// enter username
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
				
				// use explicit wait to check if password field is visible and enter password
				WebDriverWait wt = new WebDriverWait(driver, 10);
				wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pass']"))).sendKeys("12345");
				
	}

}

