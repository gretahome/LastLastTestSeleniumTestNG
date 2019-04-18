package com.Test.com.Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLaunch {

    @Parameters ({"env","browser","name","pwd"})
    @BeforeSuite
    public  WebDriver paramerTest(String env,String name,String pwd,String browser){

        WebDriver driver = null;
        String URLLink = "http://www.baidu.com";
        System.out.println("ENV：" + env +"Browser - " + browser+ "_username： " +name + "_password： " + pwd);
        if ( browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\\\Libs\\\\chromedriver.exe");
            driver  = new ChromeDriver();
            System.out.println(browser);
            return  driver;
        }
        else if(browser.equals("firefox")){
           // driver = new FirefoxDriver();
            System.out.println(browser);
            return  driver;
        }
        return driver;
    }

}
