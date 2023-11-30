package techproed.homework;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.CalculatorBaseTest;

import java.util.Random;

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
    By arti = AppiumBy.accessibilityId("Artı");
    By eksi = AppiumBy.accessibilityId("Eksi");
    By carpi = AppiumBy.accessibilityId("Çarpma");
    By bolu = AppiumBy.accessibilityId("Bölme");
    By sil = AppiumBy.accessibilityId("Temizle");
    By esit = AppiumBy.accessibilityId("Eşit");
    By arti_eksi = AppiumBy.accessibilityId("Artı/eksi");

    int secim;
    int num1;
    int num2;
    int expectedResult = 0;

    By sonuc = AppiumBy.androidUIAutomator("new UiSelector().description(\""+expectedResult+"\" Hesaplama sonucu\")");
    By sonuc1 = AppiumBy.androidUIAutomator("new UiSelector().description(\"−3 Hesaplama sonucu\")");
    By sonuc2 = AppiumBy.androidUIAutomator("new UiSelector().description(\"−10 Hesaplama sonucu\")");

    @Test
    public void testToplama() throws InterruptedException {

        // İki pozitif sayının toplamı
//        driver.findElement(bir).click();
//        driver.findElement(arti).click();
//        driver.findElement(iki).click();
//        driver.findElement(esit).click();
//        System.out.println("sonuc = " + driver.findElement(sonuc).getText());
//        driver.findElement(sil).click();

        randomSayi();
        num1 = secim;
        driver.findElement(arti).click();
        randomSayi();
        num2 = secim;
        driver.findElement(esit).click();

        //Dogrulama
        String result = driver.findElement(sonuc).getText();
        int actualResult = Integer.parseInt(result);
        expectedResult = num1 + num2;
        assertEquals(expectedResult, actualResult);
        System.out.println("Gercek deger = " + actualResult
                + "\nBeklenen deger = " + expectedResult);

        driver.findElement(sil).click();
/*

        // Bir pozitif bir negatif sayının toplamı
        driver.findElement(bes).click();
        driver.findElement(arti).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(sekiz).click();
        driver.findElement(esit).click();
        System.out.println("sonuc1 = " + driver.findElement(sonuc1).getText());
        driver.findElement(sil).click();

        // İki negatif sayının toplamı
        driver.findElement(arti_eksi).click();
        driver.findElement(dort).click();
        driver.findElement(arti).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(alti).click();
        driver.findElement(esit).click();
        System.out.println("sonuc2 = " + driver.findElement(sonuc2).getText());
        driver.findElement(sil).click();

 */
    }

    By cikarmaSonuc = AppiumBy.androidUIAutomator("new UiSelector().description(\"6 Hesaplama sonucu\")");
    By cikarmaSonuc1 = AppiumBy.androidUIAutomator("new UiSelector().text(\"12\")");
    By cikarmaSonuc2 = AppiumBy.androidUIAutomator("new UiSelector().description(\"4 Hesaplama sonucu\")");

    @Test
    public void testCikarma() {

        // İki pozitif sayıyı çıkarma
        driver.findElement(sekiz).click();
        driver.findElement(eksi).click();
        driver.findElement(iki).click();
        driver.findElement(esit).click();
        System.out.println("cikarmaSonuc = " + driver.findElement(cikarmaSonuc).getText());
        driver.findElement(sil).click();

        // Bir pozitif bir negatif sayıyı çıkarma
        driver.findElement(dort).click();
        driver.findElement(eksi).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(sekiz).click();
        driver.findElement(esit).click();
        System.out.println("cikarmaSonuc1 = " + driver.findElement(cikarmaSonuc1).getText());
        driver.findElement(sil).click();

        // İki negatif sayıyı çıkarma
        driver.findElement(arti_eksi).click();
        driver.findElement(uc).click();
        driver.findElement(eksi).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(yedi).click();
        driver.findElement(esit).click();
        System.out.println("cikarmaSonuc2 = " + driver.findElement(cikarmaSonuc2).getText());
        driver.findElement(sil).click();
    }

    By carpmaSonuc = AppiumBy.androidUIAutomator("new UiSelector().text(\"30\")");
    By carpmaSonuc1 = AppiumBy.androidUIAutomator("new UiSelector().text(\"−56\")");
    By carpmaSonuc2 = AppiumBy.androidUIAutomator("new UiSelector().text(\"52\")");

    @Test
    public void testCarpma() {
        // İki pozitif sayıyı carpma
        driver.findElement(alti).click();
        driver.findElement(carpi).click();
        driver.findElement(bes).click();
        driver.findElement(esit).click();
        System.out.println("carpmaSonuc = " + driver.findElement(carpmaSonuc).getText());
        driver.findElement(sil).click();

        // Bir pozitif bir negatif sayıyı carpma
        driver.findElement(yedi).click();
        driver.findElement(carpi).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(sekiz).click();
        driver.findElement(esit).click();
        System.out.println("carpmaSonuc1 = " + driver.findElement(carpmaSonuc1).getText());
        driver.findElement(sil).click();

        // İki negatif sayıyı carpma
        driver.findElement(arti_eksi).click();
        driver.findElement(bir).click();
        driver.findElement(uc).click();
        driver.findElement(carpi).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(dort).click();
        driver.findElement(esit).click();
        System.out.println("carpmaSonuc2 = " + driver.findElement(carpmaSonuc2).getText());
        driver.findElement(sil).click();

    }

    By bolmeSonuc = AppiumBy.androidUIAutomator("new UiSelector().description(\"3 Hesaplama sonucu\")");
    By bolmeSonuc1 = AppiumBy.androidUIAutomator("new UiSelector().text(\"−30\")");
    By bolmeSonuc2 = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sıfıra bölünemez.\")");

    @Test
    public void testBolme() {
        // İki pozitif sayıyı bölme
        driver.findElement(dokuz).click();
        driver.findElement(bolu).click();
        driver.findElement(uc).click();
        driver.findElement(esit).click();
        System.out.println("bolmeSonuc = " + driver.findElement(bolmeSonuc).getText());
        driver.findElement(sil).click();

        // Bir pozitif bir negatif sayıyı bölme
        driver.findElement(alti).click();
        driver.findElement(sifir).click();
        driver.findElement(bolu).click();
        driver.findElement(arti_eksi).click();
        driver.findElement(iki).click();
        driver.findElement(esit).click();
        System.out.println("carpmaSonuc1 = " + driver.findElement(bolmeSonuc1).getText());
        driver.findElement(sil).click();

        // Bir sayıyı "0" a bölme
        driver.findElement(dokuz).click();
        driver.findElement(bolu).click();
        driver.findElement(sifir).click();
        driver.findElement(esit).click();
        System.out.println("carpmaSonuc2 = " + driver.findElement(bolmeSonuc2).getText());
        driver.findElement(sil).click();


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
