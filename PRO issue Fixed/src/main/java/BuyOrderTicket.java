import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.TestApp;

public class BuyOrderTicket {
    //Trade Menu
    @FindBy(xpath = "//MenuItem[@Name='Trade']")
    private WebElement tradeFieldElement;

    //Buy
    @FindBy(name = "Buy")
    private WebElement BuyElement;

    //Portfolio
    @FindBy(xpath = "//ComboBox[@AutomationId='cmbPortfolio']")
    private WebElement PortfolioDropDownElement;

    //Symbol
    @FindBy(xpath = "//Edit[@AutomationId='searchTextBox']")
    private WebElement symbolSearchElement;

    //Quantity
    @FindBy(xpath = "/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform" +
            ".Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) APPLE INC'][starts-with(@Auto" +
            "mationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewModel.OrderTicke')]/Custom[@ClassName='BaseOrde" +
            "rView']/Custom[@AutomationId='actionView']/Custom[@AutomationId='txtQty']/Edit[@AutomationId='MainText']")
    private WebElement QuantityElement;

    //Price
    @FindBy(xpath = "/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatfo" +
            "rm.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) APPLE INC'][starts-with(" +
            "@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewModel.OrderTicke')]/Custom[@ClassName='Ba" +
            "seOrderView']/Custom[@AutomationId='actionView']/Custom[@AutomationId='txtPrice']/Edit[@AutomationId='M" +
            "ainText']")
    private WebElement PriceElement;

    //Buy Button
    @FindBy(name = "100.0000")
    private WebElement BuyButtonElement;

    // Buy Yes button
    @FindBy(name = "Yes")
    private WebElement BuyYesButtonElement;

    //OrderType Drop down
    @FindBy(xpath = "/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatfo" +
            "rm.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) APPLE INC'][starts-with(@" +
            "AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewModel.OrderTicke')]/Custom[@ClassName='B" +
            "aseOrderView']/Custom[@AutomationId='actionView']/ComboBox[@AutomationId='cmbOrderTypes']")
    private WebElement OrderTypeDropDownElement;

    //OrderType Drop down Option
    @FindBy(name = "Limit Order")
    private WebElement OrderTypeDropDownOptionElement;

    //Good Till DropDown
    @FindBy(xpath = "/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatf" +
            "orm.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) APPLE INC'][starts-with" +
            "(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewModel.OrderTicke')]/Custom[@ClassName=" +
            "'BaseOrderView']/Custom[@AutomationId='actionView']/ComboBox[@AutomationId='cmbTifTypesCollection']")
    private WebElement GoodTillDropDownElement;

    @FindBy(name = "DAY")
    private WebElement GoodTillDropDownDayOptionElement;

    @FindBy(xpath = "/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatfo" +
            "rm.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : AAPL (NSDQ) APPLE INC'][starts-with(@" +
            "AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewModel.OrderTicke')]/Custom[@ClassName='Ba" +
            "seOrderView']/Custom[@AutomationId='actionView']/ComboBox[@AutomationId='cmbActionCollection']")
    private WebElement BuySideDropDownElement;

    @FindBy(name = "Buy")
    private WebElement BuySideDropDownOptionElement;

    @FindBy(name = "Sell")
    private WebElement SellSideDropDownOptionElement;





    public BuyOrderTicket Trade() {
        TestApp.getInstance().waitForElement(By.xpath("//MenuItem[@Name='Trade']"), 60);
        tradeFieldElement.click();
        return this;
    }

    public BuyOrderTicket Buy() {
        TestApp.getInstance().waitForElement(By.name("Buy"), 60);
        BuyElement.click();
        return this;
    }

    public BuyOrderTicket PortfolioDropDown() {
        TestApp.getInstance().waitForElement(By.xpath("//ComboBox[@AutomationId='cmbPortfolio']"), 60);
        Actions portfolioDropDown = new Actions(TestApp.getInstance().getDriver());
        portfolioDropDown.moveToElement(PortfolioDropDownElement).click().perform();
        PortfolioDropDownElement.sendKeys(Keys.ENTER);
        return this;
    }

    public BuyOrderTicket searchSymbol(String symbol1) {
        TestApp.getInstance().waitForElement(By.xpath("//Edit[@AutomationId='searchTextBox']"), 60);
        symbolSearchElement.click();
        symbolSearchElement.clear();
        Actions symbolSearch = new Actions(TestApp.getInstance().getDriver());
        symbolSearch.moveToElement(symbolSearchElement).sendKeys(symbol1).perform();
        symbolSearchElement.sendKeys(Keys.ENTER);
        return this;
    }

