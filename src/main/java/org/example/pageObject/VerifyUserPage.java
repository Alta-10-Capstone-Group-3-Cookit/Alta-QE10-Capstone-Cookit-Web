package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUserPage {

    public static WebDriver driver;

    public static String userName;

    public VerifyUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        VerifyUserPage.driver = driver;
    }

    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']/ul/li[4]/a")
    private WebElement menuListVerifyUser;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement verifyUserPageTitle;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p")
    private WebElement firstUserNameOnList;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//button")
    private WebElement checklistButton;

    private void setUserName() {
        VerifyUserPage.userName = firstUserNameOnList.getText();
    }

    public void clickMenuListVerifyUser() {
        menuListVerifyUser.click();
    }

    public boolean validateVerifyUsersPage() {
        setUserName();
        return verifyUserPageTitle.isDisplayed();
    }

    public void clickChecklistBtn() {
        checklistButton.click();
    }

    public boolean validateFirstUserName() {
        return firstUserNameOnList.getText().equalsIgnoreCase(VerifyUserPage.userName);
    }
}
