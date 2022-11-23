package com.SeleniumProject.Assignment04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WindowsorTabTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/browser-windows");
        String originalwindow=driver.getWindowHandle();

          driver.switchTo().newWindow(WindowType.TAB);
          driver.get("https://demoqa.com/sample");
          System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(originalwindow);
        System.out.println("knowledge");
        Thread.sleep(3000);
       System.out.println(driver.findElement(By.className("main-header")).getText());
        driver.quit();
    }


}
