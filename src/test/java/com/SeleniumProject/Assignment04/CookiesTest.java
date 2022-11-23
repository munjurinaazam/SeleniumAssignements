package com.SeleniumProject.Assignment04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://parabank.parasoft.com/");
        driver.manage().addCookie(new Cookie("Learner", "6544535"));
        driver.manage().addCookie(new Cookie("Explorer", "Explorer3234345"));
        driver.manage().addCookie(new Cookie("new role", "Explorer243254634"));
        System.out.println("---------------------------");
        System.out.println(driver.manage().getCookieNamed("Explorer"));
        System.out.println("Get"+driver.manage().getCookieNamed("Explorer"));
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println("---------------------------");
        for(Cookie cookie:cookies){
            System.out.println(driver.manage().getCookieNamed(cookie.getName()));
        }
        System.out.println("---------------------------");
        driver.manage().deleteCookieNamed("Explorer");
        for(Cookie cookie:cookies){
            System.out.println(driver.manage().getCookieNamed(cookie.getName()));
        }
        System.out.println("---------------------------");
        driver.manage().deleteAllCookies();
        System.out.println("---------------------------");
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());

        driver.quit();


    }
}
