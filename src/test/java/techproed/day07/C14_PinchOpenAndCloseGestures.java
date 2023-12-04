package techproed.day07;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.VodQABaseTest;

public class C14_PinchOpenAndCloseGestures extends VodQABaseTest {
    @Test
    public void testPinchOpenAndCloseGesturesElement() {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();

        WebElement element = driver.findElement(AppiumBy.className("android.widget.ImageView"));

        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of( // Elementi büyüt
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.75,
                "speed", 500
        ));

        bekle(1);

        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of( // Elementi küçült
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.75,
                "speed", 500
        ));

        bekle(2);


    }
        @Test
        public void testPinchOpenAndCloseGesturesCoordinate () {
            driver.findElement(AppiumBy.className("android.widget.Button")).click();
            driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();

            bekle(1);

            driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                    "left", 200, "top", 700, "width", 700, "height", 700,
                    "percent", 0.75,
                    "speed", 500
            ));

            bekle(1);

            driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                    "left", 200, "top", 700, "width", 700, "height", 700,
                    "percent", 0.75,
                    "speed", 500
            ));

            bekle(2);

        }

}




