package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement isSelected=driver.findElement(By.xpath("//input[@id='bmwradio']"));
		System.out.println("Is Selected: "+ isSelected.isSelected());
		Thread.sleep(2000);
		isSelected.click();
		Thread.sleep(2000);
		System.out.println("Is Selected: "+ isSelected.isSelected());
		driver.close();

		


	}

}
