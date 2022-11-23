package com.SeleniumProject.Assignment04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Browser_JavascriptTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/alerts");
        //Alerts
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        //Confirmation Button
        WebElement confirm_button= driver.findElement(By.id("confirmButton"));
        confirm_button.click();
        Alert confirm_alert= driver.switchTo().alert();
        confirm_alert.dismiss();
        Thread.sleep(3000);
        confirm_button.click();
        System.out.println(confirm_alert.getText());
        confirm_alert.dismiss();
        //promotion
        WebElement promButton = driver.findElement(By.id("promtButton"));
        promButton.click();
        Alert prom_alert= driver.switchTo().alert();
        prom_alert.dismiss();
        Thread.sleep(3000);
        promButton.click();
        System.out.println(prom_alert.getText());
        prom_alert.sendKeys("Lorem Ipsum");
        prom_alert.accept();

//        //for quiting driver
        driver.quit();
    }
}
