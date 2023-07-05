package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegisterSteps {

    final private WebDriver driver;

    public RegisterSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @Given("^User already on Cookit landing page$")
    public void userAlreadyOnCookitLandingPage() {
        RegisterPage registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.validateSignInButton());
    }

    @When("^User click on Sign In button$")
    public void userClickOnSignInButton() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickSignInButton();
    }

    @Then("^User already on login page$")
    public void userAlreadyOnLoginPage() {
        RegisterPage registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.validateLoginTitle());
    }

    @And("^User click Sign Up text$")
    public void userClickSignUpText() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickSignUpText();
    }

    @And("^User already on signup page$")
    public void userAlreadyOnSignupPage() {
        RegisterPage registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.validateSignupTitle());
    }

    @When("^User input valid and unregistered username, email, and password$")
    public void userInputValidAndUnregisteredUsernameEmailAndPassword() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setRegisterInputValues(1, RegisterPage.REGISTER_USERNAME);
        registerPage.setRegisterInputValues(2, RegisterPage.REGISTER_EMAIL);
        registerPage.setRegisterInputValues(3, "Asdfg123");
    }

    @And("^User click sign up button$")
    public void userClickSignUpButton() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickSignUpButton();
    }

    @Then("^User already on login page after success pop up$")
    public void userAlreadyOnLoginPageAfterSuccessPopUp() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        Assert.assertTrue(registerPage.validateLoginTitle());
    }

    @When("^User input \"([^\"]*)\" as username, \"([^\"]*)\" as email, and \"([^\"]*)\" as password$")
    public void userInputAsUsernameAsEmailAndAsPassword(String username, String email, String password) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setRegisterInputValues(1, username);
        registerPage.setRegisterInputValues(2, email);
        registerPage.setRegisterInputValues(3, password);
    }

    @Then("^Alert with message \"([^\"]*)\" is shown$")
    public void alertWithMessageIsShown(String alertMessage) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(registerPage.validateErrorMessageisDisplayed(alertMessage));
    }

    @When("^User input \"([^\"]*)\" as email, and \"([^\"]*)\" as password$")
    public void userInputAsEmailAndAsPassword(String email, String password) {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setRegisterInputValues(2, email);
        registerPage.setRegisterInputValues(3, password);
    }
}
