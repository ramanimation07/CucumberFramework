package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class LoginStepdef {
	
	WebDriver driver;
	
	@Given("^User in Login page$")
	public void User_in_Login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String str=driver.getTitle();
		System.out.println(str);
	}

}
