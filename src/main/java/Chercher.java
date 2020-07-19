import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Chercher extends Util1{

    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _Animals = By.xpath("//select[@class=\"col-lg-3\"]");

    public void notAfriendlyTopic(){

    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

    WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
    driver.switchTo().frame(_iframe1);
    TypeText(_TypeTopicName, "Animal Name", 20);

    WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
    driver.switchTo().frame(_iframe3);
    clickElement(_CheckBox, 20);

    //WebElement _iframe2 = driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
   // driver.switchTo().frame(_iframe2);
   // selectFromDropDownByVisibleText(_Animals, "Avatar", 20);

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }

    public void verifyText() {

        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);

        String expectedText = "Frames Examples in Selenium Webdriver";
        String actualText = getTextfromElement(By.xpath("//h1[@class=\"breadcrumb-item\"]"));
        Assert.assertEquals(actualText, expectedText);
    }
}