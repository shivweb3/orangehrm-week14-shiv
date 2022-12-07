package com.orangehrmlive.testbase;

import com.orangehrmlive.propertyreader.PropertyReader;
import com.orangehrmlive.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";

    @BeforeMethod

    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }



}
