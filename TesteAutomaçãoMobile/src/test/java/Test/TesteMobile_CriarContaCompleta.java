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


public class TesteMobile_CriarContaCompleta {

    @Test
    public void criarContaCompleta(){

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

        MobileElement el0 = (MobileElement) ad.findElementById("com.android.packageinstaller:id/permission_allow_button");
        el0.click();

        (new TouchAction(ad)).tap(PointOption.point(943, 1634)).perform();
        (new TouchAction(ad)).press(PointOption.point(943, 1634)).release().perform();

        MobileElement el2 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/floating_novo");
        el2.click();

        //Preencher Campos
        MobileElement el3 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNome");
        el3.sendKeys("Nome Teste");
        MobileElement el4 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editRg");
        el4.sendKeys("12345678");
        MobileElement el5 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCpf");
        el5.sendKeys("99999999999");
        MobileElement el6 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editData");
        el6.sendKeys("11061995");
        MobileElement el7 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEndereco");
        el7.sendKeys("Rua Teste");
        MobileElement el8 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNumero");
        el8.sendKeys("42");
        MobileElement el9 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editBairro");
        el9.sendKeys("Bairro Teste");
        MobileElement el10 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCep");
        el10.sendKeys("12345678");
        MobileElement el11 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCidade");
        el11.sendKeys("Cidade Teste");
        MobileElement el15 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefone1");
        el15.sendKeys("999999999");
        MobileElement el16 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefone2");
        el16.sendKeys("88888888");
        MobileElement el17 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEmail");
        el17.sendKeys("teste@ame.com.br");
        MobileElement el18 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editObs");
        el18.sendKeys("Teste");MobileElement el12 = (MobileElement) ad.findElementById("android:id/text1");
        el12.click();
        MobileElement el13 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el13.click();

        //Escolher Foto
        MobileElement el14 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/imagemCliente");
        el14.click();
        MobileElement teste = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView");
        teste.click();
        MobileElement teste1 = (MobileElement) ad.findElementById("com.android.documentsui:id/nameplate");
        teste1.click();
        MobileElement e20 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/crop_image_menu_crop");
        e20.click();

        //Salvar
        MobileElement el19 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/btnSalvar");
        el19.click();

        //Validação
        Assert.assertEquals(ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/alertTitle").getText(), "Perfeito");

        MobileElement el20 = (MobileElement) ad.findElementById("android:id/button1");
        el20.click();

        ad.closeApp();
    }

}
