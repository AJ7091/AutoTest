package com.course.testng;

import org.testng.annotations.Test;

public class IgnorTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 is running");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 is running");
    }
    @Test
    public void ignore3(){
        System.out.println("ignore3 is running");
    }
}
