import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.TestApp;

import java.net.MalformedURLException;

public class LoginPageTest {
    LoginPage loginPage;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        TestApp.getInstance().openApplication();
        loginPage = PageFactory.initElements(TestApp.getInstance().getDriver(), LoginPage.class);
    }


    @Test
    public void loginSuccess() throws InterruptedException {
        String userName = "shehani_dt";
        String password = "Sheni@123";
        loginPage.setUsername(userName).setPassword(password).clickSubmitButton();
        Thread.sleep(10000);


    }
}
