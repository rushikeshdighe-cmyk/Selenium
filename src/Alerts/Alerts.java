package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement JsAlert=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Alert']")));
		JsAlert.click();
		Alert alert1=driver.switchTo().alert();
		System.out.println("Simple Alert Text"+ alert1.getText());
		alert1.accept();
		
		WebElement JSConfirm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Confirm']")));
		JSConfirm.click();
		Alert alert2=driver.switchTo().alert();
		System.out.println("Confirm Alert Text"+alert2.getText());
		alert2.dismiss();
		
		WebElement JSPrompt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Prompt']")));
		JSPrompt.click();
		Alert alert3=driver.switchTo().alert();
		System.out.println("Prompt Alert"+alert3.getText());
		alert3.sendKeys("Selenium Testing");
		alert3.accept();
		driver.close();


	}

}
