package step_defination118;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_step {

WebDriver driver;
	
	
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("http://localhost:8083/TestMeApp");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		

		
		driver.findElement(By.linkText("SignIn")).click();
		 
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	
		 	 
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		 
		 
		 
		 driver.findElement(By.name("Login")).click();
		 
//		 String checkLogin = driver.findElement(By.xpath("//header[@class='nav-down']//div[@align='right']//c:if[@test= 'true']")).getText().trim();
//		 
//		 Assert.assertEquals(checkLogin, "Hi,"+username);
//		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		
		
		 
		Assert.assertTrue(driver.findElement(By.linkText("SignOut")).isDisplayed());
		driver.findElement(By.linkText("SignOut")).click();
		 
		//driver.close();
		 
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	

}
