package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAndFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		//Find all links using tagname//
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links: "+ links.size());
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		driver.quit();


	}

}
