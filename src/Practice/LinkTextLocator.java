package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/accessing-link.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("go here")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("click here")).click();
		driver.close();


	}

}
