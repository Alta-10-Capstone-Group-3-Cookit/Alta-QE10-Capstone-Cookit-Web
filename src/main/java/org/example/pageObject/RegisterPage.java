package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public static WebDriver driver;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        RegisterPage.driver = driver;
    }

    public static String REGISTER_USERNAME = "naufaltest20";
    public static String REGISTER_EMAIL = "naufaltest20@testmail.com";

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signInButton;

    @FindBy(xpath = "//h1[contains(text(),'Login')]")
    private WebElement loginPageTitle;

    @FindBy(xpath = "//span[contains(text(), 'Sign up')]")
    private WebElement signUpText;

    @FindBy(xpath = "//h1[contains(text(), 'Sign up')]")
    private WebElement signupPageTitle;

    @FindBy(xpath = "//button[contains(text(), 'Sign up')]")
    private WebElement signupButton;

    public boolean validateSignupTitle() {
        return signupPageTitle.isDisplayed();
    }

    public boolean validateSignInButton() {
        return signInButton.isDisplayed();
    }

    public void setRegisterInputValues(int index, String value) {
        WebElement inputField = driver.findElement(By.xpath("//div[@class='relative'][" + index + "]/input"));
        inputField.sendKeys(value);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickSignUpButton() {
        signupButton.click();
    }

    public boolean validateLoginTitle() {
        return loginPageTitle.isDisplayed();
    }

    public void clickSignUpText() {
        signUpText.click();
    }

    private boolean validateErrorMessageElementisFound(String value) {
        try {
            driver.findElement(By.xpath("//span[contains(text(), '" + value + "')]"));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean validateErrorMessageisDisplayed(String value) {
        if (validateErrorMessageElementisFound(value)) {
            WebElement errorElement = driver.findElement(By.xpath("//span[contains(text(), '" + value + "')]"));
            return errorElement.isDisplayed();
        } else {
            return false;
        }
    }
}
