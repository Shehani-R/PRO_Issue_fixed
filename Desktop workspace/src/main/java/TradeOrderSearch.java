import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.TestApp;

public class TradeOrderSearch {
    @FindBy(xpath = "//MenuItem[@Name='Trade']")
    private WebElement tradenew1FieldElement;


    @FindBy(xpath = "//MenuItem[@Name='Order Search']")
    private WebElement orderSearchFieldElement;

//    @FindBy(xpath = "//SmartSearct[@AutomationId='txtCustomerSmartSearch']")
//    private WebElement searchCustomerElement;


    public TradeOrderSearch OrderListTradeMenu () {
        TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Trade']"),60);
        tradenew1FieldElement.click();
        return this;
    }

    public TradeOrderSearch TradeOrderSearch() {
        TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Order Search']"),60);
        orderSearchFieldElement.click();
        return this;
    }
}
