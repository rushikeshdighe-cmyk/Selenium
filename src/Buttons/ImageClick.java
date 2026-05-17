package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImageClick {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement Image=driver.findElement(By.xpath("//img[@alt='Jeans under $50']"));
		Thread.sleep(2000);
		Image.click();
		Thread.sleep(2000);
		WebElement Image2=driver.findElement(By.xpath("//img[@class='s-image'][1]"));
		Thread.sleep(2000);
		Image2.click();
		Thread.sleep(2000);
		WebElement AddtoCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		AddtoCart.click();
		Thread.sleep(2000);
		WebElement ProceedtoCheckout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		ProceedtoCheckout.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Image3=driver.findElement(By.xpath("//img[@class='sw-product-image'][1]"));
		Image3.click();
		Thread.sleep(2000);
		WebElement Image4=driver.findElement(By.xpath("//input[@aria-labelledby='color_name_0-announce'][1]"));
		Image4.click();
		Thread.sleep(2000);
		WebElement BuyNow=driver.findElement(By.xpath("buy-now-button"));
		BuyNow.click();
		driver.close();

		

	}

}
