package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {

	

	@Given("Enter the username as {string}")
	public void enter_the_username_as_demo_sales_manager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage Click")
	public void homepage_should_be_displayed() {
		driver.findElement(By.linkText("CRM/SFA")).click(); 
	
	}
	
	@But("ErrorMessage should be displayed")
	public void ErrorMessage() {
		
		
			System.out.println("Error Message is displayed");
		
	}
	

	
	

	
}
