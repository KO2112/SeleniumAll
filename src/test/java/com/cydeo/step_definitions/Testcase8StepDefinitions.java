package com.cydeo.step_definitions;

import com.cydeo.pages.TestCase8Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Testcase8StepDefinitions {
    TestCase8Page testCase8Page = new TestCase8Page();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("user is on the automation page")
    public void user_is_on_the_automation_page() {
        Driver.getDriver().get("https://automationexercise.com/");
    }
    @When("user clicks on products page and verify that homepage is visible")
    public void user_clicks_on_products_page() throws InterruptedException {
        Assert.assertTrue(testCase8Page.title.isDisplayed());
        testCase8Page.productbutton.click();

    }
    @When("user clicks the first product")
    public void user_clicks_the_first_product() {

    }
    @Then("user should see product name, category, price, availbility, condition and brand")
    public void user_should_see_product_name_category_price_availbility_condition_and_brand() {

    }
}
