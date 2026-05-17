package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumComandEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String url="https://demoqa.com/";
		driver.get(url);
		System.out.println(driver.getTitle());
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (url.equals(currentUrl)) {
			System.out.println("Url is same as current URL");	
		}
		else {
			System.out.println("Url is not same");
		}
	System.out.println(driver.getPageSource());
	Thread.sleep(200);
	driver.close();


	}

}
