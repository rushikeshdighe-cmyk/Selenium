package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement DropdownBox=driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select select=new Select(DropdownBox);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("orange");
		Thread.sleep(2000);
		select.selectByVisibleText("Peach");
		Thread.sleep(2000);
		select.deselectByIndex(1);
		Thread.sleep(2000);
		driver.close();
	}

}
