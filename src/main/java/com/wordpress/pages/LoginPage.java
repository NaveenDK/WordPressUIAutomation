package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Naveen on 9/8/2017.
 */
public class LoginPage
{

    static WebDriver driver; // this driver variable will not be available if it is not specified as static and a nullPoint exception will occur when extending this class from the other pages
    private By username = By.xpath("//input[@id='usernameOrEmail'] ");
    private By password= By.xpath("//input[@type='password'] "); //RveJvd snByac
    private By btnLogin=By.xpath("//button[@type='submit']");


    public void loadPage(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");//????????????????????/
        driver= new ChromeDriver();
        driver.navigate().to(url);

    }


    public void enterUsername(String usernameString){
        driver.findElement(username).sendKeys(usernameString);
    }
    public void enterPassword( String passwordString){ driver.findElement(password).sendKeys(passwordString);}
    public void clickSubmit (){ driver.findElement(btnLogin).click();}
}
