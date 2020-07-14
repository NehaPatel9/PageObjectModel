import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Util1 { // Assert Product of Shopping cart

    String expectedAddFirstItem = ("Digital Storm VANQUISH 3 Custom Performance PC");// Expected Result
    String expectedAddSecondItem = "HTC One Mini Blue"; //Expected Result

    private By _Product1 = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");//Actual Result
    private By _Product2 = By.linkText("HTC One Mini Blue");// Actual Result

    public void userVerifyShoppingCartMassage(){

        getTextfromElement(_Product1); //Get result from actual result
        getTextfromElement(_Product2); //Get result from actual result

        Assert.assertEquals(_Product1,expectedAddFirstItem); //Compare actual with expected
        Assert.assertEquals(_Product2,expectedAddSecondItem);//compare actual with expected
    }
}

