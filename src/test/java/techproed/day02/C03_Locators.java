package techproed.day02;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;


import java.net.MalformedURLException;

public class C03_Locators extends ApiDemosBaseTest {
    @Test
    public void testUiAutomator2OptionLocators() throws MalformedURLException {
//        String appUrl = System.getProperty("user.dir")
//                + File.separator + "src"
//                + File.separator + "test"
//                + File.separator + "resources"
//                + File.separator + "ApiDemos-debug.apk";
//
//        UiAutomator2Options options = new UiAutomator2Options()
//                .setApp(appUrl);
//
//        URL url = new URL("http://0.0.0.0:4723");
//        AndroidDriver driver = new AndroidDriver(url, options);
        // ********** ApiDemosBaseTest classına extends yaptığımız için yukarıdaki kısmı çıkardık *******************

        // 1 - accessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
        System.out.println("Access'ibility ID = " + element.getText());

        // 2 - Id
        element = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("ID = " + element.getText());

        // 3 - Class Name
        element = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("Class Name = " + element.getText());

        // 4 - androidUIAutomator
        element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Access'ibility\")"));
        System.out.println("androidUIAutomator = " + element.getText());

        // 5 - xpath
        element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]"));
        element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Access'ibility\"]"));
        System.out.println("xpath = " + element.getText());

    }

}
