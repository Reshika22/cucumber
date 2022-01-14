package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit extends BaseClass{
	
	@Given("Click the first row")
	public void click_the_first_row() {
		driver.findElement(By.xpath("(.//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a")).click();
	}
	
	@Given("Click Edit button")
	public void click_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Update Company Name as {string}")
	public void update_company_name_as(String newCompanyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompanyName);
		
	}
	
	@When("Click Update Button")
	public void click_update_button() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	@Then("Verify Company Name is {string}")
	public void verify_company_name_is(String newCompanyName) {
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(updatedCompanyName.contains(newCompanyName))
		{
			System.out.println("COMPANY NAME SUCCESSFULLY UPDATED.");
		}
		else
		{
			System.out.println("COMPANY NAME NOT UPDATED.");
		}
	}
	
	@Given("Search with first name as {string}")
	public void search_with_first_name_as(String firstname) {
		driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name='firstName'][contains(@class,'x-form-text x-form-field')]"))
		.sendKeys(firstname);
		
	}
	
	@Given("Click Find Leads button")
	public void click_find_leads_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
	}

}
