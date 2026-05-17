package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement Textbox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		Thread.sleep(2000);
		System.out.println("TestBox Is Displayed "+ Textbox.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		Thread.sleep(2000);
		System.out.println("TextBox is displayed: "+ Textbox.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		System.out.println("Textbox is displayed: "+ Textbox.isDisplayed());
		driver.close();


	}

}
