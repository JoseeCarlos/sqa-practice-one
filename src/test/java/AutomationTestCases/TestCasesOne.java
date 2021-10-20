package AutomationTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasesOne {
private WebDriver driver;
	
	@Before
	public void Config() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	@Test 
	public void ShearchGoogle() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("github");
		search.submit();
	}
	
	
	@After
	public void cerrar() {
		driver.close();
	}

}
