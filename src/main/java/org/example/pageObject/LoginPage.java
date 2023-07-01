package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LoginPage.driver = driver;
    }

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//button[@class='font-bold hidden sm:flex sm:text-sm lg:font-semibold lg:text-4xl']")
    private WebElement homePageTitle;

    public void setLoginInputFields(int index, String value) {
        WebElement inputField = driver.findElement(By.xpath("//form//div[@class='relative'][" + index + "]/input"));
        inputField.sendKeys(value);
    }

    public void clickLoginButton() {
        loginBtn.click();
    }

    public boolean validateHomePageTitle() {
        return homePageTitle.isDisplayed();
    }
}
