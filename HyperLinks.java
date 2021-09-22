package week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println(driver
				.findElement(By.xpath("//a[contains(text(),'Find where am supposed to go without clicking me?')]"))
				.getAttribute("href"));
		String verify = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a")).getAttribute("href");
		if (verify.contains("error")) {
			System.out.println("HTTP Status 404 – Not Found");
		} else {
			System.out.println("Link is correct");
		}
	}

}
