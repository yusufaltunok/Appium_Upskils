package techproed.day09;

import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.time.Duration;
import java.util.Collections;


public class C15_PointerInput_Tap extends ApiDemosBaseTest {
    @Test
    public void testTap() {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");

        Sequence sequence = new Sequence(finger,1) // sıralı adımlar oluşturabilmek için sequence objesi oluşturduk
                // parmak, ekran üzerindeki tap yapılacak koordinata haretek ettirilir
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),500,1300))
                // parmak ile farenin sol tuşuna basar gibi ekranda belirlediğimiz koordinata bastık
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                // ekranda parmağımızın basılı duracağı süreyi belirledik
                .addAction(new Pause(finger,Duration.ofMillis(300)))
                // Parmağı ekranda bastığımız koordinattan kaldırdık.
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        // Sıralı adımları topluca harekete geçirdik.
        driver.perform(Collections.singletonList(sequence));
        bekle(3);



    }
}
