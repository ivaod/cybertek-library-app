package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.UsersPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class UserFeature_StepDefinitions {

    LoginPage loginPage;
    UsersPage usersPage;
    Select actualOptions;


    @When("I click on {string} link")
    public void iClickOnLink(String arg0) {

        loginPage = new LoginPage();
        usersPage = new UsersPage();

        usersPage.pressUsersButton(arg0).click();

    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {


        usersPage.defaultValue.click();

        actualOptions = new Select(usersPage.defaultValue);

        String expectedValue = String.valueOf(int1);
        String actualValue = actualOptions.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedValue, actualValue);


    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedOptions) {


        actualOptions = new Select(usersPage.defaultValue);

        for (int j = 0; j < expectedOptions.size(); j++) {

            actualOptions.selectByValue(expectedOptions.get(j));

            Assert.assertTrue(usersPage.allOptions().equals(expectedOptions));

        }
    }
      @Then("table should have following column names:")
        public void tableShouldHaveFollowingColumnNames (List<String> expectedColumnName) {

            loginPage.userButton.click();

            List<String> actualColumnName = usersPage.columnsNames();

            Assert.assertTrue(actualColumnName.equals(expectedColumnName));
        }
    }




       /*wait.until(ExpectedConditions.visibilityOf(usersPage.showRecordsOption));
               Assert.assertTrue(usersPage.allColumns().equals(expectedColumns));
               }*/


     /*for (int i = 0; i < columnNames.size(); i++) {

              System.out.println(usersPage.tabUsers(columnNames.get(i)).toString());
           }*/

// List<WebElement> webElements = usersPage.tabUsers(columnNames);

// List<String> namesList = new ArrayList<>();


//Assert.assertTrue(columnNames.contains(namesList));
// boolean flag = new UsersPage().tabUsers(columnNames.);

     /* actualOptions = new Select(loginPage.defaultValue);
            for(int i =0; i < expectedOptions.size(); i++ ){
                actualOptions.selectByValue(expectedOptions.get(i));



            }
            Assert.assertEquals(expectedOptions, actualOptions);
            BrowserUtils.sleep(2);
           // System.out.println(loginPage.defaultValue.getText());*/




