package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候会用到测试异常
     * 在我们期望结果为某一个异常的时候
     * 比如：传入某些不合法的参数，程序抛出了异常
     * 也就是说我的预期结果就是这个异常
     */

// This is a Exception Test failed to run
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("This is a Exception Test failed to run");
    }
//  This is a Exception Test successful to run
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("This is a Exception Test successful to run");
        throw new RuntimeException();
    }
}
