package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCaseTest {

    @Test(priority = 4)
    public void test1(){
        System.out.println("Test Cases 1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test Cases 2");
    }
    @Test(priority = 3)
    public void test3(){
        System.out.println("Test Cases 3");
    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("Test Cases 4");
    }
}

