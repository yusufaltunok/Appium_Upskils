package techproed.day10;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.time.Duration;
import java.util.Collections;

public class C19_PointerInput_Fling extends ApiDemosBaseTest {
    @Test
    public void testFling() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),500,1250))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(50)))
                .addAction(finger.createPointerMove(Duration.ofMillis(50), PointerInput.Origin.viewport(),500,750))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

        bekle(5);

    }
}
