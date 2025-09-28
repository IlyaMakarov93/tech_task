package ozon;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = SetupAndroidDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void beforeEach() {
        open();
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }
}
