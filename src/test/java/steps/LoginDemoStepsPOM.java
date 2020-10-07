package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.Base;

public class LoginDemoStepsPOM extends Base {
	
//	WebDriver driver = null;
	LoginPage login;

	@Given("browser is open")
	public void browser_is_open() {
		 System.out.println("browser is open");
//		    
//		    String filePath = System.getProperty("user.dir");
//		    //System.out.println(filePath);
//		    System.setProperty("webdriver.chrome.driver", filePath + "/src/test/resources/Drivers/chromedriver.exe");
//		    
//		    driver = new ChromeDriver();
//		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		    driver.manage().window().maximize();
	   
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   
//		driver.navigate().to("https://example.testproject.io/web/");  //change it from configuration.properties instead
	}

	@When("^user enters (.*) and (.*)$") 
//	@When("user enters <username> and <password>")  //this step already exists inside LoginSteps
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginPage(driver); 
		
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);
	   
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickLogin();
	    //driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		login.checkLogOutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		
//		driver.close();
//		driver.quit();
	  
	}
}
