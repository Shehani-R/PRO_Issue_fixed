import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.TestApp;

public class TradeOrderList {
    @FindBy(xpath = "//MenuItem[@Name='Trade']")
    private WebElement tradenewFieldElement;


    @FindBy(xpath = "//MenuItem[@Name='Order List']")
    private WebElement orderListFieldElement;

//    @FindBy(xpath = "//SmartSearct[@AutomationId='txtCustomerSmartSearch']")
//    private WebElement searchCustomerElement;


    public TradeOrderList OrderListTradeMenu () {
        TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Trade']"),60);
        tradenewFieldElement.click();
        return this;
    }

    public TradeOrderList OrderListOrderLIst () {
        TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Order List']"),60);
        orderListFieldElement.click();
        return this;
    }

}
