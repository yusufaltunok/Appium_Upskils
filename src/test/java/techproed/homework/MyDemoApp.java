package techproed.homework;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.MyDemoAppBaseTest;



public class MyDemoApp extends MyDemoAppBaseTest {
      /*
         Uygulama: MyDemoApp
     MyDemoApp uygulamasına gir
     Menüyü aç
     Login ol (bob@example.com, 10203040)
     Login butonuna tıkla
     İlk ürünü seç
     Ürün miktarını 2'ye çıkar
     Add To Cart butonuna tıkla
     Sepete git
     Ürün miktarını toplam miktar ile aynı olduğunu doğrula
     Proceed To Checkout butonuna tıkla
     */

    @Test
    public void testIkiUrun() throws InterruptedException {
//        MyDemoApp uygulamasına gir

        By menu = AppiumBy.accessibilityId("open menu");
        By menuItemLogIn = AppiumBy.accessibilityId("menu item log in");
        By usernameInputField = AppiumBy.accessibilityId("Username input field");
        By passwordInputField = AppiumBy.accessibilityId("Password input field");
        By loginButton = AppiumBy.accessibilityId("Login button");
        By productTitle = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")");
        By counterPlusButton = AppiumBy.accessibilityId("counter plus button");
        By addToCartButton = AppiumBy.accessibilityId("Add To Cart button");
        By cartBadge = AppiumBy.accessibilityId("cart badge");
        By counterAmount = AppiumBy.xpath("(//android.widget.TextView[@text=\"2\"])[2]");
        By proceedToCheckoutButton = AppiumBy.accessibilityId("Proceed To Checkout button");

//        Menüyü aç
        driver.findElement(menu).click();

//        Login ol (bob@example.com, 10203040)
//        Login butonuna tıkla
        driver.findElement(menuItemLogIn).click();
        driver.findElement(usernameInputField).click();
        driver.findElement(usernameInputField).sendKeys("bob@example.com");
        driver.findElement(passwordInputField).sendKeys("10203040");
        driver.hideKeyboard(); // Klavyeyi saklamak için
        driver.findElement(loginButton).click();

//        İlk ürünü seç
        driver.findElement(productTitle).click();

//        Ürün miktarını 2'ye çıkar
        driver.findElement(counterPlusButton).click();

//        Add To Cart butonuna tıkla
        driver.findElement(addToCartButton).click();

//        Sepete git
        driver.findElement(cartBadge).click();

//        Ürün miktarının toplam miktar ile aynı olduğunu doğrula
        Assert.assertEquals(driver.findElement(counterAmount).getText(),"2");
        System.out.println("driver.findElement(counterAmount).getText() = " + driver.findElement(counterAmount).getText());
        bekle(5);

//        Proceed To Checkout butonuna tıkla
        driver.findElement(proceedToCheckoutButton).click();
        bekle(5);
    }
}
