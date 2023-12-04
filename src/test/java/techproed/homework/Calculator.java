package techproed.homework;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.CalculatorBaseTest;

import java.util.Random;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class Calculator extends CalculatorBaseTest {
    By bir = AppiumBy.accessibilityId("1");
    By iki = AppiumBy.accessibilityId("2");
    By uc = AppiumBy.accessibilityId("3");
    By dort = AppiumBy.accessibilityId("4");
    By bes = AppiumBy.accessibilityId("5");
    By alti = AppiumBy.accessibilityId("6");
    By yedi = AppiumBy.accessibilityId("7");
    By sekiz = AppiumBy.accessibilityId("8");
    By dokuz = AppiumBy.accessibilityId("9");
    By sifir = AppiumBy.accessibilityId("0");
    By parantez = AppiumBy.accessibilityId("sol veya sağ parantez");
    By arti = AppiumBy.accessibilityId("artı");
    By eksi = AppiumBy.accessibilityId("eksi");
    By carpi = AppiumBy.accessibilityId("çarpı");
    By bolu = AppiumBy.accessibilityId("bölü");
    By sil = AppiumBy.accessibilityId("temizle");
    By esit = AppiumBy.accessibilityId("eşittir");
    By sonuc = AppiumBy.id("com.google.android.calculator:id/result_final");

    int secim;
    int num1;
    int num2;
    int expectedResult = 0;


    @Test
    public void testToplama() throws InterruptedException {

        // İki pozitif sayının toplamı
        randomSayi();
        num1 = secim;
        driver.findElement(arti).click();
        randomSayi();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result = driver.findElement(sonuc).getText();
        int actualResult = Integer.parseInt(result);
        expectedResult = num1 + num2;
        assertEquals(expectedResult, actualResult);
        System.out.println("Gercek deger = " + actualResult
                + "\nBeklenen deger = " + expectedResult);


        // Bir pozitif bir negatif sayının toplamı
        randomSayi();
        num1 = secim;
        driver.findElement(arti).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result1 = driver.findElement(sonuc).getText();
        expectedResult = num1 + -num2;
        String expectedStr = String.valueOf(expectedResult);
        assertEquals(expectedStr, result1);
        System.out.println("Gercek deger = " + result1
                + "\nBeklenen deger = " + expectedStr);


//        // İki negatif sayının toplamı
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num1 = secim;
        driver.findElement(arti).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result2 = driver.findElement(sonuc).getText();
        expectedResult = -num1 + -num2;
        String expectedStrg = String.valueOf(expectedResult);
        assertEquals(expectedStrg, result2);
        System.out.println("Gercek deger = " + result2
                + "\nBeklenen deger = " + expectedStrg);


    }

    @Test
    public void testCikarma() {

        // İki pozitif sayıyı çıkarma
        randomSayi();
        num1 = secim;
        driver.findElement(eksi).click();
        randomSayi();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result = driver.findElement(sonuc).getText();
        expectedResult = num1 - num2;
        String expected = String.valueOf(expectedResult);
        assertEquals(expected, result);
        System.out.println("Gercek deger = " + result
                + "\nBeklenen deger = " + expected);


        // Bir pozitif bir negatif sayıyı çıkarma
        randomSayi();
        num1 = secim;
        driver.findElement(eksi).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result1 = driver.findElement(sonuc).getText();
        expectedResult = num1 - -num2;
        String expectedStr = String.valueOf(expectedResult);
        assertEquals(expectedStr, result1);
        System.out.println("Gercek deger = " + result1
                + "\nBeklenen deger = " + expectedStr);

        // İki negatif sayıyı çıkarma
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num1 = secim;
        driver.findElement(eksi).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result2 = driver.findElement(sonuc).getText();
        expectedResult = -num1 - -num2;
        String expectedStrg = String.valueOf(expectedResult);
        assertEquals(expectedStrg, result2);
        System.out.println("Gercek deger = " + result2
                + "\nBeklenen deger = " + expectedStrg);
    }


    @Test
    public void testCarpma() {
        // İki pozitif sayıyı carpma
        randomSayi();
        num1 = secim;
        driver.findElement(carpi).click();
        randomSayi();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result = driver.findElement(sonuc).getText();
        expectedResult = num1 * num2;
        String expected = String.valueOf(expectedResult);
        assertEquals(expected, result);
        System.out.println("Gercek deger = " + result
                + "\nBeklenen deger = " + expected);


        // Bir pozitif bir negatif sayıyı carpma
        randomSayi();
        num1 = secim;
        driver.findElement(carpi).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result1 = driver.findElement(sonuc).getText();
        expectedResult = num1 * -num2;
        String expectedStr = String.valueOf(expectedResult);
        assertEquals(expectedStr, result1);
        System.out.println("Gercek deger = " + result1
                + "\nBeklenen deger = " + expectedStr);


        // İki negatif sayıyı carpma
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num1 = secim;
        driver.findElement(carpi).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result2 = driver.findElement(sonuc).getText();
        expectedResult = -num1 * -num2;
        String expectedStrg = String.valueOf(expectedResult);
        assertEquals(expectedStrg, result2);
        System.out.println("Gercek deger = " + result2
                + "\nBeklenen deger = " + expectedStrg);
    }

    @Test
    public void testBolme() {

        // İki pozitif sayıyı bölme
        randomSayi();
        num1 = secim;
        driver.findElement(bolu).click();
        randomSayi();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result = driver.findElement(sonuc).getText();
        expectedResult = num1 / num2;
        String expected = String.valueOf(expectedResult);
        assertEquals(expected, result);
        System.out.println("Gercek deger = " + result
                + "\nBeklenen deger = " + expected);

        // Bir pozitif bir negatif sayıyı bölme
        randomSayi();
        num1 = secim;
        driver.findElement(bolu).click();
        driver.findElement(parantez).click();
        driver.findElement(eksi).click();
        randomSayi();
        driver.findElement(parantez).click();
        num2 = secim;
        driver.findElement(esit).click();
        System.out.println("sonuc = " + driver.findElement(sonuc).getText());

        //Dogrulama
        String result1 = driver.findElement(sonuc).getText();
        expectedResult = num1 / -num2;
        String expectedStr = String.valueOf(expectedResult);
        assertEquals(expectedStr, result1);
        System.out.println("Gercek deger = " + result1
                + "\nBeklenen deger = " + expectedStr);



        // Bir sayıyı "0" a bölme
        randomSayi();
        num1 = secim;
        driver.findElement(bolu).click();
        driver.findElement(sifir).click();
        driver.findElement(esit).click();

        WebElement sifiraBolunemez = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_preview"));
        Assert.assertEquals( sifiraBolunemez.getText(),"0'a bölünemez");


    }


    public void randomSayi() {
        Random random = new Random();
        By zero = AppiumBy.accessibilityId("0");
        By one = AppiumBy.accessibilityId("1");
        By two = AppiumBy.accessibilityId("2");
        By three = AppiumBy.accessibilityId("3");
        By four = AppiumBy.accessibilityId("4");
        By five = AppiumBy.accessibilityId("5");
        By six = AppiumBy.accessibilityId("6");
        By seven = AppiumBy.accessibilityId("7");
        By eight = AppiumBy.accessibilityId("8");
        By nine = AppiumBy.accessibilityId("9");


        secim = random.nextInt(10);
        switch (secim) {
            case 0:
                driver.findElement(zero).click();
                break;
            case 1:
                driver.findElement(one).click();
                break;
            case 2:
                driver.findElement(two).click();
                break;
            case 3:
                driver.findElement(three).click();
                break;
            case 4:
                driver.findElement(four).click();
                break;
            case 5:
                driver.findElement(five).click();
                break;
            case 6:
                driver.findElement(six).click();
                break;
            case 7:
                driver.findElement(seven).click();
                break;
            case 8:
                driver.findElement(eight).click();
                break;
            case 9:
                driver.findElement(nine).click();
                break;
            default:
                System.out.print("Lütfen Geçerli Bir Sayı Giriniz!");
        }


    }
}
