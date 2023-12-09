package techproed.utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReusableMethods {


    public String getToastMessage(AndroidDriver driver) {
        return driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
    }

    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickGesture(AndroidDriver driver, WebElement element) {
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }

    public void clickGesture(AndroidDriver driver,int x, int y){
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x",x,
                "y",y
        ));
    }


    public void doubleClickGesture(AndroidDriver driver, WebElement element) {

            driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }
    public void doubleClickGesture(AndroidDriver driver, int x, int y) {

              driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "x",x,
                "y",y
        ));
    }

    public void longClickGesture(AndroidDriver driver, WebElement element) {

              driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }

    public void longClickGesture(AndroidDriver driver, WebElement element,int second){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "duration", second * 1000
        ));
    }
    public void longClickGesture(AndroidDriver driver, int x, int y){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "x", x,
                "y", y

        ));
    }
    public void longClickGesture(AndroidDriver driver, int x, int y,int second){
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                "x", x,
                "y", y,
                "duration", Duration.ofSeconds(second)
        ));
    }

    public void dragGesture(AndroidDriver driver, WebElement element, int endX, int endY){
        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", endX,
                "endY", endY
        ));
    }
    public void dragGesture(AndroidDriver driver, int startX, int startY, int endX, int endY){
        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "startX", startX,
                "startY", startY,
                "endX", endX,
                "endY", endY
        ));
    }

    public void scrollGesture(AndroidDriver driver,WebElement element,String direction, double percent){
              driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction,
                "percent", percent // sayfayı belirlediğimiz element boyutu kadar indirir (0.5 yarısı kadar indirir,2.0 iki katı kadar indirir)
        ));
    }
    public void scrollGesture(AndroidDriver driver, WebElement element, String direction, double percent, int speed){
        driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction,
                "percent", percent,
                "speed", speed
        ));
    }

    public void swipeGesture(AndroidDriver driver, WebElement element, String direction, double percent, int speed){
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction,
                "percent", percent,
                "speed", speed
        ));
    }
    public static void visibleWait(AndroidDriver driver, WebElement element, int sayi) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));
    }



}
