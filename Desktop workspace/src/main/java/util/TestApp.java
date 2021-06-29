package util;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestApp {
    private WindowsDriver driver;
    private static TestApp myObj;

    public static TestApp getInstance() {
        if (myObj == null) {
            myObj = new TestApp();
            return myObj;
        } else {
            return myObj;
        }
    }

    public WindowsDriver getDriver() {
        return driver;
    }

    private void setDriver(WindowsDriver driver) {
        this.driver = driver;
    }

    public static void setMyObj(TestApp myObj) {
        TestApp.myObj = myObj;
    }

    public void openApplication() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app","C:\\Program Files (x86)\\MubasherTrade DT DIFC\\Trader.exe");
        cap.setCapability("platformName","Windows");
        cap.setCapability("deviceName","WindowsPC");

        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public void closeApplication() {
        driver.quit();
    }

//    public WebElement waitForElement(By locator, int timeout) {
//        WebElement element = new WebDriverWait(TestApp.getInstance().getDriver(), timeout).until
//                (ExpectedConditions.presenceOfElementLocated(locator));
//        return element;
//    }

    public void setText(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = new WebDriverWait(TestApp.getInstance().getDriver(), timeout).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}
