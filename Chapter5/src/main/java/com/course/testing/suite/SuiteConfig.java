package com.course.testing.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite运行啦");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("After Suite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
