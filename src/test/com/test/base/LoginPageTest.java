package com.test.base;
import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import org.testng.annotations.Test;




public class LoginPageTest  extends BaseClass{



    @Test
    public void loginUser()throws Exception{
        getConnection();
        //log.info("driver is:....."+driver);
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("admin","admin");


    }

}
