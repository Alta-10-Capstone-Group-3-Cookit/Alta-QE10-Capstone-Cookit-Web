package org.example.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        HomePage.driver = driver;
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

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-5 md:grid-cols-2']/div[contains(.,'Receive by 6 July-10 JulyRp 9.000')]")
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

    public String MerchandisePlusShipping() {
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
        String midtransUrl = "https://simulator.sandbox.midtrans.com/bni/va/index/";
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://simulator.sandbox.midtrans.com/bni/va/index");
    }
}
