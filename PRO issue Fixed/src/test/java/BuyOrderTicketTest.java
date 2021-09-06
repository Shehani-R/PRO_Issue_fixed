import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.TestApp;

import java.net.MalformedURLException;

public class BuyOrderTicketTest {
    BuyOrderTicket buyOrderTicket;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        buyOrderTicket = PageFactory.initElements(TestApp.getInstance().getDriver(), BuyOrderTicket.class);
    }


    @Test(priority = 0)
    public void buyTrade() throws InterruptedException {
        buyOrderTicket.Trade();
        buyOrderTicket.Buy();
        buyOrderTicket.PortfolioDropDown();
        String symbol1 ="AAPL";
        buyOrderTicket.searchSymbol(symbol1);
        buyOrderTicket.QuantityField();
        buyOrderTicket.PriceField();
        buyOrderTicket.OrderTypeDropDown();
        Thread.sleep(3000);
        buyOrderTicket.OrderTypeDropDownOption();
        Thread.sleep(3000);
        buyOrderTicket.GoodTillDropDown();
        buyOrderTicket.GoodTillDropDownDayOption();
        buyOrderTicket.BuySideDropDownClick();
        buyOrderTicket.BuySideDropDownOption();
        buyOrderTicket.BuyButton();
        buyOrderTicket.BuyYesButton();
    }

    @Test(priority = 1)
    public void SellTrade() throws InterruptedException {
        buyOrderTicket.Trade();
        buyOrderTicket.Buy();
        buyOrderTicket.PortfolioDropDown();
        String symbol1 ="AAPL";
        buyOrderTicket.searchSymbol(symbol1);
        buyOrderTicket.QuantityField();
        buyOrderTicket.PriceField();
        buyOrderTicket.OrderTypeDropDown();
        Thread.sleep(3000);
        buyOrderTicket.OrderTypeDropDownOption();
        Thread.sleep(3000);
        buyOrderTicket.GoodTillDropDown();
        buyOrderTicket.GoodTillDropDownDayOption();
        buyOrderTicket.BuySideDropDownClick();
        buyOrderTicket.SellSideDropDownOption();
        buyOrderTicket.BuyButton();
        buyOrderTicket.BuyYesButton();
    }
}
