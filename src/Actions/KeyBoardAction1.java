package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		Actions Action=new Actions(driver);
		WebElement nameField = driver.findElement(By.id("userName"));
		Thread.sleep(2000);

		//Sendkeys
		nameField.sendKeys("rushikesh");
		Thread.sleep(2000);
		Action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); 
		Thread.sleep(2000);
		driver.quit();


		
	}

}
