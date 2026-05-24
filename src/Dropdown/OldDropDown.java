package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='carselect']"));
		Select select=new Select(Dropdown);
		select.selectByIndex(0);
		Thread.sleep(200);
		select.selectByValue("benz");
		Thread.sleep(2000);
		select.selectByVisibleText("Honda");
		Thread.sleep(2000);
		driver.close();

	}

}
