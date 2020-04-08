package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	public static WebDriver driver;
	
	@Given("User has to be in the login")
	public void user_has_to_be_in_the_login() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\sridhar\\CucumberProject\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
	
	}

	@When("User has to enter {string},{string} and click the login button")
	public void user_has_to_enter_and_click_the_login_button(String s1, String s2) {
	    driver.findElement(By.id("email")).sendKeys(s1);
	    driver.findElement(By.id("pass")).sendKeys(s2);
	   
	}

	@Then("User has to find error page")
	public void user_has_to_find_error_page() {
		driver.quit();
	    System.out.println("success");
	}
}
