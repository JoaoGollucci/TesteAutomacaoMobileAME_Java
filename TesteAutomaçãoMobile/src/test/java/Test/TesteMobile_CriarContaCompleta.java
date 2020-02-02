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

        //Inserir seleção do radio button
        MobileElement e3 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/rdCompleto");
        e3.click();

        //Escolher Foto
        MobileElement e4 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/imagemCliente");
        e4.click();
        MobileElement e5 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView");
        e5.click();
        MobileElement e6 = (MobileElement) ad.findElementById("com.android.documentsui:id/nameplate");
        e6.click();
        MobileElement e7 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/crop_image_menu_crop");
        e7.click();

        //Preencher Campos
        MobileElement e8 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNome");
        e8.sendKeys("Nome Teste");
        MobileElement e9 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editRg");
        e9.sendKeys("12345678");
        MobileElement el0 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editOrgao");
        el0.sendKeys("Teste");
        MobileElement el1 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCpf");
        el1.sendKeys("99999999999");
        MobileElement el2 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editData");
        el2.sendKeys("11061995");
        MobileElement el3 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editMae");
        el3.sendKeys("Mae Teste");
        MobileElement el4 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editPai");
        el4.sendKeys("Pai Teste");
        MobileElement e15 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEndereco");
        e15.sendKeys("Rua Teste");
        MobileElement e16 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNumero");
        e16.sendKeys("42");
        MobileElement e17 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editBairro");
        e17.sendKeys("Bairro Teste");
        MobileElement el8 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCep");
        el8.sendKeys("12345678");
        MobileElement el9 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCidade");
        el9.sendKeys("Cidade Teste");
        MobileElement e20 = (MobileElement) ad.findElementById("android:id/text1");
        e20.click();
        MobileElement e21 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        e21.click();
        MobileElement e22 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editNaturalidade");
        e22.sendKeys("Brasileira");
        MobileElement e23 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefone1");
        e23.sendKeys("999999999");
        MobileElement e24 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefone2");
        e24.sendKeys("88888888");
        MobileElement e25 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEmail");
        e25.sendKeys("teste@ame.com.br");

        //Scroll
        (new TouchAction(ad)).press(PointOption.point(467, 1615)).moveTo(PointOption.point(467, 220)).release().perform();

        //Preencher endereço
        MobileElement e26 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editObs");
        e26.sendKeys("Teste");
        MobileElement e27 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEmpresa");
        e27.sendKeys("Empresa Teste");
        MobileElement e28 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCargo");
        e28.sendKeys("Testador");
        MobileElement e29 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editEnderecoEmpresa");
        e29.sendKeys("Rua Teste, 42");
        MobileElement e30 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editCepEmpresa");
        e30.sendKeys("12345678");
        MobileElement e31 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefoneEmpresa");
        e31.sendKeys("77777777");
        MobileElement e32 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editDataAdmissao");
        e32.sendKeys("10102010");
        MobileElement e33 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editRenda");
        e33.sendKeys("5000");
        MobileElement e34 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefoneRef1");
        e34.sendKeys("666666666");
        MobileElement e35 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editTelefoneRef2");
        e35.sendKeys("55555555");
        MobileElement e36 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editBanco");
        e36.sendKeys("Banco Teste");
        MobileElement e37 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editAgencia");
        e37.click();
        ad.navigate().back();
        MobileElement e38 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editAgencia");
        e38.sendKeys("1234");
        MobileElement e39 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/editConta");
        e39.sendKeys("12345");

        //Salvar
        MobileElement e40 = (MobileElement) ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/btnSalvar");
        e40.click();

        //Validação
        Assert.assertEquals(ad.findElementById("br.com.dudstecnologia.cadastrodeclientes:id/alertTitle").getText(), "Perfeito");

        MobileElement e41 = (MobileElement) ad.findElementById("android:id/button1");
        e41.click();

        ad.closeApp();

    }

}
