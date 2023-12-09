package techproed.day11;

import org.testng.annotations.Test;
import techproed.basetest.DeviceBaseTest;

import java.time.Duration;

public class C24_EkranKilidi extends DeviceBaseTest {
    @Test
    public void testLockDevice() { // ekranı kilitle
        driver.lockDevice(Duration.ofSeconds(5));
        bekle(3);
    }


    @Test
    public void testUnlockDevice() { // ekran kilidini aç
        driver.lockDevice();
        bekle(5);
        driver.unlockDevice();
        bekle(3);
    }

    @Test
    public void testIsDeviceLocked() { // ekran kilitli mi değil mi, sorgula
        System.out.println(driver.isDeviceLocked()); //false --> cihaz kilitli mi
        driver.lockDevice();
        bekle(3);
        System.out.println(driver.isDeviceLocked()); //true
        driver.unlockDevice();
        bekle(2);
        System.out.println(driver.isDeviceLocked());//false
    }



}
