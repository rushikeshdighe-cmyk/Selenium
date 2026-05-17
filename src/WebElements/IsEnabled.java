package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement enabledField= driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
		System.out.println("Is Enabled: "+enabledField.isEnabled());
		driver.findElement(By.xpath("//input[@id='disabled-button']")).click();
		System.out.println("Is Enabled: "+enabledField.isEnabled());
		driver.findElement(By.xpath("//input[@id='enabled-button']")).click();
		System.out.println("Is Enabled: "+enabledField.isEnabled());
		driver.close();

		



	}

}
