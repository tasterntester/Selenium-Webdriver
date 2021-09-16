package selenium;

import org.openqa.selenium.By;
import org.openqa. selenium.WebDriver;
import org.openqa. selenium.chrome. ChromeDriver;

public class RedioButtonProgram {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// Setting the property of chrome browser and passing chromedriver path 
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		// first way to handle
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); // clinking on female radio button 
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//input[@value='2']")).click(); // clinking on male radio button 
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@value='-1']")).click(); // clinking on custom radio button
	    
	    
	    
	}
}
