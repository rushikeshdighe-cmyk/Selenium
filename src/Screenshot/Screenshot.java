package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Typecasting driver to take Screenshot
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		//Capture Screenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		//Destination file path
		File destination=new File("C:\\Users\\Public\\Screenshot.png");
		
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken sucessfully");
		driver.quit();

	}

}
