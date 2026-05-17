package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandEX1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String Url="https://www.facebook.com/";
		driver.get(Url);
		String CurrentUrl=driver.getCurrentUrl();
		if (Url.equals(CurrentUrl)) {
			System.out.println("Current URL is same");
			
		} else {
			System.out.println("Current URL is not same");

		}
		driver.close();

	}

}
