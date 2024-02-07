package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the browser

		WebDriver driver = new ChromeDriver();

		// Pass the url

		//driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : " + currentUrl);

		// Maximize the window

		driver.manage().window().maximize();

		// click Login

		//driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.linkText("Log in")).click();
		
		//enter email
		
		String expectedText = "gmani2805@gmail.com";
		//driver.findElement(By.id("Email")).sendKeys("gmani2805@gmail.com");
		driver.findElement(By.id("Email")).sendKeys(expectedText);
		
		//enter password
				
		driver.findElement(By.id("Password")).sendKeys("Spirit567");
		
		//click login button
		
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		//validate the login
		
		String actualText = driver.findElement(By.className("account")).getText();
		
		if(expectedText.equals(actualText)) {
			
			System.out.println("Logged In successful");
			
		} else {
			
			System.out.println("Logged in Unsuccessful");
		}
		//browser navigation
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual title: " +actualTitle);
		
		driver.navigate().back();
		
		String backwardtitle = driver.getTitle();
		
		System.out.println("Page title: " +backwardtitle);
		 
		if(backwardtitle.equals("Demo Web Shop. Login")) {
		
		System.out.println("Page navigated backward");
		
		}
		
		driver.navigate().refresh();
		
		driver.close();


	}

}
