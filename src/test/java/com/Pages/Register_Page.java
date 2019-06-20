package com.Pages;

import com.driverClass;
import org.openqa.selenium.By;

public class Register_Page extends driverClass {

    public void GotoURL(String URL) {


        System.out.println(URL);

        driver.get(URL);
    }

public void ClickRegisterButton(){ driver.findElement(By.linkText("Register")).click();}




}
