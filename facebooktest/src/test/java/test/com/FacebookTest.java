/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Rajkumar
 */
public class FacebookTest {
    
    public FacebookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
      public void testFacebook() throws Exception{
          
     
        System.setProperty("webdriver.gecko.driver","c:\\data\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("sija_r@yahoo.co.in");
        driver.findElement(By.id("pass")).sendKeys("Sija@#2014");
        
        driver.findElement(By.id("u_0_2")).click();
        try{
            assertEquals("Facebook",driver.getTitle());
            System.out.println("Login is successful");
        
        }catch(Throwable e){
                
            System.out.println("Login not successful");
        }
        Thread.sleep (5000);
        driver.close();
    
        
    }
}

