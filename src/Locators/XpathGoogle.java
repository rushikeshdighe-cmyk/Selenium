package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGoogle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Facebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit'][2]")).click();
		Thread.sleep(2000);
		driver.close();

	



	}

}
