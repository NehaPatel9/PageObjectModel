import org.openqa.selenium.By;

public class DigitalStormVANQUISH extends Util1 {
    private By _ClickEmailAFriend = By.xpath("//input[@value=\"Email a friend\"]");//Locator for click on Email a Friend
    private By _AddtocartDigital = By.xpath("//input[@id='add-to-cart-button-2']");//Locator for Click on Add to Cart Button

    public void ClickonEmailAFriend() { //Method for click on email a Friend
        clickElement(_ClickEmailAFriend, 20);
    }
    public void ClickonAddtocartDigital() { // Method for click on Add to Card button
        clickElement(_AddtocartDigital, 50);
    }

}
