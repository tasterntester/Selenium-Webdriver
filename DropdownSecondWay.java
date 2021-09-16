package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSecondWay {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		// 2nd way - recommended
				WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
				//SELECT CLASS CONSTRUCTOR 
				Select month = new Select(bm);
				Thread.sleep(3000);
				//select by visibletext
				month.selectByVisibleText("Apr");
				Thread.sleep(3000);
				//select by value
				month.selectByValue("5");
				Thread.sleep(3000);
				//select by index
				month.selectByIndex(6);
				//get current value from dropdown
				System.out.println(month.getFirstSelectedOption().getText());
	}

}
