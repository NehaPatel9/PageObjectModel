import org.openqa.selenium.By;

public class Computer extends Util1 {

    private By _Desktops =  By.linkText("Desktops");

    public void ClickonDeskTops() {
        clickElement(_Desktops, 20);
    }
}
