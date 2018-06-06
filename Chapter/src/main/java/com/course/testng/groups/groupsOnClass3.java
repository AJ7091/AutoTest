package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class groupsOnClass3 {
    public void teacher1(){
        System.out.println("teacher1 of GroupsOnClass3 is running");
    }
    public void stu2(){
        System.out.println("teacher2 of GroupsOnClass3 is running");
    }
}
