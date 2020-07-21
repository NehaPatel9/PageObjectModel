import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Chercher extends Util1{ //Method to open Chercher Link and enter in iframe

    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _Animals = By.xpath("//select");

    public void OpenBrowser() {
        //Method to openBrowser and click on link
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
    }
    public void verifyText(){
        String ExpectedText = "Frames Examples in Selenium Webdriver";
        String ActualText1 = getTextfromElement(By.xpath("//h1[@class=\"breadcrumb-item\"]"));
        Assert.assertEquals(ActualText1,ExpectedText);
    }

    public void SwitchtoIframes(){
        //Method to switch to Iframe1 and enter text in Topic input box

        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1); //switch to iframe1
        TypeText(_TypeTopicName, "Animal Name", 20);

        //Switch to iframe3 and check to checkbox
        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3); //switch to iframe3
        clickElement(_CheckBox, 20);

        driver.switchTo().defaultContent(); //Switch to mainframe

        driver.switchTo().frame("frame2"); //switch to iframe2
       // Select select = new Select(driver.findElement(_Animals));
       // select.selectByVisibleText("Avatar");
        selectFromDropDownByVisibleText(_Animals, "Avatar", 20);
    }
    public void verifyURL() { //Assert URL

            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, "https://chercher.tech/practice/frames-example-selenium-webdriver");
    }
}