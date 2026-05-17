package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		searchButton.sendKeys("mobiles");
		Thread.sleep(2000);
		searchButton.clear();
		Thread.sleep(2000);
		driver.close();


	}

}
