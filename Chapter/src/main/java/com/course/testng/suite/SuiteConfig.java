package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforSite(){
        System.out.println("before suite is running");
    }
    @AfterSuite
    public void afterSite(){
        System.out.println("after suite is running");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("after test");
    }
}
