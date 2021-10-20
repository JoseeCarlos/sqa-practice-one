package AutomationTestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasesTwo {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:44336/Home/Login");
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement txtuser = driver.findElement(By.name("txtUsuario"));
		WebElement txtpassword = driver.findElement(By.name("txtPassword"));
		WebElement btn = driver.findElement(By.name("btnregister"));
		
		txtuser.sendKeys("GAIL121510");
		txtpassword.sendKeys("1234567");
		btn.submit();
		Thread.sleep(8000);
		WebElement btnmenu = driver.findElement(By.id("btnmenu"));
		btnmenu.submit();
		
		
		
		
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	

}
