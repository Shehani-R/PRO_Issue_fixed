import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.TestApp;

public class LoginPage {
    @FindBy(className = "TextBox")
    private WebElement usernameFieldElement;

    @FindBy(className = "PasswordBox")
    private WebElement passwordFieldElement;

    @FindBy(xpath = "//Button[@AutomationId='btnLogin']")
    private WebElement submitButtonElement;


    public LoginPage setUsername (String username) {
//       TestApp.getInstance().waitForElement(By.className("TextBox"),60);
        usernameFieldElement.clear();
        usernameFieldElement.sendKeys(username);
        return this;
    }

    public LoginPage setPassword (String password) {
        TestApp.getInstance().waitForElement(By.className("PasswordBox"),60);
        passwordFieldElement.sendKeys(password);
        return this;
    }

    public LoginPage clickSubmitButton () {
        TestApp.getInstance().waitForElement(By.xpath("//Button[@AutomationId='btnLogin']"),60);
        submitButtonElement.click();
        return this;
    }

}
