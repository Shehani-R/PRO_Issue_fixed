import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.TestApp;

import java.net.MalformedURLException;

public class TradeOrderSearchTest {

    TradeOrderSearch tradeOrderSearch;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        tradeOrderSearch = PageFactory.initElements(TestApp.getInstance().getDriver(),TradeOrderSearch.class);
    }


    @Test
    public void OrderList() throws InterruptedException {
        Thread.sleep(5000);
        tradeOrderSearch.OrderListTradeMenu();
        tradeOrderSearch.TradeOrderSearch();
    }

}
