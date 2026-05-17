package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		System.out.println("Search the products");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
		System.out.println("add Cart");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		System.out.println("Go to Cart");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		System.out.println("proceed to checkout");
		Thread.sleep(2000);
		driver.findElement(By.xpath("ap_email_login")).sendKeys("1234567890");
		System.out.println("Add Mobile Number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(2000);
		driver.close();


	}

}
