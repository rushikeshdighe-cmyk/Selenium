package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(20000);
		WebElement displayTextbox= driver.findElement(By.xpath("//input[@id='displayed-text']"));
		System.out.println("Display Status; "+ displayTextbox.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		Thread.sleep(2000);
		System.out.println("Dispaly status; "+displayTextbox.isDisplayed());
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		Thread.sleep(2000);
		System.out.println("Display Status: "+ displayTextbox.isDisplayed());
		driver.close();
		


	}

}
