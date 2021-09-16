package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownForthWay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		// 4th Way - Check if the dropdown is supporting multiple selection 
				WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
				Select month = new Select(bm);
				System.out.println(month.isMultiple()); // false
				month.selectByIndex(2); month.selectByIndex(5);
				month.selectByVisibleText("Dec");
				//month.deselectByIndex (2);
				//month.deselectByIndex (5); 
				//month.deselectByVisibleText("Dec");
				//month.deselectAll();
				
				// 5th Way

				bm.sendKeys ("Feb");
				Thread.sleep (3000);
				driver.findElement(By.xpath("//select[@id='month']")).sendKeys ("Mar");

	}

}
