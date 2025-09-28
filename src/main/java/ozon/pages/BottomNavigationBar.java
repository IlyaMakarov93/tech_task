package ozon.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class BottomNavigationBar {
    private final SelenideElement buttonCart= $(AppiumBy.id("ru.ozon.app.android:id/menu_cart"));
    private final SelenideElement textButtonCartQuantityProducts= $(AppiumBy.id("ru.ozon.app.android:id/tab_badge"));

    public void clickButtonCart(){
        buttonCart.click();
    }

    public String getButtonCartQuantityProducts(){
        return textButtonCartQuantityProducts.getAttribute("content-desc");
    }
}
