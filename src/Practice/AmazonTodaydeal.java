package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTodaydeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement Dismiss=driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		Dismiss.click();
		WebElement TodaysDeal=driver.findElement(By.xpath("//a[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]"));
		TodaysDeal.click();
		Thread.sleep(2000);
		WebElement Amazon=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox'][1]"));
		Amazon.click();
		Thread.sleep(2000);
		WebElement Medicube=driver.findElement(By.xpath("//*[@id=\\\"DealsGridScrollAnchor\\\"]/div[2]/div[3]/div/span[3]/div/label/i"));
		Medicube.click();
		WebElement Electronics=driver.findElement(By.xpath(""));
		Electronics.click();


	}

}
