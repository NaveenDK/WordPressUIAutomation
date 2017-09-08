package com.wordpress.domain;

import com.wordpress.pages.ProfilePage;
import com.wordpress.pages.SecurityPage;
import com.wordpress.pages.WelcomePage;

/**
 * Created by Naveen on 9/8/2017.
 */
public class AddRecoveryEmail {

    WelcomePage welcome = new WelcomePage();
    SecurityPage securityPage= new SecurityPage();
    ProfilePage profilePage= new ProfilePage();

    public void clickProfilePic(){
        welcome.clickProfileImage();
    }
    public void clickSecurity(){
        profilePage.clickSecurity();
    }
    public void clickRecovery(){
        securityPage.clickAccountRecovery();
    }
    public void clickEdit(){
        securityPage.editEmail();
    }
    public void enterEmail(){

        securityPage.enterEmail();
    }
    public void saveEmail(){
        securityPage.saveEmail();
    }
    public String getSuccessMessage(){
        return securityPage.getPopuptext();
    }
}
