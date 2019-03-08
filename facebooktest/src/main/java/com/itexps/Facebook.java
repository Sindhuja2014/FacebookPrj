/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Rajkumar
 */
public class Facebook {
    public static void main(String args[]) throws Exception{
        System.setProperty("webdriver.gecko.driver","c:\\data\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("sija_r@yahoo.co.in");
        driver.findElement(By.id("pass")).sendKeys("Sija@#2014");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep (5000);
        driver.close();
        
        
    }
    
}
