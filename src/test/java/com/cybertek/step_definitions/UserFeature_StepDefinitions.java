package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class UserFeature_StepDefinitions {

    LoginPage loginPage;
    UsersPage usersPage;
    Select select;

    @When("I click on {string} link")
    public void iClickOnLink(String arg0) {

        loginPage = new LoginPage();
        usersPage = new UsersPage();

        usersPage.pressUsersButton(arg0).click();

    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {


        loginPage.defaultValue.click();

        select = new Select(loginPage.defaultValue);

        String expectedValue = String.valueOf(int1);
        String actualValue = select.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedValue, actualValue);

    }

     @Then("show records should have following options:")
        public void show_records_should_have_following_options(List<String> num){

            select = new Select(loginPage.defaultValue);
            for(int i =0; i < num.size(); i++ ){
                select.selectByValue(num.get(i));
            }
            System.out.println(num.toString());
    }

    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> columnNames) {

        loginPage.userButton.click();

        for(int i = 0; i < columnNames.size(); i ++){
            usersPage.tabUsers(columnNames.get(i));
        }
        System.out.println(columnNames.toString());
    }
}



