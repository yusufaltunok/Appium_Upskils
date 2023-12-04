package techproed.day06;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C09_longClickGesture extends ApiDemosBaseTest {
    @Test
    public void testlongClickGestureElement() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
        driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();

        WebElement element = driver.findElement(AppiumBy.accessibilityId("Long press me"));

//        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element).getId(),
//                "Duration",1000 // defaul olarak 500 ms tıklıyor. yetmediği için 1000 ms beklettik
//        ));

        longClickGesture(driver, element,1000);
    }

    @Test
    public void testlongClickGestureCoordinate() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
        driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();

//        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
//                "x",530,
//                "y",420,
//                "Duration",1000
//        ));

    longClickGesture(driver,530,420,1000);

    }

 }
