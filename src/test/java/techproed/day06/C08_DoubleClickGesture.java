package techproed.day06;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;
import techproed.basetest.CalculatorBaseTest;

public class C08_DoubleClickGesture extends CalculatorBaseTest {


    @Test
    public void testDoubleClickGestureElement() {

        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();

        WebElement element = driver.findElement(AppiumBy.id("com.google.android.calculator:id/formula"));

        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        // burada double click yaptı ama metni seçmedi

      //  doubleClickGesture(driver,element);

    }

    @Test
    public void testDoubleClickGestureCoordinate() {

        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();

        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "x",910,
                "y",318
        ));

        // burada double click'i koordinatla 5 ile 2'nin arasına tıklatıp metni seçtirdik

     //   doubleClickGesture(driver,910,318);


    }
}

