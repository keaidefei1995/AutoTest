package com.course.testing.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法一");
}
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法二");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法1");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法2");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的服务端方法");
    }
    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这是服务端组运行之后的服务端方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前的客户端方法");
    }
    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这是客户端端组运行之后的客户端方法");
    }
}
