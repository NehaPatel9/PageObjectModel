import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util1{

    private By _registerbutton = By.linkText("Register");
    private By _Computers = By.linkText("Computers");
    private By _Electronics = By.linkText("Electronics");

    String expectedTitle = "Welcome to our store";
    String actualText1 = getTextfromElement(By.xpath("//h2[text() ='Welcome to our store']"));

    public void VerifyTextofHomePage() {
        Assert.assertEquals(actualText1,expectedTitle);
        }

    public void clickregistration(){
        clickElement(_registerbutton, 20);
    }
    public void ClickonComputer() {
        clickElement(_Computers, 20);
    }
    public void ClickonElectronics(){
        clickElement(_Electronics, 20);
    }
}
