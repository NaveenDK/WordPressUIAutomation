package com.wordpress.domain;

import com.wordpress.pages.LoginPage;

/**
 * Created by Naveen on 9/8/2017.
 */
public class Login {
 LoginPage login = new LoginPage();

    public void loadPage(String url){
       login.loadPage(url);

    }

    public void login (String username,String password){
       login.enterUsername(username);
       login.enterPassword(password);
       login.clickSubmit();
    }

}
