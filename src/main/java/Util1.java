import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Util1 extends BasePage {

    public static void TypeText(By by, String text, int time) {
        driver.findElement(by).sendKeys(text);
    }

    public static void clickElement(By by, int time) {
        driver.findElement(by).click();
    }

    public static long timestamp() {

        return (System.currentTimeMillis());
    }

    public static String getTextfromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void selectFromDropDownByValue(By by, String n, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(n);
    }

    public static void selectFromDropDownByindex(By by, String text, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByVisibleText(By by, String text, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void ScreenShotCapture(String NameofScreenshot) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
           // String Screenshotname = new String();
            FileUtils.copyFile(scrFile, new File(("src\\ScreenShot" + NameofScreenshot + ".png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

