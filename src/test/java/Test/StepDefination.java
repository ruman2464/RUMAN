package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefination {
	WebDriver dr;
	 

			@Given("^User is already on facebook  Homepage$")
			public void user_is_already_on_facebook_Homepage()  {
				System.setProperty("webdriver.gecko.driver", "/Users/iftakerahmed/Downloads/geckodriver");
				dr= new FirefoxDriver();
				dr.get("https://www.facebook.com/");
			}

			@When("^title of homepage is Facebook - Log In or Sign Up$")
			public void title_of_homepage_is_Facebook_Log_In_or_Sign_Up()  {
			   String title= dr.getTitle();
			   System.out.println(title);
			   Assert.assertEquals("Facebook - Log In or Sign Up", title);
			    
			}

			@Then("^user enters firstName$")
			public void user_enters_firstName()  {
			    dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcd@gmail.com");
			}

			@Then("^user enter LastName$")
			public void user_enter_LastName()  {
				 dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
			}

			@Then("^users clicks on login$")
			public void users_clicks_on_login()  {
			    dr.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
			}



}
