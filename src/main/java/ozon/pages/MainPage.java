package ozon.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import java.time.Duration;

public class MainPage {
    private final SelenideElement firstProductInList = $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ru.ozon.app.android:id/tileGridItemCl\").instance(0)"));
    private final SelenideElement textFieldSearchInOzonNotFocused = $(AppiumBy.id("ru.ozon.app.android:id/searchTv"));
    private final SelenideElement textFieldSearchInOzonFocused = $(AppiumBy.id("ru.ozon.app.android:id/etSearch"));
    private final SelenideElement firstTextInSearchResult= $(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"ru.ozon.app.android:id/listRv\"]/android.view.ViewGroup[1]"));

    public void clickFirstProductInList() {
        firstProductInList.click();
    }

    public void sendKeysInFieldSearchAndChooseFirstResult(String nameProduct){
        textFieldSearchInOzonNotFocused.shouldBe(Condition.clickable, Duration.ofSeconds(10)).click();
        textFieldSearchInOzonFocused.sendKeys(nameProduct);
       /* Проверяем, что в первом предложенном варианте поиска содержится название искомого товара и кликаем по нему*/
        firstTextInSearchResult.$(AppiumBy.className("android.widget.TextView")).shouldHave(text(nameProduct)).click();
    }

}
