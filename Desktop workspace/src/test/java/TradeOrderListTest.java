import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.TestApp;

import java.net.MalformedURLException;

public class TradeOrderListTest {
    TradeOrderList tradeOrderList;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        tradeOrderList = PageFactory.initElements(TestApp.getInstance().getDriver(),TradeOrderList.class);
    }


    @Test
    public void OrderList() throws InterruptedException {
        Thread.sleep(5000);
        tradeOrderList.OrderListTradeMenu();
       tradeOrderList.OrderListOrderLIst();
    }

}
