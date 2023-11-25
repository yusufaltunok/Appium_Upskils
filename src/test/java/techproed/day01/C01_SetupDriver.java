package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetupDriver {
    @Test
    public void testDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","52004ce95e622501"); // cmd'de "adb devicees" yazıp cihazın id'sini alıyoruz.cihaz 1 tane ise gerek yok.
        capabilities.setCapability("app","C:\\Users\\EXCALIBUR\\Desktop\\Appium_Upskils\\src\\test\\resources\\ApiDemos-debug.apk")
//        capabilities.setCapability("appPackace","io.appium.android.apis");
//        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        ;

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url,capabilities);

    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("52004ce95e622501")
                .setApp("C:\\Users\\EXCALIBUR\\Desktop\\Appium_Upskils\\src\\test\\resources\\ApiDemos-debug.apk")
                .setAppPackage("io.appium.android.apis")
                .setAppActivity("io.appium.android.apis.ApiDemos");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);

    }

    @Test
    public void testOdev() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("52004ce95e622501")
                .setApp("C:\\Users\\EXCALIBUR\\Desktop\\Appium_Upskils\\src\\test\\resources\\ApiDemos-debug.apk")
                .setAppPackage("com.sec.android.app.popupcalculator")
                .setAppActivity("com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);
    }
}
// adb shell dumpsys window | find "mCurrentFocus" komutu ile hesap makinesini aç  com.android.calculator2/com.android.calculator2.Calculator