package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.signup;

public class action {

	public static WebDriver driver;
	
	@Test
	public static void main() {
		signUp();
	}
	
	public static void signUp() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://develop.frontend.gympods.res.alienyard.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Book POD']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		//sign up form
		pages.signup.Email(driver).sendKeys("sahil@yopmail.com");
		pages.signup.firstName(driver).sendKeys("First Name");
		pages.signup.lastName(driver).sendKeys("Last name");
		pages.signup.mobileNumber(driver).sendKeys("8459612545");
		pages.signup.address(driver).sendKeys("125, Canning Street");
		pages.signup.postCode(driver).sendKeys("10001");
		pages.signup.emergencyName(driver).sendKeys("Sam");
		pages.signup.emergencyNumber(driver).sendKeys("584524152");
		pages.signup.password(driver).sendKeys("Sahil123@");
		pages.signup.confirmPassword(driver).sendKeys("Sahil123@");
		pages.signup.nextBtn(driver).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
