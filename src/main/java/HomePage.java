import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends Util1 {

    private By _registerbutton = By.linkText("Register");
    private By _Computers = By.linkText("Computers");
    private By _Electronics = By.linkText("Electronics");
    private By _Searchinputbox = By.xpath("//input[@type=\"submit\"]");
    private By _Facebook = By.linkText("Facebook");
    private By _NewOnlineStore = By.linkText("New online store is open!");

    public void VerifyTextofHomePage() {
        String expectedTitle = "Welcome to our store";
        String actualText1 = getTextfromElement(By.xpath("//h2[text() ='Welcome to our store']"));
        Assert.assertEquals(actualText1, expectedTitle);
    }

    public void clickregistration() {
        clickElement(_registerbutton, 20);
    }

    public void ClickonComputer() {
        clickElement(_Computers, 20);
    }

    public void ClickonElectronics() {
        clickElement(_Electronics, 20);
    }

    public void clickonSearchButton() {

        clickElement(_Searchinputbox, 40);
    }

    public void alertMessage() {
        driver.switchTo().alert().getText();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String alertMessage = driver.switchTo().alert().getText();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(alertMessage);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void verifyTextofAlert() {
        String expectedTitle = "Please enter some search keyword";
        String actualText1 = driver.switchTo().alert().getText();
        Assert.assertEquals(actualText1, expectedTitle);
    }

    public void acceptAlert() {
            driver.switchTo().alert().accept();
    }
    public void clickOnFaceBook(){
        clickElement(_Facebook, 20);
    }
    public void clickOnNewonlineStore(){clickElement(_NewOnlineStore, 20);}
}



