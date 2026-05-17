package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		Thread.sleep(2000);
		driver.close();
		


	}

}
