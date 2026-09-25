package register_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

@Test
public class Register extends Base_Test {

	public void register_module() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

		WebElement text = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

		Assert.assertEquals(text.equals("New User Signup!"), false);
		System.out.println(text.getText());

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ashfar");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("ashfarshaik15@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		WebElement text2 = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		Assert.assertEquals(text2.equals("Enter Account Information"),false);
		System.out.println(text2.getText());

		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.name("password")).sendKeys("Ashfar@123");
		
		WebElement dropdown = driver.findElement(By.id("days"));
       Select select = new Select(dropdown);

       select.selectByValue("15");
       
       WebElement dropdown1 = driver.findElement(By.id("months"));
       Select select1 = new Select(dropdown1);

       select1.selectByVisibleText("July");
       
       WebElement dropdown2 = driver.findElement(By.id("years"));
       Select select2 = new Select(dropdown2);

       select2.selectByValue("2004");
       
       driver.findElement(By.id("newsletter")).click();
       driver.findElement(By.id("optin")).click();
       
       driver.findElement(By.id("first_name")).sendKeys("Ashfar");
       driver.findElement(By.id("last_name")).sendKeys("shaik");
       driver.findElement(By.id("company")).sendKeys("Philips");
       driver.findElement(By.id("address1")).sendKeys("Pullal Jail");
       driver.findElement(By.id("address2")).sendKeys("Wards 2");
       WebElement element = driver.findElement(By.id("country"));
       Select select3 = new Select(element);
       select3.selectByVisibleText("Israel");
       
       driver.findElement(By.id("state")).sendKeys("Tamilnadu");
       driver.findElement(By.id("city")).sendKeys("Chennai");
       driver.findElement(By.id("zipcode")).sendKeys("600038");
       driver.findElement(By.id("mobile_number")).sendKeys("6379839172");
       driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
       
       WebElement element2 = driver.findElement(By.xpath("//b[text()='Account Created!']"));
       Assert.assertEquals(element.getText().equalsIgnoreCase("Account Created!"), true);
       driver.findElement(By.xpath("//a[text()='Continue']")).click();
       WebElement element3 = driver.findElement(By.xpath("//b[text()='ashfar']"));
       Assert.assertEquals(element3.getText().equals("ashfar"), true);
       
       driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
       
       
       
       
       
       
       
       
       
       

	}
}
