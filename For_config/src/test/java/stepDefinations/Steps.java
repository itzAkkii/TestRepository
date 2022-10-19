package stepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObject.LoginPage;

public class Steps extends BaseClass{

	@Before
	public void setUp() throws IOException {
		configprop = new Properties();
		FileInputStream configpropfile = new FileInputStream("config.properties");
		configprop.load(configpropfile);
		
		String browser = configprop.getProperty("browser");
		
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Browser is not set");
		}
	}
	

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	   
		   login = new LoginPage(driver);

	}

	@When("User opens url")
	public void user_opens_url() throws IOException {
 
		FileInputStream configpropfile = new FileInputStream("config.properties");
		configprop.load(configpropfile);
		
		String url = configprop.getProperty("url");
		driver.get(url);
	}

	@When("User enters email and password")
	public void user_enters_email_and_password() throws IOException {
	    
		 login.email();
		 login.password();
	}

	@When("Click on login")
	public void click_on_login() {
	     login.clickloginbtn();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	 Assert.assertEquals(string, driver.getTitle());  
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
	    login.clickonlogout();
	}

	@Then("close browser")
	public void close_browser() {
	     driver.close();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	   login = new LoginPage(driver);
	}

	@When("User opens url")
	public void user_opens_url() throws IOException {
	  
		FileInputStream configpropfile = new FileInputStream("config.properties");
		configprop.load(configpropfile);
		
		String url = configprop.getProperty("url");
		driver.get(url);
	}

	@When("User enters email and password")
	public void user_enters_email_and_password() throws IOException {
	    login.email();
	    login.password();
	}

	@When("Click on login")
	public void click_on_login() {
	     login.clickloginbtn();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	     Assert.assertEquals(string, driver.getTitle());
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
	   login.clickonlogout();
	}

	@Then("close browser")
	public void close_browser() {
	     driver.close();
	}
}
*/