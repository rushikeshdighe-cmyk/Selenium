package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookmyShow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		Thread.sleep(2000);
		WebElement Movies=driver.findElement(By.xpath("//a[text()='Movies']"));
		Movies.click();
		Thread.sleep(2000);
		WebElement Marathi=driver.findElement(By.xpath("(//div[contains(text(),'Marathi')])[3]"));
		Marathi.click();
		Thread.sleep(2000);
		WebElement Movie=driver.findElement(By.xpath("//img[@alt=\"Raja Shivaji\"]"));
		Movie.click();
		WebElement BookTicket=driver.findElement(By.xpath("//span[contains(text(),'Book tickets')][1]"));
		BookTicket.click();


	}

}
