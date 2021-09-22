package week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.name("UserFirstName")).sendKeys("Haritha");
		driver.findElement(By.name("UserLastName")).sendKeys("V");
		driver.findElement(By.name("UserEmail")).sendKeys("vharitha1310@gmail.com");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select title1=new Select(title);
		title1.selectByVisibleText("Student / Personal Interest");
		driver.findElement(By.name("CompanyName")).sendKeys("Amazon");
		WebElement empName = driver.findElement(By.name("CompanyEmployees"));
		Select empName1=new Select(empName);
		empName1.selectByValue("1600");
		driver.findElement(By.name("UserPhone")).sendKeys("8939096913");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		driver.findElement(By.className("checkbox-ui")).click();
	}

}
