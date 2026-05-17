package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(2000);
	WebElement Close=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
	Close.click();
	Thread.sleep(2000);
	WebElement Hotel=driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHotels inactive']"));
	Hotel.click();
	Thread.sleep(2000);
	WebElement Search=driver.findElement(By.xpath("//button[@id='hsw_search_button']"));
	Search.click();
	WebElement Room=driver.findElement(By.xpath("//label[text()='₹ 0 - ₹ 1500']"));
	Room.click();
	


	}

}
