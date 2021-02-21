package com.bridgelabz.page;

import com.bridgelabz.base.Base;
import com.bridgelabz.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;

public class Login extends Base {

    @FindBy(className = "input__input")
    WebElement userName;

    @FindBy(id = "session_password")
    WebElement Password;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    private static final String EXCEL_PATH = "C:\\Users\\Rajkamal\\IdeaProjects\\DataDrivenFramework\\src\\test\\resources\\Data.xlsx";

    public void LoginToApplication() throws InterruptedException, IOException {

        String username = Utility.readDataToExcel(EXCEL_PATH, "Data", 1, 0);
        String password = Utility.readDataToExcel(EXCEL_PATH, "Data", 1, 1);
        userName.sendKeys(username);
        Thread.sleep(1000);
        Password.sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.className("sign-in-form__submit-button")).click();
        Thread.sleep(2000);
    }
}
