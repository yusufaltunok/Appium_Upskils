package techproed.day08practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.TelefonBaseTest;

public class P05_Telefon_LongClickGesture extends TelefonBaseTest {
    /*
    Uygulama: Telefon
    Telefon uygulamasına gir
    +90 530 486 1275 numarasını ara
    Mesajda, Arama başarısız oldu. metnini doğrula
    Tamam butonuna bas

     */
    @Test
    public void testTelefon() {
     //  By aramaTusu = AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.sec.android.app.launcher:id/iconview_imageView\"])[4]");
       By bir =  AppiumBy.accessibilityId("1");
       By iki =  AppiumBy.accessibilityId("2");
       By uc =  AppiumBy.accessibilityId("3");
       By dort =  AppiumBy.accessibilityId("4");
       By bes =  AppiumBy.accessibilityId("5");
       By alti =  AppiumBy.accessibilityId("6");
       By yedi =  AppiumBy.accessibilityId("7");
       By sekiz =  AppiumBy.accessibilityId("8");
       By dokuz =  AppiumBy.accessibilityId("9");
       By sifir =  AppiumBy.accessibilityId("0");
       By ara =  AppiumBy.id("com.samsung.android.dialer:id/callButtonContainer");


        longClickGesture(driver, driver.findElement(sifir));
        clickGesture(driver, driver.findElement(dokuz));
        clickGesture(driver, driver.findElement(sifir));
        clickGesture(driver, driver.findElement(bes));
        clickGesture(driver, driver.findElement(uc));
        clickGesture(driver, driver.findElement(sifir));
        clickGesture(driver, driver.findElement(dort));
        clickGesture(driver, driver.findElement(sekiz));
        clickGesture(driver, driver.findElement(alti));
        clickGesture(driver, driver.findElement(bir));
        clickGesture(driver, driver.findElement(iki));
        clickGesture(driver, driver.findElement(yedi));
        clickGesture(driver, driver.findElement(bes));
        clickGesture(driver, driver.findElement(ara));







    }
}
