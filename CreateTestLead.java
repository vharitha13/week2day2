package week2Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTestLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[contains(@name,'USER')]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[contains(@class,'inputLogin')])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("NA");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Haritha");
		String fname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getAttribute("name");
		System.out.println("First name is:"+fname);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source1=new Select(source);
		source1.selectByVisibleText("Other");
		WebElement marketcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketcamp1=new Select(marketcamp);
		marketcamp1.selectByVisibleText("eCommerce Site Internal Campaign");
		driver.findElement(By.name("birthDate")).sendKeys("13/10/90");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		WebElement prefcurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select prefcurrency1=new Select(prefcurrency);
		prefcurrency1.selectByVisibleText("INR - Indian Rupee");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry1=new Select(industry);
		industry1.selectByValue("IND_SOFTWARE");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8939096913");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vharitha1310@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Haritha");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Flat no 4&5, Aswin Villa");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Prabhu Nagar, Pallikaranai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement country = driver.findElement(By.name("generalCountryGeoId"));
		Select country1 = new Select(country);
		country1.selectByValue("IND");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600100");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("The title of the View Lead page is:"+title);
	}

}
