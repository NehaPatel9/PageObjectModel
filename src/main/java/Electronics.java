import org.openqa.selenium.By;

public class Electronics extends Util1 {

private By _CellCategory = By.xpath("//a[@title=\"Show products in category Cell phones\"]");//Locator for Cell Category
private By _HTCOne = By.linkText("HTC One Mini Blue");// Locator for HTC One Cell
private By _AddtoCartHTC = By.xpath("//input[@id=\"add-to-cart-button-19\"]"); //Locator for Add to cart HTC One Cell
private By _ShoppingCart =  By.linkText("Shopping cart"); //LocCart

public void AddtoCartHTCOne() {

    clickElement(_CellCategory, 20);//Method to click Cell category
    clickElement(_HTCOne, 20); // Method to click HTC One Cell
    clickElement(_AddtoCartHTC, 20); // Method to Add to Cart
}
public void ClickonShoppingCart(){
        clickElement(_ShoppingCart, 20);//Method to click on Shopping cart


    }
}

