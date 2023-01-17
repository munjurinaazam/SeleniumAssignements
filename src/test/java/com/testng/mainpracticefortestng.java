package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class mainpracticefortestng {
   @Test
    public void UploadFileShouldSuccess() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(30)));
        String imagePath = System.getProperty("user.dir") + "/src/test/resources/pexels-alexgtacar-1592384.jpg";
        System.out.println(imagePath);
        driver.findElement(By.id("file-upload")).sendKeys("imagePath");
        Thread.sleep(1000);
        driver.findElements(By.id("file-submit"));
        Thread.sleep(1000);

    }
}
