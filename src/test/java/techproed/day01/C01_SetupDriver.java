package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetupDriver {
    @Test
    public void testDesiredCapabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android"); // Zorunlu
        capabilities.setCapability("automationName","uiautomator2");// Zorunlu
        capabilities.setCapability("app","C:\\Users\\EXCALIBUR\\Desktop\\Appium_Upskils\\src\\test\\resources\\ApiDemos-debug.apk");

        // Apk dosyası olduğu için aşağıdakilere gerek yok
//        capabilities.setCapability("appPackace","io.appium.android.apis");
//        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
//        capabilities.setCapability("udid","52004ce95e622501"); // cmd'de "adb devicees" yazıp cihazın id'sini alıyoruz.cihaz 1 tane ise gerek yok.


        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url,capabilities);
    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
//                .setUdid("52004ce95e622501")
//                .setAppPackage("io.appium.android.apis")
//                .setAppActivity("io.appium.android.apis.ApiDemos")
        ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);

    }

}
