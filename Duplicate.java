package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Duplicate extends BaseClass{

	@Given("Search with email as {string}")
	public void search_with_email_as(String email) {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(email);
	}
	@Given("Click Duplicate button")
	public void click_duplicate_button() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Given("Click create lead button at the bottom")
	public void click_create_lead_button_at_the_bottom() {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}
	@When("Verify Lead Name is duplicated")
	public void verify_lead_name_is_duplicated() {
		String duplicateLead = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertTrue(firstLead.equals(duplicateLead));
		
	}
	@Then("Print the name")
	public void print_the_name() {

		System.out.println("Name Captured Matched with Duplicate Name");

	}
}
