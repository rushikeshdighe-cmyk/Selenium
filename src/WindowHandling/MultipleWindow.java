package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		// Store parent window ID
		String ParentId= driver.getWindowHandle();
		
		// 2️⃣ Click all child window buttons
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		// driver.findElement(By.id("messageWindowButton")).click(); not working
		Thread.sleep(2000);
		
		// 3️⃣ Get all windows
		Set<String> ChildID=driver.getWindowHandles();
		
		for (String id : ChildID) {
			
			if (!id.equals(ParentId)) {
				
				driver.switchTo().window(id);
				
				String Text=driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("Child Window Text"+ Text);
				
			}
		}
		Thread.sleep(2000);
		// 4️⃣ Switch back to parent window
		driver.switchTo().window(ParentId);
		
		Thread.sleep(2000);
		String ParentHeading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Parent Heading: " + ParentHeading);
		Thread.sleep(3000);
		driver.quit();
		
}
}
