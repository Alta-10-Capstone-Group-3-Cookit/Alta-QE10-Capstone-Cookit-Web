package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public static WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        ProfilePage.driver = driver;
    }

    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']")
    private WebElement profileMenu;

    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']//ul/li/a[contains(text(), 'Profile')]")
    private WebElement profileListMenu;

    @FindBy(xpath = "//button[contains(text(), 'Profile')]")
    private WebElement profilePageTitle;

    @FindBy(xpath = "//img[@class='inset-0 absolute w-3/4 md:w-32 h-3/4 md:h-32 object-cover rounded-full']")
    private WebElement profileImage;

    @FindBy(xpath = "//h1[@class='font-bold col-span-2 text-xl md:text-xl flex']")
    private WebElement profileName;

    @FindBy(xpath = "//p[.='1 Followers']")
    private WebElement followerText;

    @FindBy(xpath = "//p[.='0 Following']")
    private WebElement followingText;

    @FindBy(xpath = "//div[@class='flex justify-self-center']/button")
    private WebElement likeButton;

    @FindBy(xpath = "//div[@class='flex justify-self-end dropdown dropdown-end']")
    private WebElement threeDotsBtn;

    @FindBy(xpath = "//div[@class='flex justify-self-end dropdown dropdown-end']/ul/li[1]")
    private WebElement replyBtn;

    @FindBy(xpath = "//div[@class='flex justify-self-end dropdown dropdown-end']/ul/li[2]")
    private WebElement recookBtn;

    @FindBy(xpath = "//button[contains(text(), 'Reply to')]")
    private WebElement replyPageTitle;

    @FindBy(xpath = "//button[contains(text(), 'Recook Recipe')]")
    private WebElement recookPageTitle;

    public void clickProfileMenu() {
        profileMenu.click();
    }

    public void clickProfileListMenu() {
        profileListMenu.click();
    }

    public boolean validateProfilePage() {
        return profilePageTitle.isDisplayed();
    }

    public boolean validateUsername(String value) {
        return profileName.getText().equalsIgnoreCase(value);
    }

    public boolean validateProfileImageDisplayed() {
        return profileImage.isDisplayed();
    }

    public boolean validateFollowerIsDisplayed() {
        return followerText.isDisplayed();
    }

    public boolean validateFollowingIsDisplayed() {
        return followingText.isDisplayed();
    }

    public boolean validateLikeButtonIsDisplayed() {
        return likeButton.isDisplayed();
    }

    public boolean validateThreeDotsButtonIsDisplayed() {
        return threeDotsBtn.isDisplayed();
    }

    public void clickLikeBtn() {
        likeButton.click();
    }

    public boolean validateLikeNumber(String number) {
        return likeButton.getText().equalsIgnoreCase(number);
    }

    public void clickThreeDotsBtn() {
        threeDotsBtn.click();
    }

    public void clickReplyBtn() {
        replyBtn.click();
    }

    public void clickRecookBtn() {
        recookBtn.click();
    }

    public boolean validateRecookPage() {
        return recookPageTitle.isDisplayed();
    }

    public boolean validateReplyPage() {
        return replyPageTitle.isDisplayed();
    }
}
