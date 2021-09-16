package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Introducing implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name ='q']")).sendKeys("How stuff work");
		
		//  HOW TO  HANDLE AUTO SUGGESTIONS
		WebElement AllSuggestion = driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]"));
		List<WebElement> AllSearch = AllSuggestion.findElements(By.tagName("li"));
		System.out.println("Total Auto Suggestion:" + AllSearch.size());
		
		for (int i = 0; i < AllSearch.size(); i++) {
			
			String AllSuggestionList = AllSearch.get(i).getText();
			String FinalResult ="Mysore"; 	
			
			if (AllSuggestionList.equalsIgnoreCase(FinalResult)) {
				
				AllSearch.get(i).click();
				System.out.println("you got selected:" + FinalResult);
				break;
			}
		}
		
	}

}

