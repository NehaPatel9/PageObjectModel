import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Util1 {

    private By _registerbutton = By.linkText("Register");
    private By _Computers = By.linkText("Computers");
    private By _Electronics = By.linkText("Electronics");
    private By _Searchinputbox = By.xpath("//input[@type=\"submit\"]");
    private By _Facebook = By.linkText("Facebook");
    private By _NewOnlineStore = By.linkText("New online store is open!");
    private By _Currencyselect = By.xpath("//select[@id=\"customerCurrency\"]");

    public void VerifyTextofHomePage() { //Assert homepage text
        String expectedTitle = "Welcome to our store";
        String actualText1 = getTextfromElement(By.xpath("//h2[text() ='Welcome to our store']"));
        Assert.assertEquals(actualText1, expectedTitle);
    }

    public void clickregistration() {
        clickElement(_registerbutton, 20);
    } //click registration link

    public void ClickonComputer() {
        clickElement(_Computers, 20);
    } // click computer link

    public void ClickonElectronics() {
        clickElement(_Electronics, 20);
    } // click electronics link

    public void clickonSearchButton() { clickElement(_Searchinputbox, 40); } // click search input box

    public void alertMessage() { //Switch to alert message and get text from alert
        driver.switchTo().alert().getText();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String alertMessage = driver.switchTo().alert().getText();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(alertMessage);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void verifyTextofAlert() { // Assert text from alert message
        String expectedTitle = "Please enter some search keyword"; //Expected alert message
        String actualText1 = driver.switchTo().alert().getText(); //Actual alert message
        Assert.assertEquals(actualText1, expectedTitle); //Assert actual and expected message
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }// Method to click ok on alert

    public void clickOnFaceBook() {
        clickElement(_Facebook, 20);
    } //Method to click on Facebbok link

    public void clickOnNewonlineStore() { clickElement(_NewOnlineStore, 20); } //Method to click on New online store

    public void Selectcurrency() { //Method to select currency from homepage

        clickElement(_Currencyselect, 20); //click on currency button

        Select currency = new Select(driver.findElement(_Currencyselect));//select Euro currency
        currency.selectByVisibleText("Euro");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Wait time 30 second

        List<WebElement> ProductName = driver.findElements(By.className("prices"));
        for (WebElement Product : ProductName) //For each loop for confirming currency symbol of four products
            System.out.println(Product.getText().contains("")); // Print result of four products with Euro and prices
        }
    public void Assertcurrency () { //Method to assert currency and symbol

        String expectedTitle = "€21.50";
        String actualText1 = getTextfromElement(By.xpath("//span[text()='€21.50']"));
        Assert.assertEquals(actualText1, expectedTitle);

    }
}



