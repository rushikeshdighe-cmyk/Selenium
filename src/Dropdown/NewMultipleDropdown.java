package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement Dropdown=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		Dropdown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Red']")).click();
		List<WebElement> Options= driver.findElements(By.xpath("//div[@class='css-1dyz3mf']"));
		
		for (WebElement option : Options) {
			System.out.println(option.getText());
			
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
