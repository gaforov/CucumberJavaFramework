package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePagePF;
import pages.LoginPagePF;

public class LoginDemoStepsPF {
	
	WebDriver driver = null;
	LoginPagePF login;
	HomePagePF home;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("==== RUNNING FROM LoginDemoStepsPF CLASS ==== ");
		 System.out.println("browser is open");
		    
		    String filePath = System.getProperty("user.dir");
		    //System.out.println(filePath);
		    System.setProperty("webdriver.chrome.driver", filePath + "/src/test/resources/Drivers/chromedriver.exe");
		    
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		    driver.manage().window().maximize();
	   
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		login = new LoginPagePF(driver); //<== this is required because WebDriver initialized null in the field, otherwise NullPointerException is returned. 
		login.enterUsername(username);
		login.enterPassword(password);
		
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
	    //driver.findElement(By.id("login")).click();
	    login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		//driver.findElement(By.id("logout")).isDisplayed();
		home = new HomePagePF(driver);
		home.checkLogoutIsDisplayed(); //<======= WHY THIS ONE NOT WORKING !????   <<<=======================
		
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	  
	}
}
