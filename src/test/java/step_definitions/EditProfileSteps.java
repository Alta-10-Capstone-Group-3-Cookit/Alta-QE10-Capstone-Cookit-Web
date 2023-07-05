package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.EditProfilePage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditProfileSteps {

    final private WebDriver driver;

    public EditProfileSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User input registered username and \"([^\"]*)\" as password$")
    public void userInputRegisteredUsernameAndAsPassword(String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, RegisterPage.REGISTER_USERNAME);
        loginPage.setLoginInputFields(2, password);
    }

    @When("^User click on edit profile icon$")
    public void userClickOnEditProfileIcon() {
        EditProfilePage editProfile = new EditProfilePage(driver);
        editProfile.clickEditProfileBtn();
    }

    @Then("^User already on Edit Profile page$")
    public void userAlreadyOnEditProfilePage() throws InterruptedException {
        EditProfilePage editProfile = new EditProfilePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(editProfile.validateEditProfilePage());
    }

    @When("^User input \"([^\"]*)\" as Bio, and \"([^\"]*)\" as current password, and \"([^\"]*)\" as new and confirm new password, and upload valid profile image$")
    public void userInputAsBioAndAsCurrentPasswordAndAsNewAndConfirmNewPasswordAndUploadValidProfileImage(String bio, String currentPassword, String newAndConfirmPassword) {
        EditProfilePage editProfile = new EditProfilePage(driver);
        editProfile.setBioField(bio);
        editProfile.setPasswordFields(1, currentPassword);
        editProfile.setPasswordFields(2, newAndConfirmPassword);
        editProfile.setPasswordFields(3, newAndConfirmPassword);
        editProfile.uploadImage("profile.png");
    }

    @And("^Click save button$")
    public void clickSaveButton() throws InterruptedException {
        EditProfilePage editProfile = new EditProfilePage(driver);
        Thread.sleep(3000);
        editProfile.clickSaveBtn();
    }

    @Then("^Error message alert should not be displayed$")
    public void errorMessageAlertShouldNotBeDisplayed() throws InterruptedException {
        EditProfilePage editProfilePage = new EditProfilePage(driver);
        Thread.sleep(4000);
        Assert.assertFalse(editProfilePage.validateErrorMessage());
    }

    @When("^User input registered username and \"([^\"]*)\" as password for edit profile page$")
    public void userInputRegisteredUsernameAndAsPasswordForEditProfilePage(String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, RegisterPage.REGISTER_USERNAME);
        loginPage.setLoginInputFields(2, password);
    }

    @When("^User click on Request button$")
    public void userClickOnRequestButton() {
        EditProfilePage editProfile = new EditProfilePage(driver);
        editProfile.clickRequestBtn();
    }

    @When("^User input \"([^\"]*)\" as Bio, \"([^\"]*)\" as new and confirm new password, and upload valid profile image$")
    public void userInputAsBioAsNewAndConfirmNewPasswordAndUploadValidProfileImage(String bio, String newConfirmPassword) {
        EditProfilePage editProfilePage = new EditProfilePage(driver);
        editProfilePage.setBioField(bio);
        editProfilePage.setPasswordFields(2, newConfirmPassword);
        editProfilePage.setPasswordFields(3, newConfirmPassword);
        editProfilePage.uploadImage("profile.png");
    }

    @Then("^Error message alert should be displayed$")
    public void errorMessageAlertShouldBeDisplayed() throws InterruptedException {
        EditProfilePage editProfilePage = new EditProfilePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(editProfilePage.validateErrorMessage());
    }

    @When("^User input \"([^\"]*)\" as Bio, \"([^\"]*)\" as current password, \"([^\"]*)\" as new and confirm new password, and upload valid profile image$")
    public void userInputAsBioAsCurrentPasswordAsNewAndConfirmNewPasswordAndUploadValidProfileImage(String bio, String currentPassword, String confirmNewPassword) {
        EditProfilePage editProfilePage = new EditProfilePage(driver);
        editProfilePage.setBioField(bio);
        editProfilePage.setPasswordFields(1, currentPassword);
        editProfilePage.setPasswordFields(2, confirmNewPassword);
        editProfilePage.setPasswordFields(3, confirmNewPassword);
        editProfilePage.uploadImage("profile.png");
    }
}
