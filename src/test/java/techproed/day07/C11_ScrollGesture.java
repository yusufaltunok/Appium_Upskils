package techproed.day07;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C11_ScrollGesture extends ApiDemosBaseTest {

    @Test
    public void testScrollToElement() throws InterruptedException {
        // new UiScrollable() constructorı kullanarak seçtiğimiz elemente kadar scroll (kaydırma) yaptık
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Layouts\"))"));
        Thread.sleep(5000);
    }

    @Test
    public void testScrollGestureElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        WebElement element = driver.findElement(AppiumBy.id("android:id/list"));

        driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", "down",
                "percent", 1.0, // sayfayı belirlediğimiz element boyutu kadar indirir (0.5 yarısı kadar indirir,2.0 iki katı kadar indirir)
                "speed", 500
        ));
      //  scrollGestureElement(driver,element,"down",1.0);

        bekle(5);
    }

    @Test
    public void testScrollGestureCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        boolean canScrollMore = true; // kaydırabileceği alan varsa kaydırmaya devam etmesi için döngü oluş1.0turduk.
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 300, "width", 0, "height", 1000, // aşağı kaydırdığımız için width'i 0 yaptık
                    "direction", "down",
                    "percent", 2.0,
                    "speed", 500
            ));
        }

        bekle(5);
    }


}
