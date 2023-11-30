package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.KeyEvent;
import techproed.basetest.ApiDemosBaseTest;

import java.net.MalformedURLException;


public class C05_TemelEylemler extends ApiDemosBaseTest {
    @Test
    public void testTemelEylemler() throws MalformedURLException, InterruptedException {

        By app = AppiumBy.accessibilityId("App");
        By activity = AppiumBy.accessibilityId("Activity");
        By customTitle = AppiumBy.accessibilityId("Custom Title");
        By leftTextBox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
        By rightTextBox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
        By leftButton = AppiumBy.accessibilityId("Change Left");
        By rightButton = AppiumBy.accessibilityId("Change Right");


        driver.findElement(app).click();
        driver.findElement(activity).click();
        driver.findElement(customTitle).click();

        driver.findElement(leftTextBox).clear();
        driver.findElement(leftTextBox).sendKeys("Yusuf");
        driver.findElement(leftButton).click();

        driver.findElement(rightTextBox).clear();
        driver.setClipboardText("Aslan");// panoya kopyalanmasını istediğimiz metni yazarız. Ctrl+c nin işlevi
        driver.findElement(rightTextBox).sendKeys(driver.getClipboardText());// Ctrl+v
        driver.findElement(rightButton).click();

        KeyEvent back = new KeyEvent(AndroidKey.BACK);
        KeyEvent home = new KeyEvent(AndroidKey.HOME);

        driver.pressKey(back);
        Thread.sleep(2000);
        driver.pressKey(home);

    }
}
