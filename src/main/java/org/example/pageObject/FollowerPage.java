package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowerPage {

    public static WebDriver driver;

    public FollowerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        FollowerPage.driver = driver;
    }

    @FindBy(css = ".grid-cols-2 > p:nth-of-type(1)")
    private WebElement followerText;

    @FindBy(css = ".grid-cols-2 > p:nth-of-type(2)")
    private WebElement followingText;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement followerPageTitle;

    @FindBy(xpath = "//button[@class=' col-span-2 w-3/4 lg:w-1/2 place-self-end bg-secondary rounded-md h-8 text-white']")
    private WebElement followBackBtn;

    @FindBy(xpath = "//button[@class=' col-span-2 w-3/4 lg:w-1/2 place-self-end bg-red-600 rounded-md h-8 text-white']")
    private WebElement unfollowBtn;

    @FindBy(xpath = "//button[@class=' col-span-2 w-3/4 lg:w-1/2 place-self-end bg-white border-2 border-black rounded-md h-8 text-black']")
    private WebElement friendBtn;

    public void clickFollowerText() {
        followerText.click();
    }

    public boolean validateFollowerPage() {
        return followerPageTitle.isDisplayed();
    }

    public void clickFollowBackBtn() {
        followBackBtn.click();
    }

    public boolean validateFriendButton() {
        return friendBtn.getText().equalsIgnoreCase("friend");
    }

    public void clickFollowingText() {
        followingText.click();
    }

    public void clickUnfollowBtn() {
        unfollowBtn.click();
    }

    private boolean validateUserFollowingStillExist() {
        try {
            driver.findElement(By.xpath("//div[@class='grid grid-cols-5 my-5 items-center']"));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean validateUserFollowing() {
        if (validateUserFollowingStillExist()) {
            WebElement userFollowing = driver.findElement(By.xpath("//div[@class='grid grid-cols-5 my-5 items-center']"));
            return userFollowing.isDisplayed();
        } else {
            return false;
        }
    }
}
