package com.cydeo.step_definitions;

import com.cydeo.pages.AutomationPracticePage;
import com.cydeo.pages.AutomationPracticePage2;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCase4StepDefinitions {
    AutomationPracticePage2 automationPracticePage2 = new AutomationPracticePage2();
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://www.automationexercise.com/");
        Assert.assertTrue(automationPracticePage.pageTitle.isDisplayed());
    }
    @When("user clicks signup loggin button")
    public void user_clicks_signup_loggin_button() {
        automationPracticePage.signupLoginButton.click();
    }
    @Then("user should see login to your account message")
    public void user_should_see_login_to_your_account_message() {
        Assert.assertTrue(automationPracticePage.loginToYourAccountText.isDisplayed());
    }
    @When("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        automationPracticePage.loginEmailBox.sendKeys("my11@email.com");
        automationPracticePage.loginPassword.sendKeys("password");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        automationPracticePage.loginButton.click();
    }
    @Then("user should see logged in as username message")
    public void user_should_see_logged_in_as_username_message() {
        Assert.assertTrue(automationPracticePage.loggedInAsUserNameText.isDisplayed());
    }
    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        automationPracticePage2.logoutButton.click();
    }
    @Then("user should see the login page")
    public void user_should_see_the_login_page() {
       Assert.assertTrue(automationPracticePage.loginToYourAccountText.isDisplayed());
    }
}
