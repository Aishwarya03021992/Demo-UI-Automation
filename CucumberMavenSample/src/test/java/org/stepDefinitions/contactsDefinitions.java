package org.stepDefinitions;

import org.Pages.contactsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactsDefinitions {

	public contactsPage link = new contactsPage();

	@Given("Open Presidio Official Website")
	public void open_presidio_official_website() throws InterruptedException {
		link.launchPresidioWebsite();
		link.pageURL();
		
	}

	@When("Check Page Scroll Down")
	public void check_page_scroll_down() throws InterruptedException {
		System.out.println("Scroll Page Down");
		link.check_page_scroll_down();
		link.demoWebsitePractice();

	}

	@When("Click Search button")
	public void click_search_button() throws InterruptedException {
		System.out.println("Learn Automation");

	}

	@When("Enter {string}")
	public void enter(String string) {
		System.out.println("Presidio India");
	}

	@Then("Click search icon")
	public void click_search_icon() {
		System.out.println("Software Test Engineer");
	}

}
