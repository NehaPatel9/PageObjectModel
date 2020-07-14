import org.openqa.selenium.By;

public class Computer extends Util1 {

    private By _Desktops =  By.linkText("Desktops");//Locator for Desktops

    public void ClickonDeskTops() {
        clickElement(_Desktops, 20);//Method to click on Desktops
    }
}
