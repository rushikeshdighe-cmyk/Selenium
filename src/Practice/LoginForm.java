package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		WebElement FirstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.sendKeys("Rushikesh");
		Thread.sleep(2000);
		WebElement LastName=driver.findElement(By.xpath("//input[@id='lastName']"));
		LastName.sendKeys("Dighe");
		Thread.sleep(2000);
		WebElement OtherGender=driver.findElement(By.xpath("//input[@id='gender-radio-3']"));
		OtherGender.click();
		Thread.sleep(2000);
		WebElement FemaleGender=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		FemaleGender.click();
		Thread.sleep(2000);
		WebElement MaleGender=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		MaleGender.click();
		Thread.sleep(2000);
		System.out.println("Other Gender is selected: "+OtherGender.isSelected());
		System.out.println("Female Gender is selected: "+ FemaleGender.isSelected());
		System.out.println("Male Gender is Selected: "+ MaleGender.isSelected());
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
		MobileNumber.sendKeys("9847748984");
		Thread.sleep(2000);
		WebElement CheckBox1=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		CheckBox1.click();
		Thread.sleep(2000);
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		Checkbox2.click();
		Thread.sleep(2000);
		WebElement CheckBox3=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		CheckBox3.click();
		Thread.sleep(2000);
		System.out.println("Checkbox1 is selected: "+CheckBox1.isSelected());
		System.out.println("Checkbox2 is selected: "+Checkbox2.isSelected());
		System.out.println("Checkbox3 is Selected: "+CheckBox3.isSelected());
		WebElement FileUpload=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		FileUpload.sendKeys("C:\\Users\\Aishwarya\\Downloads\\SQL_Practice_Question_Bank.docx");
		Thread.sleep(2000);
		WebElement CurrentAddress=driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
		CurrentAddress.sendKeys("hjdjd dkdkd dkdkd dkdkd dkdkd ");
		Thread.sleep(2000);
		driver.close();
		
		


	}

}