    public BuyOrderTicket QuantityField() {
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@Automati" +
                "onId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order :" +
                " AAPL (NSDQ) APPLE INC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.Vie" +
                "wModel.OrderTicke')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/Custom[@" +
                "AutomationId='txtQty']/Edit[@AutomationId='MainText']" +
                "\n"), 60);
        QuantityElement.click();
        QuantityElement.clear();
        QuantityElement.sendKeys("10");
        return this;
    }

    public BuyOrderTicket PriceField () {
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@Automati" +
                "onId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order :" +
                " AAPL (NSDQ) APPLE INC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.Vie" +
                "wModel.OrderTicke')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/Custom[@" +
                "AutomationId='txtPrice']/Edit[@AutomationId='MainText']"),60);
        PriceElement.click();
        PriceElement.clear();
        PriceElement.sendKeys("10");
        return this;
    }

    public BuyOrderTicket BuyButton (){
        TestApp.getInstance().waitForElement(By.name("100.0000"),60);
        BuyButtonElement.click();
        return this;
    }

    public BuyOrderTicket BuyYesButton () {
        TestApp.getInstance().waitForElement(By.name("Yes"),60);
        Actions buyYesButton = new Actions(TestApp.getInstance().getDriver());
        buyYesButton.moveToElement(BuyYesButtonElement).click().perform();
        return this;
    }

    public BuyOrderTicket OrderTypeDropDown (){
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@Automati" +
                "onId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order :" +
                " AAPL (NSDQ) APPLE INC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.View" +
                "Model.OrderTicke')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/ComboBox[" +
                "@AutomationId='cmbOrderTypes']"),60);
        Actions orderTypeDropDown = new Actions(TestApp.getInstance().getDriver());
        orderTypeDropDown.moveToElement(OrderTypeDropDownElement).click().perform();
        return this;
    }

    public BuyOrderTicket OrderTypeDropDownOption (){
        TestApp.getInstance().waitForElement(By.name("Limit Order"),60);
        Actions orderTypeDropDown = new Actions(TestApp.getInstance().getDriver());
        orderTypeDropDown.moveToElement(OrderTypeDropDownOptionElement).click().perform();
        return this;

    }

    public BuyOrderTicket GoodTillDropDown () {
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@Automatio" +
                "nId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : A" +
                "APL (NSDQ) APPLE INC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewMo" +
                "del.OrderTicke')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/ComboBox[@Au" +
                "tomationId='cmbTifTypesCollection']"),60);
        Actions GoodTillDropDown = new Actions(TestApp.getInstance().getDriver());
        GoodTillDropDown.moveToElement(GoodTillDropDownElement).click().perform();
        return this;
    }

    public BuyOrderTicket GoodTillDropDownDayOption () {
        TestApp.getInstance().waitForElement(By.name("DAY"),60);
        Actions GoodTillDropDown = new Actions(TestApp.getInstance().getDriver());
        GoodTillDropDown.moveToElement(GoodTillDropDownDayOptionElement).click().perform();
        return this;
    }

    public BuyOrderTicket BuySideDropDownClick(){
        TestApp.getInstance().waitForElement(By.xpath("/Window[@Name='MubasherTrade Pro DIFC'][starts-with(@Automati" +
                "onId,'Mubasher.ClientTradingPlatform.Infrastructure.ViewModels.ShellVi')]/Window[@Name='New Order : " +
                "AAPL (NSDQ) APPLE INC'][starts-with(@AutomationId,'Mubasher.ClientTradingPlatform.Trade.Module.ViewM" +
                "odel.OrderTicke')]/Custom[@ClassName='BaseOrderView']/Custom[@AutomationId='actionView']/ComboBox[@A" +
                "utomationId='cmbActionCollection']"),60);
        Actions BuySide = new Actions(TestApp.getInstance().getDriver());
        BuySide.moveToElement(BuySideDropDownElement).click().perform();
        return this;
    }

    public BuyOrderTicket BuySideDropDownOption () {
        TestApp.getInstance().waitForElement(By.name("Buy"),60);
        Actions GoodTillDropDown = new Actions(TestApp.getInstance().getDriver());
        GoodTillDropDown.moveToElement(BuySideDropDownOptionElement).click().perform();
        return this;
    }

    public BuyOrderTicket SellSideDropDownOption () {
        TestApp.getInstance().waitForElement(By.name("Sell"),60);
        Actions GoodTillDropDown = new Actions(TestApp.getInstance().getDriver());
        GoodTillDropDown.moveToElement(SellSideDropDownOptionElement).click().perform();
        return this;
    }

}
