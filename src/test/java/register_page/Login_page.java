package register_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Login_page extends Base_Test {

	@Test
	public void Loginpage() {

		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ashfarshaik15@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Ashfar@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		WebElement text4 = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
		Assert.assertTrue(text4.getText().contains("Logged in as"));
	}
	
	//LOGOUT SCRIPT
	
	@Test
	
	public void Logout_Module() {
		
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	}
	
}
