import org.openqa.selenium.By;

public class DeskTop extends Util1{

    private By _ProductDigitalStorm =By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    //Locator for Product Digital Storm

    public void ClickonProductDigitalStorm() {
        clickElement(_ProductDigitalStorm, 20);//Method to click on product Digital Storm
    }
}
