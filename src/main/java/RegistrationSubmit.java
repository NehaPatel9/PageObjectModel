import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSubmit extends Util1 {

    public void VerifyRegistrationButtonPage() {

        String expectedText = "Your registration completed";
        String actualText = getTextfromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualText, expectedText);

    }
}