package ozon.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private final SelenideElement popUpBanner = $(AppiumBy.id("ru.ozon.app.android:id/bannerObv"));
    private final SelenideElement buttonClosePopUpBanner = $(AppiumBy.id("ru.ozon.app.android:id/closeButtonIb"));
    private final SelenideElement buttonAddProductInBasket = $(AppiumBy.id("ru.ozon.app.android:id/mainBtn"));
    private final SelenideElement buttonIncreaseProductInCart = $(AppiumBy.id("ru.ozon.app.android:id/plusIb"));


    /* Закрытие баннера "Товары за 1 руб", если он появляется*/
    public void clickButtonClosePopUpBanner() {
        if (popUpBanner.has(Condition.enabled, Duration.ofSeconds(5))) {
            buttonClosePopUpBanner.click();
        }
    }

    public void clickButtonAddProductInCart() {
        buttonAddProductInBasket.click();
    }

    public void clickIncreaseProductInCart(int quantityPress) {
        for (int i = 0; i < quantityPress; i++) {
            buttonIncreaseProductInCart.click();
        }
    }

}
