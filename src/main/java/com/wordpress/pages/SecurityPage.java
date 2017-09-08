package com.wordpress.pages;

import com.wordpress.domain.Login;
import org.openqa.selenium.By;

import java.util.UUID;

/**
 * Created by Naveen on 9/8/2017.
 */
public class SecurityPage extends LoginPage{
    private By accountRecoveryOption=   By.xpath("//*[text()='Account Recovery']");
    private By editEmail= By.xpath("//*[text()='Edit']");
    private By txtEmail= By.xpath("//input[@name='recovery-email']");
    private By btnSave= By.xpath("//*[text()='Save Email']");
    private By popupText= By.xpath("//*[@id='notices']/div/span[1]/span");



    public void clickAccountRecovery(){
        driver.findElement(accountRecoveryOption).click();
    }
    public void editEmail(){
        driver.findElement(editEmail).click();
    }
    public void enterEmail(){
        String name= UUID.randomUUID().toString();
        driver.findElement(txtEmail).clear();
        driver.findElement(txtEmail).sendKeys(name+"recover@email.com");
    }
    public void saveEmail(){
        driver.findElement(btnSave).click();
    }
    public String getPopuptext(){
       String noteText;

      noteText=  driver.findElement(popupText).getText();
      return noteText;
    }
}
