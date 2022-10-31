package com.SeleniumProject.Selenium_Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractingWebElement extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BaseClass.GetDriver();
        WebElement web_element=driver.findElement(By.name("firstName"));
        web_element.click();
        web_element.sendKeys("Lorem");
        Thread.sleep(1000);

        WebElement uploadbutton=driver.findElement(By.name("submit"));
        uploadbutton.submit();


        driver.quit();


    }



}
