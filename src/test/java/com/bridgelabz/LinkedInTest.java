
/******************************************************************************
 *  Author   Raj Kamal
 *  Purpose: Created Properties for test LinkedIn login page
 *  @since 19-02-2021
 ******************************************************************************/
package com.bridgelabz;

import com.bridgelabz.base.Base;
import com.bridgelabz.page.Login;
import com.bridgelabz.util.Utility;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import static com.bridgelabz.util.Utility.capture;

public class LinkedInTest extends Base {

    @Test
    public void LoginToApplication1() throws InterruptedException, IOException {
        Login login = PageFactory.initElements(driver, Login.class);
        login.LoginToApplication();
        Utility.writeDataToExcel();
        test = report.startTest("Logging into Application");
        test.log(LogStatus.PASS, "Test Passes");
        test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+"TestPass");
        capture(driver);
    }
}
