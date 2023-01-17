package com.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class Assignment_1_testng {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @BeforeClass
    public void beforeClassTest(){
        System.out.println("Before Class");
    }

   @Test
    public void Add_Two_Number(){
        int sum=10+15;
        System.out.println("Test 1");
        Assert.assertEquals(29,29);
    }
    @Test(groups = "smoke")
    public void Add_Two_Number1(){
        int sum=10+15;
        System.out.println("Test 2");
        Assert.assertEquals(10,25);


    }
    @Test(groups = "smoke")
    public void Add_Two_Number2(){
        int sum=10+15;
        System.out.println("Test 3");
        Assert.assertEquals(25,25);


    }
    @Test
    public void Add_Two_Number4(){
        int sum=10+15;
        System.out.println("Test 4");
        Assert.assertEquals(sum,25);


    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClassTest(){
        System.out.println("After Class");
    }




}
