package vpn;

import org.junit.jupiter.api.Test;
import vpn.pages.MainPage;

import static java.lang.Thread.sleep;

public class TestVpn extends BaseTest{
    MainPage mainPage = new MainPage();

    @Test
    void testVpnConnectCheck()  {
        mainPage.clickButtonConnect();
    }
}
