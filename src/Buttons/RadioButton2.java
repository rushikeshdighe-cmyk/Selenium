package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement RadioButton1=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		RadioButton1.click();
		Thread.sleep(2000);
		System.out.println("Male Radio Button: "+ RadioButton1.isSelected());
		WebElement RadioButton2=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		RadioButton2.click();
		System.out.println("FeMale Radio Button: "+ RadioButton2.isSelected());
		Thread.sleep(2000);
		WebElement RadioButton3=driver.findElement(By.xpath("//input[@id='gender-radio-3']"));
		RadioButton3.click();
		System.out.println("Other Radio Button: "+ RadioButton3.isSelected());
		System.out.println("Gender Radio Button is selected as:");
		System.out.println("Male Radio Button: "+ RadioButton1.isSelected());
		System.out.println("FeMale Radio Button: "+ RadioButton2.isSelected());
		System.out.println("Others Radio Button: "+ RadioButton3.isSelected());
		driver.close();
		
		


	}

}
