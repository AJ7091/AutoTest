package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupsOnClass1 {
    @Test(groups = "server")
    public void test1(){
        System.out.println("This is method1 of server");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("This is method2 of server");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("This is method3 of client");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("This is method4 of client");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("This is method before server group is run");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("This is method after server group has been run");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("This is method before client group is run");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("This is method after client group has been run");
    }
}
