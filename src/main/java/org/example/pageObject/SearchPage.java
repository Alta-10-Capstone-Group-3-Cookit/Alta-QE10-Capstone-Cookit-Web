package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public static WebDriver driver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        SearchPage.driver = driver;
    }

    @FindBy(xpath = "//input[@placeholder='Search Cookit']")
    private WebElement SearchField;

    @FindBy(xpath = "//button[.='Recipes']")
    private WebElement SearchRecipeBtn;

    @FindBy(xpath = "//button[.='People']")
    private WebElement SearchPeopleBtn;

    @FindBy(xpath = "//p[.='Recook Burger Kepiting']")
    private WebElement RecipeName;
    @FindBy(xpath = "//div[.='Naufal1']")
    private WebElement UserName;

    public void clickSearchField() {
        SearchField.click();
    }

    public void clickSearchRecipeButton() {
        SearchRecipeBtn.click();
    }

    public void setSearchInputFields(String value) throws InterruptedException {
        WebElement inputSearchField = driver.findElement(By.xpath("//input[@placeholder='Search Cookit']"));
        inputSearchField.sendKeys(value);
        Thread.sleep(3000);
        inputSearchField.sendKeys(Keys.ENTER);
    }
    public String verifyRecipeName(){
        return RecipeName.getText();
    }
    public void clickSearchPeopleButton() {
        SearchPeopleBtn.click();
    }
    public String verifyUserName(){
        return UserName.getText().toLowerCase();
    }
}
