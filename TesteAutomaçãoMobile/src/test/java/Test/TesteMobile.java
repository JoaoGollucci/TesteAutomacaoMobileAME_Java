package Test;

import static org.junit.Assert.*; //Importação estática, tira a necessiddade de "apontar" para a classe

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class TesteMobile {



    @Before
    public  void setup(){


    }

    @Test
    public void calcTeste(){

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");
        AndroidDriver<AndroidElement> ad = null;
        try {
            ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        MobileElement el5 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementByAccessibilityId("plus");
        el6.click();
        MobileElement el7 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
        el7.click();
        MobileElement el8 = (MobileElement) ad.findElementByAccessibilityId("equals");
        el8.click();

        Assert.assertEquals(ad.findElementById("com.android.calculator2:id/result").getText(), "4");

    }

    @After
    public void tearDown(){


    }

}
