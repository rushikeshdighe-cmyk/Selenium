package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(2000);
		WebElement TextButton= driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		System.out.println("Get CSS value"+ TextButton.getCssValue("Background-Color"));
		driver.close();
		


	}

}
