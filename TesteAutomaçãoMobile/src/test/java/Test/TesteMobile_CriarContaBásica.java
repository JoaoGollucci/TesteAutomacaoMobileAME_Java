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


public class TesteMobile_CriarContaBásica {

    @Test
    public void criarContaBasica(){

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

        MobileElement e2 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/floating_novo");
        e2.click();

        //Preencher Campos
        MobileElement e3 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNome");
        e3.sendKeys("Nome Teste");
        MobileElement e4 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editRg");
        e4.sendKeys("12345678");
        MobileElement e5 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCpf");
        e5.sendKeys("99999999999");
        MobileElement e6 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editData");
        e6.sendKeys("11061995");
        MobileElement e7 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEndereco");
        e7.sendKeys("Rua Teste");
        MobileElement e8 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNumero");
        e8.sendKeys("42");
        MobileElement e9 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editBairro");
        e9.sendKeys("Bairro Teste");
        MobileElement e10 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCep");
        e10.sendKeys("12345678");
        MobileElement e11 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCidade");
        e11.sendKeys("Cidade Teste");
        MobileElement e12 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefone1");
        e12.sendKeys("999999999");
        MobileElement e13 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefone2");
        e13.sendKeys("88888888");
        MobileElement e14 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEmail");
        e14.sendKeys("teste@ame.com.br");
        MobileElement e15 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editObs");
        e15.sendKeys("Teste");MobileElement el12 = (MobileElement) ad.findElementById("android:id/text1");
        el12.click();
        MobileElement e16 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        e16.click();

        //Escolher Foto
        MobileElement e17 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/imagemCliente");
        e17.click();
        MobileElement e18 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView");
        e18.click();
        MobileElement e19 = (MobileElement) ad.findElementById("com.android.documentsui:id/nameplate");
        e19.click();
        MobileElement e20 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/crop_image_menu_crop");
        e20.click();

        //Salvar
        MobileElement e21 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/btnSalvar");
        e21.click();

        //Validação
        Assert.assertEquals(ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/alertTitle").getText(), "Perfeito");

        MobileElement e22 = (MobileElement) ad.findElementById("android:id/button1");
        e22.click();

        ad.closeApp();
    }

}
