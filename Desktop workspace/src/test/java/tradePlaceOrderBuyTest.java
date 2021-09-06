import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.TestApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class tradePlaceOrderBuyTest {
    tradePlaceOrdersBuy tradePlaceOrdersBuy;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        tradePlaceOrdersBuy = PageFactory.initElements(TestApp.getInstance().getDriver(), tradePlaceOrdersBuy.class);
    }


    @Test
    public void buyTrade() throws InterruptedException {
        Thread.sleep(3000);
        tradePlaceOrdersBuy.Trade();
        tradePlaceOrdersBuy.TradeBuy();
        Thread.sleep(3000);
        String customer = "Shehani Isurika Ranasinghe";
        tradePlaceOrdersBuy.searchCustomer(customer);
//        Thread.sleep(5000);
//        tradePlaceOrdersBuy.customerSelection();
        Thread.sleep(3000);
        tradePlaceOrdersBuy.clickPlusIcon();
        Thread.sleep(5000);
        String SymbolCode = "AAPL";
        tradePlaceOrdersBuy.clickSymbolName(SymbolCode);
//        tradePlaceOrdersBuy.clickSymbolExchangeWord();
        String SymbolExchange = "NSDQ";
        tradePlaceOrdersBuy.clickSymbolExchange(SymbolExchange);
        tradePlaceOrdersBuy.AddButton();
        tradePlaceOrdersBuy.CloseButton();
//        tradePlaceOrdersBuy.CloseButton();
        String quantity = "10";
        tradePlaceOrdersBuy.QuantityFieldButton(quantity);
        String price = "10";
        tradePlaceOrdersBuy.priceFieldButton(price);

    }

}
