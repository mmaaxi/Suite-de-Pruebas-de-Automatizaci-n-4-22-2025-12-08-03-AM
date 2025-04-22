package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_002Page {

    WebDriver driver;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    @FindBy(id = "homePageIndicator")
    private WebElement homePageIndicator;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public boolean isLoggedOut() {
        // Add logic to confirm the user is logged out
        return !driver.getCurrentUrl().contains("dashboard");
    }

    public boolean isOnHomePage() {
        return homePageIndicator.isDisplayed();
    }
}