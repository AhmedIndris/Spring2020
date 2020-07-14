package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\Eclipse2020\\Eclipse2020\\Eclipse 2020\\FirstProject\\driver\\chromedriver.exe");
		//for Firewall
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\Eclipse2020\\Eclipse2020\\Eclipse 2020\\FirstProject\\driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
