import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBook extends Util1 {

    public void faceBookWindow() {

        String MainWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
            }
        }
    }
    public void assertURL(){
                String URL = driver.getCurrentUrl();
                Assert.assertEquals(URL, "https://www.facebook.com/nopCommerce");
            }
    public void assrtText() {
        String expectedTitle = "Create New Account";
        String actualText1 = getTextfromElement(By.linkText("Create New Account"));
        Assert.assertEquals(actualText1, expectedTitle);
        System.out.println(actualText1);
    }
    public void assertByColour(){
        String expectedColour = "#42b72a";
        String ActualColour = driver. findElement(By.linkText("Create New Account")). getCssValue("background-color");
        String hexColour = Color.fromString(ActualColour).asHex();
        String Actulcolour = hexColour;
        Assert.assertEquals(Actulcolour,expectedColour);
        System. out. println("Button color: " + ActualColour);
    }
    public void closingChildWindow () {
           //Closing the Child Window
           driver.close();
    }
}
