package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to call WDM for driver
				WebDriverManager.chromedriver().setup();
				
				//Launch browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//Load URL
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Maximize browser
				
				driver.manage().window().maximize();		
				
				//Enter Username and Password
				
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click Login button
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				  //Click on CRMSFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				 // Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
				
				  //Click on Create Lead 
				driver.findElement(By.linkText("Create Lead")).click();
				
				 // Enter CompanyName Field Using id Locator
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL1");
				
				 // Enter FirstName Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anil");
				
				//  Enter LastName Field Using id Locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar1");
				
				 // Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("AnilLocal");
				
				  //Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				
				  // Enter Description Field Using any Locator of your choice 
				driver.findElement(By.id("createLeadForm_description")).sendKeys("New Lead for Anil1");
				
				 // Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anilkumar4033@gmail.com");
				
				 // Select StateProvince as NewYork Using Visible Text
				WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select select = new Select(dropdown);
				
				select.selectByVisibleText("New York");
				
				 // Click on Create Button
				driver.findElement(By.className("smallSubmit")).click();
				
				// Get the Title of Resulting Page. refer the video  using driver.getTitle()
				
				String title = driver.getTitle();
				
			    System.out.println(title);
			    
			    //Click on Duplicate button
			    driver.findElement(By.linkText("Duplicate Lead")).click();
			    
                //Clear the CompanyName Field using .clear() And Enter new CompanyName
			    driver.findElement(By.id("createLeadForm_companyName")).clear();
			    
			    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL2");
			    
                //Clear the FirstName Field using .clear() And Enter new FirstName
			    driver.findElement(By.id("createLeadForm_firstName")).clear();
			    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("GAnil");
			    
                //Click on Create Lead Button
			    
			    driver.findElement(By.className("smallSubmit")).click();
			    
                //Get the Title of Resulting Page(refer the video)  using driver.getTitle()
			    String title2 = driver.getTitle();
			    
			    System.out.println(title2);
			    
			    if(title2.equals("View Lead | opentaps CRM"))
					System.out.println("success. Landed on Page");

	}

}
