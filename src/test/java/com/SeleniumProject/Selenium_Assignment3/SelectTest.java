package com.SeleniumProject.Selenium_Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectTest extends BaseClass{
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = BaseClass.GetDriver();
        Thread.sleep(1000);
        Select select=new Select(driver.findElement(By.name("country")));
        select.selectByIndex(2);
        Thread.sleep(1000);
        select.selectByValue("ANTARCTICA");
        Thread.sleep(1000);
        select.selectByVisibleText("BASSA DE INDIA");
        Thread.sleep(1000);
        List<WebElement> webElements=select.getOptions();
        for(WebElement webElement: webElements){
            System.out.println(webElement.getAttribute("value")+" "+ webElement.getText());

        }
        driver.navigate().to("https://demoqa.com/select-menu");
        //
        Select select_new= new Select(driver.findElement(By.id("cars")));
        select_new.selectByIndex(1);
        select_new.selectByIndex(2);
        Thread.sleep(1000);
        //

        driver.quit();





        }

        }

