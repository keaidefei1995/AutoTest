package com.course.testing;

import org.testng.annotations.Test;

public class ExpectedException {
//    传入某些不合法的参数:程序抛出了异常
//    测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是个失败的异常测试");
    }
    //    测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucess(){
        System.out.println("这是个成功的异常测试");
        throw new RuntimeException();
    }
}
