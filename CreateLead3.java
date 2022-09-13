package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  WebDriverManager.chromedriver().setup();
	  
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click(); 
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayaraman");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anitha");
		
		driver.findElement(By.name("departmentName")).sendKeys("Sales");
		
		driver.findElement(By.name("description")).sendKeys("Sales Revenue Growth");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vvvjjj.j@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(dropDown);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
        String title = driver.getTitle();
		
		System.out.println("Title after given create Lead is  " + title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
				
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya2");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
		
		System.out.println("Title after duplicate Lead is " + title1);
	}

}
