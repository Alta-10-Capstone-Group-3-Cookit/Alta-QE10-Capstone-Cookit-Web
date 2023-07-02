package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.NewRecipePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NewRecipeSteps {

    final private WebDriver driver;

    public NewRecipeSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User input \"([^\"]*)\" as username and \"([^\"]*)\" as password for new recipe page$")
    public void userInputAsUsernameAndAsPasswordForNewRecipePage(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginInputFields(1, username);
        loginPage.setLoginInputFields(2, password);
    }

    @When("^User click on New Post button$")
    public void userClickOnNewPostButton() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.clickNewPostBtn();
    }

    @And("^User click on New Recipe button$")
    public void userClickOnNewRecipeButton() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.clickNewRecipeBtn();
    }

    @Then("^User already on New Recipe Page$")
    public void userAlreadyOnNewRecipePage() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(newRecipePage.validateNewRecipePage());
    }

    @When("^User input \"([^\"]*)\" as Recipe Title$")
    public void userInputAsRecipeTitle(String title) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.insertRecipeTitle(title);
    }

    @And("^User input \"([^\"]*)\" as Description$")
    public void userInputAsDescription(String desc) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.insertRecipeDescription(desc);
    }

    @And("^Upload valid image file$")
    public void uploadValidImageFile() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.uploadRecipeImage("recipe_img.png");
    }

    @And("^Click on ingredient plus button$")
    public void clickOnIngredientPlusButton() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.clickAddIngredientBtn();
    }


    @And("^Click directions plus button$")
    public void clickDirectionsPlusButton() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.clickAddStepBtn();
    }

    @And("^Checklist sell ingredients$")
    public void checklistSellIngredients() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.clickSellCheckbox();
    }

    @And("^Click Submit button$")
    public void clickSubmitButton() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.clickSubmitBtn();
    }

    @Then("^User already on recipe page from new recipe$")
    public void userAlreadyOnRecipePage() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(newRecipePage.validateRecipePage());
    }

    @And("^Validate recipe title is \"([^\"]*)\"$")
    public void validateRecipeTitleIs(String title) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        Assert.assertTrue(newRecipePage.validateRecipeTitle(title));
    }

    @And("^Input \"([^\"]*)\" as first ingredient name, \"([^\"]*)\" as first ingredient item, \"([^\"]*)\" as first ingredient unit$")
    public void inputAsFirstIngredientNameAsFirstIngredientItemAsFirstIngredientUnit(String ingName, String count, String unit) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.insertFirstIngredient(1, ingName);
        newRecipePage.insertFirstIngredient(2, count);
        newRecipePage.insertFirstIngredient(3, unit);
    }

    @And("^Input \"([^\"]*)\" as second ingredient name, \"([^\"]*)\" as second ingredient item, \"([^\"]*)\" as second ingredient unit$")
    public void inputAsSecondIngredientNameAsSecondIngredientItemAsSecondIngredientUnit(String ingName, String count, String unit) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.insertSecondIngredient(1, ingName);
        newRecipePage.insertSecondIngredient(2, count);
        newRecipePage.insertSecondIngredient(3, unit);
    }

    @And("^Input \"([^\"]*)\" as first step$")
    public void inputAsFirstStep(String step) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.insertStep(1, step);
    }

    @And("^Input \"([^\"]*)\" as second step$")
    public void inputAsSecondStep(String step) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.insertStep(2, step);
    }

    @And("^Input \"([^\"]*)\" as price$")
    public void inputAsPrice(String price) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.inputPrice(price);
    }

    @And("^Validate price is \"([^\"]*)\"$")
    public void validatePriceIs(String price) {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        Assert.assertTrue(newRecipePage.validatePrice(price));
    }

    @Then("^User still on New Recipe page$")
    public void userStillOnNewRecipePage() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(newRecipePage.validateNewRecipePage());
    }

    @And("^Upload invalid image file$")
    public void uploadInvalidImageFile() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.uploadRecipeImage("recipe_img.txt");
    }

    @And("^Clear price input$")
    public void clearPriceInput() {
        NewRecipePage newRecipePage = new NewRecipePage(driver);
        newRecipePage.inputPrice("");
    }
}
