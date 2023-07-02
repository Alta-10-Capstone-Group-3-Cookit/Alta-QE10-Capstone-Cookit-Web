package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCookingPage {

    public static WebDriver driver;

    public NewCookingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        NewCookingPage.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/newcooking']")
    private WebElement newCookingBtn;

    @FindBy(xpath = "//button[contains(text(), 'New Cooking')]")
    private WebElement newCookingPageTitle;

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement descriptionField;

    @FindBy(xpath = "//div[@class='flex justify-between w-full flex-col sm:flex-row gap-2']//input")
    private WebElement imageUploadField;

    @FindBy(xpath = "//div[@class='flex justify-between w-full flex-col sm:flex-row gap-2']/button[contains(text(), 'Submit')]")
    private WebElement submitBtn;

    @FindBy(xpath = "//button[contains(text(), 'Profile')]")
    private WebElement profilePageTitle;

    public void clickNewCookingBtn() {
        newCookingBtn.click();
    }

    public boolean validateNewCookingPage() {
        return newCookingPageTitle.isDisplayed();
    }

    public void insertDescription(String value) {
        descriptionField.sendKeys(value);
    }

    public void uploadImage(String image) {
        String path = System.getProperty("user.dir") + "/src/test/resources/assets/" + image;
        imageUploadField.sendKeys(path);
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public boolean validateProfilePage() {
        return profilePageTitle.isDisplayed();
    }
}
