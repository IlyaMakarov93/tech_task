package ozon.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement textYourCard = $(AppiumBy.id("ru.ozon.app.android:id/headerSubtitleTv"));
    private final SelenideElement quantityProducts = $(AppiumBy.id("ru.ozon.app.android:id/quantityEt"));
    private final SelenideElement buttonRemoveProductFromCart = $(AppiumBy.id("ru.ozon.app.android:id/removeButton"));
    private final SelenideElement buttonProductRemovalConfirmation = $(AppiumBy.id("android:id/button1"));

    public String getTextYourCart(){
        return textYourCard.text();
    }
    public String getQuantityProducts(){return quantityProducts.text();}
    public void clickButtonRemoveProductFromCart(){buttonRemoveProductFromCart.click();}
    public void clickButtonProductRemovalConfirmation(){buttonProductRemovalConfirmation.click();}


}
