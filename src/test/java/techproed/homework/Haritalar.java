package techproed.homework;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.HaritalarBaseTest;

public class Haritalar extends HaritalarBaseTest {
    /*
     Uygulama: Haritalar
     Haritalar uygulamasına gir
     Harita türü olarak Uydu seçeneğini seç
     Arama motorunda Taj Mahal kelimelerini arat
     Haritada Taj Mahal bölgesine zoom in ve zoom out işlemlerini yap
     */

    @Test
    public void testHaritalar() {

        WebElement katmanlar = driver.findElement(AppiumBy.accessibilityId("Katmanlar"));
        clickGesture(driver, katmanlar);

        WebElement uydu = driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/layers_menu_satellite_layer"));
        clickGesture(driver, uydu);

        WebElement menuyuKapat = driver.findElement(AppiumBy.accessibilityId("Menüyü kapat"));
        clickGesture(driver, menuyuKapat);


        WebElement aramaKutusu = driver.findElement(AppiumBy.accessibilityId("Burada arayın"));
        clickGesture(driver, aramaKutusu);

        WebElement metinArama = driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/search_omnibox_edit_text"));
        metinArama.sendKeys("Taj Mahal");

        KeyEvent enter = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(enter);
        bekle(5);

        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of( // zoom in yapılacak
                "left", 375, // X koordinatı başlangıç
                "top", 475,  // Y koordinatı başlangıç
                "width", 350, // X koordinatı bitiş - başlangıç
                "height", 325, // Y koordinatı bitiş - başlangıç
                "percent", 0.75,
                "speed", 500
        ));
        bekle(3);

        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of( // zoom out yapılacak
                "left", 375, // X koordinatı başlangıç
                "top", 475,  // Y koordinatı başlangıç
                "width", 350, // X koordinatı bitiş - başlangıç
                "height", 325, // Y koordinatı bitiş - başlangıç
                "percent", 0.75,
                "speed", 500
        ));
        bekle(3);
    }
}
