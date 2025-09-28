package vpn.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final  SelenideElement textTapToConnect = $(AppiumBy.androidUIAutomator("new UiSelector().text(\"Tap to connect automatically\")"));

    private final SelenideElement buttonConnect = $(AppiumBy.xpath("//w0.f0/android.view.View/android.view.View/android.view.View[1]"));

    /*Предполагаем, что после появления текста Tap to connect, отобразится кнопка подключения VPN*/
    public void clickButtonConnect() {
        textTapToConnect.shouldBe(Condition.enabled, Duration.ofSeconds(20));
        buttonConnect.click();
    }

}
