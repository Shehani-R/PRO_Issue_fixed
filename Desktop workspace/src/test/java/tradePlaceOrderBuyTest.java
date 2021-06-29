import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.TestApp;

import java.net.MalformedURLException;

public class tradePlaceOrderBuyTest {
    tradePlaceOrdersBuy tradePlaceOrdersBuy;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        tradePlaceOrdersBuy = PageFactory.initElements(TestApp.getInstance().getDriver(), tradePlaceOrdersBuy.class);
    }


    @Test
    public void buyTrade() throws InterruptedException {
        Thread.sleep(5000);
        tradePlaceOrdersBuy.Trade();
        tradePlaceOrdersBuy.TradeBuy();
        String customer = "Shehani Isurika Ranasinghe";
        tradePlaceOrdersBuy.searchCustomer(customer);
    }

}
