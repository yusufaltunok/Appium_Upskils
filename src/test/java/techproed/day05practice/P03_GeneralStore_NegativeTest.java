package techproed.day05practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.GeneralStoreBaseTest;

public class P03_GeneralStore_NegativeTest extends GeneralStoreBaseTest {

    /*
        Uygulama: GeneralStore
    GeneralStore uygulamasına gir
    Menüden Angola seçeneğini seç
    Your Name kutusunu boş bırak
    Let’s Shop butonuna tıkla
    Hata mesajını doğrula (Toast Message)
         */
    @Test
    public void testGeneralStoreNegativeTest() {
        WebElement angola = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Angola\"]"));
        angola.click();

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click(); //Let's Shop Button

        // Toast Message doğrulama
        String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
        Assert.assertEquals(toastMessage,"Please enter your name");


    }
    // Reusable method
//    public String getToastMessage(){
//        return driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
//    }
}
