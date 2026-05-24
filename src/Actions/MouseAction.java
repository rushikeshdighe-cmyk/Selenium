package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions Action = new Actions(driver);
		driver.get("https://demoqa.com/buttons");
		WebElement DoubleClick= driver.findElement(By.id("doubleClickBtn"));
		WebElement RightClick=driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(2000);
		
		// Double Click
		Action.doubleClick(DoubleClick).perform();
		System.out.println("Double Click Successfully");
		Thread.sleep(2000);
		
		// Right Click
		Action.contextClick(RightClick).perform();
		System.out.println("Right Click Successfully");
		Thread.sleep(2000);
		
		//Click and Hold
		Action.clickAndHold(RightClick).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
