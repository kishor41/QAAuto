package com;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

    driverClass driver_Class = new driverClass();

    @Before

    public void open(){

        driver_Class.openBrowser();

    }

    @After
    public void close(){
        driver_Class.closeBrowser();

    }
}
