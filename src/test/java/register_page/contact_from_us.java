package register_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class contact_from_us extends Base_Test {
	@Test
	public void Contact_from_us() {

		driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
		String text = element.getText();
		Assert.assertTrue(text.equalsIgnoreCase("Get In Touch"));
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("jothirupand");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jothirupand@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("this is my automation project");
		driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("automation project");
		
		WebElement text1 = driver.findElement(By.xpath("//input[@name='upload_file']"));
		text1.sendKeys("C:\\Users\\yogam\\Downloads\\PentaBay.docx");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		WebElement element2 = driver.findElement(By.xpath("//div[text()='Success! Your details have been submitted successfully.']"));
	Assert.assertEquals(false, element2.equals("Success! Your details have been submitted successfully."));
	
	System.out.println(element2.getText());
	driver.findElement(By.xpath("//span[text()=' Home']")).click();
	
	}

}

