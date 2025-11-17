package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

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
		
	}
	
}
