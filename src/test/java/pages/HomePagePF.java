package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {

	@FindBy(id = "logout")
	WebElement btn_logout;

	WebDriver driver;

	public HomePagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // or this can be replaced with ClassName.class
	}

	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}

}
