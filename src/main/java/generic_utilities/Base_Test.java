package generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Base_Test {
	
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeClass
	public void OpenBrowser() {
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 driver.get("https://automationexercise.com/");
		 
	}
@BeforeMethod
public void Loginpage() {

	driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ashfarshaik15@gmail.com");
	driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Ashfar@123");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}
//@AfterMethod

//public void Logout_Module() {
	
	//driver.findElement(By.xpath("//a[text()=' Logout']")).click();
}

	
	//@AfterClass
	//public void closeBrowser()
	//{
	//driver.quit();	
		
	//}

//}
