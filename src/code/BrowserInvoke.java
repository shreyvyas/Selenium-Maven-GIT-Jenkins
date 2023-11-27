package code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoke {

	public static void main(String[] args) {
		
		//this step is not required from 4.6, selenium manager can internally invoke the browser
		//chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Setup\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//firefox
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Setup\\drivers\\geckodriver.exe");
//		
//		WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.quit();

	}

}
