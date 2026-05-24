package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAndAlert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Jeans=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Jeans under $50']")));
		Jeans.click();
		WebElement Unisex=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Unisex']")));
		Unisex.click();
		WebElement Junior=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Juniors']")));
		Junior.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10)");
		WebElement AddtoCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='a-autoid-458-announce']")));
		AddtoCart.click();

	}

}
