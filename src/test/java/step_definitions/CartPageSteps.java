package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartPageSteps {

    final private WebDriver driver;

    public CartPageSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @And("^List of added item will appear$")
    public void userAlreadyOnTimelineTab() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validateProductName());
        Thread.sleep(3000);
    }

    @When("^user click on checkbox on selected item$")
    public void userClickOnCheckboxOnSelectedItem() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckBox();
    }

    @Then("^User verify total price$")
    public void userVerifyTotalPrice() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getTotalPrice(),cartPage.getItemPrice());
        Thread.sleep(2000);
    }

    @And("^User click checkout button$")
    public void userClickCheckoutButton() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckoutBtn();
    }

    @And("^User already on payment page$")
    public void userAlreadyOnPaymentPage() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validatePaymentPage());
        Thread.sleep(2000);
    }

    // Payment Page

    @When("^User click on choosen delivery option$")
    public void userClickOnChoosenDeliveryOption() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickChosenDelivery();
    }

    @Then("^User click on choosen payment method$")
    public void userClickOnChoosenPaymentMethod() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickPaymentMethod();
    }

    @And("^User verify order total$")
    public void userVerifyOrderTotal() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.MerchandisePlusShipping(),cartPage.validateTotalPriceOrder());
    }

    @And("^User click place order button$")
    public void userClickPlaceOrderButton() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderBtn();
    }

    @And("^Password confirmation pop-up will appear$")
    public void passwordConfirmationPopUpWillAppear() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validatePassConfirmPopup());
        Thread.sleep(1500);
    }

    @And("^User input \"([^\"]*)\" as confirm password$")
    public void userInputAsPasswoword(String password) {
        CartPage cartPage = new CartPage(driver);
        cartPage.inputOrderPassword(password);
    }

    @And("^User click confirm button$")
    public void userClickConfirmButton() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickConfirmBtn();
        Thread.sleep(5000);
    }

    @And("^User already on Detail Purchase page$")
    public void userAlreadyOnDetailPurchasePage() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validateDetailPurchasePage());
        Thread.sleep(2000);
    }

    @And("^User copy the virtual account number that displayed on detail purchased page$")
    public void userCopyTheVirtualAccountNumberThatDisplayedOnDetailPurchasedPage() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCopyBtn();
    }

    @When("^User go to midtrans page for payment$")
    public void userGoToMidtransPageForPayment() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.moveToMidtrans();
        Thread.sleep(2000);
    }
}
