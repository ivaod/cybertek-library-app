package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "inputEmail")
    public WebElement emailAddressButton;

    @FindBy(id = "inputPassword")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signInButton;



    @FindBy(xpath = "//h2[text()='5576']")
    public WebElement userCount;

    @FindBy(xpath = "//span[.='Users']/..//i")
    public WebElement userButton;


    @FindBy(xpath = "//div[@id='tbl_users_wrapper']//select/option")
    public WebElement getDefaultValue1;


    public WebElement nameButton (String text){
        String locator= "//span[text()=\""+text+"\"]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    /*
    Login method that logs in with specific username
     */
    public void login1(){
        emailAddressButton.sendKeys("username");
        passwordButton.sendKeys("password");
        signInButton.click();
    }

    /*
    Login with admin
     */
    public void loginWithAdmin(){
        emailAddressButton.sendKeys("admin");
        passwordButton.sendKeys("password");
        signInButton.click();
    }

    public void loginWithConfig(){
        emailAddressButton.sendKeys(ConfigurationReader.getProperty("username"));
        passwordButton.sendKeys(ConfigurationReader.getProperty("password"));
        signInButton.click();
    }

    public void login(String username, String password){
        emailAddressButton.sendKeys(username);
        passwordButton.sendKeys(password);
        signInButton.click();
    }





    public static void login(){
        String url = ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);

    }


    public static void signOut(){

        Driver.getDriver().findElement(By.xpath("//a[@id='navbarDropdown']")).click();
        Driver.getDriver().findElement(By.xpath("//a[text()='Log Out']")).click();
    }



}
