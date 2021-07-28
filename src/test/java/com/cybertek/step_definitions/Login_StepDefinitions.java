package com.cybertek.step_definitions;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login_StepDefinitions {

    LoginPage loginPage;


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        LoginPage.login();
    }

    @When("I enter username {string}")
    public void i_enter_username(String string) {
        loginPage = new LoginPage();
        loginPage.emailAddressButton.sendKeys(string);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        BrowserUtils.sleep(1);
        loginPage = new LoginPage();
        loginPage.passwordButton.sendKeys(arg0);
    }

    @When("click the sign button")
    public void click_the_sign_button() {

        loginPage.signInButton.click();
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        BrowserUtils.sleep(2);
        String expectedDashboard = "Library";
        String actualDisplay = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedDashboard, actualDisplay);
        System.out.println(expectedDashboard);
    }

    @And("there should be {string} users")
    public void thereShouldBeUsers(String arg0) {

        String expectedCount = arg0;
        String actualCount = loginPage.userCount.getText();
        System.out.println("Number of Users = " + actualCount);
        Assert.assertEquals(expectedCount, actualCount);
    }

    @When("User types {string} in the box")
    public void userTypesInTheBox(String arg0) {

        loginPage = new LoginPage();
        loginPage.emailAddressButton.sendKeys(arg0);
    }

    @Then("User enters {string} in the box")
    public void userEntersInTheBox(String arg0) {
        BrowserUtils.sleep(1);
        loginPage = new LoginPage();
        loginPage.passwordButton.sendKeys(arg0);
    }

    @Then("account holder name should be{string}")
    public void accountHolderNameShouldBe(String arg0) {
        loginPage = new LoginPage();
        System.out.println(loginPage.nameButton(arg0));

    }
}
   /* @And("there should {string} {string}")
    public void thereShould(String arg0, String arg1) {

        BrowserUtils.sleep(2);
        loginPage = new LoginPage();
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.userCount).perform();
        String expectedCount = arg0;
        String actualCount = loginPage.userCount.getText();
        System.out.println(actualCount);
        Assert.assertEquals(expectedCount, actualCount);
        System.out.println(expectedCount);
        BrowserUtils.sleep(2);
        String expectedTitle = arg1;
        String actualTile = loginPage.userTitle.getText();
        System.out.println(actualTile);
        LoginPage.signOut();

    }*/


 /*@And("there should be {int} users")
    public void thereShouldBeUsers(int arg0) {
        loginPage = new LoginPage();
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.userCount).perform();
        int expectedCount = arg0;
        String actualCount = loginPage.userCount.getText();
        Assert.assertEquals(expectedCount, actualCount);
    }*/

/**@When("I login using {string} and {string}")
public void iLoginUsingAnd(String arg0, String arg1) {
BrowserUtils.sleep(1);
loginPage = new LoginPage();
loginPage.emailAddressButton.sendKeys(arg0);
loginPage.passwordButton.sendKeys(arg1);
loginPage.signInButton.click();

}*/