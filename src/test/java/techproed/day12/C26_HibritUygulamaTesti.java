package techproed.day12;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.util.Set;

public class C26_HibritUygulamaTesti extends ApiDemosBaseTest {
    @Test
    public void testHibrit() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
        driver.findElement(AppiumBy.accessibilityId("WebView")).click();

        bekle(3);

        // uygulamadaki context'leri (handle ile geçiş yapılacak sayfaları) alıp yazdırmak için
//        Set<String> contextHandles = driver.getContextHandles();
//        for (String contextName : contextHandles){
//            System.out.println(contextName);
//        }

        /*
         Test çalıştırdığımızda eğer "ChromeDriver bulunamadı" şeklinde bir hata mesajı alırsak, server'ı aşağıdaki
         komut ile çalıştırıp, testi tekrar çalıştırırız. Böylece chromedriver bilgisayarımıza otomatik olarak yüklenir.
         appium --allow-insecure chromedriver_autodownload
         */
        driver.context("WEBVIEW_io.appium.android.apis"); // seleniumdaki switchTo() metodu

        System.out.println("URL: " + driver.getCurrentUrl());

        System.out.println("Başlık: " + driver.findElement(By.tagName("h1")).getText());

        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        driver.context("NATIVE_APP");

        driver.findElement(AppiumBy.accessibilityId("Visibility")).click();

        bekle(2);

    }
}




