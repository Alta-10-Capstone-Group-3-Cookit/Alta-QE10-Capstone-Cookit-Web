package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    final private WebDriver driver;

    public HomePageSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @And("^User click timeline tab button$")
    public void userClickTimelineTabButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickTimelineTabButton();
    }

    @Then("^User already on Timeline Tab$")
    public void userAlreadyOnTimelineTab() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);
        Assert.assertTrue(homePage.validateTimelineTabTitle());
    }

    @And("^User click Recipe tab button$")
    public void userClickRecipeTabButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickRecipeTabButton();
    }

    @And("^User already on Recipe Tab$")
    public void userAlreadyOnRecipeTab() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);
        Assert.assertTrue(homePage.validateRecipeTabTitle());
    }

    @Then("^User click on recipe name$")
    public void userClickOnRecipeName() {
        HomePage homePage = new HomePage(driver);
        homePage.getRecipeName();
        homePage.clickRecipeName();
    }

    @And("^User click search icon button$")
    public void userClickSearchIconButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSearchButton();
    }

    @Then("^User already on search page$")
    public void userAlreadyOnSearchPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);
        Assert.assertTrue(homePage.validateSearchPage());
    }

    @Then("^User click on add to cart icon button on recipe tab on home page$")
    public void userClickOnAddToCartIconButtonOnRecipeTabOnHomePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickAddToCartButton();
    }

    @And("^User click cart icon button$")
    public void userClickCartIconButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCartButton();
    }

    @Then("^User already on cart page$")
    public void userAlreadyOnCartPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateCartPage());
        Thread.sleep(3000);
    }

    @And("^User already on recipe page$")
    public void userAlreadyOnRecipePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getRecipeNameHeader());
        Thread.sleep(3000);
    }
}
