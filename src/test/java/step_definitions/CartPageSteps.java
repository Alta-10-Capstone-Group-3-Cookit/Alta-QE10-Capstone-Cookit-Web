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
    public void userAlreadyOnTimelineTab() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validateProductName());
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
        Assert.assertEquals(cartPage.merchandisePlusShipping(),cartPage.validateTotalPriceOrder());
    }

    @And("^User click place order button$")
    public void userClickPlaceOrderButton() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderBtn();
    }

    @And("^Password confirmation pop-up will appear$")
    public void passwordConfirmationPopUpWillAppear() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validatePassConfirmPopup());
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
    }

    @And("^User input the Virtual Account Number to virtual account number field on midtrans page$")
    public void userInputTheVirtualAccountNumberToVirtualAccountNumberFieldOnMidtransPage() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.inputVaNumber();
    }

    @And("^User click on inquire button on midtrans page$")
    public void userClickOnInquireButtonOnMidtransPage() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickInquireBtn();
        Thread.sleep(2000);
    }

    @And("^User already on inquiry page on midtrans$")
    public void userAlreadyOnInquiryPageOnMidtrans() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validateInquirePage());
    }

    @When("^User click pay on inquiry page on midtrans$")
    public void userClickPayOnInquiryPageOnMidtrans() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickPayBtn();
    }

    @Then("^Payment Success message will appear$")
    public void paymentSuccessMessageWillAppear() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validateSuccessPayment());
    }

    @And("^User go back to detail purchase page on cookit$")
    public void userGoBackToDetailPurchasePageOnCookit() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.closeMidtransTab();
        Assert.assertTrue(cartPage.validateDetailPurchasePage());
    }

    @And("^User click back button$")
    public void userClickBackButton() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickBackBtn();
    }

    @And("^User already on my purchase page$")
    public void userAlreadyOnMyPurchasePage() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validateMyPurchasePage());
    }

    @When("^User click on shipped tab$")
    public void userClickOnShippedTab() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickShippedTabButton();
        Thread.sleep(5000);
    }

    @And("^list of paid item will appear$")
    public void listOfPaidItemWillAppear() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.validatePaidItemName());
    }
}
