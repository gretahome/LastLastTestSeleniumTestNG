package com.Test;

import com.Test.com.Resource.BrowserLaunch;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Parameters({"env","name","pwd"})
    @Test
    public  void paramerTest(String env,String name,String pwd){

        System.out.println("ENV：" + env + "_username： " +name + "_password： " + pwd);
        BrowserLaunch initDriver = new BrowserLaunch();


    }
}
