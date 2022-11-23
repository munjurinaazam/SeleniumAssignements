package com.SeleniumProject.Selenium_Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver GetDriver() {

        {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.guru99.com/test/newtours/register.php");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            return driver;


        }
    }
}
