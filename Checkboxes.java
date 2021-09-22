package week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input")).isSelected());
		driver.close();
	}

}
