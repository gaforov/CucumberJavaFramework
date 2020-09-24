package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Base;

public class GoogleSearchSteps extends Base {
	
//	WebDriver driver = null;
	
//	  @Given("browser is open")
//	public void browser_is_open() {
//	    System.out.println("browser is open");
	    
//	    String filePath = System.getProperty("user.dir");
//	    System.out.println(filePath);
//	    System.setProperty("webdriver.chrome.driver", filePath + "/src/test/resources/Drivers/chromedriver.exe");
//	    WebDriverManager.chromedriver().setup(); // this line replaces above line.  pulls drivers from the cloud. 
//	    Base.setup();
	    
//	    driver = new ChromeDriver(); //this calls chrome browser again when enabled. 
	  
//	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("user is on google search page");
	    
//	    driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    System.out.println("user enters a text in search box");
	    
	    driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	    System.out.println("user hits enter");
	    
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    System.out.println("user is navigated to search results");
	    
	   boolean result = driver.getPageSource().contains("Online Courses");
	   System.out.println("Expected text is present: "+ result);
	    
//	    driver.close();
//	    driver.quit();
	}

}
