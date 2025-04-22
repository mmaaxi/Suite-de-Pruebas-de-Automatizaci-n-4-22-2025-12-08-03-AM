package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page logoutPage;
    
    public tc_002Steps() {
        driver = Hooks.driver;
        logoutPage = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // Assume user is already logged in for this test case
    }

    @When("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        logoutPage.clickLogoutButton();
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out() {
        assert logoutPage.isLoggedOut();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        assert logoutPage.isOnHomePage();
    }
}