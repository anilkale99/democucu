package com.multiscenariosinglefile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiScenarioStepDefs {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anil.Kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	@Given("^the user is on registration Page$")
	public void the_user_is_on_registration_Page() throws InterruptedException {
		System.out.println("actual script started");
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
	}
	
	@And("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(userName);
	}
	
	@When("^he enters \"([^\"]*)\" as user last name$")
	public void He_enters_user_last_name(String lastname) throws InterruptedException {
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
		Assert.assertTrue(false);
		driver.quit();
	}

}
