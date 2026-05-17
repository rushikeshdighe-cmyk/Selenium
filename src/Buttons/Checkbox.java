package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement Checkbox1=driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		Thread.sleep(2000);
		Checkbox1.click();
		System.out.println("CheckBox1 is selected: " + Checkbox1.isSelected());
		
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@id='benzcheck']"));
		Thread.sleep(2000);
		Checkbox2.click();
		System.out.println("Checkbox2 is selected: "+ Checkbox2.isSelected());
		driver.close();


	}

}
