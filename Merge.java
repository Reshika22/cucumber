package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Merge extends BaseClass{
	public static Set<String> allWindows;
	public static List<String> allhandles;
	
	@Given("Click Merge Leads button")
	public void click_merge_leads_button() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@When("Click From Leads lookup")
	public void click_from_leads_lookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@Then("Switch to the new window1")
	public void switch_to_the_new_window1() {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@Then("Search with {string}")
	public void search_with(String name) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
	}
	@Then("Click on First Lead button in the window")
	public void click_on_first_lead_button_in_the_window() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	}
	@Then("Get the Lead Id")
	public void get_the_lead_id() {
		 firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}
	@When("Click the first lead link")
	public void click_the_first_lead_link() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Switch to the original window")
	public void switch_to_the_original_window() {
		driver.switchTo().window(allhandles.get(0));
	}
	@When("Click To Leads lookup")
	public void click_to_leads_lookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	@Then("Switch to the new window2")
	public void switch_to_the_new_window2() {
		 allWindows = driver.getWindowHandles();
		 allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@Then("Switch to the original main window")
	public void switch_to_the_original_main_window() {
		driver.switchTo().window(allhandles.get(0));
	}
	@When("Click Merge button")
	public void click_merge_button() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	@Then("Accept Alert")
	public void accept_alert() {
		driver.switchTo().alert().accept();
	}
	@When("Verify Lead ID")
	public void verify_lead_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
	}
}
