package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page loginPage;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
        driver.get("http://example.com");
        assertTrue(loginPage.isPageLoaded());
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword("validPassword");
        loginPage.clickLoginButton();
    }

    @Then("the user is logged into the system")
    public void the_user_is_logged_into_the_system() {
        assertTrue(loginPage.isLoggedIn());
    }
}