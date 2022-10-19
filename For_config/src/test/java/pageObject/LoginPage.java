package pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	Properties configprop = new Properties();

	public LoginPage(WebDriver driver ) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(name = "Email") //*[@id="Email"]
	WebElement txtemail;
	
	@FindBy(name = "Password")
	WebElement txtpass;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement lgnbtn;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement logoutbtn;
	
	public void email() throws IOException {
		FileInputStream configpropfile = new FileInputStream("config.properties");
		configprop.load(configpropfile);
		
		String email = configprop.getProperty("username");
		txtemail.clear();
		txtemail.sendKeys(email);
	}
	
	
	public void password() throws IOException {
		FileInputStream configpropfile = new FileInputStream("config.properties");
		configprop.load(configpropfile);
		
		String pwd = configprop.getProperty("password");
		txtpass.clear();
		txtpass.sendKeys(pwd);
	}
	
	
	public void clickloginbtn() {
		lgnbtn.click();
	}
	
	public void clickonlogout( ) {
		logoutbtn.click();
	}
}
