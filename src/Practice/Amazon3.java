package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement Kitchen=driver.findElement(By.xpath("//img[@alt='Kitchen & dining']"));
		Kitchen.click();
		Thread.sleep(2000);
		WebElement Sets=driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Sets']"));
		Sets.click();
		WebElement discount=driver.findElement(By.xpath("//span[contains(text(),'All Discounts')]"));
		discount.click();


	}

}
