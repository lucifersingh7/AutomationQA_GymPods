package test;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.signup;

public class action {

	public static WebDriver driver;
	
	@Test
	public static void main() throws Exception {
		signUp();
	}
	
	
	public static void signUp() throws Exception {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\cred.xlsx");
		XSSFWorkbook wbk = new XSSFWorkbook(fis);
		XSSFSheet sheet =  wbk.getSheetAt(0);
		
		String cred1 = sheet.getRow(3).getCell(1).getStringCellValue();
		String cred2 = sheet.getRow(3).getCell(2).getStringCellValue();
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://develop.frontend.gympods.res.alienyard.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Book POD']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sign up form
		pages.signup.Email(driver).sendKeys(cred1);
		pages.signup.firstName(driver).sendKeys("First Name");
		pages.signup.lastName(driver).sendKeys("Last name");
		pages.signup.mobileNumber(driver).sendKeys("8459612545");
		pages.signup.address(driver).sendKeys("125, Canning Street");
		pages.signup.postCode(driver).sendKeys("10001");
		pages.signup.emergencyName(driver).sendKeys("Sam");
		pages.signup.emergencyNumber(driver).sendKeys("584524152");
		pages.signup.password(driver).sendKeys(cred2);
		pages.signup.confirmPassword(driver).sendKeys(cred2);
		pages.signup.nextBtn(driver).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//page - Please answer the following :
		pages.signup.sliderOne(driver).click();
		pages.signup.sliderTwo(driver).click();
		pages.signup.sliderThree(driver).click();
		pages.signup.sliderFour(driver).click();
		pages.signup.sliderFive(driver).click();
		pages.signup.sliderSix(driver).click();
		pages.signup.sliderSeven(driver).click();
		pages.signup.joinBtn(driver).click();
		
	}
	
}
