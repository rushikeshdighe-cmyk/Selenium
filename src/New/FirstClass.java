package New;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class FirstClass {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("title is "+ driver.getTitle());
		System.out.println("Current URL is "+ driver.getCurrentUrl());
		System.out.println("Page source is"+ driver.getPageSource());
		Thread.sleep(2000);
		driver.close();
	}

}
