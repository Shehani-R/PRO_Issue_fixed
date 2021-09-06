import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.TestApp;

import java.util.List;

public class tradePlaceOrdersBuy {
    @FindBy(xpath = "//MenuItem[@Name='Trade']")
    private WebElement tradeFieldElement;

    @FindBy(xpath = "//MenuItem[@Name='Buy']")
    private WebElement tradeBuyFieldElement;

    @FindBy(name = "Please select a customer first")
    private WebElement searchCustomerSymbolElement;

    @FindBy(xpath = "//ListBox[@AutomationId='listBoxResult']")
    private List<WebElement> customerNameResultElements;

    @FindBy(xpath = "//Button[@Name='+']")
    private WebElement addSymbolButtonElement;

    @FindBy(xpath = "//Edit[@ClassName='TextBox']")
    private WebElement addSymbolNameElement;

    @FindBy(name = "Exchange")
    private WebElement searchCustomerSymbolExchangeElement;

    @FindBy(xpath = "//Edit[@ClassName='TextBox']")
    private List<WebElement> addSymbolExchangeElement;

    @FindBy(name = "Add")
    private WebElement addButtonElement;

    @FindBy(name = "Close")
    private WebElement closeButtonElement;

    @FindBy(xpath = "/Window[@Name='MubasherTrade DT DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatfor" +
            "m.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) AAPL'][starts-with(@Automa" +
            "tionId,'Mubasher.ClientTradingPlatform.Trade.Module.DealerExtension.View')]/Custom[@ClassName='BaseOrder" +
            "View']/Custom[@AutomationId='actionView']/Custom[@AutomationId='txtQty']/Edit[@AutomationId='MainText']")
    private WebElement QuantityFieldElement;

    @FindBy(xpath = "/Window[@Name='MubasherTrade DT DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) AAPL'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.DealerExtension.View')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/Custom[@AutomationId='txtPrice']/Edit[@AutomationId='MainText']")
    private WebElement priceFieldElement;




    public tradePlaceOrdersBuy Trade () {
       TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Trade']"),60);
        tradeFieldElement.click();
        return this;
    }

    public tradePlaceOrdersBuy TradeBuy () {
        TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Buy']"),60);
        tradeBuyFieldElement.click();
        return this;
    }

    public tradePlaceOrdersBuy searchCustomer (String customer) {
        TestApp.getInstance().waitForElement(By.name("Please select a customer first"),60);
        Actions customerSearch = new Actions(TestApp.getInstance().getDriver());
        customerSearch.moveToElement(searchCustomerSymbolElement).sendKeys(customer).perform();
        return this;
    }

    public tradePlaceOrdersBuy customerSelection () {
//        TestApp.getInstance().waitForElement(By.xpath("//ListBox[@AutomationId='listBoxResult']"),60);
        Actions customerSearchSelection = new Actions(TestApp.getInstance().getDriver());
        customerSearchSelection.moveByOffset(939,245).click().perform();
//        for (WebElement element: customerNameResultElements){
//            System.out.println("x:" + element.getLocation().getX()+" Y:"+element.getLocation().getY());
//            if (element.getLocation().getX() == 948 && element.getLocation().getY() == 245){
//                element.click();
//            }
//        }
//       customerSearchSelection.moveToElement(customerNameResultElements).click().perform();
//        customerSearchSelection.doubleClick(customerNameResultElement).perform();
//        customerNameResultElement.click();
        return this;
    }

    public tradePlaceOrdersBuy clickPlusIcon () {
        TestApp.getInstance().waitForElement(By.xpath("//Button[@Name='+']"),60);
//        Actions customerSearch = new Actions(TestApp.getInstance().getDriver());
//        customerSearch.moveToElement(searchCustomerSymbolElement).sendKeys(customer).perform();
        addSymbolButtonElement.click();
        return this;
    }
    public tradePlaceOrdersBuy clickSymbolName (String SymbolCode) {
        TestApp.getInstance().waitForElement(By.xpath("//Edit[@ClassName='TextBox']"),60);
        Actions symbolCodenew = new Actions(TestApp.getInstance().getDriver());
        addSymbolNameElement.click();
        symbolCodenew.moveToElement(addSymbolNameElement).sendKeys(SymbolCode).perform();
        return this;
    }

    public tradePlaceOrdersBuy clickSymbolExchange (String SymbolExchange) {
        TestApp.getInstance().waitForElement(By.xpath("//Edit[@ClassName='TextBox']"),60);
        Actions symbolCodeExchange = new Actions(TestApp.getInstance().getDriver());
        for (WebElement element: addSymbolExchangeElement){
//            System.out.println("x:" + element.getLocation().getX()+" Y:"+element.getLocation().getY());
            if (element.getLocation().getX() == 1422 && element.getLocation().getY() == 198){
                element.sendKeys(SymbolExchange);
            }
        }
//        symbolCodeExchange.moveToElement(addSymbolExchangeElement,939,131).sendKeys(SymbolExchange).perform();
//        addSymbolExchangeElement.click();
//        symbolCodeExchange.moveToElement(addSymbolExchangeElement).sendKeys(SymbolExchange).perform();
        return this;
    }

    public tradePlaceOrdersBuy AddButton () {
        TestApp.getInstance().waitForElement(By.name("Add"),60);
        Actions customerSearch = new Actions(TestApp.getInstance().getDriver());
        customerSearch.moveToElement(addButtonElement).click().perform();
        return this;
    }

    public tradePlaceOrdersBuy CloseButton () {
        TestApp.getInstance().waitForElement(By.name("Close"),60);
        Actions customerSearch = new Actions(TestApp.getInstance().getDriver());
        customerSearch.moveToElement(closeButtonElement).click().perform();
        return this;
    }

    public tradePlaceOrdersBuy QuantityFieldButton (String quantity) {
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade DT DIFC'][starts-with(@Automation" +
                "Id,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AA" +
                "PL (NSDQ) AAPL'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.DealerExtens" +
                "ion.View')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/Custom[@Automation" +
                "Id='txtQty']/Edit[@AutomationId='MainText']"),60);
        Actions customerSearch = new Actions(TestApp.getInstance().getDriver());
        customerSearch.moveToElement(QuantityFieldElement).sendKeys(quantity).perform();
        return this;
    }

    public tradePlaceOrdersBuy priceFieldButton (String price) {
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade DT DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) AAPL'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.DealerExtension.View')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/Custom[@AutomationId='txtPrice']/Edit[@AutomationId='MainText']"),60);
        Actions customerPriceSearch = new Actions(TestApp.getInstance().getDriver());
        customerPriceSearch.moveToElement(priceFieldElement).sendKeys(price).perform();
        return this;
    }




}
