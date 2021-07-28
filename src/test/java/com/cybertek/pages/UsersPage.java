package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UsersPage {
    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='tbl_users_wrapper']//select")
    public WebElement defaultValue;

    public List<String> allOptions() {

        List<String> selectOptions = new ArrayList<>();

        Select select = new Select(defaultValue);

        for (WebElement eachOption : select.getOptions()) {
            selectOptions.add(eachOption.getText());
        }

        return selectOptions;
    }

    public List<String> columnsNames(){
        List<String>textOfColumns=new ArrayList<>();
        List <WebElement>allColumns=Driver.getDriver().findElements(By.xpath("//tr[@role='row']/th"));
        for(WebElement eachColumn:allColumns){
            textOfColumns.add(eachColumn.getText());
        }
        return textOfColumns;
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

        return Driver.getDriver().findElement(By.xpath(locator));
    }

}
