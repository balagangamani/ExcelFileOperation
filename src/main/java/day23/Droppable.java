package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame); // By xpath
		
		WebElement source = driver.findElement(By.id("draggable"));
				
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, dest).perform();
		
		System.out.println(dest.getText());

	}

}
