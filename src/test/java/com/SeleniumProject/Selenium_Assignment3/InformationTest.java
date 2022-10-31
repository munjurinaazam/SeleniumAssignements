package com.SeleniumProject.Selenium_Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InformationTest{
    public static <webelement> void main(String[] args) throws InterruptedException{
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement webelement= driver.findElement(By.className("title"));
        System.out.println("isDisplayed:"+webelement.isDisplayed());
        System.out.println("isDisplayed:"+webelement.getTagName());
        System.out.println("isDisplayed:"+webelement.getRect().getX()+ " " + webelement.getRect().getY());
        System.out.println("Get CSS Value:"+webelement.getCssValue("font-size"));
        System.out.println("Get CSS Value:"+webelement.getCssValue("color"));
        System.out.println("Get CSS Value:"+webelement.getCssValue("width"));
        System.out.println("Text Content: "+webelement.getText());
        WebElement Element1= driver.findElement(By.id("customerForm"));
        System.out.println("Attributes:"+ Element1.getAttribute("action"));
        Thread.sleep(1000);


}
}