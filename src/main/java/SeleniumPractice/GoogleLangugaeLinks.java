package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLangugaeLinks {

	public static void main(String[] args) {

/*		System.setProperty("webdriver.chrome.driver", "/Users/administrator/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
*/		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		List<WebElement> linkLists = driver.findElements(By.xpath("//a"));
		
		System.out.println("total number of links on page: "+ linkLists.size());
		int counter = 0;
		for(int i=0; i<linkLists.size(); i++){			
			
			if(!linkLists.get(i).getText().isEmpty()){
				System.out.println(linkLists.get(i).getText());
				counter++;
			}
		}
		System.out.println("total number of links with text on page: "+ counter);
		driver.quit();
		
		
	}

}
