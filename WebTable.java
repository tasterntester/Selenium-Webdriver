package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//Create the list of all companies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("total no. of companies = "+ allcompanies.size());
		
		//Create List of current price
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("total no. of current prices = " + currentprice.size());
		
		
		String expectedCompanyName = "Adani Total Gas";
		for (int i = 0; i < allcompanies.size(); i++) {
			if (allcompanies.get(i).getText().equalsIgnoreCase(expectedCompanyName)) {
				System.out.println(allcompanies.get(i).getText()+ "====" + currentprice.get(i).getText());
				allcompanies.get(i).click();
				break;
				
			}
		}
	}
}
