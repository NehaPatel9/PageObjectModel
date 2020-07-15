import org.openqa.selenium.By;

public class Electronics extends Util1 {

private By _CellCategory = By.xpath("//a[@title=\"Show products in category Cell phones\"]");
private By _HTCOne = By.linkText("HTC One Mini Blue");
private By _AddtoCartHTC = By.xpath("//input[@id=\"add-to-cart-button-19\"]");
private By _ShoppingCart =  By.linkText("Shopping cart");

public void AddtoCartHTCOne() {

    clickElement(_CellCategory, 20);
    clickElement(_HTCOne, 20);
    clickElement(_AddtoCartHTC, 20);
}
public void ClickonShoppingCart(){
        clickElement(_ShoppingCart, 20);

    }
}

