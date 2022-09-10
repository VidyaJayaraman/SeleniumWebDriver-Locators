package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); // chrome driver
		
ChromeDriver driver = new ChromeDriver();
		
		// Loading URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// maximize windows
				driver.manage().window().maximize();
				
				// Identify Web element and Enter Username with the help of locator(id),class,linkText,name
				
				WebElement username = driver.findElement(By.id("username"));
				
				username.sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click(); 
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.className("inputBox")).sendKeys("TestLeaf");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayaraman");
				
				driver.findElement(By.name("firstNameLocal")).sendKeys("Manikandan");
				
				driver.findElement(By.name("departmentName")).sendKeys("Sales");
				
				driver.findElement(By.name("description")).sendKeys("Sales Revenue Growth");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("viddhu.j@gmail.com");
				
				WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select dd = new Select(dropDown);
				
				dd.selectByVisibleText("Indiana");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				Thread.sleep(5000);
				
	}

}
