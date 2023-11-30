package techproed.homework;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.net.MalformedURLException;


public class Locators extends ApiDemosBaseTest {
    KeyEvent back = new KeyEvent(AndroidKey.BACK);
    @Test
    public void testLocators() throws MalformedURLException {

        // 1 - Access'ibility --> Access'ibilityId
        WebElement accessibility = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
        accessibility.click();

        WebElement accessibilityNodeProvider = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));
        System.out.println("accessibilityNodeProvider : " + accessibilityNodeProvider.getText());

        WebElement accessibilityNodeQuerying = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying"));
        System.out.println("accessibilityNodeQuerying : " + accessibilityNodeQuerying.getText());

        WebElement accessibilityService = driver.findElement(AppiumBy.accessibilityId("Accessibility Service"));
        System.out.println("accessibilityService : " + accessibilityService.getText());

        WebElement accessibilityCustomView = driver.findElement(AppiumBy.accessibilityId("Custom View"));
        System.out.println("accessibilityCustomView : " + accessibilityCustomView.getText());

        driver.pressKey(back);
        System.out.println("*************************************\n");


        // 2 - Content --> id
        WebElement content = driver.findElements(AppiumBy.id("android:id/text1")).get(4);
        content.click();

        WebElement assents = driver.findElements(AppiumBy.id("android:id/text1")).get(0);
        System.out.println("assents : " + assents.getText());

        WebElement clipboard = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("clipboard : " + clipboard.getText());

        WebElement packages = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
        System.out.println("packages : " + packages.getText());

        WebElement provider = driver.findElements(AppiumBy.id("android:id/text1")).get(3);
        System.out.println("provider : " + provider.getText());

        WebElement resources = driver.findElements(AppiumBy.id("android:id/text1")).get(4);
        System.out.println("resources : " + resources.getText());

        WebElement storage = driver.findElements(AppiumBy.id("android:id/text1")).get(5);
        System.out.println("storage : " + storage.getText());

        driver.pressKey(back);
        System.out.println("*************************************\n");

        // 3 - Media --> className
        WebElement media = driver.findElements(AppiumBy.className("android.widget.TextView")).get(7);
        media.click();

        WebElement audioFx = driver.findElements(AppiumBy.className("android.widget.TextView")).get(1);
        System.out.println("audioFx : " + audioFx.getText());

        WebElement mediaPlayer = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("mediaPlayer : " + mediaPlayer.getText());

        WebElement videoWiew = driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
        System.out.println("videoWiew : " + videoWiew.getText());

        driver.pressKey(back);
        System.out.println("***************************\n");

        // 4 - NFC --> androidUIAutomator
        WebElement nfc = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NFC\")"));
        nfc.click();

        WebElement foregroundDispatch = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundDispatch\")"));
        System.out.println("foregroundDispatch : " + foregroundDispatch.getText());

        WebElement foregroundNddefPush = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundNdefPush\")"));
        System.out.println("foregroundNddefPush : " + foregroundNddefPush.getText());

        WebElement techFilter = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"TechFilter\")"));
        System.out.println("techFilter : " + techFilter.getText());

        driver.pressKey(back);
        System.out.println("*************************************\n");

        // 5 - OS --> xpath
        WebElement os = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"OS\"]"));
        os.click();

        WebElement morseCode = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Sensors\"]"));
        System.out.println("morseCode : " + morseCode.getText());

        WebElement rotationVector = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Rotation Vector\"]"));
        System.out.println("rotationVector : " + rotationVector.getText());

        WebElement sensors = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Sensors\"]"));
        System.out.println("sensors : " + sensors.getText());

        WebElement smsMessaging = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"SMS Messaging\"]"));
        System.out.println("smsMessaging : " + smsMessaging.getText());
    }


}
/*
  KeyEvent back = new KeyEvent(AndroidKey.BACK);
        KeyEvent home = new KeyEvent(AndroidKey.HOME);

        driver.pressKey(back);
        Thread.sleep(2000);
        driver.pressKey(home);
 */