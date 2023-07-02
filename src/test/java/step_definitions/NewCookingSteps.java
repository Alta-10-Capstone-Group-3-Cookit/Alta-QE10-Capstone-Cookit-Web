package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.NewCookingPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NewCookingSteps {

    final private WebDriver driver;

    public NewCookingSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User input \"([^\"]*)\" as username and \"([^\"]*)\" as password for new cooking page$")
    public void userInputAsUsernameAndAsPasswordForNewCookingPage(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, username);
        loginPage.setLoginInputFields(2, password);
    }

    @And("^User click on New Cooking button$")
    public void userClickOnNewCookingButton() {
        NewCookingPage newCookingPage = new NewCookingPage(driver);
        newCookingPage.clickNewCookingBtn();
    }

    @Then("^User already on New Cooking Page$")
    public void userAlreadyOnNewCookingPage() throws InterruptedException {
        NewCookingPage newCookingPage = new NewCookingPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(newCookingPage.validateNewCookingPage());
    }

    @When("^User input \"([^\"]*)\" as description$")
    public void userInputAsDescription(String desc) {
        NewCookingPage newCookingPage = new NewCookingPage(driver);
        newCookingPage.insertDescription(desc);

    }

    @And("^Click on add image button to upload valid image file$")
    public void clickOnAddImageButtonToUploadValidImageFile() {
        NewCookingPage newCookingPage = new NewCookingPage(driver);
        newCookingPage.uploadImage("recipe_img.png");
    }

    @And("^Click submit button on new cooking page$")
    public void clickSubmitButtonOnNewCookingPage() {
        NewCookingPage newCookingPage = new NewCookingPage(driver);
        newCookingPage.clickSubmitBtn();
    }

    @Then("^User redirected to Profile page$")
    public void userRedirectedToProfilePage() throws InterruptedException {
        NewCookingPage newCookingPage = new NewCookingPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(newCookingPage.validateProfilePage());
    }
}
