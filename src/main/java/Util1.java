import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Util1 extends BasePage {

    public static void TypeText(By by, String text, int time) {
        driver.findElement(by).sendKeys(text);//Method for finding an element and Typing text into it.
    }
    public static void clickElement(By by, int time) {
        driver.findElement(by).click(); //Method for finding an element and click on it.
    }
    public static long timestamp() {
        return (System.currentTimeMillis()); //Method to enter a live timestamp.
    }
    public static String getTextfromElement(By by) {
        return driver.findElement(by).getText(); // Method to find element and get text from that element.
    }
    public  static void selectFromDropDownByValue(By by, String n, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(n);
    }
    public  static void selectFromDropDownByindex(By by, String text, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public  static void selectFromDropDownByVisibleText(By by, String text, int time) {
        org.openqa.selenium.support.ui.Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

}

