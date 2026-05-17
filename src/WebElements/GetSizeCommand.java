package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(2000);
		WebElement ElementSize=driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		Thread.sleep(2000);
		System.out.println("Dimension of the Button"+ ElementSize.getSize());
		driver.close();


	}

}
