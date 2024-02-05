package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the Chrome browser and launch the google url then search for something

		// Set up the driver and launch the browser

		ChromeDriver driver = new ChromeDriver();

		// load the url

		driver.get("https://www.google.com/");

		// Maximize the browser

		driver.manage().window().maximize();

		// Locate the element and find the key in element

		driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver", Keys.ENTER);

		// Close the Browser

		driver.quit();

	}

}
