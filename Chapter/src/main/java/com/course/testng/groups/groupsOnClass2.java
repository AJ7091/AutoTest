package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupsOnClass2 {
    public void stu1(){
        System.out.println("stu1 of GroupsOnClass2 is running");
    }
    public void stu2(){
        System.out.println("stu2 of GroupsOnClass2 is running");
    }
}
