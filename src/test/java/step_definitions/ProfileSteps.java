package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.profiler.model.Profile;

public class ProfileSteps {

    public WebDriver driver;

    public ProfileSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User input \"([^\"]*)\" as username and \"([^\"]*)\" as password for profile page$")
    public void userInputAsUsernameAndAsPasswordForProfilePage(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, username);
        loginPage.setLoginInputFields(2, password);
    }

    @When("^User click on Profile menu$")
    public void userClickOnProfileMenu() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickProfileMenu();
    }

    @And("^User click on Profile list menu$")
    public void userClickOnProfileListMenu() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickProfileListMenu();
    }

    @Then("^User already on profile page$")
    public void userAlreadyOnProfilePage() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(profilePage.validateProfilePage());
    }

    @And("^Validate user name is correct$")
    public void validateUserNameIsCorrect() {
        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.validateUsername("naufalfix"));
    }

    @And("^Validate user profile layout is displayed$")
    public void validateUserProfileLayoutIsDisplayed() {
        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.validateProfileImageDisplayed());
        Assert.assertTrue(profilePage.validateFollowingIsDisplayed());
        Assert.assertTrue(profilePage.validateFollowerIsDisplayed());
    }

    @And("^Validate user recipe post is displayed$")
    public void validateUserRecipePostIsDisplayed() {
        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.validateLikeButtonIsDisplayed());
        Assert.assertTrue(profilePage.validateThreeDotsButtonIsDisplayed());
    }

    @When("^User click like icon on their post$")
    public void userClickLikeIconOnTheirPost() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickLikeBtn();
    }

    @Then("^Like count number should be \"([^\"]*)\"$")
    public void likeCountNumberShouldBe(String like) {
        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.validateLikeNumber(like));
    }

    @When("^User click three dots icon on their post$")
    public void userClickThreeDotsIconOnTheirPost() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickThreeDotsBtn();
    }

    @And("^User click on Reply$")
    public void userClickOnReply() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickReplyBtn();
    }

    @Then("^User navigated to reply page$")
    public void userNavigatedToReplyPage() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(profilePage.validateReplyPage());
    }

    @And("^User click on Recook$")
    public void userClickOnRecook() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickRecookBtn();
    }

    @Then("^User navigated to recook page$")
    public void userNavigatedToRecookPage() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(profilePage.validateRecookPage());
    }
}
