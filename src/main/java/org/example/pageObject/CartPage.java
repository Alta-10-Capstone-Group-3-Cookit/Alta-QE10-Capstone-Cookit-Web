package org.example.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        CartPage.driver = driver;
    }

    @FindBy(xpath = "//p[@class='text-md md:text-2xl col-span-1']")
    private WebElement ProductNameBtn;

    @FindBy(xpath = "//input[@class='w-5 h-5 text-secondary bg-secondary cursor-pointer']")
    private WebElement ItemCheckBox;

    @FindBy(xpath = "//p[@class='text-orange-500 md:text-2xl lg:text-xl lg:font-semibold lg:mt-[20%]']")
    private WebElement ItemPrice;

    @FindBy(xpath = "//span[@class='text-Primary']")
    private WebElement TotalPrice;

    @FindBy(xpath = "//button[.='Checkout']")
    private WebElement CheckoutBtn;

    @FindBy(xpath = "//h1[.='Payment']")
    private WebElement PaymenntPageTitle;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-5 md:grid-cols-2']/div[contains(.,'Receive')][1]")
    private WebElement ChoosenCourier;

    @FindBy(xpath = "//p[.='Payment Option']")
    private WebElement PaymentOptionBtn;

    @FindBy(xpath = "//label[.='Bank BNI']")
    private WebElement PaymentMethodBtn;

    @FindBy(xpath = "//p[.='Rp 59.000']")
    private WebElement OrderTotal;

    @FindBy(xpath = "//div[@class='grid grid-cols-2 justify-between my-5 gap-4']/p[contains(.,'Rp 50.000')]")
    private WebElement MerchandiseTotal;

    @FindBy(xpath = "//p[4]")
    private WebElement ShippingTotal;

    @FindBy(xpath = "//label[.='Place Order']")
    private WebElement PlaceOrderBtn;

    @FindBy(xpath = "//p[@class='text-center']")
    private WebElement PassConfirmPopup;

    @FindBy(xpath = "//input[@class='border-2 border-black py-2 px-2 rounded-md']")
    private WebElement OrderPassField;

    @FindBy(xpath = "//label[.='Confirm']")
    private WebElement ConfirmBtn;

    @FindBy(xpath = "//h1[.='Detail Purchase']")
    private WebElement DetailPurchaseTitle;

    @FindBy(xpath = "//span[@class='cursor-pointer']")
    private WebElement CopyBtn;

    @FindBy(xpath = "//input[@id='inputMerchantId']")
    private WebElement VaNumberField;

    @FindBy(xpath = "//button[.='Inquire']")
    private WebElement InquireBtn;

    @FindBy(xpath = "//label[.='Amount to pay']")
    private WebElement InquirePageVerif;

    @FindBy(xpath = "//input[@name='total_amount']")
    private WebElement totalAmount;

    @FindBy(xpath = "//button[.='Pay']")
    private WebElement payBtn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement successPaymentMessage;

    @FindBy(xpath = "//a[@href='/history']")
    private WebElement DetailPurchaseBackBtn;

    @FindBy(xpath = "//h1[.='My Purchase']")
    private WebElement myPurchasePageTitle;

    @FindBy(xpath = "//p[.='Shipped']")
    private WebElement shippedTabBtn;

    @FindBy(xpath = "//div[@class='bg-gray-100  ']/div[3]//p[@class='text-md md:text-2xl col-span-1']")
    private WebElement paidItemName;

    public boolean validateProductName() {
        return ProductNameBtn.isDisplayed();
    }

    public void clickCheckBox() {
        ItemCheckBox.click();
    }

    public String getItemPrice() {
        return ItemPrice.getText();
    }
    public String getTotalPrice() {
        return TotalPrice.getText();
    }

    public void clickCheckoutBtn() {
        CheckoutBtn.click();
    }

    public boolean validatePaymentPage() {
        return PaymenntPageTitle.isDisplayed();
    }

    public void clickChosenDelivery() {
        ChoosenCourier.click();
    }

    public void clickPaymentMethod() throws InterruptedException {
        PaymentOptionBtn.click();
        Thread.sleep(1500);
        PaymentMethodBtn.click();
    }

    public String merchandisePlusShipping() {
        String merchand = MerchandiseTotal.getText().replace("Rp ", "");
        String shipping = ShippingTotal.getText().replace("Rp ", "");
        int merchandTotal = Integer.valueOf(merchand);
        int shippingTotal = Integer.valueOf(shipping);
        int total = merchandTotal + shippingTotal;
        String totalMS = String.valueOf(total);
        return totalMS;
    }

      public String validateTotalPriceOrder() {
          return OrderTotal.getText().replace("Rp ", "");
    }

    public void clickPlaceOrderBtn() throws InterruptedException {
        PlaceOrderBtn.click();
        Thread.sleep(1500);
    }

    public boolean validatePassConfirmPopup() {
        return PassConfirmPopup.isDisplayed();
    }

    public void inputOrderPassword(String password) {
        OrderPassField.sendKeys(password);
    }

    public void clickConfirmBtn() {
        ConfirmBtn.click();
    }

    public boolean validateDetailPurchasePage() {
        return DetailPurchaseTitle.isDisplayed();
    }

    public void clickCopyBtn() {
        CopyBtn.click();
    }

    public void moveToMidtrans() {
        String midtransUrl = "https://simulator.sandbox.midtrans.com/bni/va/index";
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(midtransUrl);
    }

    public void inputVaNumber() {
        Actions actions = new Actions(driver);
        VaNumberField.click();
        actions.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).build().perform();

    }

    public void clickInquireBtn() {
        InquireBtn.click();
    }

    public boolean validateInquirePage(){
        return InquirePageVerif.isDisplayed();
    }

    public void clickPayBtn() {
        payBtn.click();
    }

    public boolean validateSuccessPayment(){
        return successPaymentMessage.isDisplayed();
    }

    public void closeMidtransTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void clickBackBtn() {
        DetailPurchaseBackBtn.click();
    }

    public boolean validateMyPurchasePage(){
        return myPurchasePageTitle.isDisplayed();
    }

    public void clickShippedTabButton() {
        shippedTabBtn.click();
    }

    public boolean validatePaidItemName(){
        return paidItemName.isDisplayed();
    }
}
