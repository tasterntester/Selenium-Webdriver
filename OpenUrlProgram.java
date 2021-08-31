package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		// Setting the property of chrome browser and passing chromedriver path 
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		
		// Launching chrome browser instance
		WebDriver driver = new ChromeDriver();

		//manage() method
		driver.manage().window().maximize();

		// Opening URL of application using get() method 
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");

		// Refresh the page
		Thread.sleep(3000); driver.navigate().refresh();

		// Navigate back
		Thread.sleep(3000);
		 driver.navigate(). back();

		// Navigate forward
		 Thread.sleep(3000); driver.navigate().forward();

		// Navigate back
		Thread.sleep(3000); 
		driver.navigate().back();

		// Get Current URL
		Thread.sleep(3000);
		String url= driver.getCurrentUrl(); System.out.println(url);

		// Get Title of the Web Page 
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// Close the current browser instance
		Thread.sleep(3000);
		driver.close();

		// Closing all browser instance
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
