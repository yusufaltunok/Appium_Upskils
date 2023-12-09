package techproed.basetest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import techproed.utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalculatorBaseTest extends ReusableMethods {
    public AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
//        String appUrl = System.getProperty("user.dir")
//                + File.separator + "src"
//                + File.separator + "test"
//                + File.separator + "resources"
//                + File.separator + "Calculator.apk";
//        UiAutomator2Options options = new UiAutomator2Options()
//                .setApp(appUrl);

            UiAutomator2Options options = new UiAutomator2Options()
                    .setAppPackage("com.google.android.calculator")
                    .setAppActivity("com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Apk sı olmayan uygulamalar için, Cihazda uygulamayı açtıktan sonra
    // "cmd" de aşağıdaki kodlardan birini çalıştırarak setAppPackage() ve setAppActivity() yollarını al

    // adb shell dumpsys window | find "mCurrentFocus"
    // dumpsys activity activities | grep mResumedActivity
    // adb shell dumpsys window | grep -E "mCurrentFocus"j7y17lte:/ $ dumpsys window | grep -E "mCurrentFocus"


    @AfterClass
    public void afterClass() {
        driver.quit();

    }
}
