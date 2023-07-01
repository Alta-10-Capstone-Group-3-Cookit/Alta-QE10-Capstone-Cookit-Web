package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class EditProfilePage {

    public static WebDriver driver;

    public EditProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        EditProfilePage.driver = driver;
    }

    @FindBy(css = ".place-self-end > [stroke='currentColor']")
    private WebElement editProfileBtn;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement editProfilePageTitle;

    @FindBy(xpath = "//button[@class='w-24 lg:w-32 py-1 rounded-md place-self-center bg-secondary text-white']")
    private WebElement saveBtn;

    @FindBy(xpath = "//input[@id='pict']")
    private WebElement inputImage;

    @FindBy(xpath = "//input[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement usernameField;

    @FindBy(xpath = "//textarea[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement bioField;

    @FindBy(xpath = "//button[@class='w-24 py-1 bg-secondary font-semibold rounded-md text-white']")
    private WebElement requestVerifiedBtn;

    @FindBy(xpath = "//div[contains(@class, 'alert alert-error shadow-lg')]")
    private WebElement errorMessage;

    public void setPasswordFields(int index, String value) {
        WebElement passwordField = driver.findElement(By.xpath("//form//div[@class='relative'][" + index + "]/input"));
        passwordField.sendKeys(value);
    }

    public void clickEditProfileBtn() {
        editProfileBtn.click();
    }

    public boolean validateEditProfilePage() {
        return editProfilePageTitle.isDisplayed();
    }

    public void clickSaveBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", saveBtn);
    }

    public void uploadImage(String image) {
        String path = System.getProperty("user.dir") + "/src/test/resources/assets/" + image;
        inputImage.sendKeys(path);
    }

    public void setBioField(String value) {
        bioField.sendKeys(value);
    }

    public boolean validateErrorMessage() {
        return errorMessage.isDisplayed();
    }

    public void clickRequestBtn() {
        requestVerifiedBtn.click();
    }
}
