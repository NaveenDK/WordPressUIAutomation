package com.wordpress.pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Naveen on 9/8/2017.
 */
public class WelcomePage extends LoginPage{

    private By profileImage=By.xpath("//a[@data-tip-target='me']");

    public void clickProfileImage(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(profileImage).click();
    }

}
