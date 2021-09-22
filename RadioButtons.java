package week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
		boolean selected = driver.findElement(By.xpath("//*[@id=\"yes\"]")).isSelected();
		System.out.println("Is radio button enabled for 'Are you enjoying the classes?'"+selected);
		System.out.println(driver.findElement(By.name("news")).isSelected());
		driver.close();
	}

}
