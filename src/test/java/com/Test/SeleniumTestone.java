package com.Test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class SeleniumTestone {

        WebDriver driver;
        String URLLink = "http://www.baidu.com";
        public static Log log = LogFactory.getLog(SeleniumTestone.class);

        @BeforeMethod
        public void setUp () {
            System.setProperty("webdriver.chrome.driver","C:\\\\Libs\\\\chromedriver.exe");
            driver  = new ChromeDriver();

        }

        @AfterMethod
        public void tearDown () {
            System.out.println("start excute quit driver");
            try{
                driver.quit();

            }catch ( Exception e ){
                System.out.println("driver quit error please check");


            }
            System.out.println("driver already quit");


        }

        @Test
        public void drivertest () {
            driver.get(URLLink);
            WebElement e = driver.findElement(By.name("wd"));
            e.sendKeys("maven testng");
            e.submit();
            try {
                driver.wait(2000);
                WebElement containerL = driver.findElement(By.id("content_left"));
                containerL.isDisplayed();

                Assert.assertNotNull( driver.findElement(By.partialLinkText("Maven")),"cannot loading any result");

            }catch(Exception el){

                log.info(el.getStackTrace());
            }

        }
        @Test
        public void linktest () {
            driver.get(URLLink);
            WebElement e = driver.findElement(By.id("kw"));
            e.sendKeys("7 rings");
            WebElement submitbutton = driver.findElement(By.id("su"));
            submitbutton.click();


        }
    }

