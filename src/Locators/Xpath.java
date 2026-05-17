package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_1cl2p4jikacppb6amH1_']")).sendKeys("Rushikesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_1kl2p4jikacppb6amH1_']")).sendKeys("Dighe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_6ad8p4jikacppb6amH1_']")).sendKeys("9836373873");
		Thread.sleep(2000);
		driver.close();



	}

}
