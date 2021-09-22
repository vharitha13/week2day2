package week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Haritha");
		driver.findElement(By.name("lastname")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("8939096913");
		driver.findElement(By.name("reg_passwd__")).sendKeys("harithav13");
		WebElement date = driver.findElement(By.id("day"));
		Select date1 = new Select(date);
		date1.selectByValue("13");
		WebElement day = driver.findElement(By.id("month"));
		Select day1 = new Select(day);
		day1.selectByValue("10");
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("1990");
		driver.findElement(By.xpath("//span/label[contains(text(),'Female')]")).click();
	}
}
