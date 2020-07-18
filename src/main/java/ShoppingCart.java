import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Util1 {


    private By _Product1 = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    private By _Product2 = By.linkText("HTC One Mini Blue");

    public void userVerifyShoppingCartMassage(){
        String expectedAddFirstItem = ("Digital Storm VANQUISH 3 Custom Performance PC");
        String expectedAddSecondItem = "HTC One Mini Blue";

        getTextfromElement(_Product1);
        getTextfromElement(_Product2);

        Assert.assertEquals(_Product1,expectedAddFirstItem);
        Assert.assertEquals(_Product2,expectedAddSecondItem);
    }
}

