package StepDefinitions;

import TestCases.E2EAutomation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionsTest extends E2EAutomation {
    WebDriver driver = new ChromeDriver();

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        openWebLink();
    }

    @Given("I enter a valid name")
    public void i_enter_a_valid_name() {
        enterUsername();
    }

    @Given("I enter a valid email")
    public void i_enter_a_valid_email() {
        enterEmail();
    }

    @Given("I enter a valid password")
    public void i_enter_a_valid_password() {
        enterPassword();
    }


    @Given("I click the checkout box")
    public void i_click_the_checkout_box() {
        checkBox();
    }

    @Given("I selected my gender")
    public void i_selected_my_gender() {
        enterGender();
    }

    @Given("I choose my employment status")
    public void i_choose_my_employment_status() {
        selectEmploymentStatus();
    }

    @Given("I enter my date of birth")
    public void i_enter_my_date_of_birth() {
        enterBirthDate();
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        clickSubmitButton();
    }

    @Then("I should see my name in the two way data binding example")
    public void i_should_see_my_name_in_the_two_way_data_binding_example() {
        verifyName();
    }

    @And("I should see a welcome message")
    public void i_should_see_a_welcome_message(){
        verifySuccessText();
    }

    @And("The browser should quit")
    public void the_browser_should_quit(){
        tearDown();
    }
}
