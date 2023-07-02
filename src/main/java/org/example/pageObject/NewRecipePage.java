package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRecipePage {

    public static WebDriver driver;

    public NewRecipePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        NewRecipePage.driver = driver;
    }

    @FindBy(css = "button.gap-2")
    private WebElement newPostBtn;

    @FindBy(xpath = "//a[@href='/recipes/new']")
    private WebElement newRecipeBtn;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement newRecipePageTitle;

    @FindBy(xpath = "//form/div[1]/input")
    private WebElement recipeTitleInputField;

    @FindBy(xpath = "//form/div[2]/textarea")
    private WebElement descriptionInputField;

    @FindBy(xpath = "//form/div[3]//input")
    private WebElement imageUploadField;

    @FindBy(xpath = "//form/div[4]/div/button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement addIngredientBtn;

    @FindBy(xpath = "//form/div[5]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement addStepBtn;

    @FindBy(xpath = "//form/div[6]/input[@type='checkbox']")
    private WebElement sellCheckbox;

    @FindBy(xpath = "//form/div[7]/input[@type='number']")
    private WebElement priceInputField;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    private WebElement submitBtn;

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement recipePageTitle;

    @FindBy(xpath = "//h1/p[@class='flex']")
    private WebElement recipeTitle;

    @FindBy(xpath = "//div[@class='flex flex-col gap-5 border-2 border-primary mt-1 px-2 pb-2']/p[2]/span[@class='text-primary']")
    private WebElement price;

    public void clickNewPostBtn() {
        newPostBtn.click();
    }

    public void clickNewRecipeBtn() {
        newRecipeBtn.click();
    }

    public boolean validateNewRecipePage() {
        return newRecipePageTitle.isDisplayed();
    }

    public void insertRecipeTitle(String value) {
        recipeTitleInputField.sendKeys(value);
    }

    public void insertRecipeDescription(String value) {
        descriptionInputField.sendKeys(value);
    }

    public void uploadRecipeImage(String image) {
        String path = System.getProperty("user.dir") + "/src/test/resources/assets/" + image;
        imageUploadField.sendKeys(path);
    }

    public void clickAddIngredientBtn() {
        addIngredientBtn.click();
    }

    public void insertFirstIngredient(int index, String value) {
        WebElement ingredientField = driver.findElement(By.xpath("//form/div[4]/div[2]/input[" + index + "]"));
        ingredientField.sendKeys(value);
    }

    public void insertSecondIngredient(int index, String value) {
        WebElement ingredientField = driver.findElement(By.xpath("//form/div[4]/div[3]/input[" + index + "]"));
        ingredientField.sendKeys(value);
    }

    public void clickAddStepBtn() {
        addStepBtn.click();
    }

    public void insertStep(int index, String value) {
        WebElement stepField = driver.findElement(By.xpath("//form/div[5]/div[" + (index + 1) + "]/textarea"));
        stepField.sendKeys(value);
    }

    public void clickSellCheckbox() {
        sellCheckbox.click();
    }

    public void inputPrice(String value) {
        priceInputField.clear();
        priceInputField.sendKeys(value);
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public boolean validateRecipePage() {
        return recipePageTitle.isDisplayed();
    }

    public boolean validateRecipeTitle(String value) {
        return recipeTitle.getText().equalsIgnoreCase(value);
    }

    public boolean validatePrice(String value) {
        String[] prices = price.getText().split(" ");
        String price = prices[1];
        String cleanPrice = price.replace(".", "");
        return cleanPrice.equalsIgnoreCase(value);
    }
}
