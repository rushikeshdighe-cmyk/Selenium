package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement Decor=driver.findElement(By.xpath("//img[@alt='Décor']"));
		Decor.click();
		Thread.sleep(2000);
		WebElement image=driver.findElement(By.xpath("//img[@class='s-image'][1]"));
		image.click();
		Thread.sleep(2000);
		WebElement AddtoList=driver.findElement(By.xpath("//a[text()=' Add to List ']"));
		AddtoList.click();
		Thread.sleep(2000);
		driver.close();	

	}

}
