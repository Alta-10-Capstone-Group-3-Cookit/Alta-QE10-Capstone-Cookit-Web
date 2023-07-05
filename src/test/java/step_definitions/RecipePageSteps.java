package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.RecipePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RecipePageSteps {

    final private WebDriver driver;

    public RecipePageSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @And("^User click like button icon$")
    public void userClickSearchIconButton() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickLikeIconBtn();
        Thread.sleep(2000);
    }

    @Then("^User click unlike button icon$")
    public void userClickUnlikeButtonIcon() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickUnlLikeIconBtn();
        Thread.sleep(2000);
    }

    @When("^User click plus button on ingredients$")
    public void userClickPlusButtonOnIngredients() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickPlusServingBtn();
        Thread.sleep(2000);
    }

    @Then("^User click minus button on ingredients$")
    public void userClickMinusButtonOnIngredients() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickMinusServingBtn();
        Thread.sleep(2000);
    }

    @And("^User click add to cart button on Buy Ingredients section$")
    public void userClickAddToCartButtonOnBuyIngredientsSection() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickAddToCartBtn();
        Thread.sleep(3000);
    }

    @And("^User scroll down to comments section$")
    public void userScrollDownToCommentsSection() {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.scrollToComment();
    }

    @Then("^User input \"([^\"]*)\" on comments field$")
    public void userInputOnCommentsField(String comment){
        RecipePage recipePage = new RecipePage(driver);
        recipePage.inputComment(comment);
    }

    @And("^User click on submit button on comments section$")
    public void userClickOnSubmitButtonOnCommentsSection() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickSubmitButton();
        Thread.sleep(2000);
    }

    @And("^Comments \"([^\"]*)\" should appear$")
    public void commentsShouldAppear(String comment) throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.validateComment(comment);
    }

    @When("^User click three dots icon button on title secction$")
    public void userClickThreeDotsIconButtonOnTitleSecction() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickThreeDotsButton();
        Thread.sleep(1500);
    }

    @Then("^User click recook on three dots icon button on title secction$")
    public void userClickRecookOnThreeDotsIconButtonOnTitleSecction() {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickRecookButton();
    }

    @And("^User already on Recook page$")
    public void userAlreadyOnRecookPage() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        Assert.assertTrue(recipePage.verifyRecookPage());
        Thread.sleep(3000);
    }

    @Then("^User click reply on three dots icon button on title secction$")
    public void userClickReplyOnThreeDotsIconButtonOnTitleSecction() {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickReplyButton();
    }

    @And("^User already on Reply page$")
    public void userAlreadyOnReplyPage() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        Assert.assertTrue(recipePage.verifyReplyPage());
        Thread.sleep(3000);
    }

    @When("^User input \"([^\"]*)\" on Describe field on Reply Recipe page$")
    public void userInputOnDescribeFieldOnReplyRecipePage(String describe) throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.inputDescribeReply(describe);
        Thread.sleep(2000);
    }

    @Then("^Click on add image button and upload valid image file$")
    public void clickOnAddImageButtonAndUploadValidImageFile() throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.uploadImage("Krabby_Patty.jpg");
        Thread.sleep(2000);
    }

    @And("^User click Submit button on Reply Recipe page$")
    public void userClickSubmitButtonOnReplyRecipePage() {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.clickSubmitReplyButton();
    }

    @When("^User input \"([^\"]*)\" as Recook Recipe Title$")
    public void userInputAsRecookRecipeTitle(String recipeName) throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.inputRecookName(recipeName);
        Thread.sleep(1500);
    }

    @And("^User input \"([^\"]*)\" as Recook Description$")
    public void userInputAsRecookDescription(String recookDescription) throws InterruptedException {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.inputRecookDescription(recookDescription);
        Thread.sleep(1500);
    }

    @And("^Input \"([^\"]*)\" as ingredient 3 name, \"([^\"]*)\" as ingredient 3 item quantity, \"([^\"]*)\" as ingredient 3 unit$")
    public void inputAsIngredientNameAsIngredientItemQuantityAsIngredientUnit(String ingName, String IngQty, String ingUnit) throws Throwable {
        RecipePage recipePage = new RecipePage(driver);
        recipePage.inputRecookIngredient(ingName, IngQty, ingUnit);
    }

}
