package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
   Creating the private constructor so this classes object is not reachable from outside
    */
    private Driver(){}

    /*
    Making our driver's instance private so it is not reachable from outside of the class
    We make it static, because we want it to run before everything else,
    and also we will use it in a static method
     */
    private static WebDriver driver;
    //the webdriver is created here but instantiated in the getDriver method

    /*
    Creating re-usable utility method that will return same driver instance everytime we call it
     */
    public static WebDriver getDriver(){

        if(driver == null){
            /*
            We read our browser type from configuration.properties file using
            .getProperty method we creating in ConfigurationReader class
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type our switch statement will determine
            to open specific type of browser/driver
             */
            //browserType is the condition of what type of browser type we wanna create
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        /*
        Same driver instance will be returned everytime we call Driver.getDriver(); method
         */
        return driver;
    }

    /*This method makes sure we have some form of driver session
    or driver id has. Either null or not null it must exist
    It makes it null, so next time we set a driver is null again and can be set up with different driver
     */
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
