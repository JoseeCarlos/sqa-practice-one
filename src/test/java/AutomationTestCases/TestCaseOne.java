package AutomationTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseOne {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:44336/Home/Login");
	}
	
	@Test
	public void LoginFailedTest() throws InterruptedException {
		//Login
		WebElement email = driver.findElement(By.name("txtUsuario"));
		WebElement password = driver.findElement(By.name("txtPassword"));
		WebElement btn = driver.findElement(By.name("btnRegistrar"));
		email.sendKeys("PEAL12137 ");
		password.sendKeys("1234567");
		btn.submit();
		
		//Menu de opciones
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.id("imgbtn"));
		img.click();
		
		Thread.sleep(2000);
		WebElement btnquienes = driver.findElement(By.id("btnquienessomos"));
		btnquienes.click();
		
		Thread.sleep(2000);
		WebElement contactos = driver.findElement(By.id("btncontacto"));
		contactos.click();
		
		//Formulario de contactanos
		Thread.sleep(2000);
		WebElement nombre = driver.findElement(By.name("txtNombre"));
		WebElement apellido = driver.findElement(By.name("txtApellido"));
		WebElement correo = driver.findElement(By.name("txtCorreo"));
		WebElement selectElement = driver.findElement(By.id("Opciones"));
		Select selectObject = new Select(selectElement);
		WebElement msg = driver.findElement(By.name("messege"));
		WebElement btnsavecoment = driver.findElement(By.name("btnenviar"));
		nombre.sendKeys("juan");
		apellido.sendKeys("perez");
		correo.sendKeys("juanperez@gmail.com");
		selectObject.selectByValue("1");
		msg.sendKeys("Buena pagina");
		btnsavecoment.submit();
		Thread.sleep(8000);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
