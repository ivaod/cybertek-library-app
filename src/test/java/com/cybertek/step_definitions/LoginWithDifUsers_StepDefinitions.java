package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithDifUsers_StepDefinitions {
    LoginPage loginPage;


    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {

        loginPage = new LoginPage();
        loginPage.emailAddressButton.sendKeys(string);
        loginPage.passwordButton.sendKeys(string2);
        loginPage.signInButton.click();
    }
    @Then("account holder1 name should be {string}")
    public void account_holder1_name_should_be(String string) {

        String expectedName = string;
        String actualName= loginPage.nameButton(string).getText();
        Assert.assertEquals(expectedName, actualName);
        System.out.println(string + " = " + loginPage.nameButton(string).getText());
        LoginPage.signOut();
    }

}
