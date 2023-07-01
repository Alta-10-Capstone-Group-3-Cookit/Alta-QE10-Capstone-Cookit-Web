package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchPageSteps {

    final private WebDriver driver;

    public SearchPageSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    // Search Recipes

    @And("^User click recipes tab on search page$")
    public void userClickSearchRecipeButton() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickSearchRecipeButton();
    }

    @Then("^User click search field on search page$")
    public void userClickSearchFieldOnSearchPage() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickSearchField();
    }

    @And("^User input \"([^\"]*)\" search field on search page$")
    public void userInputSearchFieldOnSearchPage(String search) throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.setSearchInputFields(search);
        Thread.sleep(2000);

    }

    @And("^List of recipe name contains \"([^\"]*)\" will appear$")
    public void listOfRecipeNameContainsWillAppear(String search) {
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.verifyRecipeName().contains(search));
    }

    // Search People

    @When("^User click people tab on search page$")
    public void userClickPeopleTabOnSearchPage() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickSearchPeopleButton();

    }

    @And("^List of username contains \"([^\"]*)\" will appear$")
    public void listOfUsernameContainsWillAppear(String search) {
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.verifyUserName().contains(search));
    }
}
