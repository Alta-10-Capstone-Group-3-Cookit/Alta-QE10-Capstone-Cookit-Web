package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        HomePage.driver = driver;
    }

    @FindBy(xpath = "//button[.='Timeline']")
    private WebElement TimelineTabBtn;

    @FindBy(xpath = "//button[.='Recipes']")
    private WebElement RecipeTabBtn;

    @FindBy(xpath = "//a[@href='/search']")
    private WebElement SearchBtn;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//div[@class='flex justify-between items-center']/button[1]")
    private WebElement AddToCartBtn;

    @FindBy(xpath = "//div[@class='indicator']")
    private WebElement CartBtn;

    @FindBy(xpath = "//input[@placeholder='Search Cookit']")
    private WebElement SearchField;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-light text-neutral-500']")
    private WebElement TimelineTitle;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-light text-neutral-500']")
    private WebElement RecipeTabTitle;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement CartPageTitle;

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[@class='font-semibold text-primary hover:text-accent hover:cursor-pointer']")
    private WebElement RecipeName;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement RecipeHeader;

    public void clickTimelineTabButton() {
        TimelineTabBtn.click();
    }

    public void clickRecipeTabButton() {
        RecipeTabBtn.click();
    }

    public boolean validateTimelineTabTitle() {
        return TimelineTitle.isDisplayed();
    }

    public void clickRecipeName() {
        RecipeName.click();
    }

    public boolean validateRecipeTabTitle() {
        return RecipeTabTitle.isDisplayed();
    }

    public String getRecipeName(){
        return RecipeName.getText();
    }

    public boolean getRecipeNameHeader(){
        return RecipeHeader.isDisplayed();
    }

    public void clickSearchButton() {
        SearchBtn.click();
    }

    public boolean validateSearchPage() {
        return SearchField.isDisplayed();
    }

    public void clickAddToCartButton() {
        AddToCartBtn.click();
    }

    public void clickCartButton() {
        CartBtn.click();
    }

    public boolean validateCartPage() {
        return CartPageTitle.isDisplayed();
    }

}
