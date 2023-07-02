package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LogoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogoutSteps {

    final private WebDriver driver;

    public LogoutSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @And("^User click logout menu$")
    public void userClickLogoutMenu() {
        LogoutPage logout = new LogoutPage(driver);
        logout.clickLogoutBtn();
    }

    @Then("^User still on home page$")
    public void userStillOnHomePage() throws InterruptedException {
        LogoutPage logout = new LogoutPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(logout.validateHomePage());
    }

    @And("^User click Yes on pop up$")
    public void userClickYesOnPopUp() throws InterruptedException {
        LogoutPage logout = new LogoutPage(driver);
        Thread.sleep(4000);
        logout.clickYesPopupBtn();
    }

    @And("^User click No on pop up$")
    public void userClickNoOnPopUp() throws InterruptedException {
        LogoutPage logout = new LogoutPage(driver);
        Thread.sleep(4000);
        logout.clickNoPopupBtn();
    }
}
