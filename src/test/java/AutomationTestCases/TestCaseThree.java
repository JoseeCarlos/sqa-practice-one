package AutomationTestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseThree {

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
		//Login
		WebElement email = driver.findElement(By.name("txtUsuario"));
		WebElement password = driver.findElement(By.name("txtPassword"));
		WebElement btn = driver.findElement(By.name("btnRegistrar"));
		email.sendKeys("ROAL12190  ");
		password.sendKeys("1234567");
		btn.submit();
		
		//Menu de opciones
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.id("btnmenuadmin"));
		img.click();
				
		Thread.sleep(2000);
		WebElement btnquienes = driver.findElement(By.id("linkcategorias"));
		btnquienes.click();
			
		//Agregar Categoria
		Thread.sleep(2000);
		WebElement txtCategoria = driver.findElement(By.name("txtCategoria"));
		WebElement btnAgregarCategoria = driver.findElement(By.id("btnAgregarCategoria"));
		txtCategoria.sendKeys("Marinos");
		btnAgregarCategoria.submit();
		Thread.sleep(8000);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
