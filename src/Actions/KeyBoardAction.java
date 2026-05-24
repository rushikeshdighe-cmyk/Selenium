package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions Action=new Actions(driver);
		WebElement NameField=driver.findElement(By.id("userName"));
		Action.keyDown(NameField, Keys.SHIFT).sendKeys("rushikesh").keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
