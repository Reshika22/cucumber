package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Create extends BaseClass {

	@Given("click Create Lead button")
	public void click_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the company name as {string}")
	public void enter_the_company_name_as(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given("Enter first name as {string}")
	public void enter_first_name_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName); 
	}
	
	@Given("Enter last name as {string}")
	public void enter_last_name_as(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@When("Click Submit Button")
	public void click_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("View Lead Page is displayed")
	public void view_lead_page() {
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("Create lead is successful");
		}
		else
		{
			System.out.println("Create lead is not successful");
		}
	}
	
	@Given("Click Leads button")
	public void click_leads_button()  {
		driver.findElement(By.linkText("Leads")).click(); 
		driver.findElement(By.linkText("Find Leads")).click();
		
	}
	
}
