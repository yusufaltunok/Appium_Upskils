package techproed.day03;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.net.MalformedURLException;


public class C06_ElementDegerleriniCekme extends ApiDemosBaseTest {
    @Test
    public void testElementDegerleriniCekme() throws MalformedURLException {

        By accessibility = AppiumBy.accessibilityId("Accessibility");
        System.out.println("getText = " + driver.findElement(accessibility).getText());

        System.out.println("getAttribute = " + driver.findElement(accessibility).getAttribute("package"));
        System.out.println("getAttribute = " + driver.findElement(accessibility).getAttribute("checkable"));

        System.out.println("isSelected = " + driver.findElement(accessibility).isSelected());
        System.out.println("isEnabled = " + driver.findElement(accessibility).isEnabled());
        System.out.println("isDisplayed = " + driver.findElement(accessibility).isDisplayed());

        System.out.println("getSize = " + driver.findElement(accessibility).getSize());
        System.out.println("getLocation = " + driver.findElement(accessibility).getLocation());

    }
}