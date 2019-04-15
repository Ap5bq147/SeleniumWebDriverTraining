package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\InstallationStuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sree");
		driver.findElement(By.name("lastName")).sendKeys("Tester1");

driver.findElement(By.id("email")).sendKeys("Assignment@1");
driver.findElement(By.name("password")).sendKeys("Test@1234");
driver.findElement(By.name("confirmPassword")).sendKeys("Test@1234");
driver.findElement(By.name("register")).click();
driver.findElement(By.linkText("SIGN-OFF")).click();

driver.findElement(By.name("userName")).sendKeys("Assignment@1");
driver.findElement(By.name("password")).sendKeys("Test@1234");
driver.findElement(By.name("login")).click();
		
		
	}

}
