package vpn;

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
        open();
    }

    @BeforeEach
    void beforeEach() {

    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }
}
