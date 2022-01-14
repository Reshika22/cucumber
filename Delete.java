package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Delete extends BaseClass{
	
	
	
	@Given("Search with phone number as {string}")
	public void search_with_phone_number_as(String ph_Num) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(ph_Num);
	}
	@Given("Get first Lead name")
	public void get_first_lead_name() {
		firstLead = driver.findElement(By.xpath("(.//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a")).getText();
		System.out.println("First Lead : " + firstLead);
	}
	@Given("Click Delete button")
	public void click_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@When("Verify the Lead is deleted")
	public void verify_the_lead_is_deleted() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
	}
	@But("No Records found")
	public void no_records ()
	{
		String noRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(noRecord.contains("No records"))
		{
			System.out.println(noRecord);
		}
		else
		{
			System.out.println("Record Exists");
		}
	}
	

}
