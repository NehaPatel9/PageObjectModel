import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util1{

    private By _registerbutton = By.linkText("Register");// Locator for register link
    private By _Computers = By.linkText("Computers"); // Locator for Computers category
    private By _Electronics = By.linkText("Electronics"); // Locator for Electronics category

    String expectedTitle = "Welcome to our store";
    String actualText1 = getTextfromElement(By.xpath("//h2[text() ='Welcome to our store']"));

    public void VerifyTextofHomePage() {
        Assert.assertEquals(actualText1,expectedTitle); //Veryfing Actual Text with Expected Text
        }

    public void clickregistration(){
        clickElement(_registerbutton, 20); //Method to click on register button
    }
    public void ClickonComputer() {
        clickElement(_Computers, 20); //Method to click on computers button
    }
    public void ClickonElectronics(){
        clickElement(_Electronics, 20); //Method to click on Electronics button
    }
}
