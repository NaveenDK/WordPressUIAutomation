package com.wordpress.tests;

import com.wordpress.common.Constants;
import com.wordpress.domain.Login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Naveen on 9/8/2017.
 */
public class TestLogin {

    Login login = new Login();

    @BeforeClass
    public void initClass(){
        login = new Login();
        login.loadPage(Constants.URL);

    }
    @Test
    public void testSuccessLogin(){
        login.login(Constants.USERNAME,Constants.PASSWORD);
    }
}
