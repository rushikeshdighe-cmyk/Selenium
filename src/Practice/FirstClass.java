package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println("Title: "+ driver.getTitle());
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		System.out.println("Page Source: "+ driver.getPageSource());

	}

}
