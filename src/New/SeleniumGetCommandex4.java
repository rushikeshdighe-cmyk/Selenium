package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGetCommandex4 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String Url="https://www.saucedemo.com/";
		driver.get(Url);
		System.out.println(driver.getTitle());
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		if (Url.equals(CurrentUrl)) {
			
			System.out.println("URL is Same");
			
		}
		else {
			System.out.println("URL is not same");
		}
		System.out.println(driver.getPageSource());
		driver.close();
		


	}

}
