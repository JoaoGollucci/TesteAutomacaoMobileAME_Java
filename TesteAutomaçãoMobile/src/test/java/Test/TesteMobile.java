package Test;

import static org.junit.Assert.*; //Importação estática, tira a necessiddade de "apontar" para a classe

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TesteMobile {

    @Before
    public  void setup(){
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");
        //AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

    }

    @Test
    public void criarConta(){






    }

    @After
    public void tearDown(){


    }

}
