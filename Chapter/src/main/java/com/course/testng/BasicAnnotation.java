package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("This is the first case");
    }
    @Test
    public void testCase2(){
        System.out.println("This is the second case");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("这是在方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSiute(){
        System.out.println("这是运行在Suite之前的方法");
    }
    @AfterSuite
    public void AfterSiute(){
        System.out.println("这是运行在Suite之后的方法");
    }
}
