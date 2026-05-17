package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement Choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Thread.sleep(2000);
		Choosefile.sendKeys("C:\\Users\\Aishwarya\\Downloads\\MySQL_InstallationSteps.docx");
		Thread.sleep(2000);
		WebElement Checkbox=driver.findElement(By.xpath("//input[@id='terms']"));
		Thread.sleep(2000);
		Checkbox.click();
		System.out.println("Checkbox is selected: "+Checkbox.isSelected());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
