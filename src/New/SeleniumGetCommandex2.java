package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetCommandex2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(Url);
		//Title Name
		String Title= driver.getTitle();
		System.out.println(Title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		if (Url.equals(currentUrl)) {
			System.out.println("URL is Same");
		}
		else {
			System.out.println("URL is Not Same");
			
		}
		System.out.println(driver.getPageSource());
		driver.close();  


	}

}
