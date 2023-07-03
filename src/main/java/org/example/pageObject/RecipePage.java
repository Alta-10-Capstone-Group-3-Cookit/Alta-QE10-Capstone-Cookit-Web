package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipePage {

    public static WebDriver driver;

    public RecipePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        RecipePage.driver = driver;
    }

    @FindBy(xpath = "//div[@class='flex gap-1']/button[.='0']")
    private WebElement LikeIconBtn;

    @FindBy(xpath = "//button[.='1']")
    private WebElement UnkikeIconBtn;

    @FindBy(xpath = "//div[@class='flex items-center font-bold']/button[@class='btn rounded-r-lg rounded-l-none text-primary text-2xl']")
    private WebElement PlusServingBtn;

    @FindBy(xpath = "//div[@class='flex items-center font-bold']/button[@class='btn rounded-l-lg rounded-r-none text-primary text-2xl']")
    private WebElement MinusServingBtn;

    @FindBy(xpath = "//button[.='Add to Cart']")
    private WebElement AddToCartBtn;

    @FindBy(xpath = "//textarea[@placeholder='Add your comment']")
    private WebElement CommentField;

    @FindBy(xpath = "//button[.='Submit']")
    private WebElement SubmitCommentBtn;

    @FindBy(xpath = "//label[@class='flex items-center gap-1 hover:text-accent hover:cursor-pointer']")
    private WebElement ThreeDotsBtn;

    @FindBy(xpath = "//p[.='Reply']")
    private WebElement ReplyCookBtn;

    @FindBy(xpath = "//p[.='Recook']")
    private WebElement RecookBtn;

    @FindBy(xpath = "//button[.='Recook Recipe']")
    private WebElement RecookPageTitle;

    @FindBy(xpath = "//button[.='Reply to']")
    private WebElement ReplyPageTitle;

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement DescribeReplyField;

    @FindBy(xpath = "//label[@class='btn btn-secondary  w-full sm:w-20 sm:btn-sm flex gap-2']")
    private WebElement AddImageBtn;

    @FindBy(xpath = "//div[@class='flex justify-between w-full flex-col sm:flex-row gap-2']//input")
    private WebElement InputImageBtn;

    @FindBy(xpath = "//button[.='Submit']")
    private WebElement SubmitReplyBtn;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement RecookRecipeNameField;

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement RecookDescriptionField;

    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[@class='input py-2 input-primary col-span-5']")
    private WebElement Ingredient3NameField;

    @FindBy(xpath = "//input[@value='0']")
    private WebElement Ingredient3QtyField;

    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[3]")
    private WebElement Ingredient3UnitField;

    public void clickLikeIconBtn() {
        LikeIconBtn.click();
    }

    public void clickUnlLikeIconBtn() {
        UnkikeIconBtn.click();
    }

    public void clickPlusServingBtn() {
        PlusServingBtn.click();
    }

    public void clickMinusServingBtn() {
        MinusServingBtn.click();
    }

    public void clickAddToCartBtn() {
        AddToCartBtn.click();
    }

    public void scrollToComment() {
        Actions actions = new Actions(driver);
        actions.scrollToElement(SubmitCommentBtn).perform();
    }

    public void inputComment(String comment) {
        CommentField.click();
        CommentField.sendKeys(comment);

    }

    public void clickSubmitButton() {
        SubmitCommentBtn.click();
    }

    public boolean validateComment(String comment) throws InterruptedException {
        WebElement verifyComment = driver.findElement(By.xpath("//p[.='" + comment + "']"));

        Actions actions = new Actions(driver);
        actions.scrollToElement(verifyComment).perform();

        Thread.sleep(2000);

        return verifyComment.isDisplayed();

    }

    public void clickThreeDotsButton() {
        ThreeDotsBtn.click();
    }

    public void clickRecookButton() {
        RecookBtn.click();
    }

    public void clickReplyButton() {
        ReplyCookBtn.click();
    }

    public boolean verifyRecookPage() {
        return RecookPageTitle.isDisplayed();
    }

    public boolean verifyReplyPage() {
        return ReplyPageTitle.isDisplayed();
    }

    public void inputDescribeReply(String describe) {
        DescribeReplyField.click();
        DescribeReplyField.sendKeys(describe);
    }

    public void uploadImage(String image) {
        String path = System.getProperty("user.dir") + "/src/test/resources/assets/" + image;
        AddImageBtn.click();
        AddImageBtn.sendKeys();
    }

    public void clickSubmitReplyButton() {
        SubmitReplyBtn.click();
    }

    public void inputRecookName(String name) {
        RecookRecipeNameField.clear();
        RecookRecipeNameField.sendKeys(name);
    }

    public void inputRecookDescription(String name) {
        RecookDescriptionField.click();
        RecookDescriptionField.clear();
        RecookDescriptionField.sendKeys(name);
    }

    public void inputRecookIngredient(String ingName, String ingQty, String ingUnit) {
        Actions actions = new Actions(driver);
        actions.scrollToElement(Ingredient3UnitField).perform();

        Ingredient3NameField.click();
        Ingredient3NameField.sendKeys(ingName);
        Ingredient3QtyField.click();
        Ingredient3QtyField.sendKeys(ingQty);
        Ingredient3UnitField.click();
        Ingredient3UnitField.sendKeys(ingUnit);
    }
}