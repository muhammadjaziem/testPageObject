package productDemoApp.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import productDemoApp.pageObject.PO_HomePage;

public class TC_HomePage {
	
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	}

	@Test
	public void t_01_validate_form() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PO_HomePage obj = PageFactory.initElements(driver,PO_HomePage.class);
		obj.SetFirstName("Muhammad");
		obj.SetLastName("Jaziem");
		obj.SetAddress("Penang");
		obj.SelectSkillsByValue("Android");
	}
}
