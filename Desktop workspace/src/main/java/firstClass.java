import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import util.TestApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class firstClass {

    public static WindowsDriver driver =null;


    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        TestApp.getInstance().openApplication();
        driver = TestApp.getInstance().getDriver();
    }

    @Test
    public void connection() throws InterruptedException {
//        driver.findElementByName("Connection Settings").click();
//        driver.findElementByXPath("//TextBox[@AutomationId='txtTradeIP1']").clear();
//        driver.findElementByXPath("//TextBox[@AutomationId='txtTradeIP1']").sendKeys("trs-uat.mubashertrade.com");
        driver.findElementByClassName("TextBox").clear();
        driver.findElementByClassName("TextBox").sendKeys("shehani_dt");
        driver.findElementByClassName("PasswordBox").sendKeys("Sheni@123");
        driver.findElementByName("Remember Login ID").click();

//        driver.findElementByName("Login").click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElementByXPath("Trade").click();
        driver.findElementByXPath("//Button[@AutomationId='btnLogin']").click();
    }


//    @AfterClass
//    public void close(){
//        TestApp.getInstance().closeApplication();
//    }

}
