package com.wordpress.tests;

import com.wordpress.common.Constants;
import com.wordpress.domain.AddRecoveryEmail;
import com.wordpress.domain.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Naveen on 9/8/2017.
 */
public class TestAddRecoveryEmail {
    Login login = new Login();
    AddRecoveryEmail addRecoveryEmail = new AddRecoveryEmail();

    @BeforeClass
    public void initClass(){
        login = new Login();
        login.loadPage(Constants.URL);
        login.login(Constants.USERNAME,Constants.PASSWORD);
    }
    @Test
    public void testAddingCorrectRecoveryEmail() {
        addRecoveryEmail.clickProfilePic();
        addRecoveryEmail.clickSecurity();
        addRecoveryEmail.clickRecovery();
        addRecoveryEmail.clickEdit();
        addRecoveryEmail.enterEmail();
        addRecoveryEmail.saveEmail();
        Assert.assertEquals(addRecoveryEmail.getSuccessMessage(),"Successfully updated. Please check your mailbox for the validation email.");


    }
}