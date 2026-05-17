package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement RadioButton1 =driver.findElement(By.xpath("//input[@id='bmwradio']"));
		RadioButton1.click();
		Thread.sleep(2000);
		WebElement RadioButton2=driver.findElement(By.xpath("//input[@id='benzradio']"));
		RadioButton2.click();
		Thread.sleep(2000);
		WebElement RadioButton3=driver.findElement(By.xpath("//input[@id='hondaradio']"));
		RadioButton3.click();
		System.out.println("RadioButton1 is selected: "+RadioButton1.isSelected());
		System.out.println("RadioButton2 is selected: "+ RadioButton2.isSelected());
		System.out.println("RadioButton3 is Selected: "+ RadioButton3.isSelected());
		driver.close();


	}

}
