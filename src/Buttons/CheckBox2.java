package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		WebElement Checkbox1=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		Checkbox1.click();
		Thread.sleep(2000);
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		Checkbox2.click();
		Thread.sleep(2000);
		WebElement Checkbox3=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		Checkbox3.click();
		Thread.sleep(2000);
		System.out.println("Checkbox1 is Selected: "+ Checkbox1.isSelected());
		System.out.println("Checkbox2 is Selected: "+ Checkbox2.isSelected());
		System.out.println("Checkbox3 is Selected: "+ Checkbox3.isSelected());
		Thread.sleep(2000);
		Checkbox1.click();
		Thread.sleep(2000);
		System.out.println("Checkbox1 is Selected: "+ Checkbox1.isSelected());
		System.out.println("Checkbox2 is Selected: "+ Checkbox2.isSelected());
		System.out.println("Checkbox3 is Selected: "+ Checkbox3.isSelected());
		Thread.sleep(2000);
		Checkbox2.click();
		System.out.println("Checkbox1 is Selected: "+ Checkbox1.isSelected());
		System.out.println("Checkbox2 is Selected: "+ Checkbox2.isSelected());
		System.out.println("Checkbox3 is Selected: "+ Checkbox3.isSelected());
		Thread.sleep(2000);
		Checkbox3.click();
		System.out.println("Checkbox1 is Selected: "+ Checkbox1.isSelected());
		System.out.println("Checkbox2 is Selected: "+ Checkbox2.isSelected());
		System.out.println("Checkbox3 is Selected: "+ Checkbox3.isSelected());
		Thread.sleep(2000);
		driver.close();


	}

}
