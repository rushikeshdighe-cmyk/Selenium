package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement Dropdown=driver.findElement(By.xpath("//div[@id='withOptGroup']"));
		Dropdown.click();
		Thread.sleep(2000);
		WebElement Option=driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
		Option.click();
		Thread.sleep(2000);
		driver.close();
	}

}
