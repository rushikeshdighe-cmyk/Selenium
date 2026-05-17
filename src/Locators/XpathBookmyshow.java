package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBookmyshow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dummy']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dummy']")).click();



	}

}
