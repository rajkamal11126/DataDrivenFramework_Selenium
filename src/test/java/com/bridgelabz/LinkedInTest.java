package com.bridgelabz;

import com.bridgelabz.base.Base;
import com.bridgelabz.page.Login;
import org.testng.annotations.Test;

public class LinkedInTest extends Base {

    @Test
    public void LoginToApplication1() throws InterruptedException {
        Login login = new Login();
        login.LoginToApplication();
    }

}
