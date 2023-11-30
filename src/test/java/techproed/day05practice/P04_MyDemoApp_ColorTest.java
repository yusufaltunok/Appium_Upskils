package techproed.day05practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.Android_MyDemoAppBaseTest;

import java.util.List;

public class P04_MyDemoApp_ColorTest extends Android_MyDemoAppBaseTest {

    /*
         Uygulama: MyDemoApp
     MyDemoApp uygulamasına gir
     Menüyü aç
     Login ol (bob@example.com, 10203040)
     Login butonuna tıkla
     İlk ürünü seç
     Renk olarak mavi seç
     Add To Cart butonuna tıkla
     Renk olarak kırmızı seç
     Add To Cart butonuna tıkla
     Sepete git
     Listede iki ürün olduğunu doğrula
     Listedeki ürünlerin mavi ve kırmızı olduğunu doğrula
     */

    @Test
    public void testColor() throws InterruptedException {
        WebElement menu = driver.findElement(AppiumBy.accessibilityId("open menu"));
        menu.click();

        WebElement menuItemLogIn = driver.findElement(AppiumBy.accessibilityId("menu item log in"));
        menuItemLogIn.click();

        WebElement usernameInputField = driver.findElement(AppiumBy.accessibilityId("Username input field"));
        usernameInputField.click();
        usernameInputField.sendKeys("bob@example.com");

        WebElement passwordInputField = driver.findElement(AppiumBy.accessibilityId("Password input field"));
        passwordInputField.sendKeys("10203040");
        driver.hideKeyboard(); // Klavyey saklamak için
        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(AppiumBy.accessibilityId("Login button"));
        loginButton.click();

        WebElement productTitle =driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        productTitle.click();

       // WebElement blue = driver.findElement(AppiumBy.accessibilityId("blue circle"));
        By blue = AppiumBy.accessibilityId("blue circle"); // sayfa değiştiğinde StaleElementException almamak için By ile yaptık
        driver.findElement(blue).click();

        WebElement addToCart = driver.findElement(AppiumBy.accessibilityId("Add To Cart button"));
        addToCart.click();

        //WebElement red = driver.findElement(AppiumBy.accessibilityId("red circle"));
        By red = AppiumBy.accessibilityId("red circle");
        driver.findElement(red).click();

        addToCart.click();

        WebElement cart = driver.findElement(AppiumBy.accessibilityId("cart badge"));
        cart.click();

        List<WebElement> products = driver.findElements(AppiumBy.accessibilityId("product row"));
        Assert.assertEquals(products.size(),2);

        // 1. ürünün renginin mavi, 2. ürünün renginin kırmızı olduğunu doğrulamak için
        WebElement blueCircle = driver.findElement(AppiumBy.xpath(" (//android.view.ViewGroup[@content-desc=\"product row\"])[1]//android.view.ViewGroup[contains(@content-desc, 'blue circle')]"));
        WebElement redCircle = driver.findElement(AppiumBy.xpath(" (//android.view.ViewGroup[@content-desc=\"product row\"])[2]//android.view.ViewGroup[contains(@content-desc, 'red circle')]"));

        Assert.assertTrue(blueCircle.isDisplayed());
        Assert.assertTrue(redCircle.isDisplayed());

        Assert.assertTrue(driver.findElement(blue).isDisplayed());
        Assert.assertTrue(driver.findElement(red).isDisplayed());
















    }
}
