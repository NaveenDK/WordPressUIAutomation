package com.wordpress.pages;

import org.openqa.selenium.By;

/**
 * Created by Naveen on 9/8/2017.
 */
public class ProfilePage extends LoginPage
{

    private By securityOption= By.xpath("//a[@href='/me/security']");

    public void clickSecurity(){
        driver.findElement(securityOption).click();
    }

}
