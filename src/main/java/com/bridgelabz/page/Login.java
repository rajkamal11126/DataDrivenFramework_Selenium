package com.bridgelabz.page;

import com.bridgelabz.base.Base;
import com.bridgelabz.util.ReadData;
import org.openqa.selenium.By;

public class Login extends Base {

    private static final String EXCEL_PATH = "C:\\Users\\Rajkamal\\IdeaProjects\\DataDrivenFramework\\src\\test\\resources\\Data.xlsx";

    public void LoginToApplication() throws InterruptedException {
        String username = ReadData.getCellValue(EXCEL_PATH, "Data", 1, 0);
        String password = ReadData.getCellValue(EXCEL_PATH, "Data", 1, 1);

        driver.findElement(By.className("input__input")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.id("session_password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.className("sign-in-form__submit-button")).click();
        Thread.sleep(2000);

    }
}
