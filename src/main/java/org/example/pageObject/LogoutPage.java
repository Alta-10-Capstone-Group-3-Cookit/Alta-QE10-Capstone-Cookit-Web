package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public static WebDriver driver;

    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LogoutPage.driver = driver;
    }

    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']/ul/li[3]")
    private WebElement logoutBtn;

    @FindBy(xpath = "//div[@class='swal2-actions']/button[contains(text(), 'Yes')]")
    private WebElement yesPopupBtn;

    @FindBy(xpath = "//button[@class='font-bold hidden sm:flex sm:text-sm lg:font-semibold lg:text-4xl']")
    private WebElement homePageTitle;

    @FindBy(xpath = "//div[@class='swal2-actions']/button[@Class='swal2-cancel swal2-styled swal2-default-outline']")
    private WebElement noPopupBtn;

    public void clickLogoutBtn() {
        logoutBtn.click();
    }

    public void clickYesPopupBtn() {
        yesPopupBtn.click();
    }

    public void clickNoPopupBtn() {
        noPopupBtn.click();
    }

    public boolean validateHomePage() {
        return homePageTitle.isDisplayed();
    }
}
