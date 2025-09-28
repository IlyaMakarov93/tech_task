package ozon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import ozon.pages.BottomNavigationBar;
import ozon.pages.CartPage;
import ozon.pages.MainPage;
import ozon.pages.ProductPage;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuantityProducts extends BaseTest {
    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    BottomNavigationBar bottomNavigationBar = new BottomNavigationBar();
    CartPage cartPage = new CartPage();

    @Test
    void testQuantityProducts() {
        mainPage.sendKeysInFieldSearchAndChooseFirstResult("Raspberry pi 5");
        mainPage.clickFirstProductInList();
        productPage.clickButtonClosePopUpBanner();
        productPage.clickButtonAddProductInCart();
        productPage.clickIncreaseProductInCart(3);
        bottomNavigationBar.clickButtonCart();

        String textYourCart = cartPage.getTextYourCart();
        String textQuantityProducts = cartPage.getQuantityProducts();
        String textButtonCartQuantityProducts = bottomNavigationBar.getButtonCartQuantityProducts();
        assertAll(
                /*  Проверяем, что в корзине, рядом с "Ваша корзина" отобразился текст с ожидаемым количеством товара*/
                () -> assertTrue(textYourCart.contains("4 товара")),
                /*  Проверяем, что отобразилось ожидаемое количество товара в окне увеличения и уменьшения товара в корзине*/
                () -> assertEquals("4", textQuantityProducts),
                /* Проверяем, что отобразилось ожидаемое количество товара на бейдже корзины в BottomNavigationBar*/
                () -> assertEquals("4", textButtonCartQuantityProducts)
        );
    }

    /*Удаляем тестовые данные после прохождения теста*/
    @AfterEach
    void deleteProductInCart() {
        cartPage.clickButtonRemoveProductFromCart();
        cartPage.clickButtonProductRemovalConfirmation();
    }
}
