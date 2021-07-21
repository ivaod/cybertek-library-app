package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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

}
