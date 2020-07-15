import org.openqa.selenium.By;

public class DigitalStormVANQUISH extends Util1 {
    private By _ClickEmailAFriend = By.xpath("//input[@value=\"Email a friend\"]");
    private By _AddtocartDigital = By.xpath("//input[@id='add-to-cart-button-2']");

    public void ClickonEmailAFriend() {
        clickElement(_ClickEmailAFriend, 20);
    }
    public void ClickonAddtocartDigital() {
        clickElement(_AddtocartDigital, 50);
    }

}
