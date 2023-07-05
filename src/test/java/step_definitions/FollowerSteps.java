package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.FollowerPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FollowerSteps {

    final private WebDriver driver;

    public FollowerSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User input \"([^\"]*)\" as username and \"([^\"]*)\" as password for follower page$")
    public void userInputAsUsernameAndAsPasswordForFollowerPage(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, username);
        loginPage.setLoginInputFields(2, password);
    }

    @When("^User click on Followers text$")
    public void userClickOnFollowersText() {
        FollowerPage followerPage = new FollowerPage(driver);
        followerPage.clickFollowerText();
    }

    @Then("^User already on Followers page$")
    public void userAlreadyOnFollowersPage() throws InterruptedException {
        FollowerPage followerPage = new FollowerPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(followerPage.validateFollowerPage());
    }

    @When("^User click on Follow Back button$")
    public void userClickOnFollowBackButton() {
        FollowerPage followerPage = new FollowerPage(driver);
        followerPage.clickFollowBackBtn();
    }

    @And("^Refresh page$")
    public void refreshPage() throws InterruptedException {
        Thread.sleep(4000);
        driver.navigate().refresh();
    }

    @Then("^Follow Back button text should change to Friend$")
    public void followBackButtonTextShouldChangeToFriend() throws InterruptedException {
        FollowerPage followerPage = new FollowerPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(followerPage.validateFriendButton());
    }

    @When("^User click on Following text$")
    public void userClickOnFollowingText() {
        FollowerPage followerPage = new FollowerPage(driver);
        followerPage.clickFollowingText();
    }

    @Then("^User already on Following page$")
    public void userAlreadyOnFollowingPage() throws InterruptedException {
        FollowerPage followerPage = new FollowerPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(followerPage.validateFollowerPage());
    }

    @When("^User click on Unfollow button$")
    public void userClickOnUnfollowButton() {
        FollowerPage followerPage = new FollowerPage(driver);
        followerPage.clickUnfollowBtn();
    }

    @Then("^List of user following is empty$")
    public void listOfUserFollowingIsEmpty() throws InterruptedException {
        FollowerPage followerPage = new FollowerPage(driver);
        Thread.sleep(4000);
        Assert.assertFalse(followerPage.validateUserFollowing());
    }
}
