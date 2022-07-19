package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//we have to call WDM for Browser Drive

    WebDriverManager.chromedriver().setup();
		
		//Launch browser
    ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
    driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the Browser
     driver.manage().window().maximize();
     
        // Close Browser
        //driver.close(); 
     
       //Find the Username and enter username:
     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
     
     //Find password and enter password
     
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     
     //Click login button
     
     driver.findElement(By.className("decorativeSubmit")).click();
     
     //To check we are on correct page
     
     WebElement logout = driver.findElement(By.className("decorativeSubmit"));
     
     String attribute = logout.getAttribute("value");
     
    if(attribute.equals("Logout"))
    	// System.out.println(" successfully Logged In");
     
     //Click CRM/SFA image link. We need to use linkText for a Tag. 
     //the text between Tag a open and close. 
     //If before and after there is space we can remove but not in between.
     
     driver.findElement(By.linkText("CRM/SFA")).click();
     
     //Click on Leads link  
     driver.findElement(By.linkText("Leads")).click();
     
     //Click Create Lead link
     driver.findElement(By.linkText("Create Lead")).click();
     
          
     //Enter Company Name
     
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
     
     //Enter First Name
     
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anil");
     
     //Enter Last Name
     
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
     
     // Select from Dropdown
     
     WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
     
     Select select = new Select(dropdown);
     
     select.selectByIndex(2);
     
    // select.selectByValue("4");
     
     
     // Click on Create Lead Button
     
     driver.findElement(By.name("submitButton")).click();
     
     //Verify the Verify Lead Page Title
     Thread.sleep(10000);
     
    /* WebElement leadpage = driver.findElement(By.tagName("title"));
     
     
     String lead = leadpage.getText();          
          
     System.out.print(lead);
     
    	 String title = driver.getTitle();
    	 
    	 System.out.print(title);
    	 
    	 if(lead.equals(title)) {
    		 System.out.print(" Landed in correct page");
    	 }else
    	 {
    		 System.out.print("Not checked");
    	 }*/
     
     WebElement leadpage = driver.findElement(By.tagName("title"));
     System.out.println(leadpage);
     
	}

}
