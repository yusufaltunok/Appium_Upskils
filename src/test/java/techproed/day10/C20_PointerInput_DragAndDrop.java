package techproed.day10;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.time.Duration;
import java.util.Collections;

public class C20_PointerInput_DragAndDrop extends ApiDemosBaseTest {
    @Test
    public void testDragAndDrop() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        PointerInput finger =new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence sequence = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),200,600))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(200)))
                .addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),700,600))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

        bekle(5);



    }
}

