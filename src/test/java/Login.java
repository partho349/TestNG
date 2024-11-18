import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(id="email")
    static WebElement txtEmail;
   @FindBy(id="password")
   static WebElement txtPassword;

   @FindBy(css="[type=submit]")
   static WebElement btnLogin;

   public Login(WebDriver driver){
       PageFactory.initElements(driver,this);
   }
   public static void doLogin(String email, String password){
       txtEmail.sendKeys(email);
       txtPassword.sendKeys(password);
       btnLogin.click();
   }
}
