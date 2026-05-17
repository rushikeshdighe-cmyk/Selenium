package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-link.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("go here")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("click here")).click();
		driver.close();


	}

}
