package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    final private WebDriver driver;

    public LoginSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User input \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
    public void userInputAsUsernameAndAsPassword(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, username);
        loginPage.setLoginInputFields(2, password);
    }

    @And("^User click login button$")
    public void userClickLoginButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("^User already on Home Page$")
    public void userAlreadyOnHomePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.validateHomePageTitle());
    }

    @When("^User input \"([^\"]*)\" as password$")
    public void userInputAsPassword(String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(2, password);
    }

    @When("^User input \"([^\"]*)\" as username$")
    public void userInputAsUsername(String username) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, username);
    }
}
