package techproed.day06;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C07_ClickGesture extends ApiDemosBaseTest {

    @Test
    public void testClickGesture() {
        // driver.manage().window().getSize(); //Bağlandığımız cihazın çözünürlük değerini verir

        WebElement os = driver.findElement(AppiumBy.accessibilityId("OS"));

        // os.click(); yerine jse ile click yaptık. Bazı locatelere click(); ile ulaşamayabiliriz.
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) os).getId()
        ));

        clickGesture(driver, os);
    }

    @Test
    public void testClickGestureCoordinate() {
        // koordinat kullanarak istediğimiz yere tıklama
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x",285,
                "y",924
        ));

        // clickGesture(driver,285,924);
    }

}
