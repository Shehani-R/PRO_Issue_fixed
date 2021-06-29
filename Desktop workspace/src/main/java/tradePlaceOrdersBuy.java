import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.TestApp;

public class tradePlaceOrdersBuy {
    @FindBy(xpath = "//MenuItem[@Name='Trade']")
    private WebElement tradeFieldElement;


    @FindBy(xpath = "//MenuItem[@Name='Buy']")
    private WebElement tradeBuyFieldElement;

    @FindBy(xpath = "//SmartSearct[@AutomationId='txtCustomerSmartSearch']")
    private WebElement searchCustomerElement;


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
        TestApp.getInstance().waitForElement(By.xpath("//SmartSearct[@AutomationId='txtCustomerSmartSearch']"),60);
        searchCustomerElement.click();
        searchCustomerElement.sendKeys(customer);
        return this;
    }
}
