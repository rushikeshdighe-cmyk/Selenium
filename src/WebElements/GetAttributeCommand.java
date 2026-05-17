package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeCommand {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		WebElement Attributevalue=driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		String GetAttValue=Attributevalue.getAttribute("Class");
		System.out.println(GetAttValue);
		driver.close();


	}

}
