package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGetCommandEx3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		String url="https://demo.guru99.com/test/newtours/";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		if (url.equals(currenturl)) {
			System.out.println("Url is same as current URL");
		}
		else {
			System.out.println("Url is not same as Current URL");
		}
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.close();


	}

}
