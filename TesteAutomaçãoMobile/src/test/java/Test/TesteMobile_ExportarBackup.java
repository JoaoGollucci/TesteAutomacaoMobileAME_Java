package Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TesteMobile_ExportarBackup {

    @Test
    public void exportarBackup(){

        //Setup
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "br.com.dudstecnologia.cadastrodeclientes");
        dc.setCapability("appActivity", ".MainClientes");
        AndroidDriver<AndroidElement> ad = null;
        try {
            ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Iniciando o Teste
        MobileElement e1 = (MobileElement) ad.findElementById("com.android.packageinstaller:id/permission_allow_button");
        e1.click();

        (new TouchAction(ad)).tap(PointOption.point(943, 1634)).perform();
        (new TouchAction(ad)).press(PointOption.point(943, 1634)).release().perform();

        MobileElement e2 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/floating_exportar");
        e2.click();

        //Teste Excel
        MobileElement e3 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/btnExportar");
        e3.click();
        Assert.assertEquals(ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/alertTitle").getText(), "Perfeito");
        MobileElement e4 = (MobileElement) ad.findElementById("android:id/button1");
        e4.click();

        //Teste Backup
        MobileElement e5 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/btnBackup");
        e5.click();
        Assert.assertEquals(ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/alertTitle").getText(), "Perfeito!");
        MobileElement e6 = (MobileElement) ad.findElementById("android:id/button1");
        e6.click();

        ad.closeApp();
    }

}
