package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definitionsteps {
	WebDriver driver;
	@Given("User should navigate the application")
	public void userShouldNavigateTheApplication() {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
 		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*");
 		driver=new ChromeDriver(options);
 		driver.get("https://bookcart.azurewebsites.net/");
 		driver.manage().window().maximize();
 		
 		}
	@Given("User clicks on the login link")
	public void userClicksOnTheLoginLink() {
 			driver.findElement(By.xpath(" //span[contains(text(),'Login')]")).click();
 		   
 		}
	@Given("User enters the username as Kanimozhi")
	public void userEntersTheUsernameAsKanimozhi() {
 			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("Kanimozhi");
 		    
 		}
	@Given("User enters the password as MahiRitu2818")
	public void userEntersThePasswordAsMahiRitu2818() { 
 			driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("MahiRitu2818");
 		    
 		}
	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
 			driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-card-actions[1]/button[1]")).click();
 			
 		   
 		}
	@Then("login should be success")
	public void loginShouldBeSuccess() {
 			WebElement textElement=driver.findElement(By.xpath("//body/app-root[1]/app-nav-bar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[3]/button[3]/span[1]"));
 			String text=textElement.getText();
 			System.out.println("Kanimozhi"+ text());
 			
 		    
     }

		private String text() {
			// TODO Auto-generated method stub
			return null;
		}
}
