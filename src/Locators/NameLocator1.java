package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NameLocator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://reimaginehr.hrone.cloud/payroll-attendance-software-lp?utm_term=attendance%20and%20payroll%20software&utm_campaign=Payroll+Software+-+Rest+of+India&utm_source=adwords&utm_medium=ppc&hsa_acc=7736326814&hsa_cam=18894677188&hsa_grp=156167671656&hsa_ad=736790562418&hsa_src=g&hsa_tgt=kwd-297359637584&hsa_kw=attendance%20and%20payroll%20software&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gad_source=1&gad_campaignid=18894677188&gbraid=0AAAAADuXRdt_djUlCpJ3GpzTtQ4OpMLE7&gclid=Cj0KCQjw4a3OBhCHARIsAChaqJNSwe9ehK6x7juatwjp-CpoNsJ9vGdZOzOlkFvj-59VrcFWD_TkgNsaAms0EALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		WebElement dropdown=driver.findElement(By.name("number_of_employee_v1"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("1-50");
		select.selectByValue("1");
		select.selectByIndex(0);
		driver.close();


	}

}
