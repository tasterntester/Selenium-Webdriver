package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownThirdWay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		//3rd way - will store all dropdown value in list
				WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
				Select month = new Select(bm);
				List<WebElement> dropdown = month.getOptions(); 
				System.out.println("Total Dropdown values are "+ dropdown.size()); 
				for (int i = 0; i < dropdown.size(); i++) {
						String dropdownValues = dropdown.get(i).getText(); 
						if (dropdownValues.equalsIgnoreCase("Aug")) {
						dropdown.get(i).click();
						}
				}	
				
	}

}
