package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.xpath("//input[@id='_R_64qjbjb9pb6amH1_']"));
		Thread.sleep(2000);
		Login.sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		Login.clear();
		Thread.sleep(2000);
		driver.close();


	}

}
