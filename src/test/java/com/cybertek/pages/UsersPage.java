package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class UsersPage {
    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public WebElement tabUsers (String text){
        String locator= "//th[text()=\""+text+"\"]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public WebElement pressUsersButton (String text){
        String locator= "//span[text()=\""+text+"\"]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public WebElement nameButton (String text){
        String locator= "//span[text()=\""+text+"\"]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public WebElement optionsButton(String text) {
        String locator = "//option[text()=\"" + text + "\"]";
       // List<WebElement> name = Driver.getDriver().findElements(By.xpath(locator));
       // name.add(locator);
        return Driver.getDriver().findElement(By.xpath(locator));
       // return name;*/

        /*List<String> elemTexts = new ArrayList<>();
        for(WebElement each : list){
            elemTexts.add(each.getText());
        }
      return elemTexts;*/
    }

}
