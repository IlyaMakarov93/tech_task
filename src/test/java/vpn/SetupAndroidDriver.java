package vpn;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.jspecify.annotations.NullMarked;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SetupAndroidDriver implements WebDriverProvider {

    @Override
    @NullMarked
    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setDeviceName("Emulator")
                .setAppPackage("vpn.fast.unlimited.free")
                .setAppActivity("vpn.fast.unlimited.free.main.MainActivity");
        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
